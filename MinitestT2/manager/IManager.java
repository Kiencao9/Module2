package MinitestT2.manager;

import MinitestT2.model.Student;

import java.util.List;

public interface IManager<E> {
    public void add(List<Student> students);
    public void display(List<Student> students);
    public void delete(List<Student> students, int index);

    public void edit(List<Student> students, int index);
}
