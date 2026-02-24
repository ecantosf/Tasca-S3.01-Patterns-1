package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HtmlReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>" + data + "</h1>");
            writer.println("</body>");
            writer.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
