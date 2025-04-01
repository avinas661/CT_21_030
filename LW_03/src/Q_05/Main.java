package Q_05;

public class Main {
    public static void main(String[] args) {

        Lecturer kumar = new Lecturer();
        kumar.setCourseTeaching("Object oriented prog");
        kumar.setLecturerName("kumar");

        Course oop = new Course();
        oop.setCourseName("Object oriented prog");
        oop.setCourseCode("CTEC 22043");
        oop.setLecturerIncharge(kumar);

        Student sanga = new Student();
        sanga.setCourseFollowing("Object oriented prog");
        sanga.setDegreeName("BICT");
        sanga.setStudentName("sanga");
    }
}
