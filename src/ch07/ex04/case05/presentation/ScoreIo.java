package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
		private ScoreService scoreService;
		
		public ScoreIo(ScoreService scoreService) {
			this.scoreService = scoreService;
		}
		
		public void play() {
			int kor = 0;
			int eng = 0;
			int math = 0;
			
			for(int i = 0; i < 5; i ++) {
				kor = Console.inNum("국어");
				eng = Console.inNum("영어");
				math = Console.inNum("수학");
				
				scoreService.addScore(new Score(kor, eng, math));
			}
			
			Score[] scores = scoreService.getScores();
			for(Score score: scores)
				Console.info(score);
		}
}