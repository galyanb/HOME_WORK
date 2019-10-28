import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList<T> implements List {
    private T[] elementT;
    private T[] delta;
    private int DEFAULT_SIZE =10;
    private int allSize=0;

    public MyArrayList(){
        elementT = (T[])(new Object[DEFAULT_SIZE]);
    }

    public MyArrayList(int value) {
        if (value > 0) {
            elementT = (T[])(new Object[value]);
        } else {elementT = (T[])(new Object[DEFAULT_SIZE]);
        }
    }

    public void printList(){
        int i=0;
        while (i<this.elementT.length){
            System.out.println(i+"-ый элемент = "+ this.elementT[i++]);
        }
    }

    private void newArray (){
        delta = (T[]) (new Object[this.elementT.length + DEFAULT_SIZE]);
        for (int i = 0; i < this.elementT.length; i++) {
            delta[i] = elementT[i];
        }
        this.elementT = delta;
    }

    @Override
    public int size() {
        return this.allSize;
    }

    @Override
    public T get(int index) {
        if (index < this.size()){
            return this.elementT[index];}
        else return null;
    }
    @Override
    public T set(int index, Object element) {
        // this.elementT[index]= (T)element;
        return null;
    }

    @Override
    public boolean add(Object o) {
        if ((this.allSize+1) > this.elementT.length) {
            newArray();
        }
        this.elementT[this.allSize++] = (T) o;
        return true;
    }
    @Override
    public void add(int index, Object element) {
        while (index >= this.elementT.length) {
            newArray();
        }
        if ((this.allSize+1) > this.elementT.length) {
            newArray();
        }
        if (get(index) != null){
            for (int i=this.allSize; i>index; i--){
                this.elementT[i]=this.elementT[i-1];
            }
        }
        this.elementT[index] = (T) element;
        ++this.allSize;
        //       System.out.println("length: "+this.elementT.length);
    }
    @Override
    public boolean addAll(Collection c) {
        int size = this.allSize;
        for (Object element: c) {
            add(element);
        }
        if (this.allSize > size){
            return true;
        } else return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        int size = this.allSize;
        for (Object element: c) {
            add(index++,element);
        }
        if (this.allSize>size){
            return true;
        } else return false;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        int l=this.size();
        Object[] newArray = new Object[l];//new Array[l];
        for (int i=0; i<l;i++) {
            newArray[i] = this.get(i);
        }
        // return new Object[l];
        return newArray;
    }
    @Override
    public Object[] toArray(Object[] a) {
        int l=a.length;
        Object[] newArray = new Object[l];//new Array[l];
        for (int i=0; i<l;i++) {
            newArray[i] = a[i];
        }
        // return new Object[l];
        return newArray;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
}
