public class Main {
    public static void main(String[] args) {

        Phone Apple = new ApplePhone();
        Apple.setModel("Apple iPhone 15 Pro");
        Apple.setNumber("+79999999977");
        Apple.setWeight((short) 187);
        System.out.printf("Передали данные: модель: %s,\t номер: %s,\t вес: %d г.\n", Apple.getModel(), Apple.getNumber(), Apple.getWeight());
        System.out.println(Apple.Info() + "\n");

        Phone Samsung = null;
        try {
            Samsung = Apple.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Samsung.setModel("Samsung Galaxy S20");
        Samsung.setNumber("+79999999999");
        Samsung.setWeight((short) 190);
        System.out.printf("Передали данные в клон: модель %s,\t номер %s,\t вес %d г.\n", Samsung.getModel(), Samsung.getNumber(), Samsung.getWeight());
        System.out.println(Samsung.Info() + "\n");

        Phone Xiaomi = null;
        try {
            Xiaomi = Apple.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //Phone Xiaomi = new XiaomiPhone();
        Xiaomi.setModel("Xiaomi Redmi 10A");
        Xiaomi.setNumber("+79999999988");
        Xiaomi.setWeight((short) 194);
        System.out.printf("Передали данные в клон: модель: %s,\t номер: %s,\t вес: %d г.\n", Xiaomi.getModel(), Xiaomi.getNumber(), Xiaomi.getWeight());
        System.out.println(Xiaomi.Info() + "\n");


        Xiaomi.info(Xiaomi.getPhoneID(), Xiaomi.getModel(), Xiaomi.getWeight(), Xiaomi.getNumber());
        Samsung.info(Samsung.getPhoneID(), Samsung.getModel(), Samsung.getWeight(), Samsung.getNumber());
        Apple.info(Apple.getPhoneID(), Apple.getModel(), Apple.getWeight(), Apple.getNumber());

        Xiaomi.receiveCall("Иван Петрович");
        Xiaomi.receiveCall("Семен Павлов");
        Samsung.receiveCall("Дарья Синицына");
        Apple.receiveCall("тетя Даша");
    }
}