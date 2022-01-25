package behavioral.observer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListeners>> eventListeners = new HashMap<>();

    public EventManager(String ...operations){
        for (String operation : operations){
            this.eventListeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListeners eventListeners){
        List<EventListeners> users = this.eventListeners.get(eventType);
        users.add(eventListeners);
    }

    public void unsubscribe(String eventType, EventListeners eventListeners){
        List<EventListeners> users = this.eventListeners.get(eventType);
        users.remove(eventListeners);
    }

    public void notify(String eventType, File file) throws IOException {
        List<EventListeners> users = this.eventListeners.get(eventType);
        for (EventListeners eventListener: users){
            eventListener.update(eventType, file);
        }
    }
}
