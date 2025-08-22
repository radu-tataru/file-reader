import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileType = "txt"; // Change to "csv" to test CsvFileReader
        String filePath = "resources/websites." + fileType;

        FileReader reader;

        if (fileType.equals("txt")) {
            reader = new TxtFileReader();
        } else if (fileType.equals("csv")) {
            reader = new CsvFileReader();
        } else {
            System.out.println("Unsupported file type.");
            return;
        }

        List<String> websites = reader.readWebsites(filePath);
        WebsiteOpener websiteOpener =  WebsiteOpener.getInstance();
        for (String site : websites) {
            websiteOpener.openWebsite(site);
        }
    }
}
