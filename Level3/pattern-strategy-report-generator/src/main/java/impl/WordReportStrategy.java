package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WordReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("WORD DOCUMENT");
            writer.println("=============");
            writer.println(data);
            writer.println("(This is a simulated Word file)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
