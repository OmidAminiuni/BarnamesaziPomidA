package ClassExercise;

public class mainClass {
    public static void main(String[] args) {
        info obj1 =new info();
        obj1.setName("Omid");
        obj1.setFamily("Amini");
        obj1.setAge(18);
        obj1.setPass(666666);
        obj1.setUsername("Omiddev");
        obj1.setJob("Web Developer");
        System.out.println(obj1.getName());
        System.out.println(obj1.getFamily());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getPass());
        System.out.println(obj1.getUsername());
        System.out.println(obj1.getJob());

    }
}
