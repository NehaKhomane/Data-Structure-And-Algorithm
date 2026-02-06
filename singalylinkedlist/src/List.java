public class List {
    static   class Node{
        int data;
        Node next;
         public Node(int value){
            data=value;
            next=null;
        }
    }
    private Node head;//restrict the access outside the class
    public List(){
        head=null;
    }
    public boolean isEmpty(){return head==null;}
    public void addFirst(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            Node trav=head;
            while(trav.next!=null){
                trav=trav.next;
                trav.next=newNode;
            }
        }


    }
    public void addPosition(int value,int pos){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
        }
        else if(pos<=1){
            newNode.next=head;
            head=newNode;
        }else {
            Node trav=head;
            for(int i=1;i<pos-1 && trav.next!=null;i++){
                trav=trav.next;
                //b. add pos node into next of newnode
                newNode.next=trav.next;
                //c. add newnode into next of pos - 1 node
                trav.next=newNode;
            }

        }
    }
    public void deleteFirst(){
        if(head==null)
            return;
        head=head.next;


    }
    public void deleteLast(){
        if(head==null)
            return;
        else if(head.next==null){
            head=null;
        }else {
            Node trav=head;
            while(trav.next.next!=null){
                trav=trav.next;
                trav.next=null;
            }
        }
    }
    public void deletePosition(int value,int pos){
        if(pos<1 || head==null)
            return;
        else if(pos==1){
            head=head.next;
        }else  {
            Node trav=head;
            for(int i=1;i<pos-1 && trav.next!=null;i++){
                trav=trav.next;

            }
            if(trav.next != null){
                trav.next=trav.next.next;
            }
        }
    }
    public void display(){
        Node trav=head;
        System.out.println("List");
        while(trav!=null){
            System.out.println(trav.data);
            trav=trav.next;
        }
        System.out.println("");
    }
}
