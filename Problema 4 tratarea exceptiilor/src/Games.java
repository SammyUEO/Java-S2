public class Games {
	
    public static void main(String[] args) {
        Field f1 = new Field(100, 50, "Anfield");
        Ball b1 = new Ball(50, 25, f1);
        Joc j1 = new Joc("Liverpool", "Arsenal", 1000, b1);

        Field f2 = new Field(100, 50, "Camp Nou");
        Ball b2 = new Ball(50, 25, f2);
        Joc j2 = new Joc("Barcelona", "Real Madrid", 1000, b2);

        j1.simuleaza();
        j1.results();

        j2.simuleaza();
        j2.results();
    }
}
