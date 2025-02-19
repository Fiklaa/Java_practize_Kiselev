package practize21.n2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Solution<T, V, K> {
    private T tValue;
    private V vValue;
    private K kValue;

    public Solution(T tValue, V vValue, K kValue) {
        this.tValue = tValue;
        this.vValue = vValue;
        this.kValue = kValue;
    }

    public static <T> List<T> newArrayList(T... elemenets) {
        List<T> list = new ArrayList<>();
        for (T element: elemenets) {
            list.add(element);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... elemenets) {
        Set<T> set = new HashSet<>();
        for (T element: elemenets) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(K[] keys, V[] values) {
        Map<K, V> map = new HashMap<>();
        int length = Math.min(keys.length, values.length);
        for (int i = 0; i < length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public T getTValue() {
        return tValue;
    }

    public K getKValue() {
        return kValue;
    }

    public V getVValue() {
        return vValue;
    }

    public static void main(String[] args) {
        List<String> list = Solution.newArrayList("one", "two", "three");
        System.out.println("ArrayList: " + list);

        Set<Integer> set = Solution.newHashSet(1, 2, 3, 4, 5);
        System.out.println("HashSet: " + set);

        String[] keys = {"a", "b", "c"};
        Integer[] values = {1, 2, 3};
        Map<String, Integer> map = Solution.newHashMap(keys, values);
        System.out.println("HashMap: " + map);

        Solution<String, String, Integer> solution = new Solution<>("ExampleT", "ExampleK", 100);
        System.out.println("T value: " + solution.getTValue());
        System.out.println("K value: " + solution.getKValue());
        System.out.println("V value: " + solution.getVValue());
    }

}
