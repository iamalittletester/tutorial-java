package com.imalittletester.Assesment;

import org.junit.jupiter.api.Test;

public class AssesmentTests {
    public UserData userData1 = new UserData("Manuela", new Senzor(null, null), "22:00", "06:00");
    public UserData userData2 = new UserData("Daniel", new Senzor(null, null), "23:00", "06:00");
    public UserData userData3 = new UserData("Alex", new Senzor(null, null), "20:00", "06:00");
    @Test
    void stepsForCurrentDay() {
        userData1.afisajTotal();
        userData2.afisajTotal();
        userData3.afisajTotal();

    }
}
