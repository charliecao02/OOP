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
        
    }
    
}