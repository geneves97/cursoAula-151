package entitites;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Post {
    private Data moment;
    private String title;
    private String content;
    private Integer likes;


    private List<Comment> comments = new ArrayList<>();

    public Post(Data moment) {
    }

    public Post(Data moment, String title, String content, Integer likes, List<Comment> comments) {
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
