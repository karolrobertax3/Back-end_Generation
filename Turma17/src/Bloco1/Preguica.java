package Bloco1;

public class Preguica extends Animal {
	private boolean subirArvore;
	
	public Preguica() {
		super("Soninho", 3, "zZzZzZ");
		
		/*public Preguica(boolean subirArvore) {
			this.subirArvaore = subirArvore;
			
		}*/
	}
	

	public boolean isSubirArvore() {
		return subirArvore;
	}


	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	public void printCorrer() {
		if(isSubirArvore() == true)
		System.out.println("Ela sobe em árvore...");
	}

	@Override
	public void emiteSom() {
		System.out.println(super.getSom());
		
	}
}
