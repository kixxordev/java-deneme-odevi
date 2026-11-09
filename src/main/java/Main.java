
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
                if(dogru + yanlis <= 20) {
                    
                    int bos = 20 - (dogru + yanlis);
                    int gDogru = yanlis / 4 ; // 4 yanlıştan dolayı giden doğru sayısı
                    int net = dogru - gDogru;

                        /*
                        -5 - 5 Net -> Geliştirilmeli
                        6-9 Net -> Orta
                        10-14 Net -> İyi
                        15-20 -> Çok İyi

                        */

                    if(net >= 15 && net <= 20) {

                        System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                        System.out.println("Net Sayin: " + net);
                        System.out.println("Net sayina gore basari durumun: Cok İyi");


                    } else {

                        if (net >= 10 && net < 15) {

                            System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                            System.out.println("Net Sayin: " + net);
                            System.out.println("Net sayina gore basari durumun: İyi");


                        } else {

                            if (net >= 6 && net < 10) {

                                System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                                System.out.println("Net Sayin: " + net);
                                System.out.println("Net sayina gore basari durumun: Orta");


                            } else {

                                if (net >= -5 && net < 6) {

                                    System.out.println("Sinav sonucun: " + dogru + " dogru, " + yanlis + " yanlis, " + bos + " bos.");
                                    System.out.println("Net Sayin: " + net);
                                    System.out.println("Net sayina gore basari durumun: Gelistirilmeli");


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
}
