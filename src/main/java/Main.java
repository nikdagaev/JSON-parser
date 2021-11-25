import com.fasterxml.jackson.databind.ObjectMapper;
import example.Example;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader reader;
        ObjectMapper mapper = new ObjectMapper();

        try {
            reader = new FileReader("C:/Users/Никита/Downloads/uk_final.json");// тут путь к файлу выставляешь
            Example example = mapper.readValue(reader, Example.class);
            System.out.println(example);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
