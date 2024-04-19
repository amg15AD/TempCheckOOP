package pcTest;

public class PC  {
    private Case aCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case aCase, Monitor monitor, MotherBoard motherBoard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo(int x, int y, String color){
        monitor.drawPixel(x,y,color);
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today..." +
                " \n" + aCase.toString() + " " + monitor.toString() + " " + motherBoard.toString());
    }


}
