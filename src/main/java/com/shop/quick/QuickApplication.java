package com.shop.quick;

import com.shop.quick.streamTest.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class QuickApplication {

	public static void main(String[] args) {

//		MemberRepository memberRepository = null;
//		MemberService memberService = new MemberServiceImpl(memberRepository);
//		OrderService orderService;

//		long memberId = 1L;
//
//		Member member = new Member(memberId, "memberA", Grade.VIP);
//		memberService.join(member);
//
//		Order order = orderService.createOrder(memberId, "itemA", 10000);
//		System.out.println("order = " + order);
//

		/*
			distinct() 와 filter
		 */
//		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
//		names.stream()
//				.distinct()
//				.forEach(n -> System.out.println("중복 제거 :: "+n + " "));
//		System.out.println("");
//
//		names.stream()
//				.distinct()
//				.filter(n -> n.startsWith("신"))
//				.forEach(n -> System.out.println("신으로 시작 :: " + n +" "));
//		System.out.println("");
//
//		/*
//			루핑
//			peek(), forEach()
//		 */
//		int[] intArr = {1,2,3,4,5};
//
//		Arrays.stream(intArr)
//				.filter(a -> a%2 == 0)
//				.peek(n -> System.out.println("peek() 마지막 호출시 :: "+n));
//
//		int total = Arrays.stream(intArr)
//				.filter(a -> a%2 == 0)
//				.peek(n -> System.out.println("peek() 뒤에 sum() :: "+n))
//				.sum();
//		System.out.println("total :: " + total);
//
//		Arrays.stream(intArr)
//				.filter(a -> a%2 == 0)
//				.forEach(n -> System.out.println("forEach() 마지막 :: " + n));


		/*
			Optional 클래스
			- isPresent()
			- orElse()
			- ifPresent()
		 */
//		List<Integer> list = new ArrayList<>();
//
//		// 방법1_isPresent()
//		OptionalDouble optional = list.stream()
//				.mapToInt(Integer::intValue)
//				.average();
//		if(optional.isPresent()) {
//			System.out.println("평균 :: "+optional.getAsDouble());
//		} else {
//			System.out.println("방법1_평균값 없음 :: 0.0");
//		}
//
//		// 방법2_orElse()
//		double avg = list.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.orElse(0.0);
//		System.out.println("방법2_평균 :: "+avg);
//
//		// 방법3_ifPresent()
//		list.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.ifPresent(a -> System.out.println("방법3_평균 :: " + a));
//


		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 10, Student.Sex.FEMALE)
		);

		// collector 예시
//		System.out.println("man");
//		List<Student> maleList = totalList.stream()
//				.filter(s -> s.getSex().equals(Student.Sex.MALE))
//				.collect(Collectors.toList());
//		maleList.stream()
//				.forEach(s -> System.out.println(s.getName()));
//
//		System.out.println("woman");
//		List<Student> femaleList = totalList.stream()
//				.filter(s -> s.getSex().equals(Student.Sex.FEMALE))
//				.collect(Collectors.toList());
//		femaleList.stream()
//				.forEach(s -> System.out.println(s.getName()));

		//


	//	SpringApplication.run(QuickApplication.class, args);
	}

}
