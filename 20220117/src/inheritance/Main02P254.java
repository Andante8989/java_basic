package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성하세요
		// 생성한 객체의 정보를 get~~Info()를 이용해 콘솔에도 같이 찍어주세요.
		
		Student stu = new Student();
		stu.name = "아지테";
		stu.age = 200;
		stu.stuNum = 10;
		
		Salaryman sal = new Salaryman();
		sal.name = "문수";
		sal.salary = 40000000;
		sal.age = 35;
		
		stu.getStuInfo();
		sal.getSalaryInfo();

	}

}
