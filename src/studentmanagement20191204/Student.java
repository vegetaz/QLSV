package studentmanagement20191204;

public class Student {
    private String id;
    private String name;
    private float gpa;
    private String gender;
    private int old;

    public Student() {
    }

    public Student(String id, String name, float gpa, String gender, int old) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.gender = gender;
        this.old = old;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return String.format("%-9s%-15s%-5s%-9s%-5s", id, name, gpa, gender, old);
    }
    
}
