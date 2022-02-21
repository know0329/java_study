package playGame;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프할 줄 모릅니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("방향을 전환하지 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****초보자*******");
	}

	

}
