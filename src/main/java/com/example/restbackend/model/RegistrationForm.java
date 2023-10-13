package com.example.restbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class RegistrationForm {

    private String Medical_History;

    private String Reason_for_the_Visit;

    private String List_any_current_past_medical_problems;

    private String Current_Medical_Dosages;

    private String Previous_gp_Details;

    private String Name;

    private String Address;

    private String Preferred_Pharmacy;

    public RegistrationForm(String medical_History, String reason_for_the_Visit, String list_any_current_past_medical_problems, String current_Medical_Dosages, String previous_gp_Details, String name, String address, String preferred_Pharmacy) {Medical_History = medical_History;
        this.Reason_for_the_Visit = reason_for_the_Visit;
        this.List_any_current_past_medical_problems = list_any_current_past_medical_problems;
        this.Current_Medical_Dosages = current_Medical_Dosages;
        this.Previous_gp_Details = previous_gp_Details;
        this.Name = name;
        this.Address = address;
        this.Preferred_Pharmacy = preferred_Pharmacy;
    }

    public String getMedical_History() {
        return Medical_History;
    }

    public void setMedical_History(String medical_History) {
        Medical_History = medical_History;
    }

    public String getReason_for_the_Visit() {
        return Reason_for_the_Visit;
    }

    public void setReason_for_the_Visit(String reason_for_the_Visit) {
        Reason_for_the_Visit = reason_for_the_Visit;
    }

    public String getList_any_current_past_medical_problems() {
        return List_any_current_past_medical_problems;
    }

    public void setList_any_current_past_medical_problems(String list_any_current_past_medical_problems) {
        List_any_current_past_medical_problems = list_any_current_past_medical_problems;
    }

    public String getCurrent_Medical_Dosages() {
        return Current_Medical_Dosages;
    }

    public void setCurrent_Medical_Dosages(String current_Medical_Dosages) {
        Current_Medical_Dosages = current_Medical_Dosages;
    }

    public String getPrevious_gp_Details() {
        return Previous_gp_Details;
    }

    public void setPrevious_gp_Details(String previous_gp_Details) {
        Previous_gp_Details = previous_gp_Details;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPreferred_Pharmacy() {
        return Preferred_Pharmacy;
    }

    public void setPreferred_Pharmacy(String preferred_Pharmacy) {
        Preferred_Pharmacy = preferred_Pharmacy;
    }
}
