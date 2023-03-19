package absoft;
/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.Arrays;

public class test10_array2 {
    public static void main(String[] args) {
        String [] array = {"John", "Dan", "Ashe", "Carl", "Bill"};
        System.out.println("Початковий масив імен: " + Arrays.toString(array));

        System.out.println("\nВідсортований масив імен у стовпчик із новим іменем 'Stan':");
        Arrays.sort(array);

        String [] biggerArray = Arrays.copyOf(array, array.length + 1);
        biggerArray[array.length] = "Stan";

        for (String Ar : biggerArray) {
            System.out.println(Ar);
        }
    }
}
