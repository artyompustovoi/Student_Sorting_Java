package Artem_Pustovoy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class StudentGroup {
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    StudentGroup addStudent(Student s) {
        this.students.add(s);
        return this;
    }

    Iterable<String> overNames() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private Iterator<Student> studentIterator = students.iterator();

                    @Override
                    public boolean hasNext() {
                        return studentIterator.hasNext();
                    }

                    @Override
                    public String next() {
                        return studentIterator.next().name();
                    }
                };
            }
        };
    }

    private final List<Student> students;
}
