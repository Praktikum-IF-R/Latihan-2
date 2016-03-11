package mainbalok;
import java.util.Scanner;
public class MainBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p[]= new int[3];
        int l[]= new int[3];
        int t[]= new int[3];
        for(int i=0; i<p.length;i++){
            System.out.print("Panjang Balok "+(i+1)+" : ");
            p[i]=input.nextInt();
        }
        System.out.println("------------------------");
        for(int i=0; i<l.length;i++){
            System.out.print("Lebar Balok "+(i+1)+" : ");
            l[i]=input.nextInt();
        }
        System.out.println("------------------------");
        for(int i=0; i<t.length;i++){
            System.out.print("Tinggi Balok "+(i+1)+" : ");
            t[i]=input.nextInt();
        }
        System.out.println("------------------------");
        //instansiasi object
        Balok b1 = new Balok(p[0],l[0],t[0]);
        Balok b2 = new Balok(p[1],l[1],t[1]);
        Balok b3 = new Balok(p[2],l[2],t[2]);
        //menampilkanoutput
        System.out.println("Hasil object ke-1 adalah");
        b1.display();
        System.out.println("------------------------");
        System.out.println("Hasil object ke-2 adalah");
        b2.display();
        System.out.println("------------------------");
        System.out.println("Hasil object ke-3 adalah");
        b3.display();
        System.out.println("------------------------");
    }
}