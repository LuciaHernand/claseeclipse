package ClasesYObjetos;

public class Editorial {

	String Editorial;
	
	public Editorial(String Editorial) {
		super();
		this.Editorial=Editorial;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	@Override
	public String toString() {
		return "Editorial [Editorial=" + Editorial + "]";
	}
	
}
