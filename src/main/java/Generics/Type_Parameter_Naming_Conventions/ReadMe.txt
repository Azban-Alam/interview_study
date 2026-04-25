// Generic class with T
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

// Using E for elements
class MyList<E> {
    private ArrayList<E> list = new ArrayList<>();
    public void add(E element) { list.add(element); }
    public E get(int index) { return list.get(index); }
}

// Using K and V for maps
Map<String, Integer> scores = new HashMap<>();
scores.put("Ali", 95);
scores.put("Sara", 88);

| Symbol | Meaning 	| Typical Usage Example 						|
| --- 	 | --- 	  	| ---                                    		|
| **T**  | Type    	| ``class ``Box`` ``{ ``T ``value; ``}`` 		|
| **E**  | Element 	| ``class ``ArrayList`` ``{ ``... ``}``  		|
| **K**  | Key     	| ``Map``K, ``V>`` (like ``HashMap``K,V>``) 	|
| **V**  | Value   	| ``Map``K, ``V>`` 							    |
| **N**  | Number 	| ``class ``Calculator`` ``{ ``... ``}`` 		|