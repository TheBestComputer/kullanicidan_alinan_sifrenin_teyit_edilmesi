
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        String userName, password, sifirlama, yeniSifre;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici adiniz : ");
        userName = scanner.nextLine();
        
        System.out.print("Sifreniz : ");
        password = scanner.nextLine();
        
        if(userName.equals("Patika") && password.equals("java123")){
            System.out.println("Giris yaptiniz ! ");
        }
        else{
            System.out.println("******************************************");
            System.out.println("Sifrenizi sifirlamak icin : Evet\nSifirlamamak icin : Hayir");
            System.out.println("******************************************");
            System.out.print("Sifrenizi sifirlamak istiyor musunuz? : ");
            sifirlama = scanner.nextLine();
            
            
            switch (sifirlama) {
                case "Evet":
                    System.out.print("Yeni sifrenizi giriniz : ");
                    yeniSifre = scanner.nextLine();
                    yeniSifre = (yeniSifre.equals("java123") || yeniSifre.equals(password)) ? "Şifre oluşturulamadı, lütfen başka şifre giriniz." : "Şifre oluşturuldu";
                    System.out.println(yeniSifre);
                    break;
                case "Hayır":
                    System.out.println("Program bitti...");
                    break;
                default:
                    System.out.println("Evet ya da Hayir girmrdiniz, program sonlandi...");
                    break;
            }
        }
        
    }
}
