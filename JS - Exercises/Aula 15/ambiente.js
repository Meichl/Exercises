let num = [5, 8, 9, 3]
num.push(1)
num.sort()
console.log(`O vetor tem um total de ${num.length} posições`)
console.log(`O primeiro valor do vetor é o ${num[0]}`)

let pos = num.indexOf(8)
if (pos == -1) {
    console.log('O valor não foi encontrado.')
} else{
    console.log(`O valor está na posição ${pos}`)
}