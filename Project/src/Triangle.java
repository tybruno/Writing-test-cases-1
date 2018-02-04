


public class Triangle {

    private int x;
    private int y;
    private int z;

    public Triangle(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void getValues(){
        System.out.println("X: " + x);
        System.out.println("X: " + y);
        System.out.println("X: " + z);

    }
    public boolean checkEquilateral(){

        //if x implies y then y implies z
        if(x == y && y == z && x > 0)
        {
            return true;
        }
        return false;

    }

    public boolean checkIsosceles(){

        if(x == y)
        {
            if(x > z)
            {
               return true;
            }
        }
        if (y == z){
            if(y > z){
                return true;
            }

        }
        if(x == z)
        {
            if(x > y)
            {
                return true;
            }
        }

        return false;

    }

    public boolean checkScalene()
    {
        if(x != y && y != z)
        {
            return true;
        }
        return false;
    }



}


