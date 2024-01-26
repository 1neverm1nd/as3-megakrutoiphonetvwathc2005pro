import java.time.LocalTime;

interface SmartDevice {
    void turnOn();

    void turnOff();

    void connectToInternet();

    class SmartWatch extends Gadget {
        @Override
        void receiveNotification(String message) {

            System.out.println("Уведомление на умных часах: " + message);
        }

        @Override
        void batteryStatus() {

            System.out.println("Уровень заряда батареи на умных часах: 80%");
        }

        void setAlarm(String time) {

            System.out.println("Будильник установлен на время: " + time);
        }

        void trackActivity() {

            System.out.println("Отслеживание активности...");
        }

        void showTime() {
            // Получение текущего времени
            LocalTime currentTime = LocalTime.now();
            System.out.println("Текущее время на умных часах: " + currentTime);
        }

        void connectToDevice(SmartDevice anotherDevice) {

        }
    }

    class SmartTV extends Gadget {
        @Override
        void receiveNotification(String message) {
            System.out.println("Уведомление на смарт-телевизоре: " + message);
        }

        @Override
        void batteryStatus() {
            // зачем тут батарею вставлять
        }

        void adjustVolume(int volumeLevel) {

            System.out.println("Громкость установлена на уровень: " + volumeLevel);
        }

        void launchApp(String appName) {

            System.out.println("Приложение " + appName + " запущено");
        }

        void streamVideo(String videoURL) {

            System.out.println("Воспроизведение видео по URL: " + videoURL);
        }

        void changeChannel(int channelNumber) {
            System.out.println("Переключение на канал: " + channelNumber);
        }

        void connectToDevice(SmartDevice anotherDevice) {
            // тоже не понятно
        }
    }

    class SmartPhone extends Gadget {
        @Override
        void receiveNotification(String message) {

            System.out.println("Уведомление на смартфоне: " + message);
        }

        @Override
        void batteryStatus() {

            System.out.println("Уровень заряда батареи на смартфоне: 70%");
        }

        void makeCall(String number) {

            System.out.println("Совершен звонок на номер: " + number);
        }

        void sendSMS(String message) {

            System.out.println("Отправлено SMS: " + message);
        }

        void connectToDevice(SmartDevice anotherDevice) {

        }
    }
}

