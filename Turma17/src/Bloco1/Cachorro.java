package Bloco1;

public class Cachorro extends Animal {
	private boolean correr;
	
	public Cachorro() {
		super("Luma", 7,"Au...au...au...");
	}
	
	/*public Cachorro(boolean correr) {
		this.correr = correr;
	}*/

	@Override
	public void emiteSom() {
		System.out.println(super.getSom());
		
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public void printCorrer() {
		if(isCorrer() == true)
		System.out.println("Ela corre...");
	}
}
