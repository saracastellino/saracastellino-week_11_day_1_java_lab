public class Printer {
    private int numberOfSheets;
    private int volumeOfInk;
    private int jobSheets;
    private int toner;

    public Printer(int numberOfSheets, int volumeOfInk, int jobSheets, int toner) {
        this.numberOfSheets = numberOfSheets;
        this.volumeOfInk = volumeOfInk;
        this.jobSheets = jobSheets;
        this.toner = toner;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public int getVolumeOfInk() {
        return this.volumeOfInk;
    }


    public int getToner() {
        return this.toner;
    }

    public void print() {
        if(this.numberOfSheets >= jobSheets);
        numberOfSheets -= jobSheets;
        toner -= volumeOfInk;
    }

}
