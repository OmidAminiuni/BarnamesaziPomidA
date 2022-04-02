package Exercise3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("WHATS YOUR NAME?");
        String n=sc.nextLine();
        System.out.println("ADD YOUR ID :");
        int s=sc.nextInt();
        System.out.println("WHATS YOUR FATHERS NAME?");
        String a=sc.nextLine();
        String f=sc.nextLine();
        Generic student1=new Generic<>();
        student1.setName(n);
        student1.setStudentId(s);
        student1.setFatherName(f);
        System.out.println(student1.getFatherName());

        
        
        
    }
}
