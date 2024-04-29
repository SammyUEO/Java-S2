public class Main {

    public static void main(String[] args) {
    	
        Contributor c1 = new Contributor("Ion Popescu", "5041928492012");
        Address a1 = new Address("Strada V Parvan", 2);
        Address a2 = new Address("Strada Lugoj", 4);
        Properties p1 = new Building(a1, 20);
        Properties p2 = new Land(a1, 10, LocationRank.I);
        Properties p3 = new Building(a2, 25);

        c1.addProperties(p1);
        c1.addProperties(p2);
        c1.addProperties(p3);

        System.out.println(c1.butterfly());
    }
}
