public class Vehicle
{

    public int honk;
    public int engine;

    public Vehicle(int honk, int engine)
    {
        this.honk = honk;
        this.engine = engine;
    }

    public void honkHorn(int horn)
    {

    }

    public void startEngine(int keys)
    {

    }
}

class Car extends Vehicle
{
    public int turn;

    public Car(int honk, int engine, int t)
    {
        super(honk, engine);
        turn = t;

    }

    public void turnWheel(int _turn)
    {
        turn = _turn;

    }

}




