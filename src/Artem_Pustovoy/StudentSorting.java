package Artem_Pustovoy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class StudentSorting {

    public static List<Student> sortByName(List<Student> students) {
        List<Student> mutableList = new ArrayList<>(students);
        mutableList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name().compareTo(s2.name());
            }
        });
        return mutableList;
    }
    public static List<Student> sortByAge(List<Student> students) {
        students.sort(Comparator.comparingInt(Student::age));
        return students;
    }
}
