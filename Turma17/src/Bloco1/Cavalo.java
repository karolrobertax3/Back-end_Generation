package Bloco1;

public class Cavalo extends Animal {
	
	private boolean correr;
	
	public Cavalo() {
		super("Pangaré", 1,"brubru");
	}
	
	
	
	public boolean isCorrer() {
		return correr;
	}



	public void setCorrer(boolean correr) {
		this.correr = correr;
	}



	@Override
	public void emiteSom() {
		System.out.println(super.getSom());
		
	}
	
	public void printCorrer() {
		if(isCorrer() == true)
		System.out.println("Ela corre...");
	}

}
