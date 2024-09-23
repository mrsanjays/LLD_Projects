package Main;


import java.util.Scanner;

import Model.Student;
import Repository.StudentRepositoryImpl;

public class Main
{
    private static StudentRepositoryImpl repo;
    private static Scanner scanner;
    private static Main obj;

    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        int choice = 0;
        repo = StudentRepositoryImpl.getInstance();
        obj = new Main();

        while (choice != 9)
        {
            System.out.println();
            System.out.println("Choose operation: ");
            System.out.println("1. Add New Student");
            System.out.println("2. Retrieve Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("9. Exit");
            System.out.print("Enter choice here: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // To consume the leftover newline character after nextInt()

            switch (choice)
            {
                case 1: obj.addStudent();       break;
                case 2: obj.retrieveStudent();  break;
                case 3: obj.updateStudent();    break;
                case 4: obj.deleteStudent();    break;
                case 9: System.out.println("Bye!"); break;
                default: System.out.println("Invalid!");
            }
        }
        scanner.close(); // Close the scanner when done
    }

    private  void addStudent()
    {
        int id;
        String name, email;

        System.out.println("Entering student: ");
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (repo.exists(id))
        {
            System.out.println("ID Exists! Cannot add student!");
            return;
        }
        else
        {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            repo.addStudent(new Student(id, name, email));
        }
    }

    private  void retrieveStudent()
    {
        int id;

        System.out.println("Retrieving student: ");
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (repo.exists(id))
            System.out.println(repo.getStudentByID(id).toString());
        else
            System.out.println("Student not found!");
    }

    private  void updateStudent()
    {
        int id;
        String name, email;

        System.out.println("Updating student: ");
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (repo.exists(id))
        {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            repo.updateStudent(new Student(id, name, email));
        }
        else
        {
            System.out.println("ID does not exist! Cannot update student!");
        }
    }

    private  void deleteStudent()
    {
        int id;

        System.out.println("Deleting student: ");
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (repo.exists(id))
        {
            repo.deleteStudent(id);
        }
        else
        {
            System.out.println("Student not found!");
        }
    }
}

