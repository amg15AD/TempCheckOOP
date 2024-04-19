package pcTest;

public class   MotherBoard {
    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public void loadProgram(String programName){
        System.out.println(programName + " is now running!");
    }
}
