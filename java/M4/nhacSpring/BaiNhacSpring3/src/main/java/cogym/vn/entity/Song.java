package cogym.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Song {
    @Id
private Integer id;
    @NotBlank(message = "ten khong duoc de trong")
@Column(columnDefinition = "nvarchar(50)")
    private String name;
@NotBlank(message = "ten ca si khong duoc de trong")
@Column(columnDefinition = "nvarchar(50)")
    private String Singer;
private String type;
@NotBlank(message = "url khong duoc de trong")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Song() {
    }

    public Song(Integer id, String name, String singer, String type, String url) {
        this.id = id;
        this.name = name;
        Singer = singer;
        this.type = type;
        this.url = url;
    }
}
