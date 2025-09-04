


import java.util.Random;

public class PointD {

    private int x; //class level decleration
    private int y;

    private int z;


    // private int[]xy= new int[2];

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int zz) {
        z = zz;

    }
    public void setY(int yy) {
        y = yy;
        // xy[1]=yy;
    }
    public PointD(){
        x =1;
        y =1;
        z =1;
    }
    public PointD(int X,int Y,int Z) {
        this();


        this.x = X;
        y = Y;
        z = Z;
    }
    public PointD(int X){
        this.x=X;
        y=0;
        z=0;
    }


    public void setX(int xx) {
        x = xx;
        // xy[0]=x;
    }

    public void print() {
        String p = "[" + x + "," + y + "," + z + "]";
        System.out.println(p);
    }

    public double distO() {
        double d = Math.sqrt(x * x + y * y + z * z );
        return d;
    }
    public String toString() {
        String p = "[" + x + "," + y + "," + z + "]";
        return p;
    }

    public static void main(String[] args) {
        PointD p = new PointD(7,8,9);
        PointD pA[] = new PointD[5];
        int A[] = new int[5];

        for (int i= 0; i<5 ; i++){
            pA[i] = new PointD(i-1,i+1,i);
            pA[1] = new PointD();
        }
        int count = 0;
        for (int j=0; j<5; j++){
            Random r = new Random();
            if(r.nextInt(2)==0){
                pA[count++] = new PointD();
            }
        }
        System.out.println(pA[0]);
        for(PointD c:pA){
            System.out.println(c);
        }






        System.out.println("First Object (5,6,7)");
        PointD fs = new PointD();
        PointD fs1 = new PointD(9,5,3);
        fs.print();
     //   System.out.println(fs);
        // fs.x=9;
        fs.setX(5);
        fs.setY(6);
        fs.setZ(7);
        fs.print();
        fs1.print();

        System.out.println("Second Object (6,6,6) ");

        PointD fs2 = new PointD();
        fs2.setX(6);
        fs2.setY(6);
        fs2.setZ(6);
        // fs2.print();

        System.out.println(fs2);

        System.out.println("Distance");
        System.out.println(fs2.distO());

    }



}

