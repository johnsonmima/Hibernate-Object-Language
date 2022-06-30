package org.example.entity;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Entity(name = "profile")
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "image_url")
    private String imageUrl;

    public Profile(){}

    public Profile(String displayName, String imageUrl) {
        this.displayName = displayName;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
