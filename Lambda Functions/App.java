import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		for(int i=1;i<=10;i++) {
			students.add(new Student(i,"Ayush"+i));
		}
		
		// using lamda function to double id of every student.
		students.forEach((student) -> student.setStudentId(student.getStudentId()*2));
		
		
		// using lamda function to print data of every student.
		students.forEach((student) -> System.out.println(student));
		
	}
}
