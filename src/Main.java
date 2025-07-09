public class Main {
    public static void main(String[] args) {
        linked_list l=new linked_list(1);
        System.out.println(l.toString());
        l.addLast(0b111111).addLast(123).addLast(1234).addFirst(0x1A);
        System.out.println(l.toString());
        System.out.println(l.toStringRv());
        var pos=2;
        System.out.println("the value of node "+pos+" is: "+l.getNode(pos));
        System.out.println("total: "+l.size());
    }
}
