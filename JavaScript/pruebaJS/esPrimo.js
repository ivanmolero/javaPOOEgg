const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

readline.question("ingrese el numero a evaluar: ", num => {
    if (evaluaPrimo(Number(num))) {
        console.log("el numero " + num + " es primo")
    } else {
        console.log("el numero " + num + " no es primo")
    }
})

function evaluaPrimo(num) {
    let esPrimo = true
    for (let i = 2; i < num / 2; i++) {
        if (esPrimo) {
            esPrimo = esPrimo && num % i !== 0
        } else {
            return esPrimo
        }
    }
    return esPrimo
}