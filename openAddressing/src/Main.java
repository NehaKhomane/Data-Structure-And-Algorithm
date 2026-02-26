//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hashtable tble=new Hashtable(7);
        tble.put(8,"v1");
        tble.put(10,"v2");
        tble.put(13,"v3");
        tble.put(3,"v4");
        tble.put(6,"v5");
        tble.put(9,"v6");
        tble.put(8,"v7");
        tble.put(10,"updated");
        String value=tble.get(8);
        System.out.println(value);
        if(value==null){
            System.out.println("null");
        }else {
            System.out.println("value:"+value);
        }

    }
}