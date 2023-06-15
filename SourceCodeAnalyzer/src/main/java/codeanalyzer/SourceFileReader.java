package codeanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves (reads) the contents of a given file.
 * The file can be stored locally or exist on the web.
 * This class deliberately contains code smells and violations of design principles. 
 * @author agkortzis
 *
 */
public class SourceFileReader {
	
	private String type;
	private ListReader listReader;
	private StringReader stringReader;
	private LocalFileReaderFactory localFileReaderFactory;
	private WebFileReaderFactory webFileReaderFactory;
	
	public SourceFileReader(String _type) {
		this.type = _type;
		this.localFileReaderFactory = new LocalFileReaderFactory();
		this.webFileReaderFactory = new WebFileReaderFactory();
	}

	/**
	 * Reads a file and returns its content in a List
	 * (<b>local</b> for locally stored files, 
	 * <b>web</b> for files stored on the web). 
	 * @param filepath the url of the file
	 * @return a List that contains the contents of the file 
	 * or null if the type is neither <b>local</b> nor <b>web</b>
	 * @throws IOException
	 */
	public List<String> readFileIntoList(String filepath) throws IOException {
		// read a locally stored file7858
		if (type.contentEquals("local")) {
			ListReader localListReader = localFileReaderFactory.createListReader();
			return localListReader.readFileIntoList(filepath);
		// read a file stored in the web
		} else if (type.contentEquals("web")) {
			ListReader webListReader = webFileReaderFactory.createListReader();
			return webListReader.readFileIntoList(filepath);
		} else {
			return null;
		}
	}
	
	/**
	 * Reads a file and returns its content in a single Stringtt
	 * (<b>local</b> for locally stored files, 
	 * <b>web</b> for files stored on the web). 
	 * @param filepath the url of the file
	 * @return a String that contains the contents of the file
	 * or null if the type is neither <b>local</b> nor <b>web</b>
	 * @throws IOException
	 */
	public String readFileIntoString(String filepath) throws IOException {
		// read a locally stored file
		if (type.contentEquals("local")) {
			StringReader localStringReader = localFileReaderFactory.createStringReader();
			return localStringReader.readFileIntoString(filepath);
		// read a file stored in the web
		} else if (type.contentEquals("web")) {
			StringReader webStringReader = webFileReaderFactory.createStringReader();
			return webStringReader.readFileIntoString(filepath);
		} else {
			return null;
		}
	}

}
