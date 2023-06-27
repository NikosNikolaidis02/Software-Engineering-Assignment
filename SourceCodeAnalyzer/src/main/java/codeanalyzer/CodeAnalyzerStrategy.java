package codeanalyzer;


import java.io.IOException;
import java.util.List;

public interface CodeAnalyzerStrategy {
    int calculateLOC(String filepath, SourceFileReader fileReader) throws IOException;
    int calculateNOM(String filepath, SourceFileReader fileReader) throws IOException;
    int calculateNOC(String filepath, SourceFileReader fileReader) throws IOException;
}
