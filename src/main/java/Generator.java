import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Generator {

    public String makeFile(Person prs) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(prs.getPESEL()+".txt", "UTF-8");
        writer.println("IMIE: " + prs.getFirstName());
        writer.println("NAZWISKO: " + prs.getLastName());
        writer.println("MIASTO: " + prs.getCity());
        writer.println("PESEL: " + prs.getPESEL());
        writer.close();
        return "Zapisano osobę: " + prs.getFirstName() + " " + prs.getLastName() + ", zamieszkały/a w " + prs.getCity() + ", numer PESEL: " + prs.getPESEL();

    }
}
