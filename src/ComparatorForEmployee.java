import java.util.Comparator;

public class ComparatorForEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        int checkName = o1.getName().compareTo(o2.getName());
        if (checkName > 0) {
            return 1;
        } else if (checkName < 0) {
            return -1;
        }
        return 0;
    }
}
