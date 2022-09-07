public class Television {


  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;

  public Television() {
    instanceCount++;

  }

  public Television(String brand) {
    this();
    setBrand(brand);

  }

  public Television(String brand, int volume) {

    this(brand);
    setVolume(volume);
  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();

    System.out.println("The" + brand + "television is on, with a volume of" + volume);

  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  void turnOff() {
    System.out.println("The" + brand + "television is off");

  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {

    switch (brand) {
      case ("Samsung"):
      case ("Sony"):
      case ("LG"):
      case "Toshiba":
        this.brand = brand;
        break;

      default:
        System.out.printf("%s is invalid; only Sasmung, LG, and Sony are allowed.%n", brand);

    }

  }

  public int getVolume(int i) {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive)", volume,
          MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }

  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {

    return "Television: brand = " + brand + ",  volume=" + volume;

  }

}



