import java.util.*;
public class Point{
	int x;
	int y;
	public void showPoint(){
		System.out.println("X-Cordinate :"+this.x);
		System.out.println("Y-Cordinate :"+this.y);
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Point p = new Point();
		System.out.println("Enetr the X-Cordinate :");
		int x= sc.nextInt();
		System.out.println("Enetr the X-Cordinate :");
		int y=sc.nextInt();
		p.setX(x);
		p.setY(y);
		p.showPoint();
		System.out.println("X-Cordinate :"+p.getX());
}
}