public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setVolume(0);
    System.out.println(tv1);
    tv1.setBrand("samsung");

    tv1.setVolume(100);
    System.out.println(tv1);

    tv1.setVolume(0);
    tv1.setVolume(100);
    System.out.println(tv1);



   Television tv3 = new Television("samsung");







  }

}
