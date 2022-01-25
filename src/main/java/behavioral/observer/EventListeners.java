package behavioral.observer;

import java.io.File;
import java.io.IOException;

public interface EventListeners {
    void update(String eventType, File filename) throws IOException;
}
