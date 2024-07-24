package j18_제네릭.와일드카드;

import j14_참조자료형캐스팅.동물.Dog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal) animal).move();  // AnimalDtaa 내의 멤버 변수 animal을 Animal 타입으로 형 변환하여 move 메소드 호출

        if(animal.getClass() == Human.class){  // AnimalData의 멤버 변수는 현재 Animal 클래스인데, 이 것이 Human class에도 속해있다면
            ((Human) animal).readBooks();  // Human 클래스에 정의되어 있는 .readBooks() 메소드 호출
        }
        else if(animal.getClass() == Tiger.class){  // animal을 Tiger 타입으로 형 변환하여 .hunting() 메소드 호출
            ((Tiger) animal).hunting();
        }
        System.out.println();

    }
}
