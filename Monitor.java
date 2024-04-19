package pcTest;

public  class Monitor extends Resolution {
    private String model;
    private String manufactor;

    public Monitor(int width, int hight) {
        super(width, hight);
    }


    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }

}
