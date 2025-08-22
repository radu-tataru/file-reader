public class Main {
    public static void main(String[] args) {
        String fileType = "json"; // Change to "txt" or "csv" to test other readers
        String filePath = "resources/websites." + fileType;

        FileReader reader = FileReaderFactory.createReader(fileType);
        WebsiteOpener opener = WebsiteOpener.getInstance();

        for (String site : reader.readWebsites(filePath)) {
            opener.openWebsite(site);
        }
    }
}
