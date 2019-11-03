import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Starter {

    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>(5);
        MyArrayList<Integer> myList1 = new MyArrayList<>(10);
        int rez;
        // System.out.println(myList.size());
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
//        myList.printList();
        myList.add(0,3);
        myList.printList();
        rez=myList.indexOf(3);
        System.out.println(myList1.containsAll(myList));
//        System.out.println("rez "+rez);
//        System.out.println(myList.lastIndexOf(5));
        System.out.println("myList1");
        myList1.add(28);
       // myList1= Collections.sort(myList,new Comparator<Integer>());
       // myList1.toArray(myList);
       // myList.printList();
        myList1.addAll(0,myList);
        myList1.printList();
        System.out.println(myList1.containsAll(myList));
    }
}
