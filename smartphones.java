public class smartphones {
    private String model;
    private int year;
    private boolean isOn;

    public smartphones(String model, int year) {
        this.model = model;
        this.year = year;
        this.isOn = false;
    }

    public static void main(String[] args) {
        smartphones SM = new smartphones("Iphone 12", 2022);
        SM.displayInfo();
        SM.turnOn();
        SM.makeCall("123-456-789");
    }

    public void displayInfo() {
        System.out.println("The model of the phone is " + model);
        System.out.println("The year of release is " + year);
    }

    public void turnOn() {
        if (!isOn) {
            System.out.println("Turning on the phone.");
            isOn = true;
        } else {
            System.out.println("The phone is turned on.");
        }
    }

    public void makeCall(String phoneNumber) {
        if (isOn) {
            System.out.println("Making a call to " + phoneNumber);
        } else {
            System.out.println("Turn on the phone before making a call.");
        }
    }
}
