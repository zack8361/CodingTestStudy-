let arr = []

for(let i=1; i<=100; i++){
    arr.push(i);
}
const resultSum = arr.reduce((acc,value) => {
    return acc += value;
},0)
console.log(resultSum)
