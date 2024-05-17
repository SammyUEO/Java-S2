import java.util.ArrayList;

public class InvestmentCompany {

	private static ArrayList<Project> projects = new ArrayList<Project>();
	
	public static void addProject(Project p) {
		projects.add(p);
	}
	
	public static Project getBestInvestment() {
		
		double bestRisk = projects.get(0).getRisk();
		String nameOfBestInvestment = projects.get(0).getTitle();
		Project project = projects.get(0);
		for (Project p : projects) {
			if (p.getRisk() < bestRisk) {
				bestRisk = p.getRisk();
				nameOfBestInvestment = p.getTitle();
				project = p;
			}
		}
		System.out.println("Cel mai bun proiect de investitie este in " + nameOfBestInvestment);
		return project;
	}
	
	
	public static void main(String[] args) {

		Member m1 = new Member(20,"Eusebyu");
		Member m2 = new Member(21,"Naomi");
		Member m3 = new Member(22,"Oty");
		Member m4 = new Member(23,"Rafa");

		Project p1 = new Comercial("Mihai",30,"Tamplarie","Tot ce-i mai bun din lemn!",10000,"18/08/2027");
		p1.addMember(m1);
		p1.addMember(m3);

		Project p2 = new Militare("Marcel",31,"Tankuri","Totul pentru tara!",11000,"12/09/2024","GodBlessYou140");
		p2.addMember(m4);
		p2.addMember(m2);
		
		Project p3 = new OpenSource("Maria",33,"Finante","Investim cat mai mult fiecare ban!",9000,"maria@finante.ro");
		p3.addMember(m1);
		p3.addMember(m2);
		p3.addMember(m3);
		p3.addMember(m4);
		
		addProject(p1);
		addProject(p2);
		addProject(p3);

		getBestInvestment();
	}

}