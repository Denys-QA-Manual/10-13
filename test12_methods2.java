package absoft;
/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {
    public static void main(String[] args) {
        String [] array = {"Alex", "John", "Stan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        name(userName, array);
        place(userName, array);

    }

    static void name (String s, String [] arr) {
        String foundName = "Sorry, name was not found";
        for (String arrName : arr) {
            if (arrName.equals(s)) {
                foundName = "Hello, " + arrName;
            }
        }
        System.out.println(foundName);
    }

    static void place (String name, String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i]))
                System.out.println("Your seat is: " + (i+1));
        }
    }
}
