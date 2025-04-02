package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturerIncharge;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturerIncharge() {
        return lecturerIncharge;
    }

    public void setLecturerIncharge(Lecturer lecturerIncharge) {
        this.lecturerIncharge = lecturerIncharge;
    }
}