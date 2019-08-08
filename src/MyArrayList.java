import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private int DEFAULT_PACACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_PACACITY];
    }

    public MyArrayList(int pacacity) {
        this.DEFAULT_PACACITY = pacacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_PACACITY() {
        return DEFAULT_PACACITY;
    }

    public void setDEFAULT_PACACITY(int DEFAULT_PACACITY) {
        this.DEFAULT_PACACITY = DEFAULT_PACACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add(int index, E e) {
        ensurePacacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E get(int i) {
        return (E) elements[i];
    }

    private void ensurePacacity() {
        if (this.size >= elements.length) {
            int newSize = this.size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public E remove(int index) {
        checkIndex(index);
        for(int i = index; i < size -1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return (E) elements[index];
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("So Ngoai Mang!!!");
        }
    }

    public int size() {
        return size;
    }

    public E clone() {
        return (E) this;
    }

    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (!contains(e)) {
            elements[size++] = e;
            return true;
        } else return false;
    }
    public void clear(){
        elements = new Object[DEFAULT_PACACITY];
    }
}
