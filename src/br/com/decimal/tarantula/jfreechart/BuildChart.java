/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author user
 * 
 */
public class BuildChart {
	
	public static BufferedImage gerarGrafico(String titleChart, String titleX, String titleY,
			List<Item> arrayItem) throws Exception {

		BufferedImage buf = null;

		try {

			DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
			
			Iterator iterator = arrayItem.iterator();

			while (iterator.hasNext()) {
				Item item = (Item) iterator.next();
				defaultCategoryDataset.addValue(item.getTensao(), item.getProduct(), item.getPeriodo());
			}

			JFreeChart chart = ChartFactory.createLineChart(titleChart, titleX,

					titleY, defaultCategoryDataset, PlotOrientation.VERTICAL,

			false, false, false);

			chart.setBorderVisible(true);

			chart.setBorderPaint(Color.black);

			buf = chart.createBufferedImage(400, 250);

		} catch (Exception e) {

			throw new Exception(e);

		}

		return buf;

	}

	public static BufferedImage gerarGraficoLinha(String titleChart, String titleX, String titleY,
			List<Item> arrayItem) throws Exception {

		BufferedImage buf = null;

		try {

			DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
			
			Iterator iterator = arrayItem.iterator();

			while (iterator.hasNext()) {
				Item item = (Item) iterator.next();
				defaultCategoryDataset.addValue(item.getTensao(), item.getProduct(), item.getPeriodo());
			}

			JFreeChart chart = ChartFactory.createLineChart(titleChart, titleX,

					titleY, defaultCategoryDataset, PlotOrientation.VERTICAL,

			false, false, false);

			chart.setBorderVisible(true);

			chart.setBorderPaint(Color.black);

			buf = chart.createBufferedImage(400, 250);

		} catch (Exception e) {

			throw new Exception(e);

		}

		return buf;

	}

	/**
	 * 
	 * Gerar gráficos de linha 3D.
	 * 
	 * @param titleChart
	 * @param titleX
	 * @param titleY
	 * @param arrayItem
	 * @return
	 * @throws Exception
	 */
	public static BufferedImage gerarGraficoLinha3D(String titleChart, String titleX, String titleY,
			List<Item> arrayItem) throws Exception {

		BufferedImage buf = null;

		try {

			DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();

			Iterator iterator = arrayItem.iterator();

			while (iterator.hasNext()) {
				Item item = (Item) iterator.next();
				defaultCategoryDataset.addValue(item.getTensao(), item.getProduct(), item.getPeriodo());
			}

			JFreeChart chart = ChartFactory.createLineChart3D(titleChart, titleX, titleY, defaultCategoryDataset,
					PlotOrientation.VERTICAL, true, false, false);

			chart.setBorderVisible(true);
			chart.setBorderPaint(Color.black);

			buf = chart.createBufferedImage(400, 250);

		} catch (Exception e) {

			throw new Exception(e);

		}

		return buf;

	}

}
