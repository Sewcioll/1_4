import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int menu;
    double a,b;
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Wybierz liczbe od 1-4: ");
    menu = scanner.nextInt();
    
    System.out.println("Podaj liczbe a: ");
    a = scanner.nextInt();
   
    System.out.println("Podaj liczbe b: ");
    b = scanner.nextInt();
     if(menu>4)
    {
    System.out.println("BRAK OPCJI!!!.");
      
    }
   
    switch(menu)
      {
        case 1:
          System.out.println("Wybrales opcje 1.");
          double suma;
          suma=a+b;
          System.out.println("Wynik dodawania a + b = "+suma);
          break;
        case 2:
          System.out.println("Wybrales opcje 2.");
          double roznica;
          roznica=a-b;
          System.out.println("Wynik odejmowania a - b = "+roznica);
          break;
        case 3:
          System.out.println("Wybrales opcje 3.");
          double iloczyn;
          iloczyn=a*b;
          System.out.println("Wynik mnozenia a * b = "+iloczyn);
          break;
        case 4:
          System.out.println("Wybrales opcje 4.");
          double iloraz;
          if(b==0)
          {
            System.out.println("Nie mozna dzielic przez 0!.");
            break;
          }
           else
          {
            iloraz=a/b;
            System.out.println("Wynik dzielenia a / b = "+iloraz);
          }
           break;
      }
  }
}