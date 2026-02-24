package service;

import interfaces.ReportStrategy;
import impl.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class ReportServiceTest {

    @Test
    void testServiceWithDifferentStrategies(@TempDir Path tempDir) {
        // Test amb CSV
        ReportService service = new ReportService(new CsvReportStrategy());
        Path csvFile = tempDir.resolve("report.csv");
        service.generateReport("Test CSV", csvFile.toString());
        assertTrue(Files.exists(csvFile));

        service.setStrategy(new JsonReportStrategy());
        Path jsonFile = tempDir.resolve("report.json");
        service.generateReport("Test JSON", jsonFile.toString());
        assertTrue(Files.exists(jsonFile));
        
        service.setStrategy(new HtmlReportStrategy());
        Path htmlFile = tempDir.resolve("report.html");
        service.generateReport("Test HTML", htmlFile.toString());
        assertTrue(Files.exists(htmlFile));
    }

    @Test
    void testServiceWithAllStrategies(@TempDir Path tempDir) {
        ReportStrategy[] strategies = {
                new CsvReportStrategy(),
                new JsonReportStrategy(),
                new HtmlReportStrategy(),
                new XmlReportStrategy(),
                new PdfReportStrategy(),
                new ExcelReportStrategy(),
                new WordReportStrategy()
        };

        String[] extensions = {".csv", ".json", ".html", ".xml", ".pdf", ".xls", ".doc"};

        for (int i = 0; i < strategies.length; i++) {
            ReportService service = new ReportService(strategies[i]);
            Path file = tempDir.resolve("report" + extensions[i]);

            service.generateReport("Test data", file.toString());

            assertTrue(Files.exists(file));
        }
    }
}