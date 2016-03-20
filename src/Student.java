package praktikumbab2;
public class Student {
    private String name;
    private String address;
    private int umur;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int jumlahobjek;
    private String status;
    public Student() {
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahobjek++;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAddress(String a) {
        address = a;
    }
    public void setAge(int ag) {
        age = ag;
    }
    public void setMath(double math) {
        mathGrade = math;
    }
    public void setEnglish(double english) {
        englishGrade = english;
    }
    public void setScience(double science) {
        scienceGrade = science;
    }
    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    public int getJumlahObjek() {
        return jumlahobjek;
    }
    public void jumlahObjek() {
        System.out.println("Objek yang ada adalah " +getJumlahObjek());
    }
    public boolean statusakhir(double average) {
        if (average >= 61) {
            status = "Tidak Remedial";
            return true;
        } else if (average <= 61) {
            status = "Remedial";
        }
        return false;
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        statusakhir(getAverage());
        System.out.println("Status: " + status);
        System.out.println();
    }
}
