package com.imalittletester.AssessmentTest;

import com.imalittletester.Assessment.DataProcessor;
import com.imalittletester.Assessment.UserData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AssessmentTest {

    public UserData user1 = new UserData(1, "km", Arrays.asList("123-202223110900", "12-202223110930", "34-202223110910",
            "65-20222211100", "123-202222110900", "12-202221110930", "34-202221110910", "65-20221011100"), 22, 7);
    public UserData user2 = new UserData(2, "mi", Arrays.asList("145-202223110900", "200-202223111000", "145-202223111100",
            "388-202223111200", "345-202223111300", "230-202223111400", "545-202223111500", "145-202223111600",
            "200-202223111700", "145-202223111800", "388-202223111900", "345-202223112000", "230-202223112100"), 22, 9);
    public UserData user3 = new UserData(3, "km", Arrays.asList("67-202222110900", "13-202221111901", "67-202220112202",
            "88-202219110601", "67-202218110900", "13-202217111901", "67-202216112202", "1000-202216112202"), 20, 7);
    public UserData user4 = new UserData(4, "km", Arrays.asList("100-202223110900", "13-202223111901", "67-202217112202",
            "88-202218110601"), 0, 6);
    public DataProcessor data1 = new DataProcessor(user1);
    public DataProcessor data2 = new DataProcessor(user2);
    public DataProcessor data3 = new DataProcessor(user3);
    public DataProcessor data4 = new DataProcessor(user4);

    @Test
    void test() {
        data1.display();
        System.out.println("-------");
        data2.display();
        System.out.println("-------");
        data3.display();
        System.out.println("-------");
        data4.display();
        System.out.println("-------");

    }
}
