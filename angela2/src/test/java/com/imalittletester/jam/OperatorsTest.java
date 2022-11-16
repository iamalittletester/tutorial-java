package com.imalittletester.jam;

import com.imalittletester.utils.LastDayOfMonth;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.*;

public class OperatorsTest {

    @Test
    void firstTest(){
        int int1 = 0;
        int int2 = 55;

        double double1 = 0.0, double2 = 125.5;
        boolean bool1 = true, bool2 = false;

        String string1 = "", string2 = "This is the second string";

        System.out.println("int1= " + int1);
        int1=100;
        System.out.println("int1= " + int1);
        int2 = int1;
        System.out.println("int2 = " + int2);
        int1 = int1 + 5;
        System.out.println("int1 = " + int1);
        int1 = int2 + 10;
        System.out.println("int1 = " + int1);

        double1 = 10.5 - 2.3;
        System.out.println(double1);
        double1 = double2 - 1;
        System.out.println(double1);
        double1 = double1 - double2;
        System.out.println(double1);
        System.out.println(1 + 2);
        System.out.println("1" + "2");
        System.out.println(1 + "2");

        System.out.println(!bool1);
        System.out.println(!bool2);
        boolean e = "eeee".contains("e");
        System.out.println("String equals " + string1.equals(string2));
    }
    
    @Test
    void secondTest () {
        int int1 = 1;
        int int2 = 0;
        int2 = int1++; // asignez valorea veche, apoi updatez valoarea lui int1
        System.out.println("int2 = " + int2);
        // int1 e 2 deja
        int2 = ++int1; //updatez valoarea lui int1 si apoi o asignez
        // int1 e 3
        System.out.println("int2 = " + int2);

    }

    @Test
    void thirdTest () {
        int int1 = 1;
       // int1 = int1 + 10;
        int1 +=10;
        System.out.println("int1= " + int1);

       // int1 = int1 - 10;
        int1-= 10;
        System.out.println("int1= " + int1);
       // int1 = int1 + -1000000;
        int1+= -100000;
        System.out.println("int1= " + int1);

        System.out.println(1 == 2);
        System.out.println(1 != 2);

        boolean int1MaiMareSauNu = int1 > int1;
        System.out.println("Int1 mai mare ca celalalt?" + int1MaiMareSauNu);

    }

    @Test
    void listTest (){
        List<String> lista1 = new ArrayList<>();
        System.out.println(lista1.isEmpty());
        lista1.add("Cluj");
        lista1.add("Oradea");
        System.out.println("lista1 = " + lista1);

        List<String> lista2 = Arrays.asList("peach", "apple", "melon");
        System.out.println("lista2 = " + lista2);
        System.out.println("Lista2 contains apple: " + lista2.contains("apple"));

        List<Integer> lista3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println("lista3 = " + lista3);
        System.out.println(lista3.get(5));
        System.out.println(lista3.size());

        List<Integer> listOf52 = new ArrayList<>();
        for (int i=0; i < 52; i++) {
            listOf52.add(i+1);
        }
        System.out.println("listOf52 = " + listOf52);

        List<Integer> listaDeNumere = List.of(5, 13, 25, 8, 14, 7, 9);
        System.out.println(listaDeNumere.size());
        int numberOfNumbers = 0, number2 = 0;

        List<Integer> positionInList = new ArrayList<>();

        for (int i = 0; i < listaDeNumere.size(); i++) {
            if (listaDeNumere.get(i) % 7 == 0) {
                numberOfNumbers++;
                positionInList.add(i);
            }
        }
        System.out.println("Number of numbers....: " + numberOfNumbers);
        System.out.println("Elements on the positions: " + positionInList);

        for (int numarInLista : listaDeNumere) {
            if (numarInLista % 7 == 0) {
                number2++;
            }
        }
        System.out.println("Number 2....: " + number2);
    }

    @Test
    void mapTest() {
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("first", 1);
        System.out.println("simpleMap = " + simpleMap);

        Map<String, Integer> anotherMap = Map.of("firstKey", 1, "secondKey", 2, "thirdKey", 3);
        System.out.println("anotherMap = " + anotherMap);
        System.out.println("Is key present? " + anotherMap.containsKey("secondKey"));
        System.out.println("Is value present? " + anotherMap.containsValue(3));
        System.out.println("The value of 'secondKey' is: " + anotherMap.get("secondKey"));

        System.out.println("The map size is: " + anotherMap.size());
        System.out.println("Is the map empty? " + anotherMap.isEmpty());

        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -  value: " + entry.getValue());
        }

        for (String key : anotherMap.keySet()) {
            System.out.println(key);
        }

        for (int value : anotherMap.values()) {
            System.out.println(value);
        }

    }
}
