

public class Courses {
	private String lessonName;

	
	
	public Courses(String lessonName,Teachers teacher) {
		this.lessonName=lessonName;
	
	}
	
	public void addTeacher(Teachers teachers) {
		if (teachers.getBranch().equals(lessonName)) {
			System.out.println(teachers.getName() + " adl� hoca " + lessonName + " dersine eklenmi�tir.");
		}
		else {
			System.out.println("derse hoca eklenmemi�tir");
		}
	}
	
	
	
	
	
	
	
	
	
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

 
	
}
