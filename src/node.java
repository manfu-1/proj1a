public class node {
    public int value;
    public node next;
    public node prev;

    public node(int v){
        this.value=v;
        this.prev=null;
        this.next=null;
    }

    public void connect(node nextNode){
        this.next=nextNode;
        nextNode.prev=this;
    }
} 