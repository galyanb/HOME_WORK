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
        this.elementT[index]= (T)element;
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
        Object[] element = c.toArray();
        for (int i=0; i<element.length;i++){
            add(element[i]);
        }
        if (this.allSize > size){
            return true;
        } else return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        int size = this.allSize;
        Object[] element = c.toArray();
        for (int i=0; i<element.length;i++){
            add(index+i,element[i]);
        }
        if (this.allSize>size){
            return true;
        } else return false;
    }
    @Override
    public boolean isEmpty() {
        return this.allSize>0;
    }

    @Override
    public boolean contains(Object o) {
        return this.indexOf(o)>-1;
    }

    @Override
    public Iterator iterator() {
        Object[] obj = this.toArray();
       Iterator it = new Iterator() {
           int count=-1;
           @Override
           public boolean hasNext() {
              return (obj[count+1] != null);
           }

           @Override
           public Object next() {
               return obj[++count];
           }
       };
       return it;
    }

    @Override
    public Object[] toArray() {
        int l=this.size();
    //    System.out.println("l collection="+l);
        Object[] newArray = new Object[l];//new Array[l];
        for (int i=0; i<l;i++) {
            newArray[i] = this.get(i);
        }
        return newArray;
    }
    @Override
    public Object[] toArray(Object[] a) {
        int l=a.length;
        Object[] newArray = new Object[l];//new Array[l];
        for (int i=0; i<l;i++) {
            newArray[i] = a[i];
        }
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
        int index= -1;
        int i =0;
        while ((index ==-1)&&(i< this.elementT.length)) {
             if(this.elementT[i]!=null){
                    if (this.elementT[i]==(T)o) {
                        index = i;
                    }
            }
            i++;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int i = indexOf(o);
        int index = i;
        if (index >-1){
        while (i< this.elementT.length) {
            if(this.elementT[i]!=null){
                if (this.elementT[i]==(T)o) {
                    index = i;
                }
            }
            i++;
        }
        }
        return index;
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
        if (toIndex<= this.elementT.length) {
            List subList = new MyArrayList(toIndex - fromIndex + 1);
            for (int i = 0; i<=(toIndex - fromIndex); i++){
                subList.add(i,this.elementT[fromIndex+i]);
            }
            return subList;
        }
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
        Object[] element = c.toArray();
        boolean bool = false;
        int i=0;
        while ((i<element.length) && (bool=this.contains(element[i]))){
            i++;
        }
        return bool;
    }

//    static <T> void sort(List<T> list, Comparator<? super T> c) {
//        Collections.sort(list, new Comparator<T>() {
//            @Override
//            public int compare(T o1, T o2) {
//                int rez;
//                if (o1.equals(o2)) {return 0;}
//                else {
//                    if (o1<o2) return 1;}
//                return -1;
//            }
//        });
//
//    }
}
