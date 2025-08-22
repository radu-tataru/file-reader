public class FileReaderFactory {
    public static FileReader createReader(String fileType) {
        return switch (fileType.toLowerCase()) {
            case "txt" -> new TxtFileReader();
            case "csv" -> new CsvFileReader();
            default -> throw new IllegalArgumentException("Unsupported file type: " + fileType);
        };
    }
}