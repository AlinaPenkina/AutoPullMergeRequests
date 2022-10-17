package pojos;


import lombok.Data;

@Data
public class Author {
    public int id;
    public String username;
    public String name;
    public String state;
    public String avatar_url;
    public String web_url;
}
