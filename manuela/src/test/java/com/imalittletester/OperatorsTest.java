package com.imalittletester;

import org.junit.jupiter.api.Test;

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
}
