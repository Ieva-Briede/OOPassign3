import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Officer> officersInTheDistrict = new ArrayList<>();

    @Override
    public String toString() {
        return "District: " +
                "title='" + title +
                ", city='" + city +
                ", districtID=" + districtID +
                ", officersInTheDistrict=" + officersInTheDistrict;
    }

    public District() {

    }

    public District(String title, String city, int districtID, ArrayList<Officer> officersInTheDistrictf) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        officersInTheDistrict = new ArrayList<>(officersInTheDistrict);
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

    public ArrayList<Officer> getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public boolean addNewOfficer(Officer officer){
       if (officer != null){
           officersInTheDistrict.add(officer);
           return true;
       } return false;

    }

    public boolean removeOfficer(String name, String surname)
    {
        if(!name.isEmpty() && !surname.isEmpty()) {
            officersInTheDistrict.removeIf(person -> person.getName().equals(name)
                    && person.getSurname().equals(surname));
            return true;

        }
        return false;
    }
    public float calculateAvgLevelInDistrict(){
        ArrayList<Officer> officersInTheDistrict = getOfficersInTheDistrict();
        float sum = 0;
        for (Officer officer : officersInTheDistrict){
            sum += officer.calculateLevel();
        }
        float averageLevel = sum/officersInTheDistrict.size();
        return averageLevel;
    }

   }