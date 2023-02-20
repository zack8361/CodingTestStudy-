
let fruits1 = ["사과","딸기","파인애플","수박","참외","오렌지","자두","망고"];
let fruits2 = ["수박","사과","참외","오렌지","파인애플","망고"];


//자바 형식
let totalSame = [];
let totalDiff = [];
for(let i=0; i<fruits1.length; i++){
    for(let j=0; j<fruits2.length; j++){
        if(fruits1[i] === fruits2[j]){
            totalSame.push(fruits2[j]);
            break;
        }
        if(j===fruits2.length-1 && fruits1[i] !== fruits2[j]){
            totalDiff.push(fruits1[i]);
        }
    }
}
console.log(totalSame);
console.log(totalDiff);


//자바 스크립트 형식
let sameArr = [];
let diffArr = [];


fruits1.filter(value => {
    if(fruits2.includes(value)){
        sameArr.push(value)
        return;
    }
    diffArr.push(value);
})
console.log(sameArr);
console.log(diffArr);


//자바 스크립트 형식 re
let sameAsArr = [];
let diffAsArr = [];


fruits1.filter(value => {
    if(fruits2.includes(value)){
        sameAsArr.push(value);
        return;
    }
    diffAsArr.push(value);
})

console.log(sameAsArr);
console.log(diffAsArr);