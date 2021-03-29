import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Boolean debugMode = false;

        do {
        Person person = new Person();
        person.scanData();
        Generator generator = new Generator();
        String ret = generator.makeFile(person);
        System.out.println(ret);
        }
        while(debugMode);
    }
}
