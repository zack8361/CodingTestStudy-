// //실습 1 map.으로 배열 구현.
// const fruits = ["사과","파인애플","수박","포도","아륀지"];
//
// let obj = fruits.map((value,index) => {
//     return {
//         id:index,
//         name:value,
//     }
// })
// console.log(obj);
//
// //실습 2 1 ~ 100까지 map 으로 구현 합 .
// let arr = [];
// for(let i=1; i<=100; i++){
//     arr[i] = i;
// }
//
// let sum = 0;
// arr.map(value => {
//     sum +=value;
// })
// console.log(sum)


function solution(array){
    let map = new Map(); //map 선언

    for(let i=0; i<array.length; i++){
        if(map.get(array[i]) === undefined){

        }
        else {

        }
    }
}

let array = [1,2,3,3,3,4];
console.log(solution(array));