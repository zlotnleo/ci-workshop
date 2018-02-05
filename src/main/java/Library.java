import java.util.Map;
import java.util.HashMap;

public class Library {
	private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fib(int n) {
    	if(memo.containsKey(n))
    		return memo.get(n);
    	int result;
    	if(n < 2)
    		result = 1;
    	else
    		result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
}
