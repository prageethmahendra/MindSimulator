/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonderfulmindv1_1;

/**
 *
 * @author harindra
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StandardGradientPaintTransformer;

/**
 * A simple demonstration application showing how to create a bar chart.
 */
//public class BarChartDemo1 extends ApplicationFrame {
public class BarChartDemo1 {

    /**
     * Creates a new demo instance.
     *
     * @param title the frame title.
     */
    /*public BarChartDemo1(String title) {

     super(title);
     CategoryDataset dataset = createDataset();
     JFreeChart chart = createChart(dataset);
     ChartPanel chartPanel = new ChartPanel(chart, false);
     chartPanel.setPreferredSize(new Dimension(200, 170));
     setContentPane(chartPanel);

     }*/
    /**
     * Returns a sample dataset.
     *
     * @return The dataset.
     */
    public static CategoryDataset createDataset(ArrayList<String> orangeArray, boolean isDefault) {
        System.out.println("Create dataset");
        /*DefaultCategoryDataset result = new DefaultCategoryDataset();

         if (isDefault) {
         result.addValue(0, "Product 1 (Asia)", "Jan 04");
         result.addValue(13, "Product 1 (US)", "Jan 04");
            

         result.addValue(0, "Product 2 (Europe)", "Jan 04");
         result.addValue(14, "Product 2 (US)", "Jan 04");
            

         result.addValue(0, "Product 3 (Europe)", "Jan 04");
         result.addValue(25, "Product 3 (US)", "Jan 04");
            
         } else {
         Utilities.setPercentages();
         String lastCittValue = orangeArray.get(orangeArray.size() - 1);
         System.out.println("lastCittValue: " + lastCittValue);
         String ethicalyPercent = Utilities.ethicallyVariablesArray.get(lastCittValue);
         String unwholePercent = Utilities.unwholesomeFactorsArray.get(lastCittValue);
         String beautiPercent = Utilities.beautifulFactorsArray.get(lastCittValue);

         float ethicalyPercentInt = (Float.parseFloat(ethicalyPercent) / 13) * 100;
         float unwholePercentInt = (Float.parseFloat(unwholePercent) / 14) * 100;
         float beautiPercentInt = (Float.parseFloat(beautiPercent) / 25) * 100;

         System.out.println("ethicalyPercentInt: " + ethicalyPercentInt + " unwholePercentInt:" + unwholePercentInt + " beautiPercentInt:" + beautiPercentInt);

         int notethicalyPercent = 13 - Integer.parseInt(ethicalyPercent);
         int notunwholePercent = 14 - Integer.parseInt(unwholePercent);
         int notbeautiPercent = 25 - Integer.parseInt(beautiPercent);
         result.addValue(Integer.parseInt(ethicalyPercent), "Product 1 (US)", "Jan 04");
         result.addValue(notethicalyPercent, "Product 1 (Asia)", "Jan 04");

         result.addValue(Integer.parseInt(unwholePercent), "Product 2 (US)", "Jan 04");
         result.addValue(notunwholePercent, "Product 2 (Europe)", "Jan 04");

         result.addValue(Integer.parseInt(beautiPercent), "Product 3 (US)", "Jan 04");
         result.addValue(notbeautiPercent, "Product 3 (Europe)", "Jan 04");
         }

         return result;*/

        // row keys...
        String series1 = "Ethically Variables";
        String series2 = "Unwholesome Factors";
        String series3 = "Beautiful Factors";

        // column keys...
        String category1 = "";
        String category2 = "Category 2";
        String category3 = "Category 3";
         // String category4 = "Category 4";
        // String category5 = "Category 5";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        if (isDefault) {
            dataset.addValue(13, series1, category1);
            dataset.addValue(14, series2, category1);
            dataset.addValue(25, series3, category1);
        } else {
            Utilities.setPercentages();
            String lastCittValue = orangeArray.get(orangeArray.size() - 1);
            System.out.println("lastCittValue: " + lastCittValue);
            String ethicalyPercent = Utilities.ethicallyVariablesArray.get(lastCittValue);
            String unwholePercent = Utilities.unwholesomeFactorsArray.get(lastCittValue);
            String beautiPercent = Utilities.beautifulFactorsArray.get(lastCittValue);

            float ethicalyPercentInt = (Float.parseFloat(ethicalyPercent) / 13) * 100;
            float unwholePercentInt = (Float.parseFloat(unwholePercent) / 14) * 100;
            float beautiPercentInt = (Float.parseFloat(beautiPercent) / 25) * 100;

            System.out.println("ethicalyPercentInt: " + ethicalyPercentInt + " unwholePercentInt:" + unwholePercentInt + " beautiPercentInt:" + beautiPercentInt);

            int notethicalyPercent = 13 - Integer.parseInt(ethicalyPercent);
            int notunwholePercent = 14 - Integer.parseInt(unwholePercent);
            int notbeautiPercent = 25 - Integer.parseInt(beautiPercent);
            dataset.addValue(Integer.parseInt(ethicalyPercent), series1, category1);
            dataset.addValue(Integer.parseInt(unwholePercent), series2, category1);
            dataset.addValue(Integer.parseInt(beautiPercent), series3, category1);
        }

        return dataset;

    }

    /**
     * Creates a sample chart.
     *
     * @param dataset the dataset.
     *
     * @return The chart.
     */
    public static JFreeChart createChart(CategoryDataset dataset, boolean isDefault, ArrayList<String> orangeArray) {
        System.out.println("create the chart");
        /*final JFreeChart chart = ChartFactory.createStackedBarChart(
         "Mental Factors", // chart title
         "Category", // domain axis label
         "No of Mental Factors", // range axis label
         dataset, // data
         PlotOrientation.VERTICAL, // the plot orientation
         true, // legend
         true, // tooltips
         false // urls
         );

         GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
         KeyToGroupMap map = new KeyToGroupMap("G1");
         map.mapKeyToGroup("Product 1 (US)", "G1");
         map.mapKeyToGroup("Product 1 (Europe)", "G1");
         //map.mapKeyToGroup("Product 1 (Asia)", "G1");
         //map.mapKeyToGroup("Product 1 (Middle East)", "G1");
         map.mapKeyToGroup("Product 2 (US)", "G2");
         map.mapKeyToGroup("Product 2 (Europe)", "G2");
         //map.mapKeyToGroup("Product 2 (Asia)", "G2");
         //map.mapKeyToGroup("Product 2 (Middle East)", "G2");
         map.mapKeyToGroup("Product 3 (US)", "G3");
         map.mapKeyToGroup("Product 3 (Europe)", "G3");
         // map.mapKeyToGroup("Product 3 (Asia)", "G3");
         //map.mapKeyToGroup("Product 3 (Middle East)", "G3");
         renderer.setSeriesToGroupMap(map);

         renderer.setItemMargin(0.0);
         Paint p1 = new GradientPaint(
         0.0f, 0.0f, new Color(0x22, 0x22, 0xFF), 0.0f, 0.0f, new Color(0x88, 0x88, 0xFF)
         );
         renderer.setSeriesPaint(0, p1);
         renderer.setSeriesPaint(4, p1);
         renderer.setSeriesPaint(8, p1);

         Paint p2 = new GradientPaint(
         0.0f, 0.0f, new Color(0x22, 0xFF, 0x22), 0.0f, 0.0f, new Color(0x88, 0xFF, 0x88)
         );
         renderer.setSeriesPaint(1, p2);
         renderer.setSeriesPaint(5, p2);
         renderer.setSeriesPaint(9, p2);

         Paint p3 = new GradientPaint(
         0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
         );
         renderer.setSeriesPaint(2, p3);
         renderer.setSeriesPaint(6, p3);
         renderer.setSeriesPaint(10, p3);

         Paint p4 = new GradientPaint(
         0.0f, 0.0f, new Color(0xFF, 0xFF, 0x22), 0.0f, 0.0f, new Color(0xFF, 0xFF, 0x88)
         );
         renderer.setSeriesPaint(3, p4);
         renderer.setSeriesPaint(7, p4);
         renderer.setSeriesPaint(11, p4);
         renderer.setGradientPaintTransformer(
         new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL)
         );

         SubCategoryAxis domainAxis = new SubCategoryAxis("Product / Month");
         domainAxis.setCategoryMargin(0.05);
         domainAxis.addSubCategory("Ethically Variables");
         domainAxis.addSubCategory("Unwholesome Factors");
         domainAxis.addSubCategory("Beautiful Factors");

         CategoryPlot plot = (CategoryPlot) chart.getPlot();
         plot.setDomainAxis(domainAxis);
         //plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
         plot.setRenderer(renderer);
         plot.setFixedLegendItems(createLegendItems());
         return chart;*/
        // create the chart...
        JFreeChart chart = null;
        if (isDefault) {
            String notethicalyPercent = "0/13";
            String notunwholePercent = "0/14";
            String notbeautiPercent = "0/25";

            chart = ChartFactory.createBarChart(
                    "Selected Mental Factors", // chart title
                    notethicalyPercent + "               " + notunwholePercent + "               " + notbeautiPercent, // domain axis label
                    "", // range axis label
                    dataset, // data
                    PlotOrientation.VERTICAL, // orientation
                    true, // include legend
                    true, // tooltips?
                    false // URLs?
            );
        } else {
            Utilities.setPercentages();
            String lastCittValue = orangeArray.get(orangeArray.size() - 1);
            System.out.println("lastCittValue: " + lastCittValue);
            String ethicalyPercent = Utilities.ethicallyVariablesArray.get(lastCittValue);
            String unwholePercent = Utilities.unwholesomeFactorsArray.get(lastCittValue);
            String beautiPercent = Utilities.beautifulFactorsArray.get(lastCittValue);

            float ethicalyPercentInt = (Float.parseFloat(ethicalyPercent) / 13) * 100;
            float unwholePercentInt = (Float.parseFloat(unwholePercent) / 14) * 100;
            float beautiPercentInt = (Float.parseFloat(beautiPercent) / 25) * 100;

            System.out.println("ethicalyPercentInt: " + ethicalyPercentInt + " unwholePercentInt:" + unwholePercentInt + " beautiPercentInt:" + beautiPercentInt);

            String notethicalyPercent = ethicalyPercent + "/13";
            String notunwholePercent = unwholePercent + "/14";
            String notbeautiPercent = beautiPercent + "/25";

            chart = ChartFactory.createBarChart(
                    "Selected Mental Factors", // chart title
                    notethicalyPercent + "               " + notunwholePercent + "               " + notbeautiPercent, // domain axis label
                    "", // range axis label
                    dataset, // data
                    PlotOrientation.VERTICAL, // orientation
                    true, // include legend
                    true, // tooltips?
                    false // URLs?
            );
        }

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        if (isDefault) {
            GradientPaint gp0 = new GradientPaint(
                    0.0f, 0.0f, new Color(255, 255, 255),
                    0.0f, 0.0f, new Color(255, 255, 255)
            );
            renderer.setSeriesPaint(0, gp0);
            renderer.setSeriesPaint(1, gp0);
            renderer.setSeriesPaint(2, gp0);
        } else {
            GradientPaint gp0 = new GradientPaint(
                    0.0f, 0.0f, new Color(191, 219, 246),
                    0.0f, 0.0f, new Color(191, 219, 246)
            );
            GradientPaint gp1 = new GradientPaint(
                    0.0f, 0.0f, new Color(243, 187, 215),
                    0.0f, 0.0f, new Color(243, 187, 215)
            );
            GradientPaint gp2 = new GradientPaint(
                    0.0f, 0.0f, new Color(248, 227, 142),
                    0.0f, 0.0f, new Color(248, 227, 142)
            );
            renderer.setSeriesPaint(0, gp0);
            renderer.setSeriesPaint(1, gp1);
            renderer.setSeriesPaint(2, gp2);
        }

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;
    }

    public static LegendItemCollection createLegendItems() {
        LegendItemCollection result = new LegendItemCollection();
        LegendItem item1 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), true, Color.red,
                true, Color.blue, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), Color.green);
        LegendItem item2 = new LegendItem("Label", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, Color.red, true, Color.blue, new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                Color.green);
        //    LegendItem item3 = new LegendItem("Asia", new Color(0xFF, 0x22, 0x22));
        //  LegendItem item4 = new LegendItem("Middle East", new Color(0xFF, 0xFF, 0x22));
        result.add(item1);
        result.add(item2);
        //    result.add(item3);
        //  result.add(item4);
        return result;
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    /*public static void main(String[] args) {

     BarChartDemo1 demo = new BarChartDemo1("Possible Combinations");
     demo.pack();
     RefineryUtilities.centerFrameOnScreen(demo);
     demo.setVisible(true);

     }*/
}
