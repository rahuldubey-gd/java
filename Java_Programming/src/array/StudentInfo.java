package array;

public class StudentInfo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Rahul","Mumbai",11,101);
		Student s2 = new Student("Jitendra","Delhi",12,102);
		Student s3 = new Student("Sachin","Pune",13,103);
		Student s4 = new Student("Rajesh","Rajkot",14,104);
		Student s5 = new Student("Virat","Navi Mumbai",15,105);
		
		Student s[] = new Student[5];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		
		for(Student sinfo:s) {
			System.out.println(sinfo.getsName());
			System.out.println(sinfo.getsAddress());
			System.out.println(sinfo.getsRollNo());
			System.out.println(sinfo.getsID()); 
		}

	}

}
