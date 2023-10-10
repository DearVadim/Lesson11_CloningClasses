public class Main {
    public static void main(String[] args) {

        Phone Apple = new ApplePhone();
        Apple.setModel("Apple iPhone 15 Pro");
        Apple.setNumber("+79999999977");
        Apple.setWeight((short) 187);
        System.out.printf("Передали данные: модель: %s,\t номер: %s,\t вес: %d г.\n", Apple.getModel(), Apple.getNumber(), Apple.getWeight());
        System.out.println(Apple.Info() + "\n");


        Phone[] PhonesArray;
        PhonesArray = new Phone[2];

         try {
            PhonesArray[0] = Apple.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        PhonesArray[0].setModel("Samsung Galaxy S20");
        PhonesArray[0].setNumber("+79999999999");
        PhonesArray[0].setWeight((short) 190);
        System.out.printf("Передали данные в клон: модель %s,\t номер %s,\t вес %d г.\n", PhonesArray[0].getModel(), PhonesArray[0].getNumber(), PhonesArray[0].getWeight());
        System.out.println(PhonesArray[0].Info() + "\n");

        try {
            PhonesArray[1] = Apple.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //Phone Xiaomi = new XiaomiPhone();
        PhonesArray[1].setModel("Xiaomi Redmi 10A");
        PhonesArray[1].setNumber("+79999999988");
        PhonesArray[1].setWeight((short) 194);
        System.out.printf("Передали данные в клон: модель: %s,\t номер: %s,\t вес: %d г.\n", PhonesArray[1].getModel(), PhonesArray[1].getNumber(), PhonesArray[1].getWeight());
        System.out.println(PhonesArray[1].Info() + "\n");


        Apple.info(Apple.getPhoneID(), Apple.getModel(), Apple.getWeight(), Apple.getNumber());
        for (Phone PhoneElement:PhonesArray) {
            PhoneElement.info(PhoneElement.getPhoneID(), PhoneElement.getModel(), PhoneElement.getWeight(), PhoneElement.getNumber());

        }

        Apple.receiveCall("тетя Даша");
        PhonesArray[0].receiveCall("Дарья Синицына");
        PhonesArray[1].receiveCall("Иван Петрович");
        PhonesArray[1].receiveCall("Семен Павлов");
    }
}