package gr.aueb.dmst.NikosNikolaidis02;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYDataset;

import javax.swing.*;

public class HistogramGenerator {

    public static void main(String[] args) {
        //String file = args[0];
        String file = "grades.txt";
        double[] b = readGrades(file);
        //System.out.println(Arrays.toString(b));
        generateGraph(b);
    }
    public static double[] readGrades(String filename) {
        ArrayList<String> values = new ArrayList<String>();
        try {
            File txtfile = new File(filename);
            Scanner myScan = new Scanner(txtfile);
            while (myScan.hasNextLine()) {
                values.add(myScan.nextLine());
            }
            myScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        double[] a = new double[values.size()];
        for (int i=0; i<values.size(); i++) {
            a[i] = Double.parseDouble(values.get(i));
            //System.out.println(a[i]);
        }

        return a;
    }

    public static void generateGraph(double[] array) {
        HistogramDataset setOfData = new HistogramDataset();
		/*
		for (int i = 0 ; i<grades.length; i++) {
			values.add(i, grades[i]);
		}
		*/
        setOfData.addSeries("grades", array, 10);

        String title = "Grades' Histogram";
        String xAxisLabel = "Grades";
        String yAxisLabel = "Frequency";
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        boolean legend = true;
        boolean tooltips = true;
        boolean urls = false;
        org.jfree.chart.JFreeChart chart = ChartFactory.createHistogram(title, xAxisLabel, yAxisLabel,
                setOfData, orientation, legend, tooltips, urls);

        // Customize the chart
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setBarPainter(new org.jfree.chart.renderer.xy.StandardXYBarPainter());
        renderer.setSeriesPaint(0, Color.darkGray);
        renderer.setShadowVisible(false);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // Create a chart panel and add it to a frame
        ChartFrame frame = new ChartFrame("Histogram", chart);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
