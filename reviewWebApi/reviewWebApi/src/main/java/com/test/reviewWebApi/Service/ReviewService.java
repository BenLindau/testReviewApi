package com.test.reviewWebApi.Service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

import com.test.reviewWebApi.Model.QaModel;

@Service
public class ReviewService {


    DecimalFormat df1 = new DecimalFormat("0.#");

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
			
				double testTemp = ((double) (qaModel.getQuestionDegree()- 32.0) * (5.0/9.0));
				System.out.print(df1.format(testTemp) + ":" + (df1.format(qaModel.getAnswerDegree())));
				if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))){
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			double testTemp = (double) (273.5 + ((qaModel.getQuestionDegree() - 32.0) * (5.0/9.0)));
			if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))){
			qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			double testTemp = (double) ((qaModel.getQuestionDegree()*1.0)+459.67);
			if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
			qaModel.setCorrect(true);
			}
		}
		return qaModel;
	}
	
	public QaModel evaluateCelsius(QaModel qaModel) {
		if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
			if(df1.format(qaModel.getQuestionDegree()) == df1.format(qaModel.getAnswerDegree())) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				double testTemp = ((double) (qaModel.getQuestionDegree() * 1.8 + 32));
				if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
					qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			double testTemp = (double) (273.15 + ((qaModel.getQuestionDegree())));
			if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			double testTemp = (double) ((273.15 + qaModel.getQuestionDegree()) * 9/5);
			if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
				qaModel.setCorrect(true);
			}
		}
		return qaModel;
	}

	public QaModel evaluateKelvin(QaModel qaModel) {
		if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
			if(df1.format(qaModel.getQuestionDegree()) == df1.format(qaModel.getAnswerDegree())) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				double testTemp = ((double) (((qaModel.getQuestionDegree() - 273) * 9/5) + 32));
				if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
					qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
			double testTemp = (double) (qaModel.getQuestionDegree() - 273.15);
			if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
				qaModel.setCorrect(true);
			}
		}
		if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
			double testTemp = (double) (qaModel.getQuestionDegree() * 9/5);
			if (df1.format(testTemp) == (df1.format(qaModel.getAnswerDegree()))) {
				qaModel.setCorrect(true);
				}
			}
		return qaModel;
		}
		
		
		public QaModel evaluateRankine(QaModel qaModel) {
			if(qaModel.getAnswerUnit().equalsIgnoreCase("rankine")) {
				if(df1.format(qaModel.getQuestionDegree()) == df1.format(qaModel.getAnswerDegree())) {
					qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("fahrenheight")) {
				
					double testTemp = ((double) (qaModel.getQuestionDegree() - 459.67));
					if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
					qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("celsius")) {
				double testTemp = (double) ((qaModel.getQuestionDegree() - 491.67) * 5/9);
				if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
				qaModel.setCorrect(true);
				}
			}
			if(qaModel.getAnswerUnit().equalsIgnoreCase("kelvin")) {
				double testTemp = (double) (qaModel.getQuestionDegree() * 5/9);
				if(df1.format(testTemp).equals((df1.format(qaModel.getAnswerDegree())))) {
				qaModel.setCorrect(true);
				}
			}
		
		return qaModel;
	}
	
}
