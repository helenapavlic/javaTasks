import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour > 11 && hour < 18 ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a",  Locale.ENGLISH);
        String date = appointmentDate.format(parser);
        return "You have an appointment on " + date + ".";
    }

    public LocalDate getAnniversaryDate() {
        String annDate = LocalDateTime.now().getYear() + "-9-15";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-M-dd");
        LocalDate ld = LocalDate.parse(annDate, parser);
        return ld;   
    }
}
