package com.ramon.broker.controller.dto;

public class NotificationDTO {
    private EventDTO event;
    private WorkOrderDTO workOrder;

    public EventDTO getEvent() {
        return event;
    }

    public void setEvent(EventDTO event) {
        this.event = event;
    }

    public WorkOrderDTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderDTO workOrder) {
        this.workOrder = workOrder;
    }
}
