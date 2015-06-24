package polymorphism;

/**
 *
 * @author PiperZzz
 */
public class PolymorphismPractice {

    public static void main(String[] str) {
        Student student = new Phd();
        student.print();
        
        System.out.println(student.getClass());
        System.out.println(student instanceof Phd);
        System.out.println(student instanceof Student);
    }
}
