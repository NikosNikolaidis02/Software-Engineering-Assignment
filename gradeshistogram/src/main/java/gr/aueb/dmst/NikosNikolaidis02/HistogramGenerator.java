package gr.aueb.dmst.NikosNikolaidis02;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;

/***
 *
 * @author NikosNikolaidis02 The purpose of this class is to demonstrate a histogram for a set of grades which is being
 * given as an input
 * @since April 2021
 */

public class HistogramGenerator {

    public static void main(String[] args) {
        String file = args[0];
        double[] b = readGrades(file);
        generateGraph(b);
    }

    /***
     * Receives a filename(path) with grades. Reads the file and returns an array with all the grades
     *
     * @param filename the input path of the file
     */
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
        }
        return a;
    }

    /***
     * Receives the array with all the grades and generates a histogram.
     *
     * @param array the input path of the file
     */
    public static void generateGraph(double[] array) {
        HistogramDataset setOfData = new HistogramDataset();
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


        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setBarPainter(new org.jfree.chart.renderer.xy.StandardXYBarPainter());
        renderer.setSeriesPaint(0, Color.darkGray);
        renderer.setShadowVisible(false);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame frame = new ChartFrame("Histogram", chart);
        frame.pack();
        frame.setVisible(true);

    }
}
