package scheduler;

public class PriorityAllocation implements Scheduler
{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객의 등급이 높은 순서댈도 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 스킬이 가장 높은 상담원의 대기열에 우선 배분합니다.");
	}
}
