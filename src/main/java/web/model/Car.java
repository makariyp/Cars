package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Integer year;
    private Integer series;

    public Car(String model, Integer year, Integer series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }

    public List<String> toStringArray() {
        List<String> list = new ArrayList<>();
        list.add(model);
        list.add(year.toString());
        list.add(series.toString());
        return list;
    }
}
