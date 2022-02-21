package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ��� ��й���� �����ϼ��� R, L, P");
		
		int ch = System.in.read();
		
		Scheduler schduler = null;
		
		if(ch == 'R' || ch == 'r') {
			schduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			schduler = new LeastJob();
			
		}
		else if(ch == 'P' || ch == 'p') {
			schduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		schduler.getNextCall();
		schduler.sendCallToAgent();
	}
}
