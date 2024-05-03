package study.likelionbeweekly.week2.object;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
public class Person {

    private final String name;
    private final int age;

    public void walk() {
        System.out.println("Person.walk");
    }

    public void run() {
        System.out.println("Person.run");
    }
}
