package Lesson7;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class WeatherResponse {

@JsonProperty("DateTime")
public String dateTime;
    @JsonProperty("EpochDateTime")
    public Integer epochDateTime;
    @JsonProperty("WeatherIcon")
    public Integer weatherIcon;
    @JsonProperty("IconPhrase")
    public String iconPhrase;
    @JsonProperty("HasPrecipitation")
    public Boolean hasPrecipitation;
    @JsonProperty("IsDaylight")
    public Boolean isDaylight;
    @JsonProperty("Temperature")
    public Temperature temperature;
    @JsonProperty("PrecipitationProbability")
    public Integer precipitationProbability;
    @JsonProperty("MobileLink")
    public String mobileLink;
    @JsonProperty("Link")
    public String link;


@Override
    public  String toString(){
        return  "Прогноз на " + dateTime +" ожидается " + iconPhrase + temperature.toString() + "\r\n";
    }

}
