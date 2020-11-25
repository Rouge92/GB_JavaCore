package Lesson7; ;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Date",
        "EpochDate",
        "Temperature",
        "Day",
        "Night",
        "Sources",
        "MobileLink",
        "Link"
})
public class DailyForecast {

    @JsonProperty("Date")
    public String date;
    @JsonProperty("EpochDate")
    public Integer epochDate;
    @JsonProperty("Temperature")
    public Temperature2 temperature2;
    @JsonProperty("Day")
    public Day day;
    @JsonProperty("Night")
    public Night night;
    @JsonProperty("Sources")
    public List<String> sources = null;
    @JsonProperty("MobileLink")
    public String mobileLink;
    @JsonProperty("Link")
    public String link;

    @Override
    public  String toString(){
        return  "Прогноз на " + date + ", днем "+ day.toString() + ", ночью "+ night.toString() + " " + temperature2.minimum.toString() + " " + temperature2.maximum.toString()+ "\r\n";
    }
}