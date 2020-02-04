class Fraction{
    private int numer, denom;
    public Fraction(){
        numer=1;
        denom=6;
    }
    public Fraction(int numer, int denom){
        this.numer=numer;
        if(denom==0){
            System.out.println("Denominator cannot be 0");
        }else{
            this.denom=denom;
        }
    }
    public Fraction(String fraction){
        int n=fraction.indexOf("/");
        numer=Integer.parseInt(fraction.substring(0,n));
        if(Integer.parseInt(fraction.substring(n+1))==0){
            System.out.println("Denominator cannot be 0");
        }else{
            denom=Integer.parseInt(fraction.substring(n+1));
        }
    }
    public Fraction(Fraction f){
        this.numer=f.numer;
        this.denom=f.denom;
    }
    
    public int getNum(){
        return this.numer;
    }
    public int getDenom(){
        return this.denom;
    }
    public String toString(){
        return (this.numer + "/" + this.denom);
    }
    public double toDouble(){
        return ( ( (double) this.numer) / ( (double) this.denom) );
    }
    public void reduce(){
        int gcf=GCF(this.numer,this.denom);
        this.numer=this.numer/gcf;
        this.denom=this.denom/gcf;
    }
    public void setNum(int numer){
        this.numer=numer;
    }
    public void setDenom(int denom){
        this.denom=denom;
    }
    
    public static Fraction multiply(Fraction a, Fraction b){
        int num, denom;
        num=a.numer*b.numer;
        denom=a.denom*b.denom;
        Fraction f=new Fraction(num,denom);
        f.reduce();
        return f;
    }
    
    public static Fraction divide(Fraction a, Fraction b){
        int num, denom;
        num=a.numer*b.denom;
        denom=a.denom*b.numer;
        Fraction f=new Fraction(num,denom);
        f.reduce();
        return f;
    }
    
    public static Fraction add(Fraction a, Fraction b){
        int common=a.denom*b.denom;
        a.numer=a.numer*b.denom;
        b.numer=b.numer*a.denom;
        Fraction f=new Fraction(a.numer+b.numer,common);
        f.reduce();
        return f;
    }
    
    public static Fraction subtract(Fraction a, Fraction b){
        int common=a.denom*b.denom;
        a.numer=a.numer*b.denom;
        b.numer=b.numer*a.denom;
        Fraction f=new Fraction(a.numer-b.numer,common);
        f.reduce();
        return f;
    }    
    
    private static int GCF(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        return a;
    }
}