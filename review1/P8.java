package review1;

class Animal
{
	public void eat() 
	{
		System.out.println("먹다.");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("짖는다.");
	}
	public void play()
	{
		super.eat();
		System.out.println("논다");
	}
}
class BabyDog extends Dog
{
	public void weep()
	{
		System.out.println("낑낑대다.");
	}
}
public class P8
{
	public static void main(String[] args) {
		Animal a = new Animal();	//생성자 호출하지만 없음. 하지만 컴파일러가 기본생성자를 만들어 준다.
		Dog b = new Dog();
		BabyDog bd = new BabyDog();
		
		a.eat();
		b.bark(); b.eat();	//eat을 private로 바꾸면 오류난다. not visible.
		bd.weep(); bd.bark(); bd.eat();
		
		b.play();	//먹다 논다. super로 부모 생성자 지정.
	}
}