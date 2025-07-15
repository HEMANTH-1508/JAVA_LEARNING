import java.util.HashMap;

public class SlidingString {
    public static void main(String[] args) {
        String s = "abcdeabceed";
        String[] arr = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0, j = 0, maxLength = 0, startIndex = 0;
        while (i < arr.length) {
            String ch = arr[i];
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 1) {
                String l = arr[j];
                map.put(l, map.get(l) - 1);
                if (map.get(l) == 0) {
                    map.remove(l);
                }
                j++;
            }
            if (i - j + 1 >= maxLength) {
                maxLength = i - j + 1;
                startIndex = j;
            }
            i++;
        }

        String result = "";
        for (int n = startIndex; n < startIndex + maxLength; n++) {
            result += arr[n];
        }
        System.out.println(result);
    }
}
