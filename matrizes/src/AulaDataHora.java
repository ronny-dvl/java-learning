import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AulaDataHora {
    public static void main(String[]args){

        //https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        java.time.LocalDateTime d02 = java.time.LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-05-14");
        java.time.LocalDateTime d05 = java.time.LocalDateTime.parse("2026-05-14T01:30:26");
        Instant d06 = Instant.parse("2026-05-14T01:30:26Z");
        Instant d07 = Instant.parse("2026-05-14T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("14/05/2026", fmt1);
        java.time.LocalDateTime d09 = java.time.LocalDateTime.parse("14/05/2026 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2026, 5, 14);
        java.time.LocalDateTime d11 = java.time.LocalDateTime.of(2026, 5, 14, 1, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
