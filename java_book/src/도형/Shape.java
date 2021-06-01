package 도형;

public abstract class Shape {
	int w;
	double result;
	
	public Shape() {}
	
	public Shape(int w) {
		this.w = w;
	}
	
	void print() {
		System.out.println("면적: "+ result);
	}
	
	abstract void area();
	
}
