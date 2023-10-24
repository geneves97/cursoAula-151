package entitites;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;


    private List<Comment> comments = new ArrayList<>();

    public Post(Date moment) {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
}
