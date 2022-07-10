package web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Car {

    private long id;
    private String brandName;
    private String modelName;
    private int buildYear;

    public Car(String brandName, String modelName, int buildYear) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.buildYear = buildYear;
    }

}
