package Question;

/*
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 示例：
 *               s = "leetcode"
 *               返回 0
 *               s = "loveleetcode"
 *               返回 2
 * 提示：你可以假定该字符串只包含小写字母。
 * */

import java.util.ArrayList;

public class Question387 {

    public static void main(String[] args) {
        String string = "loveleetcode";
        System.out.println(firstUniqChar(string));
    }

    public static int firstUniqChar(String s) {
        if (s == null || s.equals("")) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

}
