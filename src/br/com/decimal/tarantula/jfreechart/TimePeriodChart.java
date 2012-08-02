/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.text.SimpleDateFormat;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.xy.XYDataset;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class TimePeriodChart {
	
	public static JFreeChart createChartPanel(String title) {
		final XYDataset xyDataset = createDataset();
        final XYItemRenderer renderer1 = new XYLine3DRenderer();
        
        final DateAxis domainAxis = new DateAxis("Tempo (hr)");
        domainAxis.setVerticalTickLabels(true);
        domainAxis.setTickUnit(new DateTickUnit(DateTickUnit.HOUR, 12));
        domainAxis.setDateFormatOverride(new SimpleDateFormat("HH:mm"));
        domainAxis.setLowerMargin(0.01);
        domainAxis.setUpperMargin(0.01);
        
        final ValueAxis rangeAxis = new NumberAxis("Tensão (V)");
        
        final XYPlot plot = new XYPlot(xyDataset, domainAxis, rangeAxis, renderer1);

        JFreeChart chart = new JFreeChart(title, plot);
        chart.removeLegend();

        return chart;
	}
	
	public static XYDataset createDataset() {

        final TimePeriodValues nivelBateria = new TimePeriodValues("NivelBateria");
        final Day today = new Day();
        
        for (int i = 0; i < 24; i++) {
            final Minute m0 = new Minute(0, new Hour(i, today));
            final Minute m1 = new Minute(30, new Hour(i, today));
            final Minute m2 = new Minute(0, new Hour(i + 1, today));
            nivelBateria.add(new SimpleTimePeriod(m0.getStart(), m1.getStart()), Math.random() * 2.0);
            nivelBateria.add(new SimpleTimePeriod(m1.getStart(), m2.getStart()), Math.random() * 2.0);
        }
        
        final TimePeriodValuesCollection dataset = new TimePeriodValuesCollection();
        dataset.addSeries(nivelBateria);

        return dataset;

    }
	
	public static void main(String[] args) {
		
		JFreeChart chart = TimePeriodChart.createChartPanel("Histórico de nível da bateria");
		ChartView.viewer( chart );
	}

}
