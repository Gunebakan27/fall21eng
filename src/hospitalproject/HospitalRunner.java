package hospitalproject;

public class HospitalRunner {

	static Hospital hospital = new Hospital();
	
	

	public static void main(String[] args) {

		String currentCase = "headache";

		// When you find the case, then you can find doctor title

		// If you find doctor title, then you can find the doctor information
		
		String title = doctorTitle(currentCase);
		
		System.out.println(title);
		
		
		
		findDoctor(title);//this returns doctor
		
		
		
		findPatient(currentCase);//it returns patient
		
		hospital.setDoctor(findDoctor(title));
		hospital.setPatient(findPatient(currentCase));
		
		System.out.println(findDoctor(title));
		System.out.println(findPatient(currentCase));
		
		System.out.println(hospital.getPatient().getPatientCase().getActualCase());
		
		
		

	}

	//we just return necessary doctor title
	public static String doctorTitle(String actualCase) {

		String title = "";
		switch (actualCase) {

		case "headache":
			title = "Generalist";
			break;
		case "allergy":
			title = "Pediatrist";
			break;
		case "vision":
			title = "Ophthalmologist";
			break;

		case "muscle":
			title = "Neurologist";
			break;

		case "heart diseases":
			title = "Internist";
			break;
		case "tumor":
			title = "Dermatologist";
			break;
		case "stomacache":
			title = "Internist";
			break;

		default:
			System.out.println("No matching Title!");
			break;
		}

		return title;
	}

	public static Doctor findDoctor(String title) {
		Doctor doctor = new Doctor();
		 // empty / null

		// 6 times my loop will run
		for (int i = 0; i < hospital.titles.length; i++) {

			// 0
			if (title.equalsIgnoreCase(hospital.titles[i])) {

				doctor.setName(hospital.doctorNames[i]);// Mahesh
				doctor.setLastname(hospital.doctorLastNames[i]);// Tristen
				doctor.setTitle(hospital.titles[i]);// Generalist

			}

		}
		return doctor;

	}

	public static Case findCase(String actualCase) {
		
		Case case1 = new Case();

		switch (actualCase) {

		case "headache":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "allergy":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;

		case "vision":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "muscle":

			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;

		case "heart diseases":

			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
		case "tumor":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case "stomacache":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		default:
			System.out.println("No matching Case!");
			break;

		}

		return case1;

	}
	
	
	
	//
	public static Patient findPatient(String actualCase) {
		
		Patient patient = new Patient();
		
		
		for(int i=0;i < hospital.cases.length;i++ )
		
		if(actualCase.equalsIgnoreCase(hospital.cases[i])) {
			patient.setName(hospital.patientNames[i]);
			patient.setLastname(hospital.patientLastNames[i]);
			patient.setPatientId(hospital.patientIds[i]);
			patient.setPatientCase(findCase(actualCase));
			

		}
		
		return patient;
		
	}

}
//package hospitalproject;
//
//public class HospitalRunner {
//	
//	 static Hospital hospital=new Hospital();
//	
//
//	public static void main(String[] args) {
//		
//		String currentCase="tumor";
//		
//		// When you find the case, then you can find doctor title
//		// If you find doctor title, then you can find the doctor information
//		
//		String title=doctorTitle(currentCase);
//		System.out.println(title);
//		
//		findDoctor(title);
//		findPatient(currentCase);
//		
//		System.out.println(findDoctor("Genaralist"));
//		
//		System.out.println(findPatient(currentCase));
//		
////		System.out.println(hospital.getPatient().getPatientCase().getActualCase());
//		
//	
//		
//
//	}
//	
//	public static String doctorTitle(String actualCase) {
//		String title="";
//		switch(actualCase) {
//		case "headache":
//			title="Genaralist";
//			break;
//		case "allergy":
//			title="Pediatrost";
//			break;
//		case "vision":
//			title="Ophthalmologist";
//			break;
//		case "muscle":
//			title="Neurologist";
//			break;
//		case " heart diseases":
//			title="Internist";
//			break;
//		case "tumor":
//			title="Dermatologist";
//			break;
//		case "stomache":
//			title="Internist";
//			break;
//			
//			default:
//				System.out.println("No matching Title!");
//			break;			
//			
//		}
//		
//		return title;
//	}
//	
//	
//	public static Doctor findDoctor(String title) {
//		Doctor doctor=new Doctor();
//		for(int i=0;i<hospital.titles.length;i++) {
//			if(title.equalsIgnoreCase(hospital.titles[i])) {
//				doctor.setName(hospital.doctorNames[i]);
//				doctor.setLastname(hospital.doctorLastNames[i]);
//				doctor.setTitle(hospital.titles[i]);
//			}
//		}
//		return doctor;
//	}
//	public static Case findCase(String actualCase) {
//		Case case1=new Case();
//		
//		switch (actualCase){
//		
//		case"headache":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(false);
//			break;
//		case "allergy":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(true);
//			break;
//		case"vision":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(false);
//			break;
//		case "muscle":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(false);
//			break;
//		case " heart diseases":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(true);
//			break;
//		case "tumor":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(true);
//			break;
//		case "stomache":
//			case1.setActualCase(actualCase);
//			case1.setEmergency(false);
//			break;
//		default:
//			System.out.println("No matching");
//		}
//		
//		
//		return case1;
//		
//	}
//	public static Patient findPatient(String actualCase){
//		Patient patient=new Patient();
//		
//		
//		for(int i=0;i< hospital.cases.length;i++) {
//			if(actualCase.equalsIgnoreCase(hospital.cases[i])) {
//				patient.setName(hospital.patientNames[i]);
//				patient.setLastname(hospital.patientLastNames[i]);
//				patient.setPatientId(hospital.patientIds[i]);
//				patient.setPatientCase(findCase(actualCase));
//				
//				
//			}
//		}
//		
//		return patient;
//	}
//}
