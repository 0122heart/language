package j12_상속;

public class Tiger extends Animal{
    public Tiger(String tigerName){
        super(tigerName);
    }

    @Override
    public void move(){
        super.move();
        System.out.println("네 발로 걷습니다.");
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void setName(String name){
        super.setName(name);
    }
}
