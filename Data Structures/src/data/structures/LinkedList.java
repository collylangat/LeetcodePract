
package data.structures;

public class LinkedList {
    
    
    
    Node head;
    
    
    public void deleteAt(int index){
        
        if (index  == 0 ){
            head = head.next;
        }else{
            Node node = head;
            
            for(int i=0;i<index;i++){
                node = node.next;  
            }
            Node newNext = node.next;
            
        }
    }
    
    public void insert(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head==null){
            head = node;  
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node; 
        }  
    }
    
    public void show(){
        Node node = head;
        /*
        
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }*/
        do{
            System.out.println(node.data);
            node = node.next;
            
        }while(node.next != null);
        System.out.println(node.data);
        
    }
    
    public void insertStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        node.next = head.next;
        head = node;
    }
    
    public int size(){
        Node n = head;
        int counter = 0;
        while(n==null){
            n = n.next;
            counter++;
        }
        return counter++;    
    }
    
    
    
    public boolean isEmpty(){
        if (head ==null){
            return true;
        }
        return false;
        
    }
    
    
    
    
    public void insertAt(int pos,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (pos==0){
            insertStart(data);
        }else{
            Node n = head;
        for(int i=0;i<pos--;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
            
        }
        
    }
    
        
    
}
