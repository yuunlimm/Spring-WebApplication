package project;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

  private DriverLicense license;
  private String phoneNumber;
  private Set<Vehicle> vehicles;

  public Owner(String firstName, String lastName, LocalDate dateOfBirth,
      DriverLicense license, String phoneNumber) {
    super(firstName, lastName, dateOfBirth);

    if(license.getDateOfBirth() != dateOfBirth) {
      throw new IllegalArgumentException("dateOfBirth on license don't match");
    }
    this.license = license;
    this.phoneNumber = phoneNumber;
    this.vehicles = new HashSet<>();
  }

  public Owner(String firstName, String lastName, LocalDate dateOfBirth,
      DriverLicense license, String phoneNumber, Set<Vehicle> vehicles) {
    super(firstName, lastName, dateOfBirth);

    if(license.getDateOfBirth() != dateOfBirth) {
      throw new IllegalArgumentException("dateOfBirth on license don't match");
    }
    this.license = license;
    this.phoneNumber = phoneNumber;
    this.vehicles = vehicles;
  }


  public DriverLicense getLicense() {
    return license;
  }

  public void setLicense(DriverLicense license) {
    this.license = license;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Set<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(Set<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }
}