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

        System.out.println("\nLecturer Name : "+kumar.getLecturerName());
        System.out.println("Teaching course : "+kumar.getCourseTeaching());

        System.out.println("\nCourse Name : "+oop.getCourseName());
        System.out.println("Course code : "+oop.getCourseCode());

        System.out.println("\nStudent Name : "+sanga.getStudentName());
        System.out.println("Following Degree : "+sanga.getDegreeName());
        System.out.println("Following Course : "+sanga.getCourseFollowing());
    }
}
