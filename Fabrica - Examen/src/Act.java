
public abstract class Act {
	private String id;

	public Act(String id) {
		super();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public abstract String getTip();
	

}
