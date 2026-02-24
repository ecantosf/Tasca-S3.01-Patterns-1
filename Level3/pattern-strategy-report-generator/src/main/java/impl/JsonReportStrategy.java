package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class JsonReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("{");
            writer.println("  \"content\": \"" + data + "\"");
            writer.println("}");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}