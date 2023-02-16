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
    public String  getModel(){
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getSeries() {
        return series;
    }
}
