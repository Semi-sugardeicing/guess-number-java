import java.util.Random;               //导入Random类
import java.util.Scanner;              //导入Scanner类
public class Main {
    public static void main(String[] args) {//主函数入口
        
        Scanner scanner = new Scanner(System.in); //创建Scanner对象

        int a = 0;                         //定义变量a  临时变量
        int s = 0;                         //定义变量s  设定猜次 
        int t = 0;                         //定义变量t  实际猜次
        int x = 0;                         //定义变量x  起始数字
        int y = 0;                         //定义变量y  末尾数字
        
        System.out.println("Hello java!"); //打印字符串
        System.out.println("java-真难");   //打印字符串
        System.out.println();

        System.out.println("那我们先准备猜数字吧\n得按住字母[Q]可以退出\n"); 

        while (true) {
            
        System.out.print("请输入起始数字：");

        if (scanner.hasNextInt()) {  
            x = scanner.nextInt();         //获取输入的整数
            break;                         //跳出循环
        }else { 
            scanner.next();                 //清除输入缓冲区
        }
        } 

        while (true) { 
            
        System.out.print("请输入末尾数字：");

        if (scanner.hasNextInt()) {  
            y = scanner.nextInt();         //获取输入的整数
            break;                         //跳出循环
        }else { 
            scanner.next();                 //清除输入缓冲区
        }
        }
        
        while (true) { 
            
        System.out.print("请输入猜的次数：");

        if (scanner.hasNextInt()) {  
            s = scanner.nextInt();         //获取输入的整数
            break;                         //跳出循环
        }else { 
            scanner.next();                 //清除输入缓冲区
        }
        }

        if (x>y) {       //判断x和y的大小
            a = x;   //交换x和y的值
            x = y;      
            y = a;  
        }
        Random random = new Random(); //创建Random对象
        int n = random.nextInt(y-x+1) + x;
        
        while (t < s) {
    System.out.print("请猜一个数字 (范围 " + x + " ~ " + y + "，按 Q 退出): ");
    
    if (scanner.hasNextInt()) {
        int guess = scanner.nextInt();
        t = t + 1; // 次数加1

        if (guess > n) {
            System.out.println("猜大了！");
        } else if (guess < n) {
            System.out.println("猜小了！");
        } else {
            System.out.println("🎉 恭喜你，猜对了！你一共猜了 " + t + " 次。");
            break; 
        }
    } else {
        // 如果输入的不是整数，可能是字母
        String input = scanner.next();
        if (input.equalsIgnoreCase("Q")) {
            System.out.println("游戏已退出，喵~");
            return; // 直接结束 main 方法，退出游戏
        } else {
            System.out.println("🚨 输入错误，请输入纯数字或按 Q 退出！");
        }
    }
}

// 次数用光判定
if (t == s) {
    System.out.println("很遗憾，次数用光了。正确的数字是：" + n);
}











    }
}