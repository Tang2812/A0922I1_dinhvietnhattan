package codegym.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Music {
    @Id
    private int Id;
@Column(columnDefinition = "nvachar(100)")
    private String name;
private String Singer;
private String type;
private String songUrl;

    public Music(int id, String name, String singer, String type, String songUrl) {
        Id = id;
        this.name = name;
        Singer = singer;
        this.type = type;
        this.songUrl = songUrl;
    }

    public Music() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}
