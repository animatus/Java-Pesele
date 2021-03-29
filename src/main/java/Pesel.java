

public class Pesel {

    String pesel;

    public String getPesel() {
            return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public static boolean isValid(String pesel){
        if(isValidLength(pesel) && IsCheckSumValid(pesel))
        {
            return true;
        }

        return false;
    }

    public static boolean isValidLength(String pesel) {
        if (pesel.length() < 11)
        {
            System.out.println("Wprowadzony PESEL jest za krótki");
            return false;
        }

        else if (pesel.length() > 11)
        {
            System.out.println("Wprowadzony PESEL jest za długi");
            return false;
        }

        else
            {
            return true;
        }
    }

    static int[] toArray(String s) {

        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.digit(s.charAt(i), 10);
        }
        return intArray;
    }

    static int getInt(char c)
    {
        return Character.getNumericValue(c);
    }

    public static boolean IsCheckSumValid(String pesel){
        //char PESEL[] = pesel.toCharArray();//peselConvert(pesel);
        int PESEL[] = toArray(pesel);
        int sum =   9 * PESEL[0] +
                    7 * PESEL[1] +
                    3 * PESEL[2] +
                    1 * PESEL[3] +
                    9 * PESEL[4] +
                    7 * PESEL[5] +
                    3 * PESEL[6] +
                    1 * PESEL[7] +
                    9 * PESEL[8] +
                    7 * PESEL[9];

        sum %= 10;

        if (sum == PESEL[10]) {
            return true;
        }
        else {
            System.out.println("Podano nieprawidłowy numer PESEL");
            return false;
        }
    }




}
