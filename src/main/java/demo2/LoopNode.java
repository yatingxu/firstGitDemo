package demo2;


/**
 * 节点类
 */
public class LoopNode {
    // 节点内容：数据
    private Integer data;
    // 下一个节点
    private LoopNode next;

    public LoopNode(int data) {
        this.data=data;
    }

    // 获取下一个节点
    public LoopNode next(){
        return this.next;
    }

    // 获取节点中的数据
    public Integer getData() {
        return this.data;
    }

    // 往链表中插入节点
    public void after(LoopNode node) {
        // 获得当前节点的下一个节点，作为下下一个节点
        LoopNode nextNode = this.next;
        // 令当前节点的下一个节点等于新插入的节点
        this.next = node;
        // 新插入节点的下一个节点等于currentNode
        node.next=nextNode;
    }
}
