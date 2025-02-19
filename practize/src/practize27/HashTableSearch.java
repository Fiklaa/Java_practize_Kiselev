package practize27;

public class HashTableSearch {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit();

        hashTable.hashtabAdd(1, "Apple");
        hashTable.hashtabAdd(2, "Banana");

        System.out.println("Найдено: " + hashTable.hashtabLookup(1));

        hashTable.hashtabDelete(1);
        System.out.println("После удаления: " + hashTable.hashtabLookup(1));
    }

}
