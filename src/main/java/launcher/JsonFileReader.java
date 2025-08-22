package launcher;

import org.json.JSONArray;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class JsonFileReader implements FileReader {
    @Override
    public List<String> readWebsites(String filePath) {
        List<String> websites = new ArrayList<>();
        try {
            String content = Files.readString(Paths.get(filePath));
            JSONArray array = new JSONArray(content);
            for (int i = 0; i < array.length(); i++) {
                websites.add(array.getString(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return websites;
    }
}
