import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class CsvFileReader implements FileReader {
    @Override
    public List<String> readWebsites(String filePath) {
        List<String> websites = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    websites.add(part.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return websites;
    }
}
