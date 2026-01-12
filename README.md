# Kiemthuphanmem

CHƯƠNG 1: 
05/01/2026
![image1](image1.png)

CHƯƠNG 2:Kiểm thử với Junit

## 1. Thông tin chung
- Họ và tên: Phan Hoàng Anh
- Mã sinh viên: BCS23016
- Môn học: Kiểm thử phần mềm
- Công cụ: VS Code, Java, Maven, JUnit 4.

## 2. Mô tả bài toán
Xây dựng lớp `StudentAnalyzer` để phân tích điểm số học sinh với yêu cầu xử lý dữ liệu chặt chẽ (Validate dữ liệu đầu vào).

### Các chức năng đã cài đặt:
1.  `countExcellentStudents(List<Double> scores)`:
    - Mục tiêu: Đếm số học sinh giỏi (Điểm >= 8.0).
    - Logic: Duyệt danh sách, bỏ qua các điểm số sai (< 0 hoặc > 10).

2.  `calculateValidAverage(List<Double> scores)`:
    - Mục tiêu: Tính điểm trung bình của cả lớp.
    - Logic: Chỉ cộng tổng các điểm hợp lệ (0-10). Trả về 0.0 nếu danh sách rỗng để tránh lỗi chia cho 0.

## 3. Thiết kế kiểm thử (Test Cases)
Sử dụng JUnit 4 để viết các kịch bản kiểm thử tự động trong file `StudentAnalyzerTest.java`:

| STT | Kịch bản (Scenario) | Dữ liệu đầu vào (Input) | Mong đợi (Expected) |
|-----|---------------------|-------------------------|---------------------|
| 1   | Dữ liệu chuẩn | `9.0, 8.5, 7.0, -1.0` | Đếm giỏi: 2 (Bỏ qua -1.0) |
| 2   | Danh sách rỗng | `Empty List` | Trả về 0 |
| 3   | Dữ liệu biên | `8.0` | Đếm giỏi: 1 |
| 4   | Tính trung bình | `9.0, 8.5, 7.0` | Kết quả: ~8.167 |

## 4. Kết quả thực hiện
Code đã vượt qua tất cả các bài kiểm thử (All Tests Passed).

![Kết quả chạy JUnit](image2.png)


