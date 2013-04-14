package problems3;

public class StationImpl implements Station {

    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

}
