

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratorTests extends Generator {

    @Test
    public void makeFileTest() throws FileNotFoundException, UnsupportedEncodingException {
        Person person = new Person();

        assertEquals("Zapisano osobę: Janusz Biznesman, zamieszkały/a w Poznań, numer PESEL: 44051401458", makeFile(person));
    }


}
