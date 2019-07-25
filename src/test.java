import java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/07/25
 * Time: 11:48
 */
public class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*isPalindrome ip = new isPalindrome();
        int x = sc.nextInt();
        System.out.println(ip.isPalindrome(x));*/
        romanToInt iti = new romanToInt();
        String s = sc.nextLine();
        System.out.println(iti.romanToInt(s));
    }
}
