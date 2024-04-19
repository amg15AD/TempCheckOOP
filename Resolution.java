package pcTest;

public   class Resolution {
    private int width;
    private int hight;

    public Resolution(int width, int hight) {
        this.width = width;
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", hight=" + hight +
                '}';
    }
}
