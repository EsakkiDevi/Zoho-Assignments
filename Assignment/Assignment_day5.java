/*Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
---recordId, patientName, dateOfVisit, and diagnosis.
---inputRecordDetails() – to input common record information.
---override displayRecord() – to display the common record details.*/


class MedicalRecord

{
	int recordId;
	String patientName;
	String dateOfVisit;
	String diagnosis;

       void setRecordId(int recordId)
	{
	this.recordId=recordId;

	}
	void setPatientName(String patientNmae)
	{
      	this.patientName=patientName;

	}
	void setDateOfVisit(String dateOfVisit)
	{
	this.dateOfVisit=dateOfVisit;
	}
	void setDiagnosis
	{
	this.diagnosis=diagnosis;
	}

        int getRecordId()
	{
	 return recordId;
	}
	String getPatientName()
	{
         return patientName;
	}
	String getDateOfVisit()
	{
	 return dateOfVisit;
	}
	String getDiagnosis()
	{
	return diagnosis;
	}
	void inputRecordDetails()
	{
            System.out.println("Record Id:"+recordId);
	    System.oout.println("PatientName:"+patientName);
	    System.out.println("Date Of Visit:"+dateOfVisit);
	    System.out.println("Diagnosis:"+diagnosis);
	}
}

class InPatientRecord
	{
		int roomNumber;
		int numberOfDaysAdmitted; 
		double  roomCharges;
		void setRoomNumber(int roomNumber)
		{
		this.roomNumber=roomNumber;
		}
		void setNumberOfDaysAdmitted(int numberOfDaysAdmitted)
		{
		this.numberOfDaysAdmitted=numberOfDaysAdmitted;
		}
		void setRoomCharges(int roomCharges)

		{
		this.roomCharges=roomCharges;
		}
                int getRoomNumber()
		{
		return roomNumber;
		}
		int



	}
?