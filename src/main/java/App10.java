import java.util.HashMap;
import java.util.Map;

public class App10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String a = "this is a test, and that is also a test!";
        HashMap<String,Integer> hm = new HashMap<>();
        String[] arr = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            hm.put(str, hm.containsKey(str) ? hm.get(str)+1 : 1);
        }
        for (Map.Entry<String, Integer> c : hm.entrySet()) {
            String key = c.getKey();
            int volue = c.getValue();
            sb.append(key).append("=").append(volue).append(" ");
        }
        System.out.println(sb.substring(0));
    }

}
