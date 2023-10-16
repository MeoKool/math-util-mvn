/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsq.mathutil.core;

/**
 *
 * @author saeququangsss
 */
// clas này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
// cái gì mà dung chung cho nhiều nơi, nhận info, trả về info qua hàm
// mà ko cần lưu trữ gì hết, cái đó nên là STATIC
// ĐỒ NÀO LÀ STATIC THÌ GỌI TRỰC TIẾP QUA CLASS
// KBH GỌI STATIC QUA CON ĐƯỜNG NEW!!!!
public class MathUtility {

    public static final double PI = 3.14;

    // hàm tính n! = 1.2.3.4....n
    // không có giai thừa số âm, n<0 ko tính được
    // nếu n quá lớn thì tràn kiểu long, long chỉ chịu được 18 số 0
    // 20! vừa đủ 18 số 0, do đó ko tính giai thừa từ 21 trở đi
    // 0!=1!=1 quy ước
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay đi
        }        // sống sót đến chỗ này, sure n = 2..20 
        // 2 cụm if ở trên rồi, ko cần else nếu trước đó xài return
        long result = 1; //giai thừa khởi đầu là 1
        // nhân dần 2 3 4 5 ... n vào biến này thành n!
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
