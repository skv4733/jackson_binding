package com.javasasm;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author sandip
 *
 */
public class ReadValue 
{
    public static void main(String args[])
    {
        ObjectMapper mapper = new ObjectMapper();      
        try{
        
            Physician[] physician = mapper.readValue(
                new File("Physician.JSON"), Physician[].class);
                
            Patient[] patient = mapper.readValue(
                new File("Patient.JSON"), Patient[].class);
                
            Vitals[] vitals;
            
            for(int i = 0 ; i < physician.length ; i++)
            {
            
                String npi = physician[i].getNpi();
                //System.out.println(physician[i].getName());
                System.out.println(physician[i].toString());

                for(int j = 0 ; j < patient.length ; j++)
                {
                
                    String primaryPhysician = patient[j].getPrimaryPhysician();

                    if(new String(npi).equals(primaryPhysician))
                    {
                    
                        System.out.println("\t"+patient[j].toString());
                        vitals = patient[j].getVitals();
                        
                        for(int k = 0 ; k < vitals.length ; k++)
                        {
                            System.out.println("\t\t"+vitals[k].toString());
                        }//end vitals for loop
                    }// end if
                }//end patient for loop
            }//end physician for loop
        }catch (IOException e) { e.printStackTrace(); }
    }//end main method
}//end class