public class ArrayList {
    private static int initialSize = 5;
    private static int multiplier = 2;
    private int currIndex;
    private int currBucketSize;
    private String[] bucket;

    public ArrayList() {
        this.currIndex = 0;
        this.currBucketSize = initialSize;
        this.bucket = new String[initialSize];
    }

    public void add(String item) {
        if (this.currIndex > this.currBucketSize - 1) {
            this.resize(this.currBucketSize * multiplier);
        }
        this.bucket[this.currIndex] = item;
        this.currIndex++;

    }

    public void resize(int newLength) {
        String[] newBucket = new String[newLength];

        for (int i = 0; i < this.currBucketSize; i++) {
            newBucket[i] = this.bucket[i];
        }
        this.currBucketSize = newLength;
        this.bucket = newBucket;

    }

    public String getStringItems() {
        String buildString = "";
        for (int i = 0; i < this.currBucketSize; i++) {
            buildString += "Index [" + i + "]: " + this.bucket[i] + "\n";
        }
        return buildString;
    }
}
