

public class Courses {
	private String lessonName;

	
	
	public Courses(String lessonName,Teachers teacher) {
		this.lessonName=lessonName;
	
	}
	
	public void addTeacher(Teachers teachers) {
		if (teachers.getBranch().equals(lessonName)) {
			System.out.println(teachers.getName() + " adlı hoca " + lessonName + " dersine eklenmiştir.");
		}
		else {
			System.out.println("derse hoca eklenmemiştir");
		}
	}
	
	
	
	
	
	
	
	
	
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

 
	
}
