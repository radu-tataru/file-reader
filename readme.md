# WebsiteLauncher

## Overview
This Java project demonstrates the use of interfaces, inheritance, and polymorphism. It reads website URLs from different file formats and opens them in Chrome.

## Structure
- `FileReader` interface
- `TxtFileReader` and `CsvFileReader` classes implementing `FileReader`
- `WebsiteOpener` class to launch websites
- `Main` class to run the application

## Usage
1. Set the `fileType` in `Main.java` to either `"txt"` or `"csv"`.
2. Run the `Main` class.
3. Websites listed in the corresponding file will open in Chrome.

## Requirements
- Java 8 or higher
- Chrome browser installed
