Feature: TxtFileReader

  Scenario: Read websites from a txt file
    Given a txt file with website URLs
    When the TxtFileReader reads the file
    Then it should return a list with 2 websites
