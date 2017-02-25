package strips.chicken.mitre.situationalawarenessforfirstresponders;

import java.util.ArrayList;

/**
 * Created by jtobin on 2/24/17.
 */

public class Incident {

    public class Person{
        private String name             = "";
        private String role             = "";

        public Person() {
        }

        public Person(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    public class Point{
        private double longitude        = -1;
        private double latitude         = -1;

        public Point(){

        }

        public Point(double lon, double lat){
            longitude = lon;
            latitude = lat;
        }

        public double getLongitude(){
            return longitude;
        }

        public double getLatitude(){
            return latitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }

    private String type             = "";
    private String notes            = "";
    private String commander        = "";
    private ArrayList<Point> points = new ArrayList<Point>();
    private ArrayList<Person> people= new ArrayList<Person>();

    public Incident(){

    }

    public Incident(String ty, String not, String com, ArrayList<Point> ps, ArrayList<Person> lakeys){
        type = ty;
        notes = not;
        commander = com;
        points = ps;
        people = lakeys;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
