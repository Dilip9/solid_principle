package org.solid.model;

public enum Profile {
    ENGINEER("ENGINEER"),
    DOCTOR("DOCTOR"),
    PLUMBER("PLUMBER"),
    LOWYER("LOWYER"),
    GOVT_SERVICE("GOVT SERVICE");

    private String profileName;
    Profile(String profileName){
        this.profileName = profileName;
    }

}