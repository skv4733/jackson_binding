package com.javasasm;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteValue
	{
	    public static void main(String args[])
	        {
	            ObjectMapper mapper = new ObjectMapper();      
	            try{
	            
	                Patient patient = new Patient();
	                Vitals[] vitalsArray = new Vitals[1];
	                vitalsArray[0] = new Vitals();

	                patient.setFirstName("Jean-Marc");
	                patient.setLastName("Julien");
	                patient.setDateOfBirth("1991-02-03");
	                patient.setInsurnaceId("2345678901");
	                patient.setPrimaryPhysician("7654321555");
	                patient.setAddress("555 Main Street");
	                patient.setCity("Chicago");
	                patient.setState("IL");
	                patient.setZip("54321");
	                patient.setPhone("555-123-9876");

	                vitalsArray[0].setDate("2018-01-01");
	                vitalsArray[0].setHeight("70");
	                vitalsArray[0].setWeight("150");
	                //vitalsArray[0].setBmi("20.1");//null - not set
	                vitalsArray[0].setA1c("4.0");
	                vitalsArray[0].setBpSystolic("100");
	                vitalsArray[0].setBpDiastolic("80");
	                patient.setVitals(vitalsArray);
	                mapper.writeValue(new File("writePatient.JSON"), patient);
	                
	             }catch (IOException e) { e.printStackTrace(); }
	        }//end main method
	    }//end class