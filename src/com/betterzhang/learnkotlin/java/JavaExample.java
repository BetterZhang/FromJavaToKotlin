package com.betterzhang.learnkotlin.java;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/27 上午 10:47
 * Desc   : description
 */
public class JavaExample {

    int score;

    public static void main(String[] args) {

        System.out.print("Andrew Zhang\n");
        System.out.println("Andrew Zhang");

        String name1 = "Andrew Zhang";
        final String name2 = "Andrew Zhang";

        String otherName;
        otherName = null;

        String text = "abc";
        if (text != null) {
            int length = text.length();
        }

        String firstName = "Andrew";
        String lastName = "Zhang";
        String message = "My name is: " + firstName + " " + lastName;

        String text2 = "First Line\n" +
                       "Second Line\n" +
                       "Third Line\n";

        int x = 10;
        String text3 = x > 5 ? "x > 5" : "x <= 5";
        String message2 = null;
        System.out.println(message2 != null ? message : "");

        int a = 10, b = 20;
        final int andResult = a & b;
        final int orResult = a | b;
        final int xorResult = a ^ b;
        final int rightShift = a >> 2;
        final int leftShift = a << 2;

        Object obj = new Object();
        if (obj instanceof Developer) {

        }
        Developer developer = (Developer) obj;

        if (obj instanceof Developer) {
            Developer developer2 = (Developer) obj;
        }

        int score = 80;
        if (score >= 0 && score <=300) {}

        String grade;
        switch (score) {
            case 10:
            case 9:
                grade = "Excellent";
                break;
            case 8:
            case 7:
            case 6:
                grade = "Good";
                break;
            case 5:
            case 4:
                grade = "Ok";
                break;
            case 3:
            case 2:
            case 1:
                grade = "Fail";
                break;
            default:
                grade = "Fail";
                break;
        }

        for (int i = 1; i <= 10; i++) {}
        for (int i = 1; i < 10; i++) {}
        for (int i = 10; i >=0; i--) {}
        for (int i = 1; i <= 10; i += 2) {}
        for (int i = 10; i >=0; i -= 2) {}
        List<String> collection = new ArrayList<>();
        for (String item : collection) {}
        Map<String, String> map = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {}

        final List<Integer> listOfNumber = Arrays.asList(1, 2, 3, 4);
        final Map<Integer, String> keyValue = new HashMap<Integer, String>();
        keyValue.put(1, "one");
        keyValue.put(2, "two");
        keyValue.put(3, "three");

        // Java 9
//        final List<Integer> listOfNumber2 = List.of(1, 2, 3, 4);
//        final Map<Integer, String> keyValue2 = Map.of(1, "one",
//                                                      2, "two",
//                                                      3, "three");

        // Java 7 and below
        List<Developer> developers = new ArrayList<>();
        for (Developer developer2 : developers) {
            System.out.println(developer2.getName());
        }

        // Java 8+
        developers.forEach(developer3 -> System.out.println(developer3.getName()));

        // Java 7 and below
        for (Developer developer2 : developers) {
            if (developer2.getAge() > 30) {
                System.out.println(developer2.getAge());
            }
        }

        // Java 8+
        developers.stream().filter(developer3 -> developer3.getAge() > 30).forEach(developer3 -> developer3.getAge());

        Developer dev = new Developer("Mark", 22);
        try {
            Developer dev2 = (Developer) dev.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        int result = Util.triple(3);

        Developer developer4;

    }

    void doSomething1() {
        // logic here
    }

    void doSomething2(int... numbers) {
        // logic here
    }

    int getScore() {
        // logic here
        return score;
    }

    int getScore2(int value) {
        // logic here
        return 2 * value;
    }

}

class Util {
    private Util() {}
    public static int getScore(int value) {
        return 2 * value;
    }
    public static int triple(int value) {
        return 3 * value;
    }
}
