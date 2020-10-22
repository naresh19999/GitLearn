package com.angularBoot.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visaApplication")
public class UserRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String applicantName;
	@Column
	private String passportNumber;
	@Column
	private String countryOfNationality;
	@Column
	private String gender;
	@Column
	private Date dateOfBirth;
	@Column
	private Date dateOfApplication;
	@Column
	private String typeOfVisa;
	@Column
	private String serviceOption;
	@Column
	private String durationOfVisa;
	@Column
	private long totalFee;

	@Column
	private String submissionMethod;
	@Column
	private String paymentReference;
	@Column
	private String contactEmail;
	@Column
	private long contactLanguage;
	@Column
	private String placeOfBirth;
	@Column
	private String countryOfBirth;
	@Column
	private String relationStatus;
	@Column
	private String alternativeEmail;
	@Column
	private String emailAddressBelongdTo;
	@Column
	private String doHaveOtherName;
	@Column
	private String familyName;
	@Column
	private Date planToLeaveUk;
	@Column
	private Date planToArriveUk;
	@Column
	private String purposeOfVisit;
	@Column
	private long howMuchPaid;
	@Column
	private String whoPaid;
	@Column
	private String PassportReference;
	@Column
	private Date expiryDate;
	@Column
	private Date issuedate;
	@Column
	private String ableToContactTelephone;
	@Column
	private String medicalTreatmentInUk;
	@Column
	private String doUkDrivingLicence;
	@Column
	private String address;
	@Column
	private String ownershipStatusOfHome;
	@Column
	private String nicEmployeeAddress;
	@Column
	private String nicEmployementStatus;
	@Column
	private String ddFamilyName;
	@Column
	private String familyNames;
	@Column
	private String relationToPerson;
	@Column
	private String previousVisitCountry;
	@Column
	private String refusedVisa;
	@Column
	private String refusedBorder;

	public UserRegister() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getCountryOfNationality() {
		return countryOfNationality;
	}

	public void setCountryOfNationality(String countryOfNationality) {
		this.countryOfNationality = countryOfNationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getTypeOfVisa() {
		return typeOfVisa;
	}

	public void setTypeOfVisa(String typeOfVisa) {
		this.typeOfVisa = typeOfVisa;
	}

	public String getServiceOption() {
		return serviceOption;
	}

	public void setServiceOption(String serviceOption) {
		this.serviceOption = serviceOption;
	}

	public String getDurationOfVisa() {
		return durationOfVisa;
	}

	public void setDurationOfVisa(String durationOfVisa) {
		this.durationOfVisa = durationOfVisa;
	}

	public long getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(long totalFee) {
		this.totalFee = totalFee;
	}

	public String getSubmissionMethod() {
		return submissionMethod;
	}

	public void setSubmissionMethod(String submissionMethod) {
		this.submissionMethod = submissionMethod;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public long getContactLanguage() {
		return contactLanguage;
	}

	public void setContactLanguage(long contactLanguage) {
		this.contactLanguage = contactLanguage;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getRelationStatus() {
		return relationStatus;
	}

	public void setRelationStatus(String relationStatus) {
		this.relationStatus = relationStatus;
	}

	public String getAlternativeEmail() {
		return alternativeEmail;
	}

	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}

	public String getEmailAddressBelongdTo() {
		return emailAddressBelongdTo;
	}

	public void setEmailAddressBelongdTo(String emailAddressBelongdTo) {
		this.emailAddressBelongdTo = emailAddressBelongdTo;
	}

	public String getDoHaveOtherName() {
		return doHaveOtherName;
	}

	public void setDoHaveOtherName(String doHaveOtherName) {
		this.doHaveOtherName = doHaveOtherName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Date getPlanToLeaveUk() {
		return planToLeaveUk;
	}

	public void setPlanToLeaveUk(Date planToLeaveUk) {
		this.planToLeaveUk = planToLeaveUk;
	}

	public Date getPlanToArriveUk() {
		return planToArriveUk;
	}

	public void setPlanToArriveUk(Date planToArriveUk) {
		this.planToArriveUk = planToArriveUk;
	}

	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}

	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}

	public long getHowMuchPaid() {
		return howMuchPaid;
	}

	public void setHowMuchPaid(long howMuchPaid) {
		this.howMuchPaid = howMuchPaid;
	}

	public String getWhoPaid() {
		return whoPaid;
	}

	public void setWhoPaid(String whoPaid) {
		this.whoPaid = whoPaid;
	}

	public String getPassportReference() {
		return PassportReference;
	}

	public void setPassportReference(String passportReference) {
		PassportReference = passportReference;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public String getAbleToContactTelephone() {
		return ableToContactTelephone;
	}

	public void setAbleToContactTelephone(String ableToContactTelephone) {
		this.ableToContactTelephone = ableToContactTelephone;
	}

	public String getMedicalTreatmentInUk() {
		return medicalTreatmentInUk;
	}

	public void setMedicalTreatmentInUk(String medicalTreatmentInUk) {
		this.medicalTreatmentInUk = medicalTreatmentInUk;
	}

	public String getDoUkDrivingLicence() {
		return doUkDrivingLicence;
	}

	public void setDoUkDrivingLicence(String doUkDrivingLicence) {
		this.doUkDrivingLicence = doUkDrivingLicence;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwnershipStatusOfHome() {
		return ownershipStatusOfHome;
	}

	public void setOwnershipStatusOfHome(String ownershipStatusOfHome) {
		this.ownershipStatusOfHome = ownershipStatusOfHome;
	}

	public String getNicEmployeeAddress() {
		return nicEmployeeAddress;
	}

	public void setNicEmployeeAddress(String nicEmployeeAddress) {
		this.nicEmployeeAddress = nicEmployeeAddress;
	}

	public String getNicEmployementStatus() {
		return nicEmployementStatus;
	}

	public void setNicEmployementStatus(String nicEmployementStatus) {
		this.nicEmployementStatus = nicEmployementStatus;
	}

	public String getDdFamilyName() {
		return ddFamilyName;
	}

	public void setDdFamilyName(String ddFamilyName) {
		this.ddFamilyName = ddFamilyName;
	}

	public String getFamilyNames() {
		return familyNames;
	}

	public void setFamilyNames(String familyNames) {
		this.familyNames = familyNames;
	}

	public String getRelationToPerson() {
		return relationToPerson;
	}

	public void setRelationToPerson(String relationToPerson) {
		this.relationToPerson = relationToPerson;
	}

	public String getPreviousVisitCountry() {
		return previousVisitCountry;
	}

	public void setPreviousVisitCountry(String previousVisitCountry) {
		this.previousVisitCountry = previousVisitCountry;
	}

	public String getRefusedVisa() {
		return refusedVisa;
	}

	public void setRefusedVisa(String refusedVisa) {
		this.refusedVisa = refusedVisa;
	}

	public String getRefusedBorder() {
		return refusedBorder;
	}

	public void setRefusedBorder(String refusedBorder) {
		this.refusedBorder = refusedBorder;
	}

	public UserRegister(int id, String applicantName, String passportNumber, String countryOfNationality, String gender,
			Date dateOfBirth, Date dateOfApplication, String typeOfVisa, String serviceOption, String durationOfVisa,
			long totalFee, String submissionMethod, String paymentReference, String contactEmail, long contactLanguage,
			String placeOfBirth, String countryOfBirth, String relationStatus, String alternativeEmail,
			String emailAddressBelongdTo, String doHaveOtherName, String familyName, Date planToLeaveUk,
			Date planToArriveUk, String purposeOfVisit, long howMuchPaid, String whoPaid, String passportReference,
			Date expiryDate, Date issuedate, String ableToContactTelephone, String medicalTreatmentInUk,
			String doUkDrivingLicence, String address, String ownershipStatusOfHome, String nicEmployeeAddress,
			String nicEmployementStatus, String ddFamilyName, String familyNames, String relationToPerson,
			String previousVisitCountry, String refusedVisa, String refusedBorder) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.passportNumber = passportNumber;
		this.countryOfNationality = countryOfNationality;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfApplication = dateOfApplication;
		this.typeOfVisa = typeOfVisa;
		this.serviceOption = serviceOption;
		this.durationOfVisa = durationOfVisa;
		this.totalFee = totalFee;
		this.submissionMethod = submissionMethod;
		this.paymentReference = paymentReference;
		this.contactEmail = contactEmail;
		this.contactLanguage = contactLanguage;
		this.placeOfBirth = placeOfBirth;
		this.countryOfBirth = countryOfBirth;
		this.relationStatus = relationStatus;
		this.alternativeEmail = alternativeEmail;
		this.emailAddressBelongdTo = emailAddressBelongdTo;
		this.doHaveOtherName = doHaveOtherName;
		this.familyName = familyName;
		this.planToLeaveUk = planToLeaveUk;
		this.planToArriveUk = planToArriveUk;
		this.purposeOfVisit = purposeOfVisit;
		this.howMuchPaid = howMuchPaid;
		this.whoPaid = whoPaid;
		this.PassportReference = passportReference;
		this.expiryDate = expiryDate;
		this.issuedate = issuedate;
		this.ableToContactTelephone = ableToContactTelephone;
		this.medicalTreatmentInUk = medicalTreatmentInUk;
		this.doUkDrivingLicence = doUkDrivingLicence;
		this.address = address;
		this.ownershipStatusOfHome = ownershipStatusOfHome;
		this.nicEmployeeAddress = nicEmployeeAddress;
		this.nicEmployementStatus = nicEmployementStatus;
		this.ddFamilyName = ddFamilyName;
		this.familyNames = familyNames;
		this.relationToPerson = relationToPerson;
		this.previousVisitCountry = previousVisitCountry;
		this.refusedVisa = refusedVisa;
		this.refusedBorder = refusedBorder;
	}

}
