import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
    public void add(int index, Object element) {
        if (index >= this.elementT.length) {
            delta = (T[]) (new Object[this.elementT.length + DEFAULT_SIZE]);
            for (int i = 0; i < this.elementT.length; i++) {
                delta[i] = elementT[i];
//                System.out.println("element: "+this.elementT[i]);
//                System.out.println("delta: "+this.delta[i]);
            }
            this.elementT = delta;
        }
        this.elementT[index] = (T) element;
        ++this.allSize;
 //       System.out.println("length: "+this.elementT.length);
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
        int i=0;
        int l=this.size();
        T newArray[];
        if (l>0) {

        }
        return new Object[0];
    }
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
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
