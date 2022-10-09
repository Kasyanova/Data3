/*Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:


        1. Выведите слова, состоящие только из латиницы.

        2. Выведите количество этих слов.*/

package com.max.idea;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку из слов, разделенных пробелами, например I love java 8 Я люблю java 14 core1");

        //присвоить переменной текст
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        //посчитать количество слов, разделённых пробелом
        int count = 0;
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)==' '){
                count++;
            }
        }

        int latin = 0; //переменная для подсчета слов с латинницей

        //найти и вывести слова с латинницей count раз
        String regexp = "([a-zA-Z]+)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);
        for (int j=0;j<count;j++) {
            if (matcher.find()) {
                System.out.println(matcher.group());
                latin++;
            }
        }
        System.out.println("Всего "+latin+" слов содержат латинницу");
        //как отфильтровать из результата слово латинницей с числом типа core1 ?
    }
}