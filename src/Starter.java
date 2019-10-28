public class Starter {

    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>(5);
        MyArrayList<Integer> myList1 = new MyArrayList<>(10);
        // System.out.println(myList.size());
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
//        myList.printList();
        myList.add(0,15);
//        myList.printList();
//        System.out.println(myList.size());
        System.out.println("myList1");
       // myList1.toArray(myList);
        myList.printList();
      //  myList1.addAll(myList);
    }
}
