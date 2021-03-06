import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Officer> officers = new ArrayList<Officer>();
        Officer officer1 = new Officer("Bruce", "Lee", 1050, 5);
        Officer officer2 = new Officer("James", "Bond", 1051, 127);
        Officer officer3 = new Officer("John", "Strange", 1052, 34);
        Officer officer4 = new Officer("David", "Mail", 1053, 56);
        Officer officer5 = new Officer("Luis", "Sailor", 1054, 91);
        Officer officer6 = new Officer("John", "Tailor", 1055, 66);
        Officer officer7 = new Officer("Alice", "Johnson", 1056, 81);

        District district1 = new District("District 1", "Riga", 6010, officers);
        District district2 = new District("District 2", "Ogre", 6020, officers);

        Lawyer lawyer1 = new Lawyer("Antony", "Page", 72021, 77);
        Lawyer lawyer2 = new Lawyer("Lisa", "Moonlight", 72022, 35);
        Lawyer lawyer3 = new Lawyer("Elisa", "Tree", 72023, 19);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("District 1: \n" + district1.toString());
        System.out.println("District 2: \n" + district2.toString());

        System.out.println("Information about layers: ");
        System.out.println(lawyer1.toString());
        System.out.println(lawyer2.toString());
        System.out.println(lawyer3.toString());

        ArrayList<Lawyer> lawyerList = new ArrayList<Lawyer>();

        Collections.addAll(lawyerList, lawyer1, lawyer2, lawyer3);
        System.out.println("All lawyers: " + lawyerList);




        int totalNumberOfCrimesByLawyers = 0;

        for (Lawyer lawyer: lawyerList){
            totalNumberOfCrimesByLawyers+= lawyer.getHelpedInCrimesSolving();

        }
        System.out.println("Total number of cases lawyers helped to solve: " + totalNumberOfCrimesByLawyers);

        int maxCases = 0;
        Lawyer bestLawyer = null;
        for (int i = 0; i< lawyerList.size(); i++){
            if (lawyerList.get(i).getHelpedInCrimesSolving()> maxCases){
                maxCases = lawyerList.get(i).getHelpedInCrimesSolving();
                bestLawyer = lawyerList.get(i);
            }
        }
        System.out.println("Lawyer who helped to solve the most crimes: \n" + bestLawyer);

    }
}
