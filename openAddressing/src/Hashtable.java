public class Hashtable {
    static class Entry{
        private int key;
        private String value;
        public Entry(int k, String v){
            this.key = k;
            this.value = v;

        }
    }
    private final int SIZE;
    private Entry arr[];
    public Hashtable(int size){
        SIZE = size;
        arr = new Entry[SIZE];
    }
    private int h(int k){
        return k % SIZE;
    }
    private int h(int k, int i){
        return (h(k)+i)%SIZE;
    }
    public void put(int k, String v){
        int slot=h(k);
        int i=1;
        while(arr[slot]!=null){
            if(k==arr[slot].key){
                arr[slot].value=v;
                return;
            }
            slot=h(k,i++);

        }
        arr[slot]=new Entry(k,v);
    }
    public String get(int k){
        int slot=h(k);
        int i=1;
        while(arr[slot]!=null){
            if(k==arr[slot].key){
                return arr[slot].value;
            }
            slot=h(k,i++);
        }
        return null;
    }

}
