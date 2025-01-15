package software.ulpgc.kata;

import software.ulpgc.kata.control.TitleReader;
import software.ulpgc.kata.control.TitleTypeHistogram;
import software.ulpgc.kata.control.TsvTitleReader;
import software.ulpgc.kata.model.Histogram;
import software.ulpgc.kata.view.MainFrame;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TitleReader reader = new TsvTitleReader(new File("src/main/resources/title.basics.tsv"));
        Histogram histogram = new TitleTypeHistogram(reader.read());
        MainFrame mainFrame = new MainFrame();
        mainFrame.display(histogram);
        mainFrame.setVisible(true);
    }
}
