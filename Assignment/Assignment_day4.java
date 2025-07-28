import java.util.Scanner;
class Vehicleinfo
{
	 static int mileage;  
	 static double price;
            
        void show()
	{
            System.out.println("Mileage:"+mileage);
	    System.out.println("Price:"+price);
	}
}
class car extends Vehicleinfo
{

	 static double cost;
	 static int  warranty;
	 static int seating_capacity;
	 static boolean  fuel_type;
	void show1()
	{
	System.out.println("Cost:"+cost);
	System.out.println("Warranty(in years):"+warranty);
	System.out.println("No.Of.Seats:"+seating_capacity);
	System.out.println("Fuel Type:"+fuel_type);
	}
}
class bike extends Vehicleinfo
{
	static int cylinders;
	static int gears;
	static String cooling_type;
	 static boolean wheel;
	 static int  fuel_tank_size;
        void show2()
	{
	System.out.println("No.of .Cylinder:"+cylinders);
	System.out.println("No.of .Gears:"+gears);
	System.out.println("Cooling Type:"+cooling_type);
	System.out.println("Wheel:"+wheel);
	System.out.println("Tank Size:"+fuel_tank_size);


	}
}
class Audi extends car
{
	String model;
       

	
  void display()
	{
	System.out.println("Model:"+model);
	}
	
        
}
class Ford extends car
{
	String model;
	 

void display()
	{
	System.out.println("Model:"+model);
	}

	
}
class Bajaj extends bike
{
	String make_type;
	
void display()
	{
	System.out.println("Making type:"+make_type);
	}
	
}
class TVS extends bike
{
	String make_type;
	
void display()
	{
	System.out.println("Making type:"+make_type);
	}
	

}
 

class Vehicleformation
{
	public static void main(String args[])
	{
System.out.println("\nAudi\n");
	Audi a=new Audi();
		a.mileage=90;
		a.price=5000000;
		a.cost=20000;
		a.warranty=12;
		a.seating_capacity=8;
		a.fuel_type=false;
		a.model="Audi Maruti";
    	a.show();
	a.show1();
	a.display();
System.out.println("\nFord\n");

	Ford a1=new Ford();
		a1.mileage=100;
		a1.price=8000000;
		a1.cost=70000;
		a1.warranty=20;
		a1.seating_capacity=6;
		a1.fuel_type=true;
		a1.model="Ford ZS";
    	a1.show();
	a1.show1();
	a1.display();
System.out.println("\nBajaj\n");

	Bajaj b=new Bajaj();
		b.mileage=60;
		b.price=200000;
		b.cylinders=6;
 		b.gears=4;
		b.cooling_type="air";
		b.wheel=true;
		b.fuel_tank_size=5;
    		b.make_type="Bajaj 125";
	b.show();
	b.show2();
	b.display();
System.out.println("\nTVS\n");

	TVS b1=new TVS();
		b1.mileage=80;
		b1.price=250000;
		b1.cylinders=5;
 		b1.gears=4;
		b1.cooling_type="liquaid";
		b1.wheel=false;
		b1.fuel_tank_size=6;
    		b1.make_type="TVS250";
	b1.show();
	b1.show2();
	b1.display();
System.out.println("\n\n");

    
    
	}
}

//------------------------------------------------------------------------------------------------------------
class twoD
{
	int x;
	int y;
    twoD()
	{
	this.x=x;
	this.y=y;
	}
     twoD(int x,int y)
	{
	this.x=x;
	this.y=y;
	}
     int getX()
	{
	return x;	
	}
     int getY()
	{
	return y;
	}
     void setX(int x)
	{
	this.x=x;
	}
    void setY(int y)
	{
	this.y=y;
	}
    void write()
	{
	System.out.println("X:"+x+"\tY:"+y);

	}	

      
}		
 
         
class threeD extends twoD
{

	
	private int z;
threeD()
	{
	super();
	this.z=z;	
	}

 threeD(int x,int y,int z)
	{
	super(x,y);
	this.z=z;	
	}
	
	int getZ()
	{
	return z;
	}
        void setZ(int z)
	{
         this.z=z;
	}
       void write()
	{
		System.out.println("X:"+x+"\tY:"+y+"\tZ:"+z);
	}

     void calculateDistance(threeD t1,threeD t2)
	{
		System.out.println("Distance:  "+(Math.pow((t2.x-t1.x),2)+Math.pow((t2.y-t1.y),2)+Math.pow((t2.z-t1.z),2)));
	}
}



class distance
	{
	public static void main(String args[])
	{
		twoD t=new twoD();
		t.write();
		threeD t2=new threeD();
		t2.write();

 		threeD t3=new threeD(2,3,4);
                t3.write();
               threeD t4=new threeD();
                t4.setX(3);
                t4.setY(5);
		t4.setZ(1);
                t4.write();
               t3. calculateDistance(t4,t3);
               
	
}
}
        
	
		
//-------------------------------------------------------------------------------------------------------
 class point{
		private int x;
		private int y;

	point()
	{
	this.x=x;
	this.y=y;
	} 
	

	void setPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	} 
	int getX() 
	 {	
		return x;
	 } 
	int getY() 
	 {
		return y;
	 } 
	void printPoint()
	{
           System.out.println(x+" , "+y);

	}

}

class circle extends point
{
        final float PI=3.14f;
	private int radius;
	circle(int radius)
	{
             this.radius=radius;
	}

	void setRadius(int radius)
	{
		this.radius=radius;
	}
	int getRadius()
	{
		return radius;
	}
	float area()
	{
		return (float) PI*radius*radius;
	}
 
}

class Circlearea{
	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);

 		point p=new point();
		System.out.print("Enter x:");
		int x=s.nextInt();
		System.out.print("Enter y:");
		int y=s.nextInt();
		p.setPoint(x,y);
		
		
		System.out.print("Circle radius:");
		int radius=s.nextInt();
              
		circle c1=new circle(radius);
		System.out.println("Circle center: "+p.getX()+","+p.getY());
		System.out.println("Radius is: "+ c1.getRadius());
		System.out.println("Area of Circle: "+c1.area());
	}
}
//----------------------------------------------------------------------------------------------------------
/*class gameanimal
{
	String type;
	int speed;
	String color;
	
	void setType(String type)
	{
		this.type=type;
	}
	void setSpeed(int speed)
	{
		this.speed=speed;
	}
	void setColor(String color)
	{
		this.color=color;
	}
	String getType()
	{
		return type;
	}
	int getSpeed()
	{
		return type;
	}
	String getColor()
	{
		return type;
	}
}
class gamehuman
{
	String character_name;
	String weapon;
	int score;
	void setCharacter_name(String character-name)
	{
	this.character_name=character_name;
	}
	void setWeapon(String weapon)
	{
	this.weapon=weapon;
	}
	void setScore(int score)
	{
	this.score=score;
	}
	String getCharacter_name()
	{
	return character_name;
	}
        String getWeapon()
	{
	return weapon;
	}
	int getScore()
	{
	return score;
	}
}
 class game extends gameanimal, gamehuman
	{
	public static void main(String args[])
	{
	gameanimal  ga=new gameanimal();
	gamehuman gh=new gamehuman();
         ga.setType("bird");
	 ga.setSpeed(120);
	 ga.setColor("brown");
	 gh.setCharacter_name("chojo");
	gh.setWeapon("AK40");
	gh.setScore(45);
        System.out.println("Game Aminal Details:"+ga.getType()+","+ga.getSpeed()+" speed,"+ga.getColor);
	System.out.println("Game Player Setup:"+gh.getCharacter_name()+","+gh.getWeapon()+","+gh.getScore());
	}
	}*/
	 

//-----------------------------------------------------------------------------------------------------------------
class Shape
	{
	void Prints()
	{
		System.out.println("This is a Shape");
	}
	
	}
class ploygon extends Shape
	{
	void Prints()
	{
       super.Prints();
	System.out.println("Ploygon is a Shape");
	}
	}
class Rectangle extends ploygon
	{
	void Prints()
	{
	super.Prints();
	System.out.println("Rectangle  is a Polygon");

	}
	}
class Triangle extends ploygon
	{
	void Prints()
	{
	System.out.println("Triangle is a Polygon");

	}
	}
class Square extends Rectangle
	{
	    void Prints()
		{
		super.Prints();
            System.out.println("Square is a Rectangle");
	}
	}


class Shapes
	{
	public static void main(String args[])
	{
		Shape s=new Square();
                s.Prints();
		Shape s1=new Triangle();
		s1.Prints();
	}
	}
//-----------------------------------------------------------------------------------------------
       