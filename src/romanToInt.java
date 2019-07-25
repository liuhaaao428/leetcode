import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/07/25
 * Time: 15:12
 */
public class romanToInt {
    public int romanToInt(String s) {
        int num = 0;
        int temp;
        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        if(s.length()==1){
            num=hash.get(s.charAt(0));
        }
        else{
            for(int i=1;i<s.length();){
                if((s.charAt(i-1)=='I'&&(s.charAt(i)=='V'||s.charAt(i)=='X'))||(s.charAt(i-1)=='X'&&(s.charAt(i)=='L'||s.charAt(i)=='C'))||(s.charAt(i-1)=='C'&&(s.charAt(i)=='D'||s.charAt(i)=='M'))){
                    temp=hash.get(s.charAt(i))-hash.get(s.charAt(i-1));
                    num=num+temp;
                    if(i+2==s.length()){
                        num=num+hash.get(s.charAt(i+1));
                        //i=i+1;
                        break;
                    }
                    else{
                        i=i+2;
                    }
                }
                else{
                    if(i==s.length()-1){
                        num=num+hash.get(s.charAt(i-1))+hash.get(s.charAt(i));
                        break;
                    }
                    else{
                        num=num+hash.get(s.charAt(i-1));
                        i++;
                    }

                }
            }
        }

        return num;
    }
}
