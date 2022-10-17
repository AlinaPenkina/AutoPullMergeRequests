package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class References {
    @JsonProperty("short")
    public String myshort;
    public String relative;
    public String full;
}
