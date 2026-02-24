package impl;

import interfaces.ReportStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

public class JsonReportStrategyTest {

    @Test
    void testGenerate(@TempDir Path tempDir) throws Exception {
        ReportStrategy strategy = new JsonReportStrategy();
        Path file = tempDir.resolve("test.json");

        strategy.generate("Hello World", file.toString());

        assertTrue(Files.exists(file));
        String content = Files.readString(file);
        assertTrue(content.contains("Hello World"));
        assertTrue(content.contains("{"));
        assertTrue(content.contains("}"));
        assertTrue(content.contains("content"));
    }
}
