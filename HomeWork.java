import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int temp=1;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一串数字：");
        while(temp!=-1)//输入-1来结束输入。
        {
            temp=in.nextInt();
            if(temp!=-1)
                list.add(temp);
        }
        temp=0;
        System.out.println("排序后的结果：");
        Collections.sort(list);
        for(Integer i:list)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("请输入另一串数字：");
        while(temp!=-1)
        {
            temp=in.nextInt();
            if(temp!=-1)
                list.add(temp);
        }
        Collections.sort(list);
        System.out.println("合并后的结果为：");
        for(Integer i:list)
        {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}
