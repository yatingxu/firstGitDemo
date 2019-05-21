package demo2;


/**
 * 节点类
 */
public class Node {
    // 节点内容：数据
    private Integer data;
    // 下一个节点
    private Node next;

    public Node(int data) {
        this.data=data;
    }

    // 为当前节点追加节点，无论当前节点是否为最后一个节点
    public Node append(Node node){
//        this.next=node;
        // 将当前对象赋给当前节点保存
        Node curretntNode = this;
        // 判断当前节点是否是最后一个节点
        while (true){
            // 取出当前节点的下一个节点
            Node nextNode=curretntNode.next;
            // 如果下一个节点为null，则说明当前节点已经是最后一个节点
            if (curretntNode.next==null){
                break;
            }
            // 将下一个节点赋给当前节点
            curretntNode=nextNode;
        }
        // 为当前节点做追加节点操作
        curretntNode.next=node;
        return this;
    }

    // 获取下一个节点
    public Node next(){
        return this.next;
    }

    // 获取节点中的数据
    public Integer getData() {
        return this.data;
    }

    // 当前节点是否为最后一个节点
    public boolean isNext() {
        return this.next==null;
    }

    // 删除下一个节点
    public void removeNext() {
        // 获取当前节点的下一个节点的下一个节点
        Node nextNode = this.next.next;
        // 当前节点的下一个节点就等于当前节点的下一个节点的下一个节点
        this.next=nextNode;
    }

    // 显示链表数据
    public void show() {
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.getData()+" ");
            if (currentNode.next==null){
                break;
            }
            // 当前节点等于当前节点的下一个节点
            currentNode=currentNode.next;
        }
        System.out.println();
    }

    // 往链表中插入节点
    public void after(Node node) {
        // 获得当前节点的下一个节点，作为下下一个节点
        Node nextNode = this.next;
        // 令当前节点的下一个节点等于新插入的节点
        this.next = node;
        // 新插入节点的下一个节点等于currentNode
        node.next=nextNode;
    }
}
