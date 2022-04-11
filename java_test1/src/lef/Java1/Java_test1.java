package lef.Java1;

import java.util.ArrayList;
import java.util.Scanner;

/*快捷键大全
 * psvm :主函数方法生成；
 * sout: 打印快捷；
 * ctrl+alt+L :格式化；
 * Alt + enter（回车） : 代码错误解决提示
 * Ctrl + D : 复制一行代码；
 * Ctrl + X : 剪切；
 * Ctrl + / : 批量单行注释；
 * Ctrl + shift + / : 多行注释
 * Alt + shift + 上 : 移动代码
 * Alt + shift + 下 : 移动代码
 * */
public class Java_test1 {
    public static void main(String[] args) {
        int ary[] = {12, 34, 46, 6887, 67, 23, 34, 15, 459, 95};
        int cont = 0;
//        Java_test1.max(ary, cont);
//        Java_test1.sc(ary, cont);
        //Java_test1.scMax();
        //fuhao();
        // jiaoHuan();
               String s = "dasf32";
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
             String ss = "dasf2";
        System.out.println(ss);
        System.out.println(ss);
        System.out.println(ss);
        s = "1";
        ss = "2";
        System.out.println(ss);


    }

    //查找最大值
    public static void max(int ary[], int cont) {
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > cont) {
                cont = ary[i];
            }
        }
        System.out.println(cont);
    }

    //查找录入值是否在数组里
    public static void sc(int ary[], int cont) {
        Scanner scanner = new Scanner(System.in);
        in:
        while (true) {
            System.out.println("请输入：");

            int sc = scanner.nextInt();
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == sc) {
                    System.out.println("恭喜你找到了索引为：" + i);
                    break in;
                }
            }
            System.out.println("没找到请继续输入；");
        }
    }

    //查找输入值后其中最大的值
    public static void scMax() {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        int max = 0;
        while (true) {
            int sc = scanner.nextInt();
            if (sc == -1) {
                String s = "";
                for (int i = 0; i < arrayList.size(); i++) {
                    s = s + arrayList.get(i) + ",";
                }
                System.out.println("当前已录入" + arrayList.size() + "个数据；分别为：" + s);
                System.out.println("欢迎下次光临；");
                break;
            }
            arrayList.add(sc);
            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i) > max) {
                    max = (int) arrayList.get(i);
                }
            }
            System.out.println("当前最大值为：" + max);
        }
    }

    public static void fuhao() {
        //符号位移实现乘二，高效率二进制计算；
        int i = 2;
        //<<乘2的次方
        //>>除以2的次方
        System.out.println(2 >> 1);//1
        System.out.println(2 >> 2);//0
        System.out.println(2 >> 3);//0
        System.out.println(2 << 3);//16
        System.out.println(2 << 2);//8
        System.out.println(2 << 1);//4
        //表示取反  ~ 二进制取反 0变1 1变0；
        System.out.println(~2);
        System.out.println("-----------------------");
        //异或运算符号的使用;将a和b的数值进行交换；
        int a = 2000;
        int b = 1011;
        a = b ^ a;
        System.out.println(a);
        b = a ^ b;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);

    }

    public static void jiaoHuan() {
        for (; 1 == 1; ) {
            System.out.println("for进来了");
            break;
        }
        //第一种for循环写法
        int end = 0;
        int star = 1;
        int cont = 1;
        for (; end <= star; ) {
            end++;
            System.out.println("w我进来了第：" + cont++);
        }
        //第二种for循环写法

        for (int end1 = 0, star1 = 1; end1 <= star1; end1++, star1--) {
            System.out.println("w我进来了第：" + cont++);
        }
    }
}
