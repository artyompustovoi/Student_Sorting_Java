
package Artem_Pustovoy;
import java.util.ArrayList;
import java.util.List;

import static Artem_Pustovoy.StudentSorting.sortByAge;
import static Artem_Pustovoy.StudentSorting.sortByName;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Eugeniy", 19),
                new Student("Anatoliy", 22),
                new Student("Kot", 20),
                new Student("Boris", 19)
        );

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        students = sortByName(students); // Assign the sorted list back to students

        System.out.println("\nAfter sorting by name:");
        for (Student student : students) {
            System.out.println(student);
        }
        sortByAge(students);

        System.out.println("\nAfter sorting by age:");
        for (Student student : students) {
            System.out.println(student);
        }
        var g = new StudentGroup(new ArrayList<>());
        g.addStudent(new Student("Ann", 18));
        g.addStudent(new Student("Sam", 19));
        g.addStudent(new Student("Mary", 22));
        g.addStudent(new Student("Boris", 17));

        var names = g.overNames();
        var it1 = names.iterator();
        var it2 = names.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next().equals(it2.next()));
        }

        System.out.println(it1.hasNext() == it2.hasNext());

        for (var name : names) {
            System.out.println(name);
        }
    }
    }
