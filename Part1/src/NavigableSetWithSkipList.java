import java.util.*;

public class NavigableSetWithSkipList<E extends Comparable<E>>
        implements NavigableSet<E> {

    private SkipList<E> skipList;

    /**
     * Constructor
     */
    public NavigableSetWithSkipList(){
        skipList = new SkipList<>();
    }

    /**
     * Adds the element only if the specified element is not
     * already present in the set
     * @param e to be added
     * @return true if the element is not present in the set
     * else it returns false if the element is already present
     * in the set
     */
    @Override
    public boolean add(E e) {
        return skipList.add(e);
    }

    /**
     * Removes the specified element from the set
     * @param o To be removed element
     * @return true if the element is already present in
     * the set otherwise return false
     */
    @Override
    public boolean remove(Object o) {
        return skipList.remove((E) o);
    }

    /**
     * Return true if the set is empty
     * @return true if the set is empty
     */
    @Override
    public boolean isEmpty() {
        return skipList.size() == 0;
    }

    /**
     * Return true if the specified element in the set
     * @param o the element
     * @return true if the specified element in the set
     * otherwise return false
     */
    @Override
    public boolean contains(Object o) {
        return (skipList.find((E) o)) != null;
    }

    /**
     * Return size
     * @return size
     */
    @Override
    public int size() {
        return skipList.size();
    }

    /**
     * Returns an iterator over the elements in this set
     * @return an iterator
     */
    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public String toString(){
        return skipList.toString();
    }


    ////////////////////////////////////////////////

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E lower(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E floor(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E ceiling(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E higher(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Comparator<? super E> comparator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E first() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E last() {
        throw new UnsupportedOperationException();
    }
}
