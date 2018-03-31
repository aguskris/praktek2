package praktek2;
public class retengel {
    double panjang;
    double lebar;
    
    public retengel(){
        panjang=5;
        lebar=2;
    }
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("panjang : "+panjang);
        System.out.println("lebar :    "+lebar);
        System.out.println("===================");
        
        double hitungluas(){
            double luas;
            luas=panjang*lebar;
            return luas;
    }
        
        void cetakluas(){
            System.out.println("luasnya adalah: "+hitungluas());
        }
    }
}
