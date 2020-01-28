class Test{
    public static void main(String args[]){
        Fraction f=new Fraction("6/8");
        f.setNum(69);
        f.setDenom(138);
        
        System.out.println(f.getNum() + "/" + f.getDenom());
    }
}