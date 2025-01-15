package software.ulpgc.kata.control;

import software.ulpgc.kata.model.Title;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvTitleReader implements TitleReader{
    private final File source;
    private final TitleDeserializer deserializer;

    public TsvTitleReader(File source) {
        this.source = source;
        this.deserializer = new TsvTitleDeserializer();
    }

    @Override
    public List<Title> read() throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
            readHeadersWith(reader);
            return readTitlesWith(reader);
        }
    }

    private void readHeadersWith(BufferedReader reader) throws IOException {
        reader.readLine();
    }

    private List<Title> readTitlesWith(BufferedReader reader) throws IOException {
        List<Title> titles = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            titles.add(deserializer.deserialize(line));
        }
        return titles;
    }
}
