package com.example.restbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class RegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String surName;

    private String firstName;

    private String title;

    private Date DOB;

    private String gender;

    private String address;

    private int street_Number;

    private String street_Name;

    private String city;

    private String county;

    private String EIR_Code;

    private String Email;

    private int Mobile_Number;

    private int Emergency_Contact_Number;

    private int Medical_Card_Number;

    private LocalDate Expiry_Date;

    private int PPSN_Number;

    private String Insurance_Company_Name;

    private String Insurance_Plan_Type;

    private int Insurance_Policy_Number;

    private String Insurance_Policy_Holder_Name;

    private LocalDate Insurance_Policy_Expiry;


    private String Preferred_Pharmacy;


    public RegistrationForm(Long id, String surName, String firstName, String title, Date DOB, String gender, String address, int street_Number, String street_Name, String city, String county, String EIR_Code, String email, int mobile_Number, int emergency_Contact_Number, int medical_Card_Number, LocalDate expiry_Date, int PPSN_Number, String insurance_Company_Name, String insurance_Plan_Type, int insurance_Policy_Number, String insurance_Policy_Holder_Name, LocalDate insurance_Policy_Expiry, String preferred_Pharmacy) {
        this.id = id;
        this.surName = surName;
        this.firstName = firstName;
        this.title = title;
        this.DOB = DOB;
        this.gender = gender;
        this.address = address;
        this.street_Number = street_Number;
        this.street_Name = street_Name;
        this.city = city;
        this.county = county;
        this.EIR_Code = EIR_Code;
        this.Email = email;
        this.Mobile_Number = mobile_Number;
        this.Emergency_Contact_Number = emergency_Contact_Number;
        this.Medical_Card_Number = medical_Card_Number;
        this.Expiry_Date = expiry_Date;
        this.PPSN_Number = PPSN_Number;
        this.Insurance_Company_Name = insurance_Company_Name;
        this.Insurance_Plan_Type = insurance_Plan_Type;
        this.Insurance_Policy_Number = insurance_Policy_Number;
        this.Insurance_Policy_Holder_Name = insurance_Policy_Holder_Name;
        this.Insurance_Policy_Expiry = insurance_Policy_Expiry;
        this.Preferred_Pharmacy = preferred_Pharmacy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStreet_Number() {
        return street_Number;
    }

    public void setStreet_Number(int street_Number) {
        this.street_Number = street_Number;
    }

    public String getStreet_Name() {
        return street_Name;
    }

    public void setStreet_Name(String street_Name) {
        this.street_Name = street_Name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEIR_Code() {
        return EIR_Code;
    }

    public void setEIR_Code(String EIR_Code) {
        this.EIR_Code = EIR_Code;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(int mobile_Number) {
        Mobile_Number = mobile_Number;
    }

    public int getEmergency_Contact_Number() {
        return Emergency_Contact_Number;
    }

    public void setEmergency_Contact_Number(int emergency_Contact_Number) {
        Emergency_Contact_Number = emergency_Contact_Number;
    }

    public int getMedical_Card_Number() {
        return Medical_Card_Number;
    }

    public void setMedical_Card_Number(int medical_Card_Number) {
        Medical_Card_Number = medical_Card_Number;
    }

    public LocalDate getExpiry_Date() {
        return Expiry_Date;
    }

    public void setExpiry_Date(LocalDate expiry_Date) {
        Expiry_Date = expiry_Date;
    }

    public int getPPSN_Number() {
        return PPSN_Number;
    }

    public void setPPSN_Number(int PPSN_Number) {
        this.PPSN_Number = PPSN_Number;
    }

    public String getInsurance_Company_Name() {
        return Insurance_Company_Name;
    }

    public void setInsurance_Company_Name(String insurance_Company_Name) {
        Insurance_Company_Name = insurance_Company_Name;
    }

    public String getInsurance_Plan_Type() {
        return Insurance_Plan_Type;
    }

    public void setInsurance_Plan_Type(String insurance_Plan_Type) {
        Insurance_Plan_Type = insurance_Plan_Type;
    }

    public int getInsurance_Policy_Number() {
        return Insurance_Policy_Number;
    }

    public void setInsurance_Policy_Number(int insurance_Policy_Number) {
        Insurance_Policy_Number = insurance_Policy_Number;
    }

    public String getInsurance_Policy_Holder_Name() {
        return Insurance_Policy_Holder_Name;
    }

    public void setInsurance_Policy_Holder_Name(String insurance_Policy_Holder_Name) {
        Insurance_Policy_Holder_Name = insurance_Policy_Holder_Name;
    }

    public LocalDate getInsurance_Policy_Expiry() {
        return Insurance_Policy_Expiry;
    }

    public void setInsurance_Policy_Expiry(LocalDate insurance_Policy_Expiry) {
        Insurance_Policy_Expiry = insurance_Policy_Expiry;
    }
    public String getPreferred_Pharmacy() {
        return Preferred_Pharmacy;
    }

    public void setPreferred_Pharmacy(String preferred_Pharmacy) {
        Preferred_Pharmacy = preferred_Pharmacy;
    }
}
