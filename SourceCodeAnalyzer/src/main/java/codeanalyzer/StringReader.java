package codeanalyzer;

import java.io.IOException;

public interface StringReader {
    String readFileIntoString(String filepath) throws IOException;
}
