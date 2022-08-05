package practice0805;

public class M {
    int i;
    public M(int i){
        this.i--;
        System.out.println(i);

    }
}class N extends M
{
    public N(int i){
        super(++i);
        System.out.println(i);

    }
}
