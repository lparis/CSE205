//**************************************************************************************************
// CLASS: Queue (Queue.java)
//
// DESCRIPTION
// Implements a queue data structure where the elements of the Queue are stored in a DList.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************

/**
 * Implements a queue data structure using a DList to store the elements.
 */
public class Queue {

    private DList mList;

    /**
     * Creates a new empty Queue by creating a new empty DList.
     */
    public Queue() {
        setList(new DList());
    }

    /**
     * Removes all of the elements from this Queue. After clear() returns this Queue is empty.
     */
    public void clear() {
        getList().clear();
    }

    /**
     * Removes and returns the element that is at the front of this Queue.
     */
    public Integer dequeue() {
        Integer front = getList().remove(0);
        return front;
    }

    /**
     * Adds pData to the rear of this Queue.
     */
    public void enqueue(Integer pData) {
        getList().append(pData);
    }

    /**
     * Accessor method for mList.
     */
    protected DList getList() {
        return mList;
    }

    /**
     * Returns true if this Queue is empty.
     */
    public boolean isEmpty() {
        return getList().isEmpty();
    }

    /**
     * Returns the front element of this Queue without removing it.
     */
    public Integer peek() {
        return getList().get(0);
    }

    /**
     * Mutator method for mList.
     */
    protected void setList(DList pList) {
        mList = pList;
    }

    /**
     * Overrides toString() inherited from Object. Returns a String representation of the elements
     * of this Queue by calling the DList.toString() method.
     */
    @Override
    public String toString() {
        return getList().toString();
    }

}
