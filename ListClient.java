public class ListClient {
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        list1.add(18);
        list1.add(4);
        list1.add(27);
        list1.add(9);
        list1.add(5);
        list1.add(63);
        System.out.println(list1);
        // uncomment to test
        list1.backToFront();
        System.out.println(list1);
    }
}