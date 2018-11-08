import java.util.Scanner;
 
public class PointTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the first values of the coordinates:");
        System.out.print("x: ");
        int x = reader.nextInt();
        System.out.print("y: ");
        int y = reader.nextInt();
        
        Point point = new Point(x, y);
         
        System.out.println("Point is now at : " + point);
        System.out.println("Type in the change of x and y coordinates");
        System.out.print("x: ");
        x = reader.nextInt();
        System.out.print("y: ");
        y = reader.nextInt();
        
        point.move(x, y);
        System.out.println("Point is now at: " + point);
    }
}


class Point{
	private int x;
	private int y;
	public Point(int xaxis,int yaxis){
		this.x=xaxis;
		this.y=yaxis;	
		if(x < 0){
			x = 0;
		}
		else if(y < 0){
			y = 0;
		}
		if(x > 100){
			x = 100;
		}
		else if(y > 100){
			y = 100;
		}	
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public void move(int xaxis,int yaxis){
		if(xaxis < 0){
			x += xaxis;
			if(x < 0){
				x = 0;}
		}
		else if(xaxis > 0){
			x += xaxis;
			if(x > 100){
				x = 100;}
		}
		if(yaxis < 0){
			y += yaxis;
			if(y < 0){
				y = 0;}
		}
		else if(yaxis > 0){
			y += yaxis;
			if(y > 100){
				y = 100;}
		}	
	}
}