package impl;

import interfaces.ReportStrategy;
import java.io.FileWriter;
import java.io.PrintWriter;

public class XmlReportStrategy implements ReportStrategy {
    @Override
    public void generate(String data, String outputPath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            writer.println("<report>");
            writer.println("    <content>" + data + "</content>");
            writer.println("</report>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
