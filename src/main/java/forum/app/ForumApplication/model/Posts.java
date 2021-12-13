package forum.app.ForumApplication.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "posts")
public class Posts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    private String category;
    private String title;
    private String body;
    private String postByUser;

    public Posts() {
    }

    public Posts(String category, String title, String body, String postByUser) {
        this.category = category;
        this.title = title;
        this.body = body;
        this.postByUser = postByUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPostByUser() {
        return postByUser;
    }

    public void setPostByUser(String postByUser) {
        this.postByUser = postByUser;
    }
}
