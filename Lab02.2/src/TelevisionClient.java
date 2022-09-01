public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = "Toshiba";
    tv1.volume = 25;



    Television tv2 = new Television();
    tv2.brand = "Zenith";
    tv2.volume = 25;

    tv1.turnOn();
    tv1.turnOff();

    tv2.turnOn();
    tv2.turnOff();

  }
}
