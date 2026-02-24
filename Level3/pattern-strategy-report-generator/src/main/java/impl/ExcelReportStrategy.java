package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ExcelReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("Data");
            writer.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
