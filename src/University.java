public class University {
    private String name;
    private Integer Id;
    private Integer students_number;
    private Integer open_year;

    public University(String name, Integer id, Integer students_number, Integer open_year) {
        this.name = name;
        Id = id;
        this.students_number = students_number;
        this.open_year = open_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getStudents_number() {
        return students_number;
    }

    public void setStudents_number(Integer students_number) {
        this.students_number = students_number;
    }

    public Integer getOpen_year() {
        return open_year;
    }

    public void setOpen_year(Integer open_year) {
        this.open_year = open_year;
    }
}
