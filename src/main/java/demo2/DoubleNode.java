package demo2;

/**
 * 循环双链表
 */
public class DoubleNode {
    // 上一个节点，当为一个节点时，上一个节点和下一个节点都是其本身
    DoubleNode pre = this;
    // 下一个节点
    DoubleNode next = this;
    // 节点数据
    Integer data;

    public DoubleNode(Integer data){
        this.data=data;
    }

    // 增节点
    public void after(DoubleNode node) {
        // 先获得当前节点的下一个节点的下一个节点
        DoubleNode nextNext = this.next.next;
        // 将当前节点的下一个节点指定为新节点
        this.next=node;
        // 将新节点的上一个节点指定为当前节点
        node.pre=this;
        // 将新节点的下一个节点指定为当前节点的下一个节点的下一个节点
        node.next=nextNext;
        // 将当前节点的下一个节点的下一个节点的上一个节点指定为新节点
        nextNext.pre=node;
    }

    // 下一个节点
    public DoubleNode next() {
        return this.next;
    }

    // 上一个节点
    public DoubleNode pre() {
        return this.pre;
    }

    // 获得数据
    public Integer getData() {
        return this.data;
    }
}
