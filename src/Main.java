public class Main {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println(map);

        System.out.println("get('banana'): " + map.get("banana"));
        map.put("banana", 22);
        System.out.println("get('banana') after update: " + map.get("banana"));

        map.remove("apple");
        System.out.println("remove 'apple': " + map);
    }

}