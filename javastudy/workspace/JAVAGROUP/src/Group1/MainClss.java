package Group1;

public class MainClss {

	public static void main(String[] args) {
		
		
		Group group = new Group("코리아 그룹");
		group.hireEmplyee(new Regular(100,"리차드","개발부",3000));
		group.hireEmplyee(new Regular(100,"리차드","개발부",3000));
		group.hireEmplyee(new Regular(100,"리차드","개발부",3000));
		group.hireEmplyee(new Regular(100,"리차드","개발부",3000));
		
		group.info();
		group.dropEmloyee(1000);
		group.info();
	}

}
