public interface Informable {
    default void info(int PhoneID, String model, int weght, String number){
        System.out.println("Это сообщение из метода info() интерфейса Informable. Данные телефона");
        System.out.printf("id телефона - %d, модель - %s, вес - %d г, номер %s%n%n", PhoneID, model, weght, number);
    }
}
