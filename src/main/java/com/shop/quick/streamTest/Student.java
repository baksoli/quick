package com.shop.quick.streamTest;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Student implements Comparable<Student> {

    // stream sort 객체 요소일 경우 클래스 Comparable을 구현하지 않으면 ClassCastException 발생

    public enum Sex { MALE, FEMALE }
    public enum City { Seoul, Pusan }

    @NonNull
    private String name;
    @NonNull
    private int score;
    @NonNull
    private Sex sex;
    private City city;

//    public Student(String name, int score, Sex sex) {
//        this.name = name;
//        this.score = score;
//        this.sex = sex;
//    }

    @Override
    public int compareTo(Student o) {
        // score < o.score : 음수 리턴
        // score == o.score : 0 리턴
        // score > o.score : 양수 리턴
        return Integer.compare(score, o.score);
    }
}
