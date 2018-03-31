package praktek2;

public class retengelAksi {
   public static void main(String[] args){
       retengel r1 = new retengel();
       r1.panjang = 9;
       r1.lebar = 3;
       
       r1.cetakInfo();
       System.out.println("luas retengel = "+r1.hitungluas());
       r1.cetakluas();
   
       retengel r2= new retengel();
       r2.cetakInfo();
       
       retengel r3= new retengel(50,30);
       r3.cetakInfo();
   } 
}
