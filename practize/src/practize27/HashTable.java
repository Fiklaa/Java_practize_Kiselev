package practize27;

import java.util.HashMap;

public class HashTable {
    private HashMap<Integer, String> table;

    public void hashtabInit() {
        table = new HashMap<>();
    }

    public void hashtabAdd(int key, String value) {
        table.put(key, value);
    }

    public String hashtabLookup(int key) {
        return table.get(key);
    }

    public void hashtabDelete(int key) {
        table.remove(key);
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit();

        hashTable.hashtabAdd(1, "Apple");
        hashTable.hashtabAdd(2, "Banana");
        hashTable.hashtabAdd(12, "Cherry");

        System.out.println("Элемент с ключом 1: " + hashTable.hashtabLookup(1));
        System.out.println("Элемент с ключом 12: " + hashTable.hashtabLookup(12));

        hashTable.hashtabDelete(1);
        System.out.println("После удаления ключа 1: " + hashTable.hashtabLookup(1));
    }


}
