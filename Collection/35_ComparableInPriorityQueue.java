import java.util.*;

class ProjectInfo implements Comparable {
	
	String pName = null;
	int teamCount = 0;
	int duration = 0;
	ProjectInfo(String pName, int teamCount, int duration) {
		
		this.pName = pName;
		this.teamCount = teamCount;
		this.duration = duration;
	}

	public int compareTo(Object obj) {
		
		return pName.compareTo(((ProjectInfo)obj).pName);
	}

	public String toString() {
		
		return pName;
	}
}

class Main {
	
	public static void main(String[] args) {
	
		PriorityQueue que = new PriorityQueue();

		que.offer(new ProjectInfo("InstagramClone", 4, 8));
		que.offer(new ProjectInfo("QuizApp", 2, 5));
		que.offer(new ProjectInfo("EcommerceWebSite", 8, 15));
		que.offer(new ProjectInfo("WebBrowser", 3, 6));

		System.out.println(que);
	}
}
