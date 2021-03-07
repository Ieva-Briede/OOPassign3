import java.util.Scanner;

public class Officer extends Person {


    private int officerID;
    private int crimesSolved;

    public Officer() {

    }

    public Officer(String name, String surname, int officerID, int crimedSolved) {
        super.setName(name);
        super.setSurname(surname);
        this.officerID = officerID;
        this.crimesSolved = crimedSolved;


    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    @Override
    public String toString() {
        return "Officer " +
                "name = " + super.getName() +
                ", surname = " + super.getSurname() +
                ", officerID = " + officerID +
                ", crimedSolved = " + crimesSolved;
    }

    public int calculateLevel() {
        if (crimesSolved < 0) {
            return -1;
        }
        if (crimesSolved < 20) {
            return 1;
        }
        if (crimesSolved < 40) {
            return 2;
        }
        if (crimesSolved >= 40) {
            return 3;

        }
        return -1;
    }

    public static Officer newOfficer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Officer' s name: ");
        String name = input.nextLine();
        System.out.println("Officers' surname: ");
        String surname = input.nextLine();
        System.out.println("Officers' ID number: ");
        int officerID = input.nextInt();
        System.out.println("Crimes solved: ");
        int crimesSolved = input.nextInt();
        return new Officer(name, surname, officerID, crimesSolved);

    }

}

