/**
 * 
 */
package br.com.decimal.tarantula.jfreechart;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

/**
 * @author Vitor Hugo Oliveira
 *
 */
public class ChartView {
	
	public static void viewer( JFreeChart chart ) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 500, 500 );
		frame.setLocationRelativeTo( null );

		ChartPanel panel = new ChartPanel( chart );
		frame.add( panel, BorderLayout.CENTER );

		frame.setVisible( true );
	}
	
	public static void viewer( Image image ) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 500, 300 );
		frame.setLocationRelativeTo( null );
		
		JPanel panel = new JPanel();
		panel.add(new JLabel(new ImageIcon( image )));
		frame.add( panel, BorderLayout.CENTER );
		
		frame.setVisible(true);
	}

}
