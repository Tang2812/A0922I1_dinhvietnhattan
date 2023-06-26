package codegym.vn.entity;

import javax.persistence.*;

@Entity
public class Music {
    @Id
//    @GeneratedValue
    private int id;

    @Column(columnDefinition = "nvarchar(100)")

    private String name;
    private String singer;
    private String type;
    private String songUrl;

    public Music(int id, String name, String singer, String type, String songUrl) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.songUrl = songUrl;
    }

    public Music() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
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
