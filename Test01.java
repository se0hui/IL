package backend;

public class Test01{

    // 필드
    String name; // 이름
    int age; // 나이
    int korean_score; // 국어 성적
    int math_score; // 수학 성적
    int english_score; // 영어 성적
    
    // 생성자
    public Test01(String name, int age, int korean_score, int math_score, int english_score){
        this.name = name;
        this.age = age;
        this.korean_score = korean_score;
        this.math_score = math_score;
        this.english_score = english_score;
    }
    
    // 메소드
    public void printScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어 성적 : " + korean_score);
        System.out.println("수학 성적 : " + math_score);
        System.out.println("영어 성적 : " + english_score);
    }
}

class Main{
    public static void main(String[] args){
        Test01 test = new Test01("홍길동", 18, 100, 90, 80);
        test.printScore();
    }
}
