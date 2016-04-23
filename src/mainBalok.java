/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2new;

import java.util.Scanner;
public class mainBalok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int a = in.nextInt();
        System.out.print("Masukkan lebar   : ");
        int b = in.nextInt();
        System.out.print("Masukkan tinggi  : ");
        int c = in.nextInt();
        System.out.println("Hasil object ke-1 adalah");
        Balok b1 = new Balok(a,b,c);
        b1.Luas();
        b1.Kell();
        b1.Volume();
        b1.display();
        System.out.println("------------------------");
        System.out.println("Hasil object ke-2 adalah");
        Balok b2 = new Balok(a,b,c);
        b2.Luas();
        b2.Kell();
        b2.Volume();
        b2.display();
        System.out.println("------------------------");
        System.out.println("Hasil object ke-3 adalah");
        Balok b3 =new Balok(a,b,c);
        b3.Luas();
        b3.Kell();
        b3.Volume();
        b3.display();
        System.out.println("------------------------");
    }
}
