package com.ramon.broker.controller.dto;

public class AppointmentDTO {
    private String appointmentStart;
    private String appointmentFinish;
    private boolean bookingConfirmed;

    public String getAppointmentStart() {
        return appointmentStart;
    }

    public void setAppointmentStart(String appointmentStart) {
        this.appointmentStart = appointmentStart;
    }

    public String getAppointmentFinish() {
        return appointmentFinish;
    }

    public void setAppointmentFinish(String appointmentFinish) {
        this.appointmentFinish = appointmentFinish;
    }

    public boolean isBookingConfirmed() {
        return bookingConfirmed;
    }

    public void setBookingConfirmed(boolean bookingConfirmed) {
        this.bookingConfirmed = bookingConfirmed;
    }
}
