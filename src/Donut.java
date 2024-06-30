/*
 * Student Name: Di Wu
 * Lab Professor: Professor James Mwangi
 * Due Date: June 07, 2024
 * Modified: June 01, 2024
 * Description: this class creates Donut constructors and donut volume calculating method.
 */

//create class donut with its outer radius and inner radius
public class Donut {
	private double outerRadius;
	private double innerRadius;
	
	//no-args constructor
	public Donut() {

	}
	
	//parameterized constructor
	public Donut(double outerRadius, double innerRadius) {
		this.outerRadius = outerRadius;
		this.innerRadius = innerRadius;
	}
	
	//accessor for outer radius
	public double getOuterRadius() {
		return outerRadius;
	}
	
	//mutator for outer radius
	public void setOuterRadius(double outerRadius) {
		this.outerRadius = outerRadius;
	}
	
	//accessor for inner radius
	public double getInnerRadius() {
		return innerRadius;
	}
	
	//mutator for inner radius
	public void setInnerRadius(double innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	//method for calculating donut volume
	public double calculateDonutVolume() {
		double volume;
		/*
		   torus volume formula reference:
		   R. P. D. BEng, "Torus," Math Is Fun, 2024. [Online]. 
		   Available: https://www.mathsisfun.com/geometry/torus.html. 
		   [Accessed 03 June 2024].
		 */
		volume = 2 * Math.pow(Math.PI, 2) * outerRadius * Math.pow(innerRadius, 2);
		
		return volume;

	}
	
}
