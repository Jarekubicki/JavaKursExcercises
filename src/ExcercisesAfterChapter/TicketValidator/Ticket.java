package ExcercisesAfterChapter.TicketValidator;

import java.time.LocalDateTime;

/**
 * Created by BIURO22 on 2023-02-14
 */
public class Ticket {

    private LocalDateTime validationTime;
    private long minutesDurationTime;

    public Ticket(LocalDateTime validationTime, long minutesDurationTime) {
        this.validationTime = validationTime;
        this.minutesDurationTime = minutesDurationTime;
    }

    public LocalDateTime getValidationTime() {
        return validationTime;
    }

    public void setValidationTime(LocalDateTime validationTime) {
        this.validationTime = LocalDateTime.from(validationTime);
    }

    public long getMinutesDurationTime() {
        return minutesDurationTime;
    }

    public void setMinutesDurationTime(long minutesDurationTime) {
        this.minutesDurationTime = minutesDurationTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "validationTime=" + validationTime +
                ", minutesDurationTime=" + minutesDurationTime +
                '}';
    }
}
