package codeanalyzer;

public class WebFileReaderFactory implements SourceFileReaderFactory {
    @Override
    public ListReader createListReader() {
        return new WebListReader();
    }

    @Override
    public StringReader createStringReader() {
        return new WebStringReader();
    }
}