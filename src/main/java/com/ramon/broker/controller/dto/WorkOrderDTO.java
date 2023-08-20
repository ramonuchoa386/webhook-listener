package com.ramon.broker.controller.dto;

public class WorkOrderDTO {
    private String id;
    private String lifeCycleStatus;
    private String associatedDocument;
    private String businessUnit;
    private String operationalPriority;
    private boolean readyForTechnicalDispatch;
    private TaskDTO task;
    private AppointmentDTO appointment;
    private TechnicianDTO technician;
    private AddressDTO address;
    private CustomerDTO customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    public void setLifeCycleStatus(String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }

    public String getAssociatedDocument() {
        return associatedDocument;
    }

    public void setAssociatedDocument(String associatedDocument) {
        this.associatedDocument = associatedDocument;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getOperationalPriority() {
        return operationalPriority;
    }

    public void setOperationalPriority(String operationalPriority) {
        this.operationalPriority = operationalPriority;
    }

    public boolean isReadyForTechnicalDispatch() {
        return readyForTechnicalDispatch;
    }

    public void setReadyForTechnicalDispatch(boolean readyForTechnicalDispatch) {
        this.readyForTechnicalDispatch = readyForTechnicalDispatch;
    }

    public TaskDTO getTask() {
        return task;
    }

    public void setTask(TaskDTO task) {
        this.task = task;
    }

    public AppointmentDTO getAppointment() {
        return appointment;
    }

    public void setAppointment(AppointmentDTO appointment) {
        this.appointment = appointment;
    }

    public TechnicianDTO getTechnician() {
        return technician;
    }

    public void setTechnician(TechnicianDTO technician) {
        this.technician = technician;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}
