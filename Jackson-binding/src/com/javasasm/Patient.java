package com.javasasm;

public class Patient
	{
		// instance variables
		private String firstName;
		private String lastName;
		private String dateOfBirth;
		private String insuranceId;
		private String primaryPhysician;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String phone;
		private Vitals[] vitals;

		public String getFirstName()
			{
				return firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public String getDateOfBirth()
			{
				return dateOfBirth;
			}

		public String getinsuranceId()
			{
				return insuranceId;
			}

		public String getPrimaryPhysician()
			{
				return primaryPhysician;
			}

		public String getAddress()
			{
				return address;
			}

		public String getCity()
			{
				return city;
			}

		public String getState()
			{
				return state;
			}

		public String getZip()
			{
				return zip;
			}

		public String getPhone()
			{
				return phone;
			}

		public Vitals[] getVitals()
			{
				return vitals;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public void setDateOfBirth(String dateOfBirth)
			{
				this.dateOfBirth = dateOfBirth;
			}

		public void setinsuranceId(String insuranceId)
			{
				this.insuranceId = insuranceId;
			}

		public void setPrimaryPhysician(String primaryPhysician)
			{
				this.primaryPhysician = primaryPhysician;
			}

		public void setAddress(String address)
			{
				this.address = address;
			}

		public void setCity(String city)
			{
				this.city = city;
			}

		public void setState(String state)
			{
				this.state = state;
			}

		public void setZip(String zip)
			{
				this.zip = zip;
			}

		public void setPhone(String phone)
			{
				this.phone = phone;
			}

		public void setVitals(Vitals[] vitals)
			{
				this.vitals = vitals;
			}

		@Override
		public String toString()
			{
				return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
						+ ", insuranceId=" + insuranceId + ", primaryPhysician=" + primaryPhysician + ", address="
						+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + "]";
			}

	}
