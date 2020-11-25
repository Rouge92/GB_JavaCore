//package Lesson7;
//
//import com.fasterxml.jackson.annotation.*;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Value",
//        "Unit",
//        "UnitType"
//})
//public class TemperatureResponse {
//
//    public Double Value;
//
//    public String Unit;
//
//    public Integer UnitType;
//
//    @JsonGetter("Value")
//    public Double getValue(){ return Value;}
//    @JsonSetter("Value")
//    public void setValue( Double Value){ this.Value = Value;}
//
//    @JsonGetter("Unit")
//    public String getUnit(){ return Unit;}
//    @JsonSetter("Unit")
//    public void setUnit( String Unit){ this.Unit = Unit;}
//
//    @JsonGetter("UnitType")
//    public Integer getUnitType(){ return UnitType;}
//    @JsonSetter("UnitType")
//    public void setUnitType( Integer UnitType){ this.UnitType = UnitType;}
//
//    public TemperatureResponse (Double Value,String Unit,Integer UnitType){
//        this.Value = Value;
//        this.Unit = Unit;
//        this.UnitType = UnitType;
//    }
//    public TemperatureResponse(){
//
//    }
//
//    @Override
//    public  String toString(){
//        return  "Температура: " + Value + " " + Unit;
//    }
//
//}
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
public class Temperature {

    @JsonProperty("Value")
    public Double value;
    @JsonProperty("Unit")
    public String unit;
    @JsonProperty("UnitType")
    public Integer unitType;
    @Override
    public  String toString(){
        return  "Температура: " + value + " " + unit;
    }
}