package practize27;


public class testhashTable {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit();

        for (int i = 1; i <= 10; i++) {
            hashTable.hashtabAdd(i, "Value" + i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ключ: " + i + ", Значение: " + hashTable.hashtabLookup(i));
        }
    }
}