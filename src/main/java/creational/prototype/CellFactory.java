package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
    private static final Map<Color, Cell> cellCache = new HashMap<>();

    public CellFactory() {
    }

    public static Cell getCell(Color color){
        if(!cellCache.containsKey(color)){
            Cell cell = new Cell(color.toString());
            cellCache.put(color, cell);
        }
        return (Cell) cellCache.get(color).clone();
    }
}
