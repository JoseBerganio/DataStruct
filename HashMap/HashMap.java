public class HashMap {
    private int capacity;
    private Item[] items;


    public HashMap(int capacity){
        this.capacity = capacity;
        this.items = new Item[this.capacity];
    }

    public String get(String key){
        int index = this.hashFunction(key);
        Item currentItem = this.items[index];
        while(currentItem != null){
            // if the current match to what we are looking for
            // return the Item
            if(currentItem.key.equals(key)){
                return currentItem.value;
            }
            currentItem = currentItem.next;
        }
        return null;
    }

    public void put(String key, String value){
        Item newNode = new Item(key, value);
        int computedIndex = this.hashFunction(key);

        Item headItem = this.items[computedIndex];
        Item current = headItem;
    
        while (current  != null) {
            if(current.key.equals(key)){
                current.value = value; // update
                return; // exit
            }
            current = current.next;
        }
        newNode.next = headItem;
        this.items[computedIndex] = newNode;
    }

    public void printAll() {
        for (int i = 0; i < this.capacity; i++) {
            Item current = this.items[i];
            if (current != null) {
                System.out.print("Index " + i + ":  ");
                while (current != null) {
                    System.out.print(current.key + ": \"" + current.value + "\"");
                    if (current.next != null) {
                        System.out.print(", "); // separate entries in same index
                    }
                    current = current.next;
                }
                System.out.println();
            }
        }
    }

    public int hashFunction(String key){
        int sum = 0;
        int numberOfCharacters  = key.length();
        for (int i = 0; i < numberOfCharacters; i++) {
            sum += key.charAt(i);
        }
        return sum % this.capacity;
    }
}
