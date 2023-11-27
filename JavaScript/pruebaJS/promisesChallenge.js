
console.log("start");

setTimeout(() => {
    console.log("settimeout")
})

Promise.resolve().then(() => {
    console.log("resolve")
})

console.log("end")

// console.log('start');
//
// const promise1 = new Promise((resolve, reject) => {
//     console.log(1)
// })
//
// console.log('end');
