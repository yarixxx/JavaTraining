package problems3;

public class LineImpl implements Line {

    private String lineTitle;

    @Override
    public void setTitle(String title) throws Exception {
        if (title == null) {
            throw new Exception();
        }
        this.lineTitle = title;
    }

    @Override
    public String getTitle() {
        return lineTitle;
    }

    @Override
    public boolean removeStation(Station station) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addStation(Station station) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeStation(int index) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setStation(Station station, int index) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Station getStation(int index) {
        // TODO Auto-generated method stub
        return null;
    }

}
