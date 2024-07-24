package j18_제네릭.와일드카드;

/*
    와일드카드(WildCard)
        : 와일드카드는 제네릭 타입을 좀 더 유연하게 사용할 수 있도록 보조함. 표기 방식 -> '?'
        1.2 상한 경계 와일드카드
            <? extends T> : T의 하위 타입만 허용
        1.3 하한 경계 와일드카드
            <? super T> : T의 상위 타입만 허용
 */
public class Main {
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }
        else if(flag == 2){
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
//        else if(flag == 3){
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("셀토스"));
//            return animalData;
//        }
        return null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getAnimal(1));
        System.out.println(main.getAnimal(2));
    }
}
