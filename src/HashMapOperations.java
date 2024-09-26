import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapOperations {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("HashMap after adding elements: " + map);

        // 2. Count the number of key-value (size) mappings in a map
        System.out.println("Size of the HashMap: " + map.size());

        // 3. Copy all of the mappings from the specified map to another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.println("New map after copying: " + newMap);

        // 4. Remove all of the mappings from a map
        newMap.clear();
        System.out.println("New map after clearing: " + newMap);

        // 5. Check whether a map contains key-value mappings (empty) or not
        System.out.println("Is newMap empty? " + newMap.isEmpty());

        // 6. Get a shallow copy of a HashMap instance
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map.clone();
        System.out.println("Shallow copy of the map: " + shallowCopy);

        // 7. Test if a map contains a mapping for the specified key
        System.out.println("Does map contain key 2? " + map.containsKey(2));

        // 8. Test if a map contains a mapping for the specified value
        System.out.println("Does map contain value 'Banana'? " + map.containsValue("Banana"));

        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Set view of mappings: " + entrySet);

        // 10. Get the value of a specified key in a map
        System.out.println("Value for key 1: " + map.get(1));

        // 11. Get a set view of the keys contained in this map
        Set<Integer> keySet = map.keySet();
        System.out.println("Set view of keys: " + keySet);

        // 12. Get a collection view of the values contained in this map
        Collection<String> values = map.values();
        System.out.println("Collection view of values: " + values);
    }
}
