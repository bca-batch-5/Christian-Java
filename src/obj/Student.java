package src.obj;

public class Student extends Person {

    private Integer sks = 0;
    private String status;

    public Student(String firstName, String lastName,
            String address) {
        super(firstName, lastName, address);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Student "+ super.getFirstName() + "[sks=" + sks + ", status=" + status + "]";
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

}
