/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/07/25
 * Time: 11:47
 */
public class isPalindrome {
    public boolean isPalindrome(int x){
        boolean flag=false;
        int re=0;
        int i = x;
        if(x<0){
            return flag;
        }
        else{
            for(;i>0;){
               re=re*10+i%10;//根据前一天的整数反转想到的
               i=i/10;  //这段反转代码也是看昨天整数反转评论得来的
            }
            if(x==re){
                flag=true;
            }
        }
        return flag;
    }
}
