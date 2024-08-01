package org.solid.model;

import javax.persistence.*;
@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Profile profile;

    @Column(name = "username")
    private String username;

    @Override
    public String toString() {
        return "Users{" +
                "profile=" + profile +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }


    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
