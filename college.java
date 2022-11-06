public class college extends Abstract{
	
	@Override
	void college() {
		// TODO Auto-generated method stub
		System.out.println("DSCET");
	}

	@Override
	void semster() {
		// TODO Auto-generated method stub
		System.out.println("Sixth");
	}

	@Override
	void Branch() {
		// TODO Auto-generated method stub
		System.out.println("Chennai");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		college info=new college();
		info.Branch();
		info.semster();
		info.college();
		info.university();
		
		
		
	}

	
	
}
