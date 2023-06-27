package codeanalyzer;

public class LocalFileReaderFactory implements SourceFileReaderFactory {
    @Override
    public ListReader createListReader() {
        return new LocalListReader();
    }

    @Override
    public StringReader createStringReader() {
        return new LocalStringReader();
    }
}