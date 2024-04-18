package JavaOOP;

import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School();

        // Adding students
        Student student1 = new Student("John", 10, "123 Main St", "S001", "10th");
        student1.enrollCourse("Math");
        school.addStudent(student1);

        Student student2 = new Student("Jane", 15, "456 Elm St", "S002", "9th");
        student2.enrollCourse("English");
        school.addStudent(student2);

        // Adding teachers
        Teacher teacher1 = new Teacher("Johnson", 35, "789 Oak St", "T001", "Math");
        teacher1.assignClassroom("Room 101");
        school.addTeacher(teacher1);

        Teacher teacher2 = new Teacher("Anderson", 40, "987 Pine St", "T002", "Science");
        teacher2.assignClassroom("Room 102");
        school.addTeacher(teacher2);

        // Display all students and teachers
        school.displayAllStudents();
        school.displayAllTeachers();

        // Search for student and teacher by ID
        System.out.println("Search student with ID S002:");
        Student foundStudent = school.searchStudentById("S002");
        if (foundStudent != null) {
            foundStudent.displayInfo();
            foundStudent.displayCoursesTaken();
        } else {
            System.out.println("Student not found.");
        }

        System.out.println();

        System.out.println("Search teacher with ID T001:");
        Teacher foundTeacher = school.searchTeacherById("T001");
        if (foundTeacher != null) {
            foundTeacher.displayInfo();
            foundTeacher.displaySubjectTaught();
        } else {
            System.out.println("Teacher not found.");
        }
    }
}
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    private String studentId;
    private String grade;
    private ArrayList<String> coursesTaken;

    public Student(String name, int age, String address, String studentId, String grade) {
        super(name, age, address);
        this.studentId = studentId;
        this.grade = grade;
        this.coursesTaken = new ArrayList<>();
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    // Method to enroll in a course
    public void enrollCourse(String course) {
        coursesTaken.add(course);
    }
    // Method to display courses taken by the student
    public void displayCoursesTaken() {
        System.out.println("Courses taken by " + getName() + ":");
        for (String course : coursesTaken) {
            System.out.println(course);
        }
    }
}


class Teacher extends Person {
    private String teacherId;
    private String subject;
    private String classroomAssigned;

    public Teacher(String name, int age, String address, String teacherId, String subject) {
        super(name, age, address);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    // Getters and Setters
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getClassroomAssigned() {
        return classroomAssigned;
    }
    public void setClassroomAssigned(String classroomAssigned) {
        this.classroomAssigned = classroomAssigned;
    }
    // Method to assign a classroom
    public void assignClassroom(String classroom) {
        this.classroomAssigned = classroom;
    }

    // Method to display the subject taught by the teacher
    public void displaySubjectTaught() {
        System.out.println(getName() + " teaches " + subject);
    }
}

class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Method to add a student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to add a teacher to school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Method to display all students in the school
    public void displayAllStudents() {
        System.out.println("All Students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.displayInfo();
            System.out.println();
        }
    }

    // Method to display all teachers in the school
    public void displayAllTeachers() {
        System.out.println("All Teachers:");
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            teacher.displayInfo();
            System.out.println();
        }
    }

    // Method to search for a student by student ID
    public Student searchStudentById(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null; // Student not found
    }

    // Method to search for a teacher by teacher ID
    public Teacher searchTeacherById(String teacherId) {
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null; // Teacher not found
    }
}

