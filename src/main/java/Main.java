import com.fasterxml.jackson.databind.ObjectMapper;
import model.MainObjectJSON;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String uk = "src/main/resources/uk_final.json";
    private static final String en = "src/main/resources/en_final.json";
    private static final String ru = "src/main/resources/ru_final.json";

    public static void main(String[] args) {
        //
        MainObjectJSON objectJSON = parse(uk); //выбираешь локализацию (uk, en, ru)
        //
    }

    public static MainObjectJSON parse(String localization) {

        ObjectMapper mapper = new ObjectMapper();
        FileReader reader;
        MainObjectJSON result;
        try {
            reader = new FileReader(localization);
            result =  mapper.readValue(reader, MainObjectJSON.class);

        } catch (IOException e) {
            throw new RuntimeException("The problem has occurred while parsing. Check localization parameter.");
        }
        return result;
    }
}
