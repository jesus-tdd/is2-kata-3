package software.ulpgc.kata.model;

import java.util.List;

public interface Histogram {
    String title();

    List<String> key();

    int valueOf(String key);
}
