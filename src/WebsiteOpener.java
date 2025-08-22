import java.io.IOException;

public class WebsiteOpener {
    private static WebsiteOpener instance;

    // Private constructor to prevent instantiation
    private WebsiteOpener() {}

    // Public method to provide access to the single instance
    public static WebsiteOpener getInstance() {
        if (instance == null) {
            instance = new WebsiteOpener();
        }
        return instance;
    }

    public void openWebsite(String url) {
        try {
            Runtime.getRuntime().exec("cmd /c start chrome " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}