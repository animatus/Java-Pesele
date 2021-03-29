import java.util.Scanner;

public class Person {
    String PESEL, City, firstName, lastName;

    public Person() {
        this.PESEL = "44051401458";
        this.City = "Poznań";
        this.firstName = "Janusz";
        this.lastName = "Biznesman";
    }

    public String getCity() {
        return City;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void scanData(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Miasto: ");
        City =scanner.nextLine();
        System.out.print("Imie: ");
        firstName =scanner.nextLine();
        System.out.print("Nazwisko: ");
        lastName =scanner.nextLine();
        System.out.print("Podaj pesel: ");
        PESEL =scanner.nextLine();
        if(!Pesel.isValid(PESEL)){
            return;
        }
        else System.out.println("Dane poprawne ");

    }

}
