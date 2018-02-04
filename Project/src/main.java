import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        //assume all values entered are greater than 0
        Triangle equilateral = new Triangle(10,10,10);
        Triangle scalene = new Triangle(2,10,20);
        Triangle isoscelese = new Triangle(5,5,3);

        ArrayList triangles = new ArrayList();
        triangles.add(equilateral);
        triangles.add(scalene);
        triangles.add(isoscelese);


//        for(int i = 0;i < triangles.size();i++)
//        {
//            triangles.get(i). ;
//
//            System.out.println(t.checkEquilateral());
////            System.out.println(triangles.get(i).checkEquilateral());
////            System.out.println(triangles.get(i).checkscalene());
////            System.out.println(triangles.get(i).checkisoscelese());
//
//        }

    }


}



