package com.test.reviewWebApi.Service;

import org.springframework.stereotype.Service;

import com.test.reviewWebApi.Model.QaModel;

@Service
public class ReviewService {


	public void outputResults(String string) {
		System.out.println(string);
	}
	
	public QaModel reviewQuestion(QaModel qaModel) {
		
		if(qaModel.getQuestionUnit().trim().equalsIgnoreCase("fahrenheight")) {
			evaluatefahrenheight(qaModel);
		} 
		if(qaModel.getQuestionUnit().equalsIgnoreCase("celsius")) {
			evaluateCelsius(qaModel);
		} 
		if(qaModel.getQuestionUnit().equalsIgnoreCase("kelvin")) {
			evaluateKelvin(qaModel);
		} 
		if(qaModel.getQuestionUnit().equalsIgnoreCase("rankine")) {
			evaluateRankine(qaModel);
		} 
		
		return qaModel;
	}
	
	public QaModel evaluatefahrenheight(QaModel qaModel) {
		if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
			if(qaModel.getQuestionDegree() == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
			
				float testTemp = ((float) (qaModel.getQuestionDegree()-32)*5)/9;
				if(testTemp == (qaModel.getAnswerDegree())) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			float testTemp = (float) (273.5 + ((qaModel.getQuestionDegree() - 32.0) * (5.0/9.0)));
			if(testTemp == qaModel.getAnswerDegree()) {
			qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			float testTemp = (float) ((qaModel.getQuestionDegree()*1.0)+459.67);
			if(testTemp == qaModel.getAnswerDegree()) {
			qaModel.setCorrect(true);
			}
		}
		return qaModel;
	}
	
	public QaModel evaluateCelsius(QaModel qaModel) {
		if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
			if(qaModel.getQuestionDegree() == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				float testTemp = ((float) (qaModel.getQuestionDegree() * 1.8 + 32));
				if(testTemp == qaModel.getAnswerDegree()) {
					qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			float testTemp = (float) (273.15 + ((qaModel.getQuestionDegree())));
			if(testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			float testTemp = (float) ((273.15 + qaModel.getQuestionDegree()) * 9/5);
			if(testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		return qaModel;
	}

	public QaModel evaluateKelvin(QaModel qaModel) {
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			if(qaModel.getQuestionDegree() == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				float testTemp = ((float) (((qaModel.getQuestionDegree() - 273) * 9/5) + 32));
				if(testTemp == qaModel.getAnswerDegree()) {
					qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
			float testTemp = (float) (qaModel.getQuestionDegree() - 273.15);
			if(testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			float testTemp = (float) (qaModel.getQuestionDegree() * 9/5);
			if (testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
				}
			}
		return qaModel;
		}
		
		
		public QaModel evaluateRankine(QaModel qaModel) {
			if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
				if(qaModel.getQuestionDegree() == qaModel.getAnswerDegree()) {
					qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				
					float testTemp = ((float) (qaModel.getQuestionDegree() - 459.67));
					if(testTemp == qaModel.getAnswerDegree()) {
					qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
				float testTemp = (float) ((qaModel.getQuestionDegree() - 491.67) * 5/9);
				if(testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
				float testTemp = (float) (qaModel.getQuestionDegree() * 5/9);
				if(testTemp == qaModel.getAnswerDegree()) {
				qaModel.setCorrect(true);
				}
			}
		
		return qaModel;
	}
	
}
