// Problem link : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_Two {
    static String removeDuplicates(String s, int k) {
        int flag, lastPop = 0;
        do {
            int count = 1;
            flag = 0;
            Stack<Character> stk = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                Character ch = new Character(s.charAt(i));
                if (count > 1 && s.charAt(i - 1) != s.charAt(i)) {
                    count = 1;
                }
                stk.push(ch);
                //System.out.println("line 17 " + stk);
                if (lastPop == 1) {
                    lastPop = 0;
                    continue;
                }
                if (i > 0 && s.charAt(i - 1) == s.charAt(i) && count < k && lastPop == 0) {
                    count++;
                    if (count == k) {
                        int j = 0;
                        flag = 1;
                        while (j < k) {
                            stk.pop();
                            j++;
                        }
                        count = 1;
                        lastPop = 1;
                    }
                }
            }
            //System.out.println("\n\n\n\n");
            char[] chArr = new char[stk.size()];
            int m = 0;
            while (!stk.empty()) {
                chArr[m] = stk.pop();
                m++;
            }
            String string = String.valueOf(chArr);
            StringBuilder sb = new StringBuilder();
            // append a string into StringBuilder sb
            sb.append(string);
            // reverse StringBuilder sb
            sb = sb.reverse();
            s = sb.toString();
        }
        while (flag == 1);
        return s;
    }

    // Driver code
    public static void main(String args[]) {
        System.out.println(removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
