import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/07/24
 * Time: 14:03
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] an=new int[2];
        /*int i,j=0;
        for(i=0;i<nums.length;i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    an[0]=i;
                    an[1]=j;
                    break;          //我写的
                } else {
                    continue;
                }
            }
        }*/
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                an[0]=i;
                an[1]=hash.get(nums[i]);
                return an;                     //别人写的，一个循环
            }
            hash.put(target-nums[i],i);
        }
        return an;
    }
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution so = new Solution();
        int[] answer=so.twoSum(nums,target);
        System.out.println(answer[0]+"+"+answer[1]);
    }
}