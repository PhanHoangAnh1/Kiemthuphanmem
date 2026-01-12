import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentAnalyzerTest {
   
    StudentAnalyzer analyzer = new StudentAnalyzer();

   @Test
public void testCountExcellentStudents() {
    System.out.println("--- Đang kiểm tra hàm đếm học sinh giỏi ---"); 
    assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, -1.0)));
    assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
}

    @Test
    public void testCalculateValidAverage() {
        assertEquals(8.167, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0)), 0.01);
    }
}