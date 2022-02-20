package polymorphism;


/*
  다형성(polymorphism) : 하나의 코드가 여러가지 자료형으로 구현되어 실행되는 것 Flexibitity, Reuseability, maintaince에 기본
  상위 클래스 타입으로 선언된 하나의 변수가 여러 인스턴스에 대입되어 다양한 구현이 실행될 수 있다.
  
  다운캐스팅 : 업캐스팅으로 인해 그 클래스만의 고유의 메소드를 사용하지 못할 때 사용하는 형변환이다. 원래 클래스로 돌아간다.
  			instanceof를 사용 (인스턴스의 타입을 체크하는 예약어)
 */

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("하늘을 날아갑니다	.");
	}
	
}

public class AnimalTest {

	
	
	
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Human());
		test.moveAnimal(new Eagle());
		
	
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		
		//다운 캐스팅
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}

		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		
		else
			System.out.println("지원하지 않는 기능 입니다.");
			
		
	}

}
