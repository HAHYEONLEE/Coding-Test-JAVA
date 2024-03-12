import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n >= 1 && n <= 1000) {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        } else {
            System.out.println("1 이상 1,000 이하의 숫자를 입력해주세요.");
        }
    }
}