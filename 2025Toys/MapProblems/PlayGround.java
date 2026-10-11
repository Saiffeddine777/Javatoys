
import java.util.HashMap;
import java.util.Map;

public class PlayGround {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
            return map;
        }
        return map;

    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            Map<String, String> returnedMap = new HashMap<String, String>();
            returnedMap.put("a", map.get("a"));
            returnedMap.put("ab", map.get("a").concat(map.get("b")));
            returnedMap.put("b", map.get("b"));
            map.remove("a");
            map.remove("b");
            map.remove("ab");
            returnedMap.putAll(map);
            return returnedMap;

        }

        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")){
            map.put("ice cream" ,"cherry");
        }
        
        Map <String ,String> toReturn = new HashMap<String , String>(map);
        toReturn.put("bread", "butter");
        return toReturn;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }

        return map; 
    }


    public Map<String, String> topping3(Map<String, String> map) {
        if( map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }
        if (map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;
    }




    public static void main(String[] args) {

    }

}