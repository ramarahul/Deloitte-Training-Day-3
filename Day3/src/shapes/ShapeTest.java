package shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape box  = new Rectangle(20,30);
		box.computeArea();
		box.computePerimeter();
		System.out.println(box.toString());
		
		Shape sq = new Square(25.5);
		sq.computeArea();
		sq.computePerimeter();
		System.out.println(sq);
		
		ShapeDrawer sd = new ShapeDrawer();
		
		draw(sd,box);
		draw(sd,sq);
		
		Drawable d = new Drawable() {
			@Override
			public void draw(Shape s) {
				if(s instanceof Rectangle)
					System.out.println("Drawing rectangle shape using my drawable");
				if(s instanceof Square) {
					System.out.println("Drawing square shape using my drawable");
				}
			}
		};
		
		draw(d,sq);
		
		draw(new MyDrawable(),sq);
		
	}

	
	public static void draw(Drawable d,Shape s) {
		// TODO Auto-generated method stub
		d.draw(s);
		
	}
	
	static class MyDrawable implements Drawable {
		@Override
		public void draw(Shape s) {
			if(s instanceof Rectangle)
				System.out.println("Drawing rectangle shape using my drawable!");
			if(s instanceof Square) {
				System.out.println("Drawing square shape using my drawable!");
			}
		}
	}

	
	

}

