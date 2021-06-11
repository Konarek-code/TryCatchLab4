import java.util.Scanner;
public class Start {
    public static void main(String[] args)
    {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj liczbe");
      int liczba ;
      int popr = 0;
        try{

            liczba = Integer.parseInt(odczyt.nextLine());
        }
        catch(NumberFormatException a){
            System.out.println("twoja liczba nie jest intem wprowadz ja jeszcze raz" );
            popr = odczyt.nextInt();
        }
        finally {
            System.out.println("twoja liczba to: ");
            System.out.println(popr);
        }
    }


}
