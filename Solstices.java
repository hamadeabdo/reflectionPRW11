package reflection;

import java.time.*;

public class Solstices {

    public String getSummerSolsticeCountdown(int today) {
        LocalDate summerDate = LocalDate.parse("2019-06-21");
        LocalDate nowHere = LocalDate.now();
        Duration duration = Duration.between(summerDate, nowHere);
        if (nowHere.isBefore(summerDate))
            return "The Summer Solstice " + nowHere.getYear() + " is on" + summerDate.getDayOfYear() + summerDate + " (in " + duration + " days).";


    else if (nowHere.isAfter(summerDate))
        return "The Summer Solstice " + nowHere.getYear() + " is on" + summerDate.getDayOfYear() + summerDate.plusMonths(12) + " (in " + duration + " days).";

    return
    }
}

