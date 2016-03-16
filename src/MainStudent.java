package praktikumbab2;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(30);
        chris.setScience(50);
        chris.setEnglish(60);
        chris.displayMessage();
    }
}