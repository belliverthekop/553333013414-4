package Bell;

public class Bell {
	private String name;
	private String position;
	private String friend[];
	public Bell() {
		name = "Bell";
		position = "RB";
		friend = new String[]{"Soarez","Sturridge","Gerrard"};
	}
	public Bell(int a) {
		
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
	

}
