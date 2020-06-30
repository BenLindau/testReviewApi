package com.test.reviewWebApi.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.test.reviewWebApi.Model.QaModel;

@Component
public class QaModelDao {
	
	private Map<QaModel, String> questions = new HashMap();
	
	public List<QaModel> getAllQuestions() {
		return new ArrayList(questions.values());
	}
	
	public void createQuestion(QaModel question) {
		if(question.isCorrect() == true) {
			questions.put(question, question.getQuestionDegree() + question.getQuestionUnit()  + " = " 
					+ question.getAnswerDegree() + question.getAnswerUnit() + ": Correct");
		} else {
			questions.put(question, question.getQuestionDegree() + question.getQuestionUnit()  + " = " 
					+ question.getAnswerDegree() + question.getAnswerUnit() + ": Incorrect");
		}
	
	}
	
	
}
