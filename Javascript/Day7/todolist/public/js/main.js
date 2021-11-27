/*
Các chức năng cần thực hiện

1. Lấy danh sách cv hiện có (x)
2. Thêm cv (x)
3. Sửa tên cv
4. Xóa cv (x)
5. Lọc cv theo trạng thái
6. Thay đổi trạng thái cv
*/

let todos = [];

const todo_list = document.querySelector(".todo-list");
const todo_input = document.getElementById("todo-input");
const btn_add = document.getElementById("btn-add");

function randomId() {
    return Math.floor(Math.random() * 100000);
}

// =============== API ===============
// API lấy danh sách công việc
function getTodosAPI() {
    return axios.get("/todos"); // => luôn trả về promise
}

// API xóa công việc
function deleteTodosAPI(id) {
    return axios({
        method: "delete",
        url: `/todos/${id}`,
    });
}

// API thêm công việc
function addTodoAPI(title) {
    return axios.post("/todos", {
        id: randomId(),
        title: title,
        status: false,
    });
}

// ============= Hàm xử lý =============
// Lấy danh sách todo
async function getTodos() {
    try {
        const res = await getTodosAPI();
        todos = res.data;

        // Render ra ngoài giao diện
        renderUI(todos);
    } catch (error) {
        console.log(err);
    }
}

// Xóa todo
async function deleteTodo(id) {
    try {
        const res = await deleteTodosAPI(id);
        if (res.status == 200) {
            // Xóa todo trong mảng todos dựa vào id
            todos.forEach((todo, index) => {
                if (todo.id == id) {
                    todos.splice(index, 1);
                }
            });

            renderUI(todos);
        }
    } catch (error) {
        console.log(error);
    }
}

// Hàm xử lý việc thêm
async function createTodo(title) {
    try {
        const res = await addTodoAPI(title)
        todos.push(res.data)

        renderUI(todos);

    } catch (error) {
        console.log(error);
    }
}

btn_add.addEventListener('click', function() {
    let todoTitle = todo_input.value
    if(todoTitle == "") {
        alert("Tiêu đề không được để trống")
        return
    }

    createTodo(todoTitle)
    todo_input.value = ""
})

function renderUI(arr) {
    todo_list.innerHTML = "";

    // Kiểm tra mảng rỗng
    if (arr.length == 0) {
        todo_list.innerHTML = "Không có công việc nào trong danh sách";
        return;
    }

    // Trường hợp có công việc
    for (let i = 0; i < arr.length; i++) {
        const t = arr[i];
        todo_list.innerHTML += `
            <div class="todo-item ${t.status ? "active-todo" : ""}">
                <div class="todo-item-title">
                    <input type="checkbox" ${t.status ? "checked" : ""}>
                    <p>${t.title}</p>
                </div>
                <div class="option">
                    <button class="btn btn-update">
                        <img src="./img/pencil.svg" alt="icon">
                    </button>
                    <button class="btn btn-delete" onclick="deleteTodo(${
                        t.id
                    })">
                        <img src="./img/remove.svg" alt="icon">
                    </button>
                </div>
            </div>
        `;
    }
}

window.onload = () => {
    getTodos();
};
