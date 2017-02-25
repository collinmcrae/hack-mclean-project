package strips.chicken.mitre.situationalawarenessforfirstresponders;

import java.util.ArrayList;

/**
 * Created by jtobin on 2/24/17.
 */

public class POI {
    private String type             = "";
    private String notes            = "";
    private String commander        = "";
    private ArrayList<Incident.Point> points = new ArrayList<Incident.Point>();
    private ArrayList<Incident.Person> assistants = new ArrayList<Incident.Person>();
    private int capacity            = 0; // For shelters
    private int current             = 0; // Also for shelters

    public POI(){

    }

    public POI(String ty, String not, String com, ArrayList<Incident.Point> ps, ArrayList<Incident.Person> lakeys, int cap, int cur){
        type = ty;
        notes = not;
        commander = com;
        points = ps;
        assistants = lakeys;
        capacity = cap;
        current = cur;
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

    public ArrayList<Incident.Point> getPoints(){
        return points;
    }

    public void setPoints(ArrayList<Incident.Point> points) {
        this.points = points;
    }

    public ArrayList<Incident.Person> getAssistants() {
        return assistants;
    }

    public void setAssistants(ArrayList<Incident.Person> assistants) {
        this.assistants = assistants;
    }
}
