package codeanalyzer;

import java.util.Map;

public interface MetricsExportStrategy {
    public void export(Map<String, Integer> metrics, String filepath);
}
