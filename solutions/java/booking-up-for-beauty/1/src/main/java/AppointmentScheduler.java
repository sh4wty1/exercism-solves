import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] description = appointmentDateDescription.split(" ");
        String[] date = description[0].split("/");
        String[] time = description[1].split(":");
        return LocalDateTime.of(
            Integer.parseInt(date[2]),
            Integer.parseInt(date[0]),
            Integer.parseInt(date[1]),
            Integer.parseInt(time[0]),
            Integer.parseInt(time[1]),
            Integer.parseInt(time[2]));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18) {
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {

    LocalDate date = appointmentDate.toLocalDate();

    DateTimeFormatter timeFormatter =
        DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);

    DateTimeFormatter printer =
        DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);

    return "You have an appointment on "
        + appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH)
        + ", "
        + printer.format(date)
        + ", at "
        + appointmentDate.format(timeFormatter)
        + ".";
}

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
