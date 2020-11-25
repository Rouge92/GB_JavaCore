package Lesson7;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Value",
        "Unit",
        "UnitType"
})
public class Minimum {

    @JsonProperty("Value")
    public Double value;
    @JsonProperty("Unit")
    public String unit;
    @JsonProperty("UnitType")
    public Integer unitType;
    @Override
    public  String toString(){
        return  "Минимальная температура: " + value + " " + unit;
    }

}