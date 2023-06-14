package codeanalyzer;

import java.io.IOException;
import java.util.List;

public interface ListReader {
    List<String> readFileIntoList(String filepath) throws IOException;
}
