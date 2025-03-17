import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj miejsce zamieszkania:");
        String miejsce = sc.nextLine();
        System.out.println("Podaj dzień tygodnia:");
        String dzien= sc.nextLine();
        System.out.println("Podaj wiek:");
        int wiek = sc.nextInt();
        int cenabiletu1=40;
        int znizka=0;


        if(dzien.equals("Czwartek")) {
            znizka = 100;
        }else if(wiek<10) {
            znizka = 100;
        }else if (wiek>=10 && wiek<=18) {
            znizka = 50;
        }else{
            if(miejsce.equals("Warszawa")){
                znizka=10;
            }
        }
        if(znizka>100){
            znizka=100;
        }
        double cenabiletu2=cenabiletu1*(100-znizka)/100;
        System.out.println("Data: "+miejsce+", "+wiek+" years old, "+dzien+" ,"+" Ticket price:"+cenabiletu2+ " PLN");
        System.out.println("Discount: "+ znizka + "%");
    }
}

