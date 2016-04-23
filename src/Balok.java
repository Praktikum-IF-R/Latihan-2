/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2new;

/**
 *
 * @author Lenovo
 */
public class Balok {
    private int panjang, lebar, tinggi;
    
    public void setPanjang(int a){
        panjang = a;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int b){
        lebar = b;
    }
    public int getLebar(){
        return lebar;
    }
    public void setTinggi(int c){
        tinggi = c;
    }
    public int getTinggi(){
        return tinggi;
    }
    public Balok(int a, int b, int c){
        panjang = a;
        lebar = b;
        tinggi = c;
    }
    public double Kell(){
        double kell = ((2*getPanjang())+(2*getLebar()));
        return kell;
    }
    public double Luas(){
        double luas = (getPanjang()*getLebar());
        return luas;
    }
    public double Volume(){
        double vol = (getPanjang()*getLebar()*getTinggi());
        return vol;
    }
    public void display(){
        System.out.println("Memiliki luas sebesar : "+Luas());
        System.out.println("Memiliki keliling     : "+Kell());
        System.out.println("Memiliki volume       : "+Volume());
    }
}
