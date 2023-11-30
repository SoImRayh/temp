package dev.rayh.app.domain.views;

public enum AppViews {

    HOME("index.html");
    private final String path;

    AppViews(String path) {
        this.path = path;
    }
    @Override
    public String toString(){
        return this.path;
    }
}
