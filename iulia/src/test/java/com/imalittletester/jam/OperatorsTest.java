package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import javax.lang.model.SourceVersion;
import java.util.*;

public class OperatorsTest {

    public int numele;


    @Test
    void firstTest() {
        int int1 = 0;
        int int2 = 55;

        double double1 = 0.0, double2 = 125.5;

        boolean bool1 = true, bool2 = false;

        String string1 = "", string2 = "This is the second string";

        System.out.println("int1 = " + int1);

        int1 = 100;
        System.out.println("int1 = " + int1);

        int2 = int1;
        System.out.println("int2 = " + int2);

        int1 = int1 + 5;
        System.out.println("int1 = " + int1);

        int1 = int2 + 10;
        System.out.println("int1 = " + int1);

        double1 = 10.5 - 2.3;
        System.out.println("double1 = " + double1);

        double1 = double2 - 1;
        System.out.println("double1 = " + double1);

        double1 = double1 - double2;
        System.out.println("double1 = " + double1);

        System.out.println(1 + 2);
        System.out.println("1" + "2");
        System.out.println(1 + "2");


        System.out.println(!bool1);
        System.out.println(!bool2);
        boolean e = !"eeee".contains("e");

        System.out.println(string1.equals(string2));

    }

    @Test
    void secondTest() {
        int int1 = 1;
        int cuiAsignamValoarea = 0;
        //int 1 e 1
        cuiAsignamValoarea = int1++; //asignez valoarea veche, apoi updatez valoarea lui int1
        System.out.println("cuiAsignamValoarea = " + cuiAsignamValoarea);
        //int1 e 2 deja
        cuiAsignamValoarea = ++int1; //intai updatez valoarea lui int1, apoi o asignez
        //int1 e 3
        System.out.println("cuiAsignamValoarea = " + cuiAsignamValoarea);
        ++int1;
        //int1 e 4
        System.out.println("int1 = " + int1);
        int1++;
        //int1 e 5
        System.out.println("int1 = " + int1);

        boolean int1MaiMareSauNu = int1 > cuiAsignamValoarea;
        System.out.println("Int1 mai mare ca celalalt? " + int1MaiMareSauNu);
        System.out.println("Int1 mai mic ca celalalt? " + (int1 < cuiAsignamValoarea));
    }

    @Test
    void thirdTest() {
        int int1 = 1;
        //int1 = int1 + 10;
        int1 += 10;
        System.out.println("int1 = " + int1);  //avem valoarea 11
        //        int1 = int1 - 10;
        int1 -= 10;
        System.out.println("int1 = " + int1); //avem valoarea 1
        //        int1 = int1 + -100000;
        int1 += -100000;
        System.out.println("int1 = " + int1); //valoarea -99999

        System.out.println(1 == 2);
        System.out.println(1 != 2);
    }

    //Lists
    @Test
    void collectionTest() {
        List<String> lista1 = new ArrayList<>();
        System.out.println(lista1.isEmpty());
        lista1.add("Cluj");
        lista1.add("Oradea");
        System.out.println("lista1 = " + lista1);

        List<String> lista2 = Arrays.asList("peach", "apple", "melon");
        System.out.println("lista2 = " + lista2);
        System.out.println("Lista 2 contains apple:  " + lista2.contains("apple"));

        List<Integer> lista3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println("lista3 = " + lista3);
        System.out.println(lista3.get(5));
        System.out.println(lista3.size());

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
        System.out.println("Number Of Numbers..." + numberOfNumbers);
        System.out.println("Elements on the positions: " + positionInList);

        for (Integer numarInLista : listaDeNumere) {
            if (numarInLista % 7 == 0) {
                number2++;
            }
        }
        System.out.println("number 2..." + number2);
    }

    //Map
    @Test
    void mapTest() {
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("first", 1);
        System.out.println("simpleMap=  " + simpleMap);

        Map<String, Integer> anotherMap = Map.of("firstKey", 1, "secondKey", 2, "thirdKey", 3);
        System.out.println("anotherMap = " + anotherMap);
        System.out.println("Is value present? " + anotherMap.containsValue(3));
        System.out.println("Is key present" + anotherMap.containsKey("secondKey"));
        System.out.println("The value of second key is: " + anotherMap.get("secondKey"));

        System.out.println("The map size is: " + anotherMap.size());
        System.out.println("Is the map empty? " + anotherMap.isEmpty());

        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "value: " + entry.getValue());
        }
        for (String key : anotherMap.keySet()) {
            System.out.println(key);
        }
        for (int value : anotherMap.values())
            System.out.println(value);
    }

    void sixthTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------");


        //numere divizibile cu 3 intre 0 si 21 (exclusiv)

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i = 20; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);

            System.out.println("----------------------");
        }
        for (int i = 3; i < 20; i += 3) {
            System.out.println(i);
        }
        System.out.println("--------------");
        int i = 1;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        int position = 789;

        if (position > 0)
            System.out.println("Element found on position " + position);
        else System.out.println("THERE IS NO ELEMENT!!!!");


        // using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!!!");

        String theMessage = position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!!!";
        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Eelement found on position: " + position;
        else theMessage2 = "THERE IS NO ELEMENT!";
        System.out.println(theMessage2);
    }
}

