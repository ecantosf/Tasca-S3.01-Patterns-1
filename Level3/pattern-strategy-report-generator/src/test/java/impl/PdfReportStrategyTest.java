package impl;

import interfaces.ReportStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

public class PdfReportStrategyTest {

    @Test
    void testGenerate(@TempDir Path tempDir) throws Exception {
        ReportStrategy strategy = new PdfReportStrategy();
        Path file = tempDir.resolve("test.pdf");

        strategy.generate("Hello World", file.toString());

        assertTrue(Files.exists(file));
        String content = Files.readString(file);
        assertTrue(content.contains("Hello World"));
        assertTrue(content.contains("PDF REPORT"));
        assertTrue(content.contains("simulated PDF"));
    }
}