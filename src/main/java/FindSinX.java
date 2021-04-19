public class FindSinX {

    /*
    Assignment 2 : Sathya

    Sin(x) = x-xPown/n!
    We need to give below inputs ,

    x , n and increment of operation , and number of iteration

    sin x = x1/1! - x3/3! + x5/5! - x7/7! + x9/9! ........

    n=1,3,5,7
    increment number is z=2
    number of iteration is 6 and its y=6
    x=x/180*3.14 which is conversion of radians
    1st part to positive and 2nd part to negative and this should be defined in loop
    and find the values of j and k limitation  and this needs to be calculated.
    solution return variable is w

     */


    public double SinX(double x,double n,double z,double y)
    {
        double m=0;
        double w =0;
        x=((x/180)*3.14);
        System.out.println("x is :"+x);
        double i= Math.round(y/2);
        System.out.println("i is :"+i);
        double j= y-i;
        System.out.println("j is :"+j);

            for (double l = 0; l < i; l++) {

                double f= Powercal(x,n);
                double o = facOperation(n);
                if(l==0)
                {

                    w=f+0;
                    n=n+z;

                    System.out.println("the result w is plus :"+w);

                }
                else
                {


                    w = w+f/o;
                    n=n+z;


                    System.out.println("the result w is plus :"+w);


                }

                if(m<j)
                {
                    f= Powercal(x,n);
                    o = facOperation(n);

                    w=w-f/o;
                    n=n+z;

                    System.out.println("the result w is minus :"+w);

                    m++;

                }


            }



        return w;
    }

    public double Powercal(double x,double n)
    {

        //2*2*2 n = 3 and x =2

        double e=1;
        for(double d=n;d>0;d--)
        {

            if(d==1)
            {

                e = x+0;


            }
            else
            {
                e=e*x;

            }
        }

        return e;
    }

    public double facOperation(double n)
    {

        //5!= 5,4,3,2,1

        double h=1;

        for(double g=n;g>0;g--)
        {
            if(g==1)
            {
                h=n+0;

            }
            else
            {
                h=g*h;

            }

        }

        return h;


    }


    public static void main(String[] args) {
        FindSinX sin = new FindSinX();
        double Result= sin.SinX(1,1,2,7);
        System.out.println("The sin x result is :"+Result);

    }
}
