package codeanalyzer;

public interface SourceFileReaderFactory {
    ListReader createListReader();
    StringReader createStringReader();
}
