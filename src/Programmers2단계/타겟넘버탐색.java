package Programmers2단계;

import java.util.Arrays;

class Solution {
    static int answer = 1;
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;
        System.out.println(solution(numbers,target));
    }

    public static int solution(int[] numbers, int target) {

        dfs(0,0,numbers,target);
        return answer;
    }

    private static void dfs(int depth, int sum, int[] numbers, int target) {


    }
}

// 스프링부트/ MYSql / 리액트 리덕스

// 스프링부트 공부하고, 스프링부터 프로젝트 파오기, db(퍼블릭 ip 써서) -> 서버 올리기

// 중고거래 웹 사이트 잖아 -> (반응형) -> 다같이 (프론트 : 정혁, 민영, 성희, 유림)  /  백앤드(나, 인영)

// 1. 써보고 싶은 라이브러리(api) -> 채팅 / 위치, 결제 (토스)

// 2. 카카오톡 로그인 / 네이버 로그인 / 일반 로그인 , 회원가입

// 3. 메인페이지 / 글쓰기, 검색기능, 카테코리 (의류 : 바지, 상의 , 아우터, 악세사리) / 관심사(찜) : 하트 -> 장바구니

// 4  거래간 별점 주기.

// 5. 마이페이지(편집, 닉변, 사진, 변경) / 평균 별점 / 블랙리스트(신고 3번)






