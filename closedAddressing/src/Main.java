//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashTable tbl=new HashTable(10);
        tbl.put(8,"v1");
        tbl.put(13,"v2");
        tbl.put(10,"v3");
        tbl.put(4,"v4");
        tbl.put(6,"v5");
        tbl.put(13,"v6");
        tbl.put(23,"v7");
        tbl.put(10,"v8");
        tbl.put(4,"updated");

        String value=tbl.get(4);
        if(value==null){
            System.out.println("key is not found");

        }else {
            System.out.println("key is "+value);
        }

    }
}