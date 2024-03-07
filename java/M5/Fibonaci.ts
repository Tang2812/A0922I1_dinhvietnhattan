
let fibonaci = (n) => {
    if (n < 0) {
        return -1
    } else {
        if (n === 0 || n === 1) {
            return n
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}
let sum = 0;
for (let i = 0; i <= 10; i++) {
    console.log(fibonaci(i))
    sum = sum + fibonaci(i);
}
console.log("Tong la: " + sum)
