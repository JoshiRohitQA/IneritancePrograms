package inheritance;


class GrandMulti{
	static void grandRel() {
		System.out.println("Grandfather will give properties to Father");
	}
}

class ParentMulti extends GrandMulti{
	static void parentRel() {
		System.out.println("Father will inherit  GrandFather");
	}
}
public class MultilevelAssign extends ParentMulti {
	static void childSon() {
		System.out.println("Child will inherit  Father");
	}
	public static void main(String[] args) {
		childSon();
		parentRel();
		grandRel();
		
	}

}
