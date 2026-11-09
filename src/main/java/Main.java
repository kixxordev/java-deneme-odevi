
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("Sinavdaki soru sayisi 20 olarak belirlendi.");
        
        System.out.print("Sinavda kac dogru yaptin?");
        int dogru = girdi.nextInt();
        
        if(dogru > 20 || dogru < 0) {
            
            System.out.println("Gecersiz bir sayi girdigin icin islem sonlandirildi.");
            System.exit(0);
            
        } else {
            
            System.out.print("Tamamdir. Peki kac yanlis yaptin?");
            int yanlis = girdi.nextInt();
            
            if (yanlis > 20 || yanlis < 0) {
                
                System.out.println("Gecersiz bir sayi girdigin icin islem sonlandirildi.");
                System.exit(0);
                
            } else {
                
                int bos = 20 - (dogru + yanlis);
                int gDogru = yanlis / 4 ; // 4 yanlıştan dolayı giden doğru sayısı
                int net = dogru - gDogru;
                
                    /*
                    Başarı kriterleri yazılmamıştı, ben de kendim karar verdim.

                    0-4 Net -> Başarısız
                    5-9 Net -> Orta Başarısız
                    10-14 Net -> Orta Başarılı
                    15-20 -> Başarılı

                    */
                
                if(net >= 15 && net <= 20) {
                    
                    System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                    System.out.println("Net Sayin: " + net);
                    System.out.println("Net sayina gore basari durumun: Basarili");
                    
                    
                } else {
                    
                    if (net >= 10 && net < 15) {
                        
                        System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                        System.out.println("Net Sayin: " + net);
                        System.out.println("Net sayina gore basari durumun: Orta Basarili");
                    
                        
                    } else {
                        
                        if (net >= 5 && net < 10) {
                            
                            System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                            System.out.println("Net Sayin: " + net);
                            System.out.println("Net sayina gore basari durumun: Orta Basarisiz");
                    
                            
                        } else {
                            
                            if (net >= 0 && net < 5) {
                                
                                System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                                System.out.println("Net Sayin: " + net);
                                System.out.println("Net sayina gore basari durumun: Basarisiz");
                    
                                
                            } else {
                                
                                System.out.println("Hesaplamada bir hata olustu. Program sonlandiriliyor..");
                                System.exit(0);
                                
                            }
                            
                        }
                    }
                    
                }
                
            }
            
        }
    
    }
}
