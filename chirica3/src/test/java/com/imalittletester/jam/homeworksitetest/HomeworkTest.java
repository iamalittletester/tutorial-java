package com.imalittletester.jam.homeworksitetest;

import com.imalittletester.homeworksite.GarminCookie;
import org.junit.jupiter.api.Test;

public class HomeworkTest {
    public GarminCookie garminCookie;

    @Test
    void firstTest(){
        int max = 100;
        garminCookie.multipleOf7(max);
    }

}
