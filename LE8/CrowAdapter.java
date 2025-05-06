public class CrowAdapter implements Swan{
    private Crow crow;
    public CrowAdapter(Crow crow){
        this.crow=crow;
    }
    public void sing(){
        crow.cry();
    }
    public void swim(){
        crow.fly();
    }
    public void eat(){
        crow.eat();
    }
}