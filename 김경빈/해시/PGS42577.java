import java.util.*;
class PGS42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : phone_book) {
            map.put(str, 1);
        }
        
        for(String str : phone_book) {
            for(int i = 1; i < str.length(); i++) {
                if(map.containsKey(str.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}
