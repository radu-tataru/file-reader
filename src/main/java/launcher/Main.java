package launcher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileType = "txt";
        String filePath = "src/test/resources/test_websites.txt";

        FileReader reader = FileReaderFactory.createReader(fileType);
        WebsiteOpener opener = WebsiteOpener.getInstance();

        List<String> websites = reader.readWebsites(filePath);
        for (String site : websites) {
            opener.openWebsite(site);
        }
    }
}
