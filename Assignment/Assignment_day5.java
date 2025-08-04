import java.util.Scanner;
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
	void setPatientName(String patientName)
	{
      		this.patientName=patientName;

	}
	void setDateOfVisit(String dateOfVisit)
	{
		this.dateOfVisit=dateOfVisit;
	}
	void setDiagnosis(String diagnosis)
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
            System.out.println("Record Id:"+getRecordId());
	    System.out.println("PatientName:"+getPatientName());
	    System.out.println("Date Of Visit:"+getDateOfVisit());
	    System.out.println("Diagnosis:"+getDiagnosis());
	}
}

class InPatientRecord extends MedicalRecord
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
		int getNumberOfdaysAdmitted()
		{
			return	numberOfDaysAdmitted;
		}

		double getRoomCharges()
		{
			return roomCharges;
		}
		double calculateTotalCharges()
		{
		    return (double)roomCharges*numberOfDaysAdmitted;
		}


   		void displayRecord()
		{
			super.inputRecordDetails();
			System.out.println("Room Number:"+getRoomNumber());
			System.out.println("Room Charges:"+getRoomCharges());
			System.out.println("Number of days:"+getNumberOfdaysAdmitted());
			System.out.println("Total charge Amount:"+calculateTotalCharges());
		}

		



	}
class OutPatientRecord extends MedicalRecord
	{
		private String doctorName;
		private double consultationFee;
                 void setDoctorName(String doctorName)
			{
				this.doctorName=doctorName;
			}
		void setConsultationFee(double consultationFee)
			{
				this.consultationFee=consultationFee;
			}
		String  getDoctorName()
			{
				return  doctorName;
			}
		double getConsultationFee()
			{
				return consultationFee;
			}
		void displayRecord()
			{
				super.inputRecordDetails();
				System.out.println("Doctor Name:"+getDoctorName());
				System.out.println("Consulatation Fee:"+getConsultationFee());
			}
}
class Hospital
	{
		public static void main(String args[])
		{
			OutPatientRecord  op=new OutPatientRecord();
			InPatientRecord ip=new InPatientRecord();
				int outRecordId=1;
				int inRecordId=1;
				int charge=1200;
			Scanner s=new Scanner(System.in);
			while(true)
			{
			System.out.println("Hospital Management");
			System.out.println("-------------------");
			System.out.println("1.OutPatient\n2.InPatient");
			System.out.println("Choose one:");
			int choose=s.nextInt();
			switch(choose)
			{
				case 1:
					op.setRecordId(outRecordId++);
					System.out.println("Enter the Name Of the Patient:");
					String name=s.nextLine();
					op.setPatientName(name);
						s.nextLine();
					
					
					System.out.println("Name of Diagnosis:");
					String dia=s.nextLine();
					op.setDiagnosis(dia);
						s.nextLine();
					
					System.out.println("Date Of Visit");
					String dov=s.nextLine();
					op.setDateOfVisit(dov);	
						s.nextLine();
						
					
					System.out.println("Doctor Name:");
					String dn=s.nextLine();
					op.setDoctorName(dn);
						s.nextLine();

					
					System.out.println("Fees amont:");
					double fees=s.nextDouble();
					op.setConsultationFee(fees);
				  	op.displayRecord();
					break;
				case 2:
					ip.setRecordId(inRecordId++);
					System.out.println("Enter the Name Of the Patient:");
					 name=s.nextLine();
					ip.setPatientName(name);
					
						s.nextLine();
					
					
					System.out.println("Name of Diagnosis:");
					dia=s.nextLine();
					ip.setDiagnosis(dia);
						//s.nextLine();
					
					System.out.println("Date Of Visit");
					dov=s.nextLine();
					ip.setDateOfVisit(dov);
						//s.nextLine();
					
					System.out.println("Room Number:");
					int rm=s.nextInt();
					ip.setRoomNumber(rm);
						s.nextLine();
					
					ip.setRoomCharges(charge);
					System.out.println("Number of Days Admitted:");
					int days=s.nextInt();
					ip.setNumberOfDaysAdmitted(days);
						s.nextLine();
					
					ip.displayRecord();
					break;
				default:
					System.out.println("Invalid Option");
				}
				}
					
			}




			
	}

	
//-----------------------------------------------------------------------------------