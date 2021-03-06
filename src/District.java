import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Person> personsInTheDistrict = new ArrayList<>();

    @Override
    public String toString() {
        return "District: " +
                "title='" + title +
                ", city='" + city +
                ", districtID=" + districtID +
                ", personsInTheDistrict=" + personsInTheDistrict;
    }

    public District() {

    }

    public District(String title, String city, int districtID, ArrayList<Person> personsInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        personsInTheDistrict = new ArrayList<>(personsInTheDistrict);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Person> getPersonsInTheDistrict() {
        return personsInTheDistrict;
    }

    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;
    }

    public boolean addNewOfficer(Person person){
       if (person != null){
           personsInTheDistrict.add(person);
           return true;
       } return false;

    }

    public boolean removeOfficer(String name, String surname)
    {
        if(!name.isEmpty() && !surname.isEmpty()) {
            personsInTheDistrict.removeIf(person -> person.getName().equals(name)
                    && person.getSurname().equals(surname));
            return true;

        }
        return false;
    }

   }