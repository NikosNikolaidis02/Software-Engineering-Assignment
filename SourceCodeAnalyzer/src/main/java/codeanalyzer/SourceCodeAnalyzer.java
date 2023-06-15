package codeanalyzer;

import java.io.IOException;

/**
 * Analyzes the contents of a Java source code file 
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes. 
 * The current functionality supports two types of source code analysis,
 * namely regex (with the use of regular expressions) and 
 * strcomp (with the use of string comparison).
 * This class deliberately contains code smells and violations of design principles. 
 * @author agkortzis
 *
 */
public class SourceCodeAnalyzer {

	private SourceFileReader fileReader;

	private RegexCodeAnalyzerStrategy regexCodeAnalyzerStrategy = new RegexCodeAnalyzerStrategy();
	private StringComparisonCodeAnalyzerStrategy stringComparisonCodeAnalyzerStrategy = new StringComparisonCodeAnalyzerStrategy();

	public SourceCodeAnalyzer(String fileReaderType) {
		this.fileReader = new SourceFileReader(fileReaderType);
	}

	public int calculateLOC(String filepath, String analyzerType) throws IOException {
		if(analyzerType.equals("regex")) {
			regexCodeAnalyzerStrategy.calculateLOC(filepath,fileReader);
		} else if (analyzerType.equals("strcomp")) {
			stringComparisonCodeAnalyzerStrategy.calculateLOC(filepath,fileReader);
		}
		return -1;
	}

	public int calculateNOM(String filepath, String analyzerType) throws IOException {
		if(analyzerType.equals("regex")) {
			regexCodeAnalyzerStrategy.calculateNOM(filepath,fileReader);
		} else if (analyzerType.equals("strcomp")) {
			stringComparisonCodeAnalyzerStrategy.calculateNOM(filepath,fileReader);
		}
		return -1;
	}
	
	public int calculateNOC(String filepath, String analyzerType) throws IOException {
		if(analyzerType.equals("regex")) {
			regexCodeAnalyzerStrategy.calculateNOC(filepath, fileReader);
		} else if (analyzerType.equals("strcomp")) {
			stringComparisonCodeAnalyzerStrategy.calculateNOC(filepath,fileReader);
		}
		return -1;
	}
}
