package entitites;

import lombok.Data;

@Data
public class Comment {

    private String text;

    public Comment(){}

    public Comment(String text) {
        this.text = text;
    }
}
