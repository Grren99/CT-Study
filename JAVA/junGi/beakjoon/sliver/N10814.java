package JAVA.junGi.beakjoon.sliver;

import java.util.*;

public class N10814 {
    /**
     * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
     * 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        List<Member> list = new ArrayList<>();
        for(int i = 0; i < index; i++){
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Member(name, age));
        }
        list.sort(Comparator.comparingInt(Member::getAge));

        for(Member member : list){
            System.out.println(member.getAge() + " " + member.getName());
        }
    }

    // DAO 생성
    public static class Member{
        String name;
        int age;
        // 기본 생성자
        Member(String name , int age){
            this.name = name;
            this.age = age;
        }

        int getAge(){
            return age;
        }
        String getName(){
            return name;
        }
    }
}
