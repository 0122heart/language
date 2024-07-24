package j12_상속;

public class Bird extends Animal{
    public Bird(String birdName){
        super(birdName);
    }

    public void move(){
        super.move();
        System.out.println("날아갑니다!");
    }

    public String getName(){
        return super.getName();
    }

    public void setName(String birdName){
        super.setName(birdName);
    }
}
