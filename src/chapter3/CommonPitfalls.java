package chapter3;

public class CommonPitfalls {
  public static void main(String[] args) {
  	int x=1;
  	int y=2;
  	while(x==y){
  		System.out.println("Equal");
  		x++;
  	}
  	
  	if(x>0 & y>1)
  		System.out.println("Greater than");	
}
}