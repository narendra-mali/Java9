

import java.util.Scanner;

class Gym {

	class Day1 {

		void workoutPlan() {

			System.out.println("Workout Plan for Day 1 ");
		}
	}

	class Day2 {

		void workoutPlan() {

			System.out.println("Workout Plan for Day 2 ");

		}
	}

	class Day3 {

		void workoutPlan() {

			System.out.println("Workout Plan for Day 3 ");
		}
	}

	class Day4 {

		void workoutPlan() {

			System.out.println("Workout Plan for Day 4 ");
		}
	}

	class Day5 {

		void workoutPlan() {

			System.out.println("Workout Plan for Day 5 is....");
		}
	}

	void todaysWorkout() {

		System.out.print("Enter Choice : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {

			case 1:
				Day1 d1 = new Day1();
				d1.workoutPlan();
				break;

			case 2:
				Day2 d2 = new Day2();
				d2.workoutPlan();
				break;

			case 3:
				Day3 d3 = new Day3();
				d3.workoutPlan();
				break;

			case 4:
				Day4 d4 = new Day4();
				d4.workoutPlan();
				break;

			case 5:
				Day5 d5 = new Day5();
				d5.workoutPlan();
				break;

			default:
				System.out.println("Enter number bet 1 to 5");
		}
	}

	public static void main(String[] args){

		Gym g = new Gym();
		g.todaysWorkout();
	}
}
