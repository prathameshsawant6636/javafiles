
public class Cost {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items:" + items);
        System.out.println("Cost of items:" + costPerItem + currency);
        System.out.println("Number of Total cost:" + totalCost + currency);

    }

}
