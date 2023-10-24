package entitites;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)+ "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : comments){
            sb.append(c.getText());
        }
        return sb.toString();
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }
}
