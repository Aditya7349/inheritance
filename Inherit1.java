class Inherit1 extends Inherit{
    void meth2(){
        System.out.println("Meth2()");
    }
    public static void main(String args[]){
        Inherit aobj=new Inherit();
        aobj.meth1();
        Inherit1 bobj=new Inherit1();
        bobj.meth1();
        bobj.meth2();  
    }
} 