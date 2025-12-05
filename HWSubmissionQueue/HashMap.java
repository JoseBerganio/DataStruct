public class HashMap {
    private final int capacity;
    private final Item[] items;

    public HashMap(int capacity){
        this.capacity = capacity;
        this.items = new Item[this.capacity];
    }

    //Get the Student ID
    public String get(String key){
        int index = this.hashFunction(key);
        Item currentItem = this.items[index];

        while(currentItem != null){
            if(currentItem.key.equals(key)){
                return currentItem.value;
            }
            currentItem = currentItem.next;
        }
        return null;
    }

    //put student
    public void put(String key, String value){
        Item newNode = new Item(key, value);
        int computedIndex = this.hashFunction(key);

        Item headItem = this.items[computedIndex];
        Item current = headItem;

        while (current != null){
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        newNode.next = headItem;
        this.items[computedIndex] = newNode;
    }


//use polynomial rolling hash
public int hashFunction(String key){    
    int p = 31;          // small prime number
    int hash = 0;
    int Capacity = this.capacity;  
    for (int i = 0; i < key.length(); i++) {
            hash = (hash * p + key.charAt(i)) % Capacity;
        }
        
        return hash;
} 
}

