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
	
}