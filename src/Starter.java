public class Starter {

    public static void printList(MyArrayList myList){

    }

    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>(5);
        System.out.println(myList.size());
        myList.add(0,1);
        myList.add(7,7);
        System.out.println(myList.size());
     // System.out.println(myList.);
//        System.out.println(myList.get(2));
//        System.out.println(myList.get(0));
//        System.out.println(myList.get(7));
        myList.add(20,10);
//        System.out.println(myList.get(2));
//        System.out.println(myList.get(0));
//        System.out.println(myList.get(10));
        System.out.println(myList.size());
    }
}
