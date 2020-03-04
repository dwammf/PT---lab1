

/**
 * @author Lenovo
 * @version 1.0
 * @created 04-мар-2020 14:12:47
 */
public abstract class Shape {

	private Color borderColor;
	private Point center;

	public Shape(){

	}

	public void finalize() throws Throwable {

	}

	public abstract draw();

	public Color getBorderColor(){
		return null;
	}

	public Point getCenter(){
		return null;
	}

	public Point location(){
		return null;
	}

	/**
	 * 
	 * @param newCenterPoint
	 */
	public abstract move(Point newCenterPoint);

	/**
	 * 
	 * @param color
	 */
	public setBorderColor(Color color){

	}

	/**
	 * 
	 * @param centerPoint
	 */
	public setCenter(Point centerPoint){

	}

}