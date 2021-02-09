package com.tms.enums;

public enum Roles {
    USER("user", "regular privilegies"),
    ADMIN("admin", "admin privilegies (CRU operations)"),
    MANAGER("manager", "base manager privilegies"),
    OWNER("god_mode", "all possible privilegies");

    private String roleName;
    private String description;

    Roles(String name, String description) {
        this.roleName = name;
        this.description = description;
    }


    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
