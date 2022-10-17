package pojos;

import lombok.Data;

@Data
public class TimeStats {
    public int time_estimate;
    public int total_time_spent;
    public String human_time_estimate;
    public String human_total_time_spent;
}
