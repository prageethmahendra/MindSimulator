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
import java.awt.Font;
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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StandardGradientPaintTransformer;

/**
 * A simple demonstration application showing how to create a stacked bar chart
 * using data from a {@link CategoryDataset}.
 */
public class StackedBarChartDemo4 extends ApplicationFrame {

    public static String name = "";

    /**
     * Creates a new demo.
     *
     * @param title the frame title.
     */
    public StackedBarChartDemo4(final String title) {
        super(title);

    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    public static CategoryDataset createDataset(ArrayList<String> orangeArray, boolean isDefault) {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        if (isDefault) {
            result.addValue(0, "Product 1 (US)", name);
            result.addValue(13, "Product 1 (Europe)", name);

            result.addValue(0, "Product 2 (US)", name);
            result.addValue(14, "Product 2 (Europe)", name);

            result.addValue(0, "Product 3 (US)", name);
            result.addValue(25, "Product 3 (Europe)", name);
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

            String notethicalyPercent2 = ethicalyPercent + "/13";
            String notunwholePercent2 = unwholePercent + "/14";
            String notbeautiPercent2 = beautiPercent + "/25";

            result.addValue(Integer.parseInt(ethicalyPercent), "Product 1 (US)", name);
            result.addValue(notethicalyPercent, "Product 1 (Europe)", name);

            result.addValue(Integer.parseInt(unwholePercent), "Product 2 (US)", name);
            result.addValue(notunwholePercent, "Product 2 (Europe)", name);

            result.addValue(Integer.parseInt(beautiPercent), "Product 3 (US)", name);
            result.addValue(notbeautiPercent, "Product 3 (Europe)", name);
        }

        return result;
    }

    /**
     * Creates a sample chart.
     *
     * @param dataset the dataset for the chart.
     *
     * @return A sample chart.
     */
    public static JFreeChart createChart(final CategoryDataset dataset, ArrayList<String> orangeArray, boolean isDefault) {

        String notethicalyPercent2 = "";
        String notunwholePercent2 = "";
        String notbeautiPercent2 = "";
        if (isDefault) {
            notethicalyPercent2 = "0/13";
            notunwholePercent2 = "0/14";
            notbeautiPercent2 = "0/25";
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

            notethicalyPercent2 = ethicalyPercent + "/13";
            notunwholePercent2 = unwholePercent + "/14";
            notbeautiPercent2 = beautiPercent + "/25";
        }
        final JFreeChart chart = ChartFactory.createStackedBarChart(
                "       Selected Mental Factors", // chart title
                "Category", // domain axis label
                "No of mental factors", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // the plot orientation
                true, // legend
                true, // tooltips
                false // urls
        );

        chart.setBackgroundPaint(new Color(168,244,168));//background
        
        GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup("Product 1 (US)", "G1");
        map.mapKeyToGroup("Product 1 (Europe)", "G1");
        map.mapKeyToGroup("Product 1 (Asia)", "G1");
        map.mapKeyToGroup("Product 1 (Middle East)", "G1");
        map.mapKeyToGroup("Product 2 (US)", "G2");
        map.mapKeyToGroup("Product 2 (Europe)", "G2");
        map.mapKeyToGroup("Product 2 (Asia)", "G2");
        map.mapKeyToGroup("Product 2 (Middle East)", "G2");
        map.mapKeyToGroup("Product 3 (US)", "G3");
        map.mapKeyToGroup("Product 3 (Europe)", "G3");
        map.mapKeyToGroup("Product 3 (Asia)", "G3");
        map.mapKeyToGroup("Product 3 (Middle East)", "G3");
        renderer.setSeriesToGroupMap(map);

        renderer.setItemMargin(0.0);

        Paint p1 = new GradientPaint(
                0.0f, 0.0f, new Color(191, 219, 246), 0.0f, 0.0f, new Color(191, 219, 246)
        );
        Paint p2 = new GradientPaint(
                0.0f, 0.0f, new Color(243, 187, 215), 0.0f, 0.0f, new Color(243, 187, 215)
        );
        Paint p3 = new GradientPaint(
                0.0f, 0.0f, new Color(248, 227, 142), 0.0f, 0.0f, new Color(248, 227, 142)
        );
        Paint p4 = new GradientPaint(
                0.0f, 0.0f, new Color(255, 255, 255), 0.0f, 0.0f, new Color(255, 255, 255)
        );
        renderer.setSeriesPaint(0, p1);
        renderer.setSeriesPaint(1, p4);
        renderer.setSeriesPaint(2, p2);
        renderer.setSeriesPaint(3, p4);
        renderer.setSeriesPaint(4, p3);
        renderer.setSeriesPaint(5, p4);

        /* 
        
         renderer.setSeriesPaint(1, p2); 
         renderer.setSeriesPaint(5, p2); 
         renderer.setSeriesPaint(9, p2); 
        
         Paint p4 = new GradientPaint(
         0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
         );
         renderer.setSeriesPaint(2, p3);
         renderer.setSeriesPaint(6, p3);
         renderer.setSeriesPaint(10, p3);
            
         Paint p5 = new GradientPaint(
         0.0f, 0.0f, new Color(0xFF, 0xFF, 0x22), 0.0f, 0.0f, new Color(0xFF, 0xFF, 0x88)
         );
         renderer.setSeriesPaint(3, p4);
         renderer.setSeriesPaint(7, p4);
         renderer.setSeriesPaint(11, p4);*/
        renderer.setGradientPaintTransformer(
                new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL)
        );

        SubCategoryAxis domainAxis = new SubCategoryAxis(notethicalyPercent2+"           "+notunwholePercent2+"           "+notbeautiPercent2);
        domainAxis.setCategoryMargin(0.05);
        
        //domainAxis.addSubCategory(notethicalyPercent2);
        //domainAxis.addSubCategory(notunwholePercent2);
        //domainAxis.addSubCategory(notbeautiPercent2);

        domainAxis.setLowerMargin(.05);
        domainAxis.setCategoryMargin(.05);
        domainAxis.setUpperMargin(.05);
        //domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
        

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDomainAxis(domainAxis);

        //plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.setRenderer(renderer);
        plot.setFixedLegendItems(createLegendItems());

        Font font3 = new Font("Dialog", Font.BOLD, 14);
        domainAxis.setLabelFont(font3);
        plot.getDomainAxis().setLabelFont(font3);
        plot.getRangeAxis().setLabelFont(font3);
        plot.getDomainAxis().setTickLabelFont(font3);
        plot.getRangeAxis().setTickLabelFont(font3);

        renderer.setBaseItemLabelFont(font3);
        plot.setBackgroundPaint(new Color(168,244,168));//MAGENTA

        renderer.setItemMargin(0.3);
        renderer.setMaximumBarWidth(10.0);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setLabelFont(font3);
        
      
        return chart;

    }

    /**
     * Creates the legend items for the chart. In this case, we set them
     * manually because we only want legend items for a subset of the data
     * series.
     *
     * @return The legend items.
     */
    public static LegendItemCollection createLegendItems() {
        LegendItemCollection result = new LegendItemCollection();

       /* LegendItem item1 = new LegendItem("Ethically Variables", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), true, new Color(191, 219, 246),
                true, new Color(191, 219, 246), new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(2.1f), new Color(191, 219, 246));
        LegendItem item2 = new LegendItem("Unwholesome Factors", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, new Color(243, 187, 215), true, new Color(243, 187, 215), new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                new Color(243, 187, 215));
        LegendItem item3 = new LegendItem("Beautiful Factors", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, new Color(248, 227, 142), true, new Color(248, 227, 142), new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                new Color(248, 227, 142));
        LegendItem item4 = new LegendItem("Not Selected", "Description",
                "ToolTip", "URL", true,
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                true, new Color(255, 255, 255), true, new Color(0, 0, 0), new BasicStroke(1.2f), true,
                new Line2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(2.1f),
                new Color(248, 227, 142));

        //LegendItem item1 = new LegendItem("US", new Color(0x22, 0x22, 0xFF));
        //      LegendItem item2 = new LegendItem("Europe", new Color(0x22, 0xFF, 0x22));
        //    LegendItem item3 = new LegendItem("Asia", new Color(0xFF, 0x22, 0x22));
        //  LegendItem item4 = new LegendItem("Middle East", new Color(0xFF, 0xFF, 0x22));
        result.add(item1);
        result.add(item2);
        result.add(item3);
        result.add(item4);*/
        //  result.add(item4);
        return result;
    }

    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    /*public static void main(final String[] args) {
     final StackedBarChartDemo4 demo = new StackedBarChartDemo4("Stacked Bar Chart Demo 4");
     final CategoryDataset dataset = createDataset();
     final JFreeChart chart = createChart(dataset);
     final ChartPanel chartPanel = new ChartPanel(chart);
     chartPanel.setPreferredSize(new java.awt.Dimension(590, 350));
     //setContentPane(chartPanel);
     demo.pack();
     RefineryUtilities.centerFrameOnScreen(demo);
     demo.setVisible(true);
     }*/
}
