public class linked_list {
    public node sentinel=new node(111);
    
    public linked_list(){

    }

    public linked_list(int v){
        node newNode = new node(v);
        this.sentinel.next=newNode;
        newNode.prev=this.sentinel;
    }

    public linked_list(node h){
        this.sentinel.next=h;
        h.prev=sentinel;
    }

    @Override
    public String toString(){
        if (sentinel.next==null){
            return "";
        }
        var strb=new StringBuilder();
        strb.append(sentinel.next.value);
        var curr=sentinel.next.next;
        while (curr!=null){
            strb.append(" --> ").append(curr.value);
            curr=curr.next;
        }
        return strb.toString();
    }

    public String toStringRv(){
        if (sentinel.next==null){
            return "";
        }
        var curr=sentinel.next;
        while (curr.next!=null) {
            curr=curr.next;
        }
        var strb=new StringBuilder();
        strb.append(curr.value);
        while (curr.prev!=sentinel) {
            curr=curr.prev;
            strb.append(" <-- ").append(curr.value);
        }
        return strb.toString();
    }

    public linked_list addLast(int v){
        node newNode=new node(v);
        var curr=sentinel;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.connect(newNode);
        return this;
    }

    public linked_list addFirst(int v){
        node newNode=new node(v);
        if (sentinel.next==null){
            sentinel.next=newNode;
            newNode.prev=sentinel;
            return this;
        }
        var curr=sentinel.next;
        newNode.connect(curr);
        sentinel.connect(newNode);
        return this;
    }

    public linked_list removeLast(){
        var curr=sentinel;
        while (curr.next!=null){
            curr=curr.next;
        }
        var previous=curr.prev;
        previous.next=null;
        curr.prev=null;
        return this;
    }

    public linked_list removeFirst(){
        if (sentinel.next==null){
            return this;
        }
        if (sentinel.next.next==null){
            return this.removeLast();
        }
        var curr=sentinel.next;
        var nextNode=curr.next;
        sentinel.connect(nextNode);
        curr.prev=null;
        curr.next=null;
        return this;
    }

    public int getNode(int pos){
        if (pos<0){
            return 0;
        }
        var curr=sentinel;
        for (int i=0;i<pos;i++){
            if (curr==null){
                return 0;
            }
            curr=curr.next;
        }
        return curr.value;
    }
	
    public int size(){
        int cnt=0;
        var curr=sentinel;
        while (curr.next!=null) {
            curr=curr.next;
            cnt++;
        }
        return cnt;
    }
    
    public boolean isEmpty(){
        if (sentinel.next==null){
            return true;
        }
        return false;
    }
	
// toList()

}