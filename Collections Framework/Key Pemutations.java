/*

Write a program to print all permutations of a given string.
Each element in a map is uniquely identified by its key value.

{ a : @ , s : $ , i : ! }

Input string - pass
p@s$ , pa$$ aise aye output.

*/
import java.util.*;
public class Main
{
    public static HashMap<Character,Character> map;
    public static List<String> res;
	public static void main(String[] args) {
	    //Initalizing the map
		map = new HashMap<>();
		map.put('a','@');
		map.put('s','$');
		map.put('i','!');
		String s = "pass";
		res = new LinkedList<>();
		helper(s,0,new StringBuilder());
		System.out.println(res);
	}
	public static void helper(String s, int idx , StringBuilder sb) {
	    for(int i = idx ; i < s.length() ; i++) {
	        if(map.containsKey(s.charAt(i))) {
	            int size = sb.length();
	            sb.append(map.get(s.charAt(i)));
	            helper(s,i+1,sb);
	            sb.setLength(size);
	        }
	        sb.append(s.charAt(i));
	    }
	    if(sb.length() == s.length()) {
	        res.add(sb.toString());
	        return;
	    }
	}
}
