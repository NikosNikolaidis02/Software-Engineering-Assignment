<img src="ClassDiagram.drawio.svg">

# Design Patterns
<h2>SourceFileReader</h2>
<p>I decided to design the function of reading a file with the Abstract Factory Design for the following reasons:</p>
<ul>
	<li>It helps read a file from different sources(factories), eg. web or local files</li>
	<li>We can independently create the final products and from which file was, eg. A List created by a Web file(eg. WebListReader)</li>
</ul>
<p>The classes the participate on this pattern are:</p>
<ul>
	<li><b>SourceFileReader</b></li>
	<li><b>StringReader:</b> It's an interface that is implemented by:</li>
	<ul>
		<li><b>LocalStringReader</b></li>
		<li><b>WebStringReader</b></li>
	</ul>
	<li><b>ListReader:</b> It's an interface that is implemented by:</li>
	<ul>
		<li><b>LocalListReader</b></li>
		<li><b>WebListReader</b></li>
	</ul>
	<li><b>SourceFileReaderFactory:</b> It's an interface that is implemented by:</li>
	<ul>
		<li><b>LocalFileReaderFactory</b></li>
		<li><b>WebFileReaderFactory</b></li>
	</ul>
</ul>

<h2>SourceCodeAnalyzer</h2>
<p>I decided to design the function of analyzing a file with the Strategy Design for the following reasons:</p>
<ul>
	<li>Defines the classes of Source Code Analyzing, based on if we want string comparison or Regex analysis</li>
</ul>
<p>The classes the participate on this pattern are:</p>
<ul>
	<li><b>SourceCodeReader</b></li>
	<li><b>CodeAnalyzerStrategy:</b> it's an interface that it's implemented by:</li>
	<ul>
		<li>RegexCodeAnalyzerStrategy</li>
		<li>StringComparisonAnalyzerStrategy</li>
	</ul>
</ul>

<h2>MetricsExporter</h2>
<p>I decided to design the function of analyzing a file with the Strategy Design for the following reasons:</p>
<ul>
	<li>Defines the classes of Source Code Analyzing, based on if we want to export a CSV or a Json file</li>
</ul>
<p>The classes the participate on this pattern are:</p>
<ul>
	<li><b>MetricsExporter</b></li>
	<li><b>MetricsExportStratey:</b> it's an interface that it's implemented by:</li>
	<ul>
		<li>CSVMetricsExportStratey</li>
		<li>JsonMetricsExportStratey</li>
	</ul>
</ul>

Build the executable Java application with:
mvn package jacoco:report

Run the executable by executing
	java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
were args translate to: 	
	arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
	arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
	arg2 = “SourceCodeLocationType” [local|web]
	arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
	arg4 = “OutputFileType” [csv|json]
example: 
	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv