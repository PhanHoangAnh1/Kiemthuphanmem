import org.junit.Test;                
import static org.junit.Assert.*;    
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {
   
    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, -1.0)));
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage() {
        assertEquals(8.167, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0)), 0.01);
    }
}