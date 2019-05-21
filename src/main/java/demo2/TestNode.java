package demo2;

public class TestNode {
    public static void main(String[] args) {
       DoubleNode d1=new DoubleNode(1);
       DoubleNode d2=new DoubleNode(2);
       DoubleNode d3=new DoubleNode(3);
       DoubleNode d4=new DoubleNode(4);
       d1.after(d2);
        System.out.println(d1.pre.getData());
        System.out.println(d2.pre.getData());
    }
}
