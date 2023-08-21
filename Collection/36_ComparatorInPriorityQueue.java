import java.util.*;

class ProjectInfo {

        String pName = null;
        int teamCount = 0;
        int duration = 0;
        ProjectInfo(String pName, int teamCount, int duration) {

                this.pName = pName;
                this.teamCount = teamCount;
                this.duration = duration;
        }

        public String toString() {

                return "{" + pName + ":" + teamCount + ":" + duration + "}";
        }
}

class SortedByDuration implements Comparator {

	public int compare(Object obj1, Object obj2) {
		
		return (((ProjectInfo)obj1).duration) - (((ProjectInfo)obj2).duration);
	}
}
class Main {

        public static void main(String[] args) {

                PriorityQueue que = new PriorityQueue(new SortedByDuration());

                que.offer(new ProjectInfo("InstagramClone", 4, 8));
                que.offer(new ProjectInfo("QuizApp", 2, 5));
                que.offer(new ProjectInfo("EcommerceWebSite", 8, 15));
                que.offer(new ProjectInfo("WebBrowser", 3, 6));

                System.out.println(que);
        }
}

