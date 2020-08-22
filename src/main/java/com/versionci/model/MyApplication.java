package com.versionci.model;

public class MyApplication {

    private final long version;
    private final String lastcommitsha;
    private final String description;

    public MyApplication(long version, String lastcommitsha, String description) {
        this.version = version;
        this.lastcommitsha = lastcommitsha;
        this.description = description;
    }

    public long getVersion() {
        return version;
    }

    public String getLastcommitsha() {
        return lastcommitsha;
    }

    public String getDescription() {
        return description;
    }
}
