package launcher;

import org.junit.jupiter.api.Test;
import java.nio.file.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TxtFileReaderTest {

    @Test
    public void testReadWebsites() throws Exception {
        String testFilePath = "src/test/resources/test_websites.txt";
        Files.write(Paths.get(testFilePath), List.of(
            "https://www.google.com",
            "https://www.microsoft.com"
        ));

        TxtFileReader reader = new TxtFileReader();
        List<String> websites = reader.readWebsites(testFilePath);

        assertEquals(2, websites.size());
        assertEquals("https://www.google.com", websites.get(0));
        assertEquals("https://www.microsoft.com", websites.get(1));
    }
}
