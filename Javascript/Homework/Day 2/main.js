// Kiểm tra 1 giá trị có nằm trong mảng hay không
function checkElementExist(arr, element) {
    return arr.includes(element)
}
console.log(checkElementExist([1, 2, 3, 4], 4));
console.log(checkElementExist([1, 2, 3, 4], 5));

// Tìm ra số lớn thứ nhì trong mảng
let max2Numbers = arr => Array.from([...new Set(arr)]).sort((a, b) => b - a)[1]
console.log(max2Numbers([2, 1, 3, 4, 4]));

// Chuyển 1 chuỗi thành chuỗi chỉ viết hoa từ đầu tiên
let capitalizeString = str => str.toLowerCase().split(" ").map(text => text.charAt(0).toUpperCase() + text.slice(1)).join(" ")
console.log(capitalizeString("chÀo MừnG đẾn với techMaster"));

// Đảo ngược chuỗi
let reverseString = str => str.split("").reverse().join("")
console.log(reverseString("Hello"))

// Kiểm tra chuỗi đối xứng
function checkSymmetricString(str) {
    let s1 = str.toLowerCase().split(" ").join("")
    let s2 = s1.split("").reverse().join("")
    return s1 == s2
}
console.log(checkSymmetricString("Race car"));
console.log(checkSymmetricString("hello world"));





