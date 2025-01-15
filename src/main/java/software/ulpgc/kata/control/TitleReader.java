package software.ulpgc.kata.control;

import software.ulpgc.kata.model.Title;

import java.io.IOException;
import java.util.List;

public interface TitleReader {
    List<Title> read() throws IOException;
}
