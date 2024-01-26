import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartDevice.SmartPhone phone = new SmartDevice.SmartPhone();
        SmartDevice.SmartWatch watch = new SmartDevice.SmartWatch();
        SmartDevice.SmartTV tv = new SmartDevice.SmartTV();
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите устройство (1 - Смартфон, 2 - Умные часы, 3 - Смарт-телевизор, 0 - Выйти):");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    operateSmartPhone(phone, scanner);
                    break;
                case 2:
                    operateSmartWatch(watch, scanner);
                    break;
                case 3:
                    operateSmartTV(tv, scanner);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }

    private static void operateSmartPhone(SmartDevice.SmartPhone phone, Scanner scanner) {
        boolean backToMenu = false;
        while (!backToMenu) {
            System.out.println("Выберите действие для смартфона (1 - Совершить звонок, 2 - Отправить SMS, 0 - Вернуться в меню):");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Введите номер для звонка:");
                    String number = scanner.next();
                    phone.makeCall(number);
                    break;
                case 2:
                    System.out.println("Введите текст сообщения для отправки:");
                    String message = scanner.next();
                    phone.sendSMS(message);
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Неверное действие для смартфона.");
            }
        }
    }

    private static void operateSmartWatch(SmartDevice.SmartWatch watch, Scanner scanner) {
        boolean backToMenu = false;
        while (!backToMenu) {
            System.out.println("Выберите действие для умных часов (1 - Отслеживание пульса, 2 - Показать время, 3 - Установить будильник, 4 - Отслеживать активность, 0 - Вернуться в меню):");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    // Заменил trackHeartRate() на trackActivity()
                    watch.trackActivity();
                    break;
                case 2:
                    watch.showTime();
                    break;
                case 3:
                    System.out.println("Введите время для установки будильника:");
                    String alarmTime = scanner.next();
                    watch.setAlarm(alarmTime);
                    break;
                case 4:
                    watch.trackActivity();
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Неверное действие для умных часов.");
            }
        }
    }
    private static void operateSmartTV(SmartDevice.SmartTV tv, Scanner scanner) {
        boolean backToMenu = false;
        while (!backToMenu) {
            System.out.println("Выберите действие для смарт-телевизора (1 - Воспроизвести видео, 2 - Переключить канал, 3 - Регулировать громкость, 4 - Запустить приложение, 0 - Вернуться в меню):");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Введите URL видео:");
                    String videoURL = scanner.next();
                    tv.streamVideo(videoURL);
                    break;
                case 2:
                    System.out.println("Введите номер канала:");
                    int channelNumber = scanner.nextInt();
                    tv.changeChannel(channelNumber);
                    break;
                case 3:
                    System.out.println("Введите уровень громкости:");
                    int volumeLevel = scanner.nextInt();
                    tv.adjustVolume(volumeLevel);
                    break;
                case 4:
                    System.out.println("Введите название приложения:");
                    String appName = scanner.next();
                    tv.launchApp(appName);
                    break;
                case 0:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Неверное действие для смарт-телевизора.");
            }
        }
    }
}