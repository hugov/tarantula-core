/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.awt.image.BufferedImage;

import org.jfree.chart.JFreeChart;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class ConstruirGrafico {

	public static void main(String[] args) {
		
		try {
//			DataItem dataItem = new DataItem();
//			BufferedImage graficoLinha3D = BuildChart.gerarGraficoLinha("Histórico de nível da bateria", "Tempo (hr)", "Tensão (V)", dataItem.getArray());
//			
//			ChartView.viewer( graficoLinha3D );
			
			JFreeChart chart = TimePeriodChart.createChartPanel("Histórico de nível da bateria");
			ChartView.viewer( chart );
			
		} catch (Exception e) {
			System.err.println("Falha ao gerar o relatório. Exception : " + e);
		}
		
	}

}
