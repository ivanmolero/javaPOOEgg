const request = require('request');

function fetchDataSWAPI(url) {
    let options = {json: true}
    let data = "hola"

    const promesa = new Promise((resolve, reject) => {
        request(url, options, (error, res, body) => {
            if (res.statusCode === 200) {
                resolve(body)
            } else {
                reject("problemas")
            }
        })
    })
    return promesa

}

fetchDataSWAPI("https://swapi.dev/api/planets/0").then((res) => {
    console.log(res)
}).catch((err) => {
    console.log(err)
})
fetchDataSWAPI("https://swapi.dev/api/planets/1").then((res) => {
    console.log(res)
}).catch((err) => {
    console.log(err)
})

// obtención de datos de swapi usando fetch, que es una promesa

// const promesa = new Promise((resolve, reject) => {
//     fetch("https://swapi.dev/api/planets/" + 0).then(res => {
//         if (res.status === 200) {
//             resolve(res.json())
//         } else {
//             reject("problemas")
//         }
//     }).catch(err => {
//         reject("problemas")
//     })
// })
//
// function fetchDataSWAPI() {
//     promesa.then(res => {
//         console.log(res)
//     }).catch(err => {
//         console.log(err)
//     })
// }
//
// fetchDataSWAPI()
