package com.imalittletester;

import org.junit.jupiter.api.Test;

import java.util.*;

public class OperatorsTest {

    @Test
    void firstTest() {
        //variabila
        int int1 = 0;
        int int2 = 55;

        double double1 = 0.0, double2 = 125.5; //operator unar -125.5

        boolean boo1 = true, bool2 = false;
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
        double1 =  double2 - 1;
        System.out.println("double1 = " + double1);
        double1 =  double1 - double2;
        System.out.println("double1 = " + double1);
        System.out.println(1 + 2);
        System.out.println("1 " + "2");//concatenare de string
        System.out.println(1 + "2");
        System.out.println(!boo1); // asta device false
        System.out.println(!bool2); //asta devine true
        
        boolean e = !"eee".contains("e"); //are nega si ar aduce false in loc de true

        System.out.println("String equals: " + string1.equals(string2));

    }

    @Test
    void secondTest(){
        int int1 = 1;
        //la fel ca si int1 = int1+1;
        int cuiAsignamValoarea = 0;
        //int 1 e 1
        cuiAsignamValoarea = int1++; //nu tine cont de ++ cand asignezi o variabila altei variable, asignez valoarea veche, apoi updatez valoarea lui int1
        System.out.println("cuiAsignamValoarea = " + cuiAsignamValoarea);
        //int1 e 2 deja
        cuiAsignamValoarea = ++int1; //tine cont de ++ cand asignezi o variable altei variable, intai updatez valoarea lui int1, apoi o asignez
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
        System.out.println("Int1 mai mic ca celalalt? " + (int1MaiMareSauNu));

    }
    
    @Test
    void thirdTest(){
        int int1 = 1; 
        int1 += 10; //la fel ca int1 = int1 + 10;
        System.out.println("int1 = " + int1); //avem valoarea 11
        int1 -= 10; //la fel ca int1 =  int1 - 10;
        System.out.println("int1 = " + int1);//avem valoare 1
        int1 += -100000; // int1 = int1 + -100000;
        System.out.println("int1 = " + int1);
        System.out.println(1 == 2);
        System.out.println(1 != 2);
    }
    @Test
    void listTest(){
        //stocam mai multe, se poate adauga si in if, for, while
        List<String> lista1 = new ArrayList<>();
        System.out.println(lista1.isEmpty());
        lista1.add("Cluj");
        lista1.add("Oradea");
        lista1.get(1);
        //rezultate [] reprezinta lista
        System.out.println("lista1 = " + lista1);
        
        List<String> lista2 = Arrays.asList("peach", "apple", "melon");
        System.out.println("lista2 = " + lista2);
        System.out.println("Lista 2 contains apple: " + lista2.contains("apple"));
        
        List<Integer> lista3 = List.of(1,2,3,4,5,6,7,8,9,10, 11);
        System.out.println("lista3 = " + lista3);
        System.out.println(lista3.get(5));
        System.out.println(lista3.size());

        List<Integer> listaDeNumere = List.of(5,13, 25, 8,14, 7, 9);
        System.out.println(listaDeNumere.size());
        int numberOfNumbers = 0;
        int number2 = 0;
        List<Integer> positionInList = new ArrayList<>();

        for(int i = 0; i < listaDeNumere.size(); i++){
           if (listaDeNumere.get(i) % 7 == 0) {
               numberOfNumbers++;
               positionInList.add(i);
           }

        }
        System.out.println("Number of numbers...." + numberOfNumbers);
        System.out.println("Elements on the positions: " +positionInList);

        //nu te intereseaza cate nr sunt in lista, inhence for
        for (Integer numarInLista : listaDeNumere){
            if(numarInLista % 7 == 0){
                number2++;
            }
        }
        System.out.println("Number 2...: " + number2);

        List<Integer> listOf52 = new ArrayList<>();
        for (int i = 0; i<52; i++){
            listOf52.add(i+1);
        }
        System.out.println("listof52 " +listOf52);

    }
    @Test
    void mapTest(){
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("firstKey", 1);
      //  System.out.println(simpleMap.containsKey("firstKey"));
      //  System.out.println("simpleMap = " + simpleMap);
        
        Map<String, Integer> anotherMap = Map.of("firstKey", 1, "secondKey",2, "thirdKey", 3);
       // System.out.println("anotherMap = " + anotherMap);
        //System.out.println("Is key present: " + anotherMap.containsKey("secondKey"));
       // System.out.println("Is value present: " + anotherMap.containsValue(5));
        System.out.println("The value of 'secondKey' is: " +anotherMap.get("secondKey"));
        System.out.println("The map size is: " + anotherMap.size());
        System.out.println("Is the map empty: " + anotherMap.isEmpty());

       for(Map.Entry<String, Integer> entry : anotherMap.entrySet()){
           System.out.println("Key: " + entry.getKey() + " - value: " + entry.getValue());
       }
       for(String key : anotherMap.keySet()){
           System.out.println(key);
       }
       for (int value : anotherMap.values()){
           System.out.println(value);
       }
    }

    @Test
    void setTest (){
        Set <String > firstSet = new HashSet<>();
        firstSet.add("fruit");
        System.out.println(firstSet);
    }
}
