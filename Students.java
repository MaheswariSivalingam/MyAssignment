package week3.day2;

public class Students {
	public  void getStudentInfo(int id) {
		System.out.println("student id: "+id);
     }
	public  void getStudentInfo(int id,String name) {
		System.out.println("student id: "+ id+"\n"+"student name: "+name);
     }
	public  void getStudentInfo(String email,long phoneNumber) {
		System.out.println("student email: "+email+"\n"+"phoneNumber: "+phoneNumber);
     }
	public static void main(String[] args) {
		Students obj=new Students();
        obj.getStudentInfo(13245);
        obj.getStudentInfo(13245, "ram");
        obj.getStudentInfo("ram1234@gmail.com", 9067835267L);
	}

}
