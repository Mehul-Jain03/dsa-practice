package dp;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {

	int id, deadline, profit;

	public JobSequencingProblem(int id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

	public static void compare(JobSequencingProblem[] job) {

		Arrays.sort(job, new Comparator<JobSequencingProblem>() {
			@Override
			public int compare(JobSequencingProblem s1, JobSequencingProblem s2) {
				return s2.profit - s1.profit;
			}
		});
	}

	static int jobScheduling(JobSequencingProblem[] job) {

		if (job.length == 0) {
			return 0;
		}

		int max = 0;
		for (int i = 0; i < job.length; i++) {
			if (job[i].deadline > max) {
				max = job[i].deadline;
			}
		}

		int[] result = new int[max + 1];
		for (int i = 1; i < result.length; i++) {
			result[i] = -1;
		}

		int jobsCount = 0;
		int jobProfit = 0;

		for (int i = 0; i < job.length; i++) {

			for (int j = job[i].deadline; j > 0; j--) {

				if (result[j] == -1) {
					result[j] = i;
					jobsCount = jobsCount + 1;
					;
					jobProfit = jobProfit + job[i].profit;
					break;
				}

			}

		}
		return jobProfit;
	}

	public static void main(String[] args) {

		JobSequencingProblem[] job = new JobSequencingProblem[5];
		job[0] = new JobSequencingProblem(1, 2, 100);
		job[1] = new JobSequencingProblem(2, 1, 19);
		job[2] = new JobSequencingProblem(3, 2, 27);
		job[3] = new JobSequencingProblem(4, 1, 25);
		job[4] = new JobSequencingProblem(5, 3, 15);

		compare(job);

		System.out.println(jobScheduling(job));

	}

}
