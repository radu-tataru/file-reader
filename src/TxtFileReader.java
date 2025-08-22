import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class TxtFileReader implements FileReader {
    @Override
    public List<String> readWebsites(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
