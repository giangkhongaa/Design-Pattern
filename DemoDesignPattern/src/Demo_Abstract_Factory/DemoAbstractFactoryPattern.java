package Demo_Abstract_Factory;

/**
 * @author Giang
 *
 * Client
 */
public class DemoAbstractFactoryPattern {

	public static void main(String[] args) {
		
		  //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //initialization shape circle
	      IShape shape1 = shapeFactory.getShape("CIRCLE");

	      //execute function draw of circle shape
	      shape1.draw();

	      //initialization shape rectangle
	      IShape shape2 = shapeFactory.getShape("RECTANGLE");

	      //execute function draw of  rectangle shape
	      shape2.draw();
	      
	      //initialization shape square
	      IShape shape3 = shapeFactory.getShape("SQUARE");

	      //execute function draw of square shape
	      shape3.draw();

	      //initialization factory color
	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

	      //initializationo color Blue
	      IColor color1 = colorFactory.getColor("RED");

	      //execute function draw of red color 
	      color1.fill();

	      //initialization color Blue
	      IColor color2 = colorFactory.getColor("BLUE");

	      //execute function draw of blue color 
	      color2.fill();

	      //initialization color white
	      IColor color3 = colorFactory.getColor("WHITE");

	      //execute function fill of white color
	      color3.fill();

	}

}
