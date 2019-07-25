import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/07/24
 * Time: 16:05
 */
public class reverseInteger {
    public int reverse(int x) {
        int mark=0;
        long an=0;
        /*if(x>2147483647||x<-2147483648){
            return an;
        }*/
        ArrayList<Integer> anlist = new ArrayList<>();
        for(int i=0;i<11;i++){
            if(x!=0){
                anlist.add(i,x%10);
                x=x/10;
            }
            else{
                anlist.add(i,x%10);
                mark=i;
                break;
            }                    //想的太复杂了，写得多的不行，评论全是大佬
        }
        for(int i=0;i<mark;i++){                //int疯狂溢出，必须用long，想了半天问题在哪里
            long temp=anlist.get(i)+an*10;
            if(temp>Integer.MAX_VALUE||temp<Integer.MIN_VALUE){
                temp=0;
                an=temp;        //an 不能用int，temp强制转换也不行
                break;

            }
            else{
                an=temp;
            }
        }
        return (int)an;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        reverseInteger ri = new reverseInteger();
        int an=ri.reverse(x);
        System.out.println(an);
    }
}
