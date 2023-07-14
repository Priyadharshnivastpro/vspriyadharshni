package fridaytask;

public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		
		p1.setAddress("No 20 Avadi");
		p1.setAge(21);
		p1.setName("Naran");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		
		
		p2.setAddress("no 12 vadapalani");
		p2.setAge(23);
		p2.setName("Ganesh");
		System.out.println("Name: "+p2.getName()+" "+"Age: "+p2.getAge()+" "+"Address: "+p2.getAddress());
		
		Person p3=new Person("Priya",21,"No 1 Avadi");
		Person p4=new Person("Hari",20,"No 2 chennai");
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println("count of the Person is: "+Person.count);
		

	}

}
