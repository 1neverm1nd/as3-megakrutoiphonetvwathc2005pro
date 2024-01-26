abstract class Gadget implements SmartDevice {
    abstract void receiveNotification(String message);

    abstract void batteryStatus();

    @Override
    public void turnOn() {
        System.out.println("Устройство включено");
    }

    @Override
    public void turnOff() {
        System.out.println("Устройство выключено");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Устройство подключено к интернету");
    }
}
