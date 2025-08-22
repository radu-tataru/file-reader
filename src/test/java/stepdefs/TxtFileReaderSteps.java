package stepdefs;

import io.cucumber.java.en.*;
import launcher.TxtFileReader;

import java.nio.file.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TxtFileReaderSteps {
    private List<String> websites;

    @Given("a txt file with website URLs")
    public void a_txt_file_with_website_URLs() throws Exception {
        Files.write(Paths.get("src/test/resources/test_websites.txt"), List.of(
            "https://www.google.com",
            "https://www.microsoft.com"
        ));
    }

    @When("the TxtFileReader reads the file")
    public void the_TxtFileReader_reads_the_file() {
        TxtFileReader reader = new TxtFileReader();
        websites = reader.readWebsites("src/test/resources/test_websites.txt");
    }

    @Then("it should return a list with {int} websites")
    public void it_should_return_a_list_with_websites(Integer count) {
        assertEquals(count.intValue(), websites.size());
    }
}
