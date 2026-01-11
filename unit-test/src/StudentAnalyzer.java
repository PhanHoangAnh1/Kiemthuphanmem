package src;
import java.util.List;

public class StudentAnalyzer {

    // Chức năng 1 (Issue #1): Đếm học sinh giỏi (>= 8.0)
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Double score : scores) {
            // Validate: Bỏ qua điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10)
            if (score < 0 || score > 10) {
                continue; 
            }
            if (score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    // Chức năng 2 (Issue #2): Tính điểm trung bình hợp lệ
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        int validCount = 0;
        for (Double score : scores) {
            // Chỉ tính tổng các điểm hợp lệ
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }
        // Tránh lỗi chia cho 0
        if (validCount == 0) return 0.0;
        
        return sum / validCount;
    }
}