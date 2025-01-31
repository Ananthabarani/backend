package MiniProject;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static jdk.internal.org.jline.utils.Colors.s;

public class StudentManagementSystem {

    private static List<Student> students=new ArrayList<>();
    public static String FlieName="Student.txt";
    public static void main(String[] args) throws FileNotFoundException {
        try {
            load(); // Load existing students from the file at the start
        } catch (FileNotFoundException e) {
            System.out.println("No existing data found. Starting with an empty student list.");
        }
        Scanner s=new Scanner (System.in);
        Boolean exit=true;
        while(exit){
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. sort By ");
            System.out.println("8. Save and Exit ");
            System.out.print("Choose an option: ");
            int choice;
            try{
                choice=s.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input ,Please enter the Number format");
                continue;
            }
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6 :
                    sortBy();
                    break;
                case 7 :
                    save();
                    System.out.println("Data saved. Exiting... Goodbye!");
                    exit=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    //Add the Student
    public static void addStudent(){
        Scanner s=new Scanner (System.in);
        try {
            System.out.println("Enter the Student Id  : ");
            int id=s.nextInt();
            s.nextLine();
            Optional<Student> existingStudent =students.stream().filter(student->student.getId()==id).findFirst();
            if(existingStudent.isPresent()){
                System.out.println(" Student Already exits");
                return;
            }
            System.out.print("Enter Name: ");
            String name = s.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(s.nextLine());

            System.out.print("Enter Grade: ");
            String grade = s.nextLine();

            System.out.print("Enter Email: ");
            String emailformat = "[a-zA-Z0-9._-]*@[a-zA-Z0-9]+\\.(com|org|net)$";
            Pattern pattern = Pattern.compile(emailformat);
            String email = s.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find())
            {
                students.add(new Student(id, name, age, grade, email));
                save();
                System.out.println("Student added successfully.");
                System.out.println("--------------------------------");
            } else
            {
                System.out.println();
                System.out.println(email + " Is Invalid Email.");
                System.out.println("--------------------------------");
                System.out.println();
                return;
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid Id input type");
            System.out.println("--------------------------------");
        }

    }
    // view Student
    public static void viewAllStudents(){
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("--- Student Details ---");
        System.out.println(students);
        System.out.println("--------------------------------");
    }
    //Search by Student Id
    public static void searchStudentById(){
        Scanner s=new Scanner(System.in);
        try {
            System.out.print("Enter Student ID to search: ");
            int id = s.nextInt();

            Optional<Student> student = students.stream()
                    .filter(student1 -> student1.getId() == id).findFirst();

            if (student.isPresent()) {
                System.out.println("Student found: " + student.get());
                System.out.println("--------------------------------");
            } else {
                System.out.println("Student with ID " + id + " not found.");
                System.out.println("--------------------------------");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter  ID in number Format.");
            System.out.println("--------------------------------");
        }
    }
    //Update student details
    public static void updateStudent() {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID to update: ");
            int id = s.nextInt();
            s.nextLine();

            Optional<Student> studentOptional = students.stream()
                    .filter(student -> student.getId() == id)
                    .findFirst();

            if (!studentOptional.isPresent()) {
                System.out.println("Student with ID " + id + " not found.");
                System.out.println("--------------------------------");
                return;
            }

            Student student = studentOptional.get();
            boolean Update = true;

            while (Update) {
                System.out.println("\nChoose the field to update:");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Grade");
                System.out.println("4. Email");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = s.nextInt();
                s.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter New Name : ");
                        String name = s.nextLine();
                            student.setName(name);
                            System.out.println("Name updated successfully.");
                        System.out.println("--------------------------------");
                        break;

                    case 2:
                        System.out.print("Enter New Age : ");
                        int ageInput = s.nextInt();
                        student.setAge(ageInput);
                        System.out.println("Age updated successfully.");
                        System.out.println("--------------------------------");
                        break;

                    case 3:
                        System.out.print("Enter New Grade : ");
                        String grade = s.nextLine();
                        student.setGrade(grade);
                        System.out.println("Grade updated successfully.");
                        System.out.println("--------------------------------");

                        break;

                    case 4:
                        System.out.print("Enter New Email : ");
                        String email = s.nextLine();
                        student.setEmail(email);
                        System.out.println("Email updated successfully.");
                        System.out.println("--------------------------------");

                        break;

                    case 5:
                        Update = false;
                        System.out.println("Exiting update menu.");
                        save();
                        System.out.println("--------------------------------");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("Student details updated successfully.");
            System.out.println("--------------------------------");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("--------------------------------");
        }
    }

    // Delete a student
    public static void deleteStudent(){
        Scanner s=new Scanner (System.in);
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = s.nextInt();

            boolean removed = students.removeIf(student -> student.getId() == id);

            if (removed) {
                System.out.println("Student with ID " + id + " deleted successfully.");
                System.out.println("--------------------------------");
            } else {
                System.out.println("Student with ID " + id + " not found.");
                System.out.println("--------------------------------");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric ID.");
            System.out.println("--------------------------------");
        }
        save();

    }
    public static void sortBy(){
        Scanner s=new Scanner(System.in);
        boolean sort =true;
        while (sort) {
            System.out.println("\nChoose the filed by sort the Student:");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter New Name : ");
                    sortByName();
                    System.out.println("--------------------------------");
                    break;

                case 2:
                    System.out.print("Enter New Age : ");
                    int ageInput = s.nextInt();
                    sortByAge();
                    break;


                case 3:
                    sort = false;
                    System.out.println("Exiting update menu.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
    //Sort By Name
    public static void sortByName(){
       students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
        System.out.println("--------------------------------");
    }
    //Sort by Age
    public  static void sortByAge(){
        students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("--------------------------------");
    }

    public static void save(){

      try {
          FileWriter fw = new FileWriter(FlieName);
          students.stream().forEach(student -> {

              try {

                  fw.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "," + student.getEmail() + "\n");              } catch (Exception e) {
                  e.printStackTrace();
              }
          });
          fw.close();
      }
      catch (Exception e){
          e.printStackTrace();
      }

    }
    public static void load() throws FileNotFoundException {
        File  fr=new File(FlieName);
        String stringLine;
        try(BufferedReader br=new BufferedReader(new FileReader(fr))){
            if((stringLine = br.readLine()) != null){
                String word[]=stringLine.split(",");
                students.add(new Student(Integer.parseInt(word[0]),word[1],Integer.parseInt(word[2]),word[3],word[4]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
