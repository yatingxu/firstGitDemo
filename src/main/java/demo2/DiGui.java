package demo2;

public class DiGui {
    public static void main(String[] args) {
        int i=febonacci(4);
        System.out.println(i);
    }

    // 打印第n项斐波那契数列
    public static int febonacci(int i){
        if (i==1 || i==2){
            return 1;
        } else {
            return febonacci(i-1)+febonacci(i-2);
        }
    }
}
