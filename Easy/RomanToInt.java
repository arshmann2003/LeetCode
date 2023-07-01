package Easy;
import java.util.HashMap;

class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int n = s.length();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = map.get(s.charAt(i));
            if (i < n - 1 && num < map.get(s.charAt(i + 1))) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }
}
