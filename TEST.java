
public class TEST {

	public static void main(String[] args) {
Teachers teachers1=new Teachers("Ela", "Kuş", 1000, "Matematik");
Teachers teachers2=new Teachers("ahmet", "söke", 1250, "Fizik");
Teachers teachers3=new Teachers("aslı", "mavi", 450, "Kimya");

Courses course1=new Courses("Matematik", teachers1);
Courses course2=new Courses("Fizik", teachers2);
Courses course3=new Courses("Kimya", teachers3);
 course1.addTeacher(teachers1);
course2.addTeacher(teachers2);
course3.addTeacher(teachers3);

Students s1=new Students(course1, "Kadir", "Karacan", 1700);
s1.not(12, 70, 87, teachers1, teachers2, teachers3);

Students s2=new Students(course1, "Çağla", "ülker", 2900);
s2.not(28, 89, 31, teachers1, teachers2, teachers3);

Students s3=new Students(course1, "Kadir", "Karacan", 200);
s3.not(30, 30, 30, teachers1, teachers2, teachers3);



}}
