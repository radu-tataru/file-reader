package launcher;

import java.io.IOException;
import java.util.Arrays;

public class WebsiteOpener {
    private static WebsiteOpener instance;

    private WebsiteOpener() {}

    public static WebsiteOpener getInstance() {
        if (instance == null) {
            instance = new WebsiteOpener();
        }
        return instance;
    }

    public void openWebsite(String url) {
        try {
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(Arrays.asList("cmd.exe", "/c", "start", "chrome", url));
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
