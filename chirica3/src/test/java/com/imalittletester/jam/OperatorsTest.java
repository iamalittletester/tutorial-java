package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

import static java.util.List.*;

public class OperatorsTest {

    @Test
    void mapTest(){
        Map<String, Integer> simpleMap = new HashMap<>();
        System.out.println("simpleMap = " + simpleMap);
        simpleMap.put("first", 1);
        System.out.println("simpleMap = " + simpleMap);

        Map<String, Integer> anotherMap = Map.of("firstkey", 1, "secondkey", 2, "thirdkey", 3);
        System.out.println("anotherMap = " + anotherMap);
        System.out.println("avem key: " + anotherMap.containsKey("thirdkey"));
        System.out.println("avem valoare: " + anotherMap.containsValue(2));
        System.out.println("valoarea lui secondkey este: " + anotherMap.get("secondkey"));
        System.out.println("map size: " + anotherMap.size());
        System.out.println("is map empty? " + anotherMap.isEmpty());

        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }

        for (String key : anotherMap.keySet()) {
            System.out.println(key);
        }

        for (int value : anotherMap.values()) {
            System.out.println(value);
        }
    }

    @Test
    void listTest() {
        List<String> lista1 = new ArrayList<>();
        lista1.add("cluj");
        lista1.add("alba");
        System.out.println("lista1 = " + lista1);

        List<String> lista2 = Arrays.asList("peach", "apple", "melon");
        System.out.println("lista2 = " + lista2);

        System.out.println(lista2.get(2));
        System.out.println(lista2.size());
        System.out.println(lista2.contains("apple"));

        List<Integer> list4 = Arrays.asList(5, 13, 25, 8, 14, 7, 9);
        int divizibile = 0;
        List<Integer> pozInList = new ArrayList<>();
        for (int i = 0; i < list4.size(); i++) {
            if (list4.get(i) % 7 == 0) {
                divizibile++;
                pozInList.add(i);
            }
        }
        System.out.println("cate sunt divizibile la 7? " + divizibile);
        System.out.println("pe ce pozitii sunt divizibilele: "+ pozInList);

        int divizibil = 0;
        for (int nrInLista : list4) {
            if (nrInLista % 7  == 0) {
                divizibil++;
            }
        }

        System.out.println(divizibil);

        List<Integer> lista3 = List.of( 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("lista3 = " + lista3);
    }

    @Test
    void firstTest() {
        int int1 = 0;
        int int2 = 55;
        double double1 = 0.0, double2 = 125.5;
        boolean bool1 = true, bool2=false;
        String string1 = "", string2 = "this is the second string";

        System.out.println("int1 = " + int1);
        int1 = 100;
        System.out.println("int1 = " + int1);
        int2 = int1;
        System.out.println("int2 = " + int2);
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
        System.out.println("sunt stringurile la fel? " + string1.equals(string2));
    }

    @Test
    void secondTest() {
        int int1 = 1;
        int int2 = 0;
        int2 = int1++; //int2 ia valoarea lui int1 si int1 creste cu 1
        System.out.println("int2 = " + int2);
        int2 = ++int1; //int2 e cu int1 +1, int 1 ramane la fel -sau creste si el?!
        System.out.println("int2 = " + int2);
        System.out.println("int1 = " + int1);

        boolean int1MaiMareSauNu = int1 > int2;
        System.out.println("int1>int2 ? "+ int1MaiMareSauNu);
    }
    
    @Test
    void thirdTest(){
        int int1=1;
        // int1 = int1 +10;
        int1 += 10;
        System.out.println("int1 = " + int1);
        int1 -= 10;
        System.out.println("int1 = " + int1);
        int1 -= 100000;
        System.out.println("int1 = " + int1);
        System.out.println(1 == 2);
        System.out.println(1 != 2);
    }
}
