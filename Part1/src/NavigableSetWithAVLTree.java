import java.util.*;

public class NavigableSetWithAVLTree<E extends Comparable<E>>
        implements NavigableSet<E> {

    private AVLTree<E> avlTree;
    private TreeSet<E> treeSet;


    /**
     * Constructor
     */
    public NavigableSetWithAVLTree(){
        avlTree = new AVLTree<>();
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
        return avlTree.add(e);
    }

    /**
     * Returns an iterator over the elements in this set
     * @return an iterator
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    /**
     * Returns all the elements of a navigable set before
     * specified element(which is passed as an argument)
     * @param toElement The element
     * @param inclusive if true, the method returns all the elements
     *                  before the specified element including the
     *                  specified element
     * @return all the elements of a navigable set before
     * specified element(which is passed as an argument)
     */
    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive){
        treeSet = new TreeSet<>();
        inOrder(avlTree.root, toElement);
        if (!inclusive)
            treeSet.remove(toElement);
        return treeSet;
    }

    private void inOrder(BinaryTree.Node<E> node, E target){
        if (node == null)
            return;
        inOrder(node.left, target);
        if (node.data.compareTo(target) > 0)
            return;
        else
            treeSet.add(node.data);
        inOrder(node.right, target);
    }


    /**
     * Returns all the elements of a navigable set after
     * specified element(which is passed as an argument)
     * @param fromElement The element
     * @param inclusive if true, the method returns all the elements
     *                  after the specified element including the
     *                  specified element
     * @return all the elements of a navigable set after
     * specified element(which is passed as an argument)
     */
    @Override
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        treeSet = new TreeSet<>();
        preOrder(avlTree.root, fromElement);
        if (!inclusive)
            treeSet.remove(fromElement);
        return treeSet;
    }

    private void preOrder(BinaryTree.Node<E> node, E target){
        if (node == null)
            return;
        if (node.data.compareTo(target) >= 0)
            treeSet.add(node.data);
        preOrder(node.left, target);
        preOrder(node.right, target);
    }

    //////////////////////////////////////

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
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
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean remove(Object o) {
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
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
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

    @Override
    public String toString() {
        return avlTree.toSetView();
    }
}
