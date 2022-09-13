/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

class DateTimeTest {


  public static void main(String[] args) {
    testNow();
    //testCreate();
    // testParse();
    // testFormat();
  }


  public static void testNow() {
    LocalDateTime timestamp = LocalDateTime.now();
    System.out.println(timestamp);

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);

    LocalDateTime time = LocalDateTime.now();
    System.out.println(time);

    // TODO
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void testCreate() {
    // TODO: create your birthday via of(). What day of the week were you born on?

    // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
    // NOTE: ignore time-zone, just assume Eastern Time is the local time.
  }

  /**
   * TASK: implement the TODOs and print your results.
   */
  public static void LocalDateParse(LocalDate today) {
    LocalDate bday = LocalDate.of(1984, 4, 2);
    DayOfWeek day = today.getDayOfWeek();
    System.out.println(day);


    // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").

    // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
  }
  public static void testParse() {
    LocalDate bday = LocalDate.parse("1984-04-02");
    System.out.println(bday);
  }


  {

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    //public static void testFormat() {
    LocalDate hastings = LocalDate.of(1066, 10, 14);

      System.out.println(10/14/1066);
    }

    }


    // TODO: 10/14/1066

    // TODO: 14-10-1066

    // OPTIONAL: October 14, 1066



