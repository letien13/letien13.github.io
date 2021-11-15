// In ra xếp loại theo mark
function diem(mark) {
    if (mark >= 85) {
        console.log("A")
    } else if (mark < 85 && mark >= 70) {
        console.log("B")
    } else if (mark < 70 && mark >= 40) {
        console.log("C")
    } else {
        console.log("D")
    }
}
diem(75)

// In ra các ngày trong tuần
function ngay(day) {
    switch (day) {
        case 0:
            console.log("Chủ nhật")
            break;
        case 1:
            console.log("Thứ 2")
            break;
        case 2:
            console.log("Thứ 3")
            break;
        case 3:
            console.log("Thứ 4")
            break;
        case 4:
            console.log("Thứ 5")
            break;
        case 5:
            console.log("Thứ 6")
            break;
        case 6:
            console.log("Thứ 7")
            break;
        default:
            break;
    }
}
ngay(2)

// Số nguyên được random nằm trong khoảng từ min -> max
function soNgauNhien(min, max) {
    let result = Math.floor(Math.random() * max) + min;
    return console.log(result);
}
soNgauNhien(1, 10)

// Tổng các số lẻ từ 1 -> 100
function sumEven() {
    let sum = 0;
    for (let i = 1; i < 101; i++) {
        if (i % 2 != 0) {
            sum += i;
        } 
    }
    return console.log(sum)
}
sumEven()

// Tổng các số chia hết cho 3 và 5 trong khoảng từ 0 -> 100
function sumNumber() {
    let sum = 0;
    for (let i = 0; i < 101; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            sum += i;
        }
    }
    return console.log(sum)
}
sumNumber()

