package articles;

import java.util.Objects;
import java.util.jar.Attributes;

public class Article {
    private String type;
    private String id;
    private Attributes attributes;
    private Author author;

    public Article() {
    }

    public Article(String type, String id, Attributes attributes, Author author) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.author = author;
    }

    private String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(type, article.type) && Objects.equals(id, article.id) && Objects.equals(attributes, article.attributes) && Objects.equals(author, article.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, attributes, author);
    }

    @Override
    public String toString() {
        return "Article{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", author=" + author +
                '}';
    }
}
