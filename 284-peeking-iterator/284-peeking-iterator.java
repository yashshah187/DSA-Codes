// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
   Iterator<Integer> it;
    Integer p;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
       it=iterator;
        if(it.hasNext())
        {
            p=it.next();
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
         return p;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer n = p;
        if(it.hasNext()){
            p=it.next();
        }else{
            p=null;
        }
        return n;
        
	}
	
	@Override
	public boolean hasNext() {
	    return p!=null;
	}
}