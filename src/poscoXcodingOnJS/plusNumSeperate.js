function solution(n){
    let totalAns = 0;
    let answer = String(n);
    for(let i=0; i<answer.length; i++){
        totalAns+=parseInt(answer.charAt(i));
    }
    return totalAns;
}

console.log(solution(123));