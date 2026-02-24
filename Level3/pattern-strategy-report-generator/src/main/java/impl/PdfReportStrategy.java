package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PdfReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("PDF REPORT");
            writer.println("==========");
            writer.println("Content: " + data);
            writer.println("(This is a simulated PDF file)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
