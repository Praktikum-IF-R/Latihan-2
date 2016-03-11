package mainbalok;
public class Balok {
    double panjang;
    double lebar;
    double tinggi;
    double luas,kel,volume;
    public Balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
        getLuas();
        getKeliling();
        getVolume();
    }
    public void getLuas(){
        luas = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
    }
    public void getKeliling(){
        kel=4*(panjang+lebar+tinggi);
    }
    public void getVolume(){
        volume = panjang*tinggi*lebar;
    }
    public void display(){
        System.out.println("Memiliki luas sebesar : "+luas);
        System.out.println("Memiliki keliling : "+kel);
        System.out.println("Memiliki volume : "+volume);
    }
}