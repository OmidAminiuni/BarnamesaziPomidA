import java.util.*;

public class mainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ADD UNIstudent ID :");
        int a=scanner.nextInt();
        System.out.println("ADD your score : ");
        int b=scanner.nextInt();
        System.out.println("WHATS YOUR NAME?");
        String name=scanner.next();
        HashMap <Integer,String> hashlist1=new HashMap< Integer,String>();
        hashlist1.put(1,name);
        HashMap < Integer,Integer> hashlist2=new HashMap< Integer,Integer>();
        hashlist2.put(1,a);
        hashlist2.put(2,b);
        System.out.println(hashlist2.get(1));
        System.out.println(hashlist2.get(2));
        System.out.println(hashlist1.get(1));
    }
}
