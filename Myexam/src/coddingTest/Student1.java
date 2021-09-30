package coddingTest;

public class Student1 {

	private String name;
	private String no;

	public String getName() {
		return name;
	}

	public Student1(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", no=" + no + "]";
	}

	}
