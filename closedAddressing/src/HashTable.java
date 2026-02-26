import java.util.LinkedList;
import java.util.List;

public class HashTable {
    static class Entry{
        private int key;
        private String value;
        public Entry(int k, String v){
            this.key = k;
            this.value = v;
        }
    }
    private final int SIZE;
    private List<Entry> arr[];
    public HashTable(int size){
        this.SIZE = size;
        arr=new List[SIZE];
        for(int i=0;i<SIZE;i++){
            arr[i]=new LinkedList<>();
        }

    }
    private int h(int k){return k%SIZE;}
    public void put(int k, String v){

        int slot=h(k);
        if(!arr[slot].isEmpty()){
            for(Entry e:arr[slot]){
                if(k==e.key){
                    e.value=v;
                    return;
                }
            }
        }
        Entry e=new Entry(k,v);
        arr[slot].add(e);
    }
    public String get(int k){
        int slot=h(k);
        if(!arr[slot].isEmpty()){
            for(Entry e:arr[slot]){
                if(k==e.key){
                    return e.value;
                }
            }
        }
        return null;
    }
}
