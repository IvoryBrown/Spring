package com.sevice.device.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gepadatok1_exi")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_gepadatok")
	private Long deviceID;
	@Column(name = "ugyfel_adatok_id_ugyfel_exi")
	private String deviceClientID;
	@Column(name = "eszkoz_azonosito")
	private String deviceNumber;
	@Column(name = "ceg_nev_gep")
	private String deviceCompanyName;
	@Column(name = "ugyfél_nev_gep")
	private String deviceClientName;
	@Column(name = "eszkoz")
	private String deviceName;
	@Column(name = "eszkoz_gyarto")
	private String deviceManufacturer;
	@Column(name = "eszkoz_gyari_szama")
	private String deviceSerialNumber;
	@Column(name = "javitas_helye")
	private String deviceRepairLocation;
	@Column(name = "allapot")
	private String deviceStatus;
	@Column(name = "uj_gep")
	private String deviceNewMachine;
	@Column(name = "ugyintezo")
	private String deviceAdministrator;
	@Column(name = "prioritas")
	private String devicePriorit;
	@Column(name = "jelszo")
	private String devicePassword;
	@Column(name = "hivatkozasi_szam")
	private String deviceReferences;
	@Column(name = "tartozekok")
	private String deviceAccesssory;
	@Column(name = "serules")
	private String deviceInjury;
	@Column(name = "hiba_leirasa")
	private String deviceErrorDescription;
	@Column(name = "eszkoz_megjegyzes")
	private String deviceComment;
	@Column(name = "vasarlasi_datuma")
	private String deviceSalesBuying;
	@Column(name = "bejelentes_datuma")
	private String deviceAddDate;
	@Column(name = "hatarido_datuma")
	private String deviceEndDate;
	@Column(name = "kiszallas_datuma")
	private String deviceDeliveryDate;
	@Column(name = "adatmentes")
	private String deviceDataRecovery;
	@Column(name = "softver")
	private String deviceSoftver;
	@Column(name = "operacios_rendszer")
	private String deviceOperatingSystem;
	@Column(name = "softver_megjegyzés")
	private String deviceSoftverComment;
	@Column(name = "haz")
	private String deviceNewHouse;
	@Column(name = "tapegyseg")
	private String devicePowerSupply;
	@Column(name = "processzor")
	private String deviceProcessor;
	@Column(name = "alaplap")
	private String deviceBaseBoard;
	@Column(name = "memoria")
	private String deviceMemory;
	@Column(name = "videokartya")
	private String deviceVideoCard;
	@Column(name = "ssd")
	private String deviceSSDDrive;
	@Column(name = "meghajto")
	private String deviceHardDrive;
	@Column(name = "hutoventilator")
	private String deviceCoolingFan;
	@Column(name = "optikai_meghajto")
	private String deviceOpticalDrive;
	@Column(name = "bovitokartya")
	private String deviceExpansionCard;
	@Column(name = "laptop")
	private String deviceLaptop;
	@Column(name = "elkeszult_datuma")
	private String deviceCompletedDate;
	@Column(name = "hibajavitas_leirasa")
	private String deviceErrorCorrection;
	@Column(name = "technikus")
	private String deviceTechnicalPerson;
	@Column(name = "statusz")
	private String deviceStatusz;
	// String converter

	public Device() {

	}

	public Device(Long deviceID, String deviceClientID, String deviceNumber, String deviceCompanyName,
			String deviceClientName, String deviceName, String deviceManufacturer, String deviceSerialNumber,
			String deviceRepairLocation, String deviceStatus, String deviceNewMachine, String deviceAdministrator,
			String devicePriorit, String devicePassword, String deviceReferences, String deviceAccesssory,
			String deviceInjury, String deviceErrorDescription, String deviceComment, String deviceSalesBuying,
			String deviceAddDate, String deviceEndDate, String deviceDeliveryDate, String deviceDataRecovery,
			String deviceSoftver, String deviceOperatingSystem, String deviceSoftverComment, String deviceNewHouse,
			String devicePowerSupply, String deviceProcessor, String deviceBaseBoard, String deviceMemory,
			String deviceVideoCard, String deviceSSDDrive, String deviceHardDrive, String deviceCoolingFan,
			String deviceOpticalDrive, String deviceExpansionCard, String deviceLaptop, String deviceCompletedDate,
			String deviceErrorCorrection, String deviceTechnicalPerson, String deviceStatusz) {
		super();
		this.deviceID = deviceID;
		this.deviceClientID = deviceClientID;
		this.deviceNumber = deviceNumber;
		this.deviceCompanyName = deviceCompanyName;
		this.deviceClientName = deviceClientName;
		this.deviceName = deviceName;
		this.deviceManufacturer = deviceManufacturer;
		this.deviceSerialNumber = deviceSerialNumber;
		this.deviceRepairLocation = deviceRepairLocation;
		this.deviceStatus = deviceStatus;
		this.deviceNewMachine = deviceNewMachine;
		this.deviceAdministrator = deviceAdministrator;
		this.devicePriorit = devicePriorit;
		this.devicePassword = devicePassword;
		this.deviceReferences = deviceReferences;
		this.deviceAccesssory = deviceAccesssory;
		this.deviceInjury = deviceInjury;
		this.deviceErrorDescription = deviceErrorDescription;
		this.deviceComment = deviceComment;
		this.deviceSalesBuying = deviceSalesBuying;
		this.deviceAddDate = deviceAddDate;
		this.deviceEndDate = deviceEndDate;
		this.deviceDeliveryDate = deviceDeliveryDate;
		this.deviceDataRecovery = deviceDataRecovery;
		this.deviceSoftver = deviceSoftver;
		this.deviceOperatingSystem = deviceOperatingSystem;
		this.deviceSoftverComment = deviceSoftverComment;
		this.deviceNewHouse = deviceNewHouse;
		this.devicePowerSupply = devicePowerSupply;
		this.deviceProcessor = deviceProcessor;
		this.deviceBaseBoard = deviceBaseBoard;
		this.deviceMemory = deviceMemory;
		this.deviceVideoCard = deviceVideoCard;
		this.deviceSSDDrive = deviceSSDDrive;
		this.deviceHardDrive = deviceHardDrive;
		this.deviceCoolingFan = deviceCoolingFan;
		this.deviceOpticalDrive = deviceOpticalDrive;
		this.deviceExpansionCard = deviceExpansionCard;
		this.deviceLaptop = deviceLaptop;
		this.deviceCompletedDate = deviceCompletedDate;
		this.deviceErrorCorrection = deviceErrorCorrection;
		this.deviceTechnicalPerson = deviceTechnicalPerson;
		this.deviceStatusz = deviceStatusz;
	}

	public Long getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(Long deviceID) {
		this.deviceID = deviceID;
	}

	public String getDeviceClientID() {
		return deviceClientID;
	}

	public void setDeviceClientID(String deviceClientID) {
		this.deviceClientID = deviceClientID;
	}

	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	public String getDeviceCompanyName() {
		return deviceCompanyName;
	}

	public void setDeviceCompanyName(String deviceCompanyName) {
		this.deviceCompanyName = deviceCompanyName;
	}

	public String getDeviceClientName() {
		return deviceClientName;
	}

	public void setDeviceClientName(String deviceClientName) {
		this.deviceClientName = deviceClientName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceManufacturer() {
		return deviceManufacturer;
	}

	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getDeviceRepairLocation() {
		return deviceRepairLocation;
	}

	public void setDeviceRepairLocation(String deviceRepairLocation) {
		this.deviceRepairLocation = deviceRepairLocation;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceNewMachine() {
		return deviceNewMachine;
	}

	public void setDeviceNewMachine(String deviceNewMachine) {
		this.deviceNewMachine = deviceNewMachine;
	}

	public String getDeviceAdministrator() {
		return deviceAdministrator;
	}

	public void setDeviceAdministrator(String deviceAdministrator) {
		this.deviceAdministrator = deviceAdministrator;
	}

	public String getDevicePriorit() {
		return devicePriorit;
	}

	public void setDevicePriorit(String devicePriorit) {
		this.devicePriorit = devicePriorit;
	}

	public String getDevicePassword() {
		return devicePassword;
	}

	public void setDevicePassword(String devicePassword) {
		this.devicePassword = devicePassword;
	}

	public String getDeviceReferences() {
		return deviceReferences;
	}

	public void setDeviceReferences(String deviceReferences) {
		this.deviceReferences = deviceReferences;
	}

	public String getDeviceAccesssory() {
		return deviceAccesssory;
	}

	public void setDeviceAccesssory(String deviceAccesssory) {
		this.deviceAccesssory = deviceAccesssory;
	}

	public String getDeviceInjury() {
		return deviceInjury;
	}

	public void setDeviceInjury(String deviceInjury) {
		this.deviceInjury = deviceInjury;
	}

	public String getDeviceErrorDescription() {
		return deviceErrorDescription;
	}

	public void setDeviceErrorDescription(String deviceErrorDescription) {
		this.deviceErrorDescription = deviceErrorDescription;
	}

	public String getDeviceComment() {
		return deviceComment;
	}

	public void setDeviceComment(String deviceComment) {
		this.deviceComment = deviceComment;
	}

	public String getDeviceSalesBuying() {
		return deviceSalesBuying;
	}

	public void setDeviceSalesBuying(String deviceSalesBuying) {
		this.deviceSalesBuying = deviceSalesBuying;
	}

	public String getDeviceAddDate() {
		return deviceAddDate;
	}

	public void setDeviceAddDate(String deviceAddDate) {
		this.deviceAddDate = deviceAddDate;
	}

	public String getDeviceEndDate() {
		return deviceEndDate;
	}

	public void setDeviceEndDate(String deviceEndDate) {
		this.deviceEndDate = deviceEndDate;
	}

	public String getDeviceDeliveryDate() {
		return deviceDeliveryDate;
	}

	public void setDeviceDeliveryDate(String deviceDeliveryDate) {
		this.deviceDeliveryDate = deviceDeliveryDate;
	}

	public String getDeviceDataRecovery() {
		return deviceDataRecovery;
	}

	public void setDeviceDataRecovery(String deviceDataRecovery) {
		this.deviceDataRecovery = deviceDataRecovery;
	}

	public String getDeviceSoftver() {
		return deviceSoftver;
	}

	public void setDeviceSoftver(String deviceSoftver) {
		this.deviceSoftver = deviceSoftver;
	}

	public String getDeviceOperatingSystem() {
		return deviceOperatingSystem;
	}

	public void setDeviceOperatingSystem(String deviceOperatingSystem) {
		this.deviceOperatingSystem = deviceOperatingSystem;
	}

	public String getDeviceSoftverComment() {
		return deviceSoftverComment;
	}

	public void setDeviceSoftverComment(String deviceSoftverComment) {
		this.deviceSoftverComment = deviceSoftverComment;
	}

	public String getDeviceNewHouse() {
		if (deviceNewHouse.equals("1")) {
			deviceNewHouse = "Igen";
		} else {
			deviceNewHouse = "Nem";
		}
		return deviceNewHouse;
	}

	public void setDeviceNewHouse(String deviceNewHouse) {
		this.deviceNewHouse = deviceNewHouse;
	}

	public String getDevicePowerSupply() {
		if (devicePowerSupply.equals("1")) {
			devicePowerSupply = "Igen";
		} else {
			devicePowerSupply = "Nem";
		}
		return devicePowerSupply;
	}

	public void setDevicePowerSupply(String devicePowerSupply) {
		this.devicePowerSupply = devicePowerSupply;
	}

	public String getDeviceProcessor() {
		if (deviceProcessor.equals("1")) {
			deviceProcessor = "Igen";
		} else {
			deviceProcessor = "Nem";
		}
		return deviceProcessor;
	}

	public void setDeviceProcessor(String deviceProcessor) {
		this.deviceProcessor = deviceProcessor;
	}

	public String getDeviceBaseBoard() {
		if (deviceBaseBoard.equals("1")) {
			deviceBaseBoard = "Igen";
		} else {
			deviceBaseBoard = "Nem";
		}
		return deviceBaseBoard;
	}

	public void setDeviceBaseBoard(String deviceBaseBoard) {
		this.deviceBaseBoard = deviceBaseBoard;
	}

	public String getDeviceMemory() {
		if (deviceMemory.equals("1")) {
			deviceMemory = "Igen";
		} else {
			deviceMemory = "Nem";
		}
		return deviceMemory;
	}

	public void setDeviceMemory(String deviceMemory) {
		this.deviceMemory = deviceMemory;
	}

	public String getDeviceVideoCard() {
		if (deviceVideoCard.equals("1")) {
			deviceVideoCard = "Igen";
		} else {
			deviceVideoCard = "Nem";
		}
		return deviceVideoCard;
	}

	public void setDeviceVideoCard(String deviceVideoCard) {
		this.deviceVideoCard = deviceVideoCard;
	}

	public String getDeviceSSDDrive() {
		if (deviceSSDDrive.equals("1")) {
			deviceSSDDrive = "Igen";
		} else {
			deviceSSDDrive = "Nem";
		}
		return deviceSSDDrive;
	}

	public void setDeviceSSDDrive(String deviceSSDDrive) {
		this.deviceSSDDrive = deviceSSDDrive;
	}

	public String getDeviceHardDrive() {
		if (deviceHardDrive.equals("1")) {
			deviceHardDrive = "Igen";
		} else {
			deviceHardDrive = "Nem";
		}
		return deviceHardDrive;
	}

	public void setDeviceHardDrive(String deviceHardDrive) {
		this.deviceHardDrive = deviceHardDrive;
	}

	public String getDeviceCoolingFan() {
		if (deviceCoolingFan.equals("1")) {
			deviceCoolingFan = "Igen";
		} else {
			deviceCoolingFan = "Nem";
		}
		return deviceCoolingFan;
	}

	public void setDeviceCoolingFan(String deviceCoolingFan) {
		this.deviceCoolingFan = deviceCoolingFan;
	}

	public String getDeviceOpticalDrive() {
		if (deviceOpticalDrive.equals("1")) {
			deviceOpticalDrive = "Igen";
		} else {
			deviceOpticalDrive = "Nem";
		}
		return deviceOpticalDrive;
	}

	public void setDeviceOpticalDrive(String deviceOpticalDrive) {
		this.deviceOpticalDrive = deviceOpticalDrive;
	}

	public String getDeviceExpansionCard() {
		if (deviceExpansionCard.equals("1")) {
			deviceExpansionCard = "Igen";
		} else {
			deviceExpansionCard = "Nem";
		}
		return deviceExpansionCard;
	}

	public void setDeviceExpansionCard(String deviceExpansionCard) {
		this.deviceExpansionCard = deviceExpansionCard;
	}

	public String getDeviceLaptop() {
		if (deviceLaptop.equals("1")) {
			deviceLaptop = "Igen";
		} else {
			deviceLaptop = "Nem";
		}
		return deviceLaptop;
	}

	public void setDeviceLaptop(String deviceLaptop) {
		this.deviceLaptop = deviceLaptop;
	}

	public String getDeviceCompletedDate() {
		return deviceCompletedDate;
	}

	public void setDeviceCompletedDate(String deviceCompletedDate) {
		this.deviceCompletedDate = deviceCompletedDate;
	}

	public String getDeviceErrorCorrection() {
		return deviceErrorCorrection;
	}

	public void setDeviceErrorCorrection(String deviceErrorCorrection) {
		this.deviceErrorCorrection = deviceErrorCorrection;
	}

	public String getDeviceTechnicalPerson() {
		return deviceTechnicalPerson;
	}

	public void setDeviceTechnicalPerson(String deviceTechnicalPerson) {
		this.deviceTechnicalPerson = deviceTechnicalPerson;
	}

	public String getDeviceStatusz() {
		return deviceStatusz;
	}

	public void setDeviceStatusz(String deviceStatusz) {
		this.deviceStatusz = deviceStatusz;
	}

}