//
//
//
//
//
//
//
//
//
//
function solution(answers) {
    let answer = [];
    let player1 = [1, 2, 3, 4, 5];
    let player2 = [2, 1, 2, 3, 2, 4, 2, 5];
    let player3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    let one = answers.filter((val,idx) => val === player1[idx%player1.length]).length;
    let second = answers.filter((val,idx) => val ===player2[idx%player2.length]).length;
    let third = answers.filter((val,idx) => val === player3[idx%player3.length]).length;
    let max = Math.max(one,second,third);
    console.log(max);
    if(one === max){
        answer.push(1);
    }
    if(second === max){
        answer.push(2);
    }
    if(third === max){
        answer.push(3);
    }
    return answer;
}
let answers = [1,2,3,4,5];
console.log(solution(answers));
