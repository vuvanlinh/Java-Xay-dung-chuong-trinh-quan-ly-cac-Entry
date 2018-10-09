package codegym.todo;

public class Entry {
    static int count = 1;
    private int id;
    private String notes;

    public Entry() {

    }

    public Entry(int id, String notes) {
        this.id = id;
        this.notes = notes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String toString() {
        return "NoteID: " + getId() + " Notes: " + getNotes();
    }
}
