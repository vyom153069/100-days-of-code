//leetcode 705 implementation
//solution
class MyHashSet {

    /** Initialize your data structure here. */
    int [] hash;
    public MyHashSet() {
        hash = new int[10];
    }
    
    public void add(int key) {
        if (key >= hash.length) hash = addLength(hash, key);
        hash[key] = 1;
    }
    
    public void remove(int key) {
        if (key < hash.length) hash[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (key >= hash.length) return false;
        if (hash[key] == 1) return true;
        return false;
    }
    
    /** Expand the size of the storge*/
    private int[] addLength (int [] arr, int target) {
        int[] newArray = new int [target+1];
        System.arraycopy(arr,0,newArray,0,arr.length);
		return newArray;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */