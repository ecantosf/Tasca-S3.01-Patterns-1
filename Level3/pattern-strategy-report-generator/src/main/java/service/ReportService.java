package service;

import interfaces.ReportStrategy;

public class ReportService {

    private ReportStrategy strategy;

    public ReportService(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateReport(String data, String outputPath) {
        System.out.println("Generating report using: " + strategy.getClass().getSimpleName());
        strategy.generate(data, outputPath);
    }
}
