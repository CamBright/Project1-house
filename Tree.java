/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square Grass;
    private Square Sky;
    private Triangle Roots;
    private Square Trunk1;
    private Square Trunk2;
    private Square Trunk3;
    private Square Trunk4;
    private Square Trunk5;
    private Square Trunk6;
    private Square Trunk7;
    private Circle Leaves1;
    private Circle Leaves2;
    private Circle Leaves3;
    private Circle Leaves4;
    private Circle FLeaves1;
    private Circle FLeaves2;
    private Circle Shade1;
    private Circle Shade2;
    private Circle Shade3;
    private Circle Shade4;
    private Person Person;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        // initialise instance variable 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    {
        Grass = new Square();
        Grass.changeColor("green");
        Grass.moveHorizontal(-30);
        Grass.moveVertical(200);
        Grass.changeSize(900);
        Grass.makeVisible();
        
        Sky = new Square();
        Sky.changeColor("blue");
        Sky.moveHorizontal(-60);
        Sky.moveVertical(-700);
        Sky.changeSize(900);
        Sky.makeVisible();
        
        Roots = new Triangle();
        Roots.changeColor("red");
        Roots.moveHorizontal(250);
        Roots.moveVertical(240);
        Roots.changeSize(20, 40);
        Roots.makeVisible();       
        
        Trunk1 = new Square();
        Trunk1.changeColor("red");
        Trunk1.moveHorizontal(240);
        Trunk1.moveVertical(230);
        Trunk1.changeSize(20);
        Trunk1.makeVisible();
        
        Trunk2 = new Square();
        Trunk2.changeColor("red");
        Trunk2.moveHorizontal(241);
        Trunk2.moveVertical(214);
        Trunk2.changeSize(18);
        Trunk2.makeVisible();
        
        Trunk3 = new Square();
        Trunk3.changeColor("red");
        Trunk3.moveHorizontal(242);
        Trunk3.moveVertical(200);
        Trunk3.changeSize(16);
        Trunk3.makeVisible();
        
        Trunk4 = new Square();
        Trunk4.changeColor("red");
        Trunk4.moveHorizontal(242);
        Trunk4.moveVertical(185);
        Trunk4.changeSize(16);
        Trunk4.makeVisible();
        
        Trunk5 = new Square();
        Trunk5.changeColor("red");
        Trunk5.moveHorizontal(241);
        Trunk5.moveVertical(167);
        Trunk5.changeSize(18);
        Trunk5.makeVisible();
        
        Trunk6 = new Square();
        Trunk6.changeColor("red");
        Trunk6.moveHorizontal(240);
        Trunk6.moveVertical(147);
        Trunk6.changeSize(20);
        Trunk6.makeVisible();
        
        Shade1 = new Circle();
        Shade1.changeColor("black");
        Shade1.moveHorizontal(220);
        Shade1.moveVertical(20);
        Shade1.changeSize(100);
        Shade1.makeVisible();
        
        Leaves2 = new Circle();
        Leaves2.changeColor("green");
        Leaves2.moveHorizontal(190);
        Leaves2.moveVertical(50);
        Leaves2.changeSize(90);
        Leaves2.makeVisible();
        
        Shade2 = new Circle();
        Shade2.changeColor("black");
        Shade2.moveHorizontal(232);
        Shade2.moveVertical(50);
        Shade2.changeSize(95);
        Shade2.makeVisible();
        
        Trunk7 = new Square();
        Trunk7.changeColor("red");
        Trunk7.moveHorizontal(239);
        Trunk7.moveVertical(125);
        Trunk7.changeSize(22);
        Trunk7.makeVisible();
        
        Leaves1 = new Circle();
        Leaves1.changeColor("green");
        Leaves1.moveHorizontal(230);
        Leaves1.moveVertical(50);
        Leaves1.changeSize(90);
        Leaves1.makeVisible();
        
        Leaves3 = new Circle();
        Leaves3.changeColor("green");
        Leaves3.moveHorizontal(220);
        Leaves3.moveVertical(20);
        Leaves3.changeSize(90);
        Leaves3.makeVisible();
        
        Shade3 = new Circle();
        Shade3.changeColor("black");
        Shade3.moveHorizontal(230);
        Shade3.moveVertical(70);
        Shade3.changeSize(30);
        Shade3.makeVisible();
        
        Shade4 = new Circle();
        Shade4.changeColor("black");
        Shade4.moveHorizontal(250);
        Shade4.moveVertical(50);
        Shade4.changeSize(40);
        Shade4.makeVisible();
        
        FLeaves1 = new Circle();
        FLeaves1.changeColor("green");
        FLeaves1.moveHorizontal(228);
        FLeaves1.moveVertical(69);
        FLeaves1.changeSize(27);
        FLeaves1.makeVisible();
        
        FLeaves2 = new Circle();
        FLeaves2.changeColor("green");
        FLeaves2.moveHorizontal(247);
        FLeaves2.moveVertical(50);
        FLeaves2.changeSize(37);
        FLeaves2.makeVisible();
        
        Person = new Person();
        Person.makeVisible();
        
        
    }
    
    public void setBlackAndWhite()
    {
        if (Grass != null)
    {
        Grass.changeColor("black");
        Sky.changeColor("black");
        Roots.changeColor("white");
        Trunk1.changeColor("white");
        Trunk2.changeColor("white");
        Trunk3.changeColor("white");
        Trunk4.changeColor("white");
        Trunk5.changeColor("white");
        Trunk6.changeColor("white");
        Shade1.changeColor("black");
        Leaves2.changeColor("white");
        Shade2.changeColor("black");        
        Trunk7.changeColor("white");
        Leaves1.changeColor("white");
        Leaves3.changeColor("white");
        Shade3.changeColor("black");
        Shade4.changeColor("black");        
        FLeaves1.changeColor("white");
        FLeaves2.changeColor("white");
        Person.changeColor("white");
    }
    }
        public void setColor()
    {
        if (Grass != null)
    {
        Grass.changeColor("green");
        Sky.changeColor("blue");
        Roots.changeColor("red");
        Trunk1.changeColor("red");
        Trunk2.changeColor("red");
        Trunk3.changeColor("red");
        Trunk4.changeColor("red");
        Trunk5.changeColor("red");
        Trunk6.changeColor("red");
        Shade1.changeColor("black");
        Leaves2.changeColor("green");
        Shade2.changeColor("black");
        Trunk7.changeColor("red");
        Leaves1.changeColor("green");
        Leaves3.changeColor("green");
        Shade3.changeColor("black");
        Shade4.changeColor("black");
        FLeaves1.changeColor("green");
        FLeaves2.changeColor("green");
        Person.changeColor("black");
    }
    }
}
