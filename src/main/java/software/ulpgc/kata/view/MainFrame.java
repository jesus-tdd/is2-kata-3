package software.ulpgc.kata.view;

import org.jfree.chart.JFreeChart;
import software.ulpgc.kata.model.Histogram;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final JFreeChartHistogramDisplay display;

    public MainFrame() throws HeadlessException {
        this.setTitle("Title type distribution histogram");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.display = new JFreeChartHistogramDisplay();
        add(display);
    }

    public void display(Histogram histogram) {
        display.display(histogram);
    }
}
