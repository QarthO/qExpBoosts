package gg.quartzdev.qexpboosts;

public enum qPermission {

    PLAYER("qexpboost.player"),
    BOOST("qexpboost.boost.");

    private String permission;

    qPermission(String permission){
        this.permission = permission;
    }

}
