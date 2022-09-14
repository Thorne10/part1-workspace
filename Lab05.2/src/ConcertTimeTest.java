/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.net.ProxySelector;
import java.util.*;
import java.time.*;

class ConcertTimeTest {

    public static void main(String[] args, ProxySelector ZoneID) {
        listAvailableZoneIds();
        testLiveConcert(ZoneID);
    }

    /*
     * Shows all defined ZoneIds, which will help with the concert problem.
     * You'll need to know the names of the ZoneIds for Toronto and Perth.
     */
    public static void listAvailableZoneIds() {
        Set<String> rawZoneIds = ZoneId.getAvailableZoneIds();  // unsorted, arbitrary order
        SortedSet<String> zoneIds = new TreeSet<>(rawZoneIds);  // sorted by String natural order

        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }

    /**
     * OPTIONAL: your favorite band is playing live in Toronto, Canada on June 18, 2020, at 7pm.
     * You live in Perth, Australia, and want to watch a live simulcast via the web.
     * When are you watching it?
     *
     * RESULT: 
     */
    public static void testLiveConcert(ProxySelector ZoneID) {
        ZonedDateTime Toronto = ZoneID.of("America/Toroto");
        ZoneId perth = ZoneID.of("Australia/Perth");
        ZonedDateTime concertInToronto = ZonedDateTime.of(LocalDate.of(2020, 06, 18), LocalTime.of(19,0 ),
        ZonedDateTime  concertInToronto.withZoneSameInstant ZoneId("America/Toronto");
        // TODO
    }
}