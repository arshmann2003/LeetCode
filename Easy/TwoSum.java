package Easy;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] num, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;
        for(int i=0; i<n; i++){
           int x = target - num[i];
           if(map.containsKey(x)){
                arr[0] = i;
                arr[1] = map.get(x);
                return arr;
           }
            map.put(num[i], i);
        }
        return arr;
    }
}