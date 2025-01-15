package software.ulpgc.kata.control;

import software.ulpgc.kata.model.Title;

public interface TitleDeserializer {
    Title deserialize(String content);
}
