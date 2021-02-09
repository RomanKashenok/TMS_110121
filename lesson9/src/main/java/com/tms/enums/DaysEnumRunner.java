package com.tms.enums;

public class DaysEnumRunner {
    public static void main(String[] args) {
        Roles[] possibleRoles = Roles.values();

        for (int i = 0; i < possibleRoles.length; i++) {
            System.out.println(possibleRoles[i]);
        }

        String description = Roles.ADMIN.getDescription();
        System.out.println("admin desc: " + description);

        Roles.ADMIN.setDescription("new description for admin role");

        description = Roles.ADMIN.getDescription();
        System.out.println("admin desc: " + description);
    }
}
