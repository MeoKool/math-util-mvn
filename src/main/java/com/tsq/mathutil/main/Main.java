/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tsq.mathutil.main;

import com.tsq.mathutil.core.MathUtility;

/**
 *
 * @author saeququangsss
 * 0976849500
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case #1 xem mô tả chi tiết ở phần ghi chú
        int n = 0; //hàm ý kiểm tra 0!
        long expected = 1; // hàm ý rằng, hy vọng rằng n = 0! phải trả về 1
        long actual = MathUtility.getFactorial(0); // thực tế là mấy, gọi hàm là biết ngay
        // so sánh giữa expected == actual hay ko
        System.out.println(n + "! -> expected: " + expected + " | actual: " + actual);
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(5);
        System.out.println(n + "! -> expected: " + expected + " | actual: " + actual);
    }

}
// DÂN DEV VIẾT RA CODE: HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM TEST CODE CỦA MÌNH
// TEST CODE CỦA CHÍNH MÌNH LÀM RA
// CÓ 3 CÁCH
// CÁCH 1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM

// CÁCH 2: IN RA LOG FILE
// CÁCH 3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO - THƯ VIÊN ĐEM VÀO !!!!
// NHƯNG DÙ LÀ KIỂM THỬ THẾ NÀO THÌ CŨNG GỒM 3 CÔNG VIỆC
// THIẾT KẾ TEST CASE
// THỰC THI TETS CASE - TEST RUN
// GHI BUG NẾU CÓ = LOG BUG
// TEST CASE LÀ: BỘ DATA ĐƯA VÀO APP ĐỂ XEM APP HÀNH XỬ ĐÚNG KO?
//  KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ GIỐNG KO
// KÈM THÊM HDSD APP VỚI DATA ĐƯA VÀO
// KÈM THÊM TRẠNG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI
// CẤU TRÚC CỦA 1 TEST CASE NHƯ SAU
//(DÙNG TỎNG THỰC TẾ ĐI LÀM, VÀ DÙNG TRONG BÀI THI PE)
// MỘT TEST CASE GỒM NHỮNG INFO SAU:
// TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
// EXPECTED RESULT | STATUS(PASSED) | FAILED
// test case là tình huống xài app với bộ data đưa vào và giá trị kì vọng phải trả về
// giờ ta test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng k
// test case #1: verify getFactorial(with n=0) check 0! correct or not?
// TEST STEPS/PROCEDURE
//          1.given n = 0
//          2. Call/invoke getFactorial(n =0)
//EXPECTED RESULT:
//          the method must return 1 as the result of 0!
//STATUS: PASSED | FAILED, just watting the method returns value

//CÂU 3 BÀI THI PE VIẾT RA KHOẢNG 10 CÁI TEST CASE NHƯ TRÊN
// test case #2: verify getFactorial(with n=5) check 5! correct or not?
// TEST STEPS/PROCEDURE
//          1.given n = 5
//          2. Call/invoke getFactorial(n =5)
//EXPECTED RESULT:
//          the method must return 120 as the result of 5!
//STATUS: PASSED | FAILED, just watting the method returns value
