package com.test.reviewWebApi.Model;

public class QaModel {
	
	private float questionDegree;
	private String questionUnit;
	private float answerDegree;
	private String answerUnit;
	private boolean isCorrect;
	
	
	public QaModel(float inputQ,
				String inputUnit, 
				float answerQ, 
				String answerUnit, 
				boolean result) {
		this.questionDegree = inputQ;
		this.questionUnit = inputUnit;
		this.answerDegree = answerQ;
		this.answerUnit = answerUnit;
		this.isCorrect = result;
	}
	
	public float getQuestionDegree() {
		return questionDegree;
	}
	public void setQuestionDegree(float questionDegree) {
		this.questionDegree = questionDegree;
	}
	public String getQuestionUnit() {
		return questionUnit;
	}
	public void setQuestionUnit(String questionUnit) {
		this.questionUnit = questionUnit;
	}
	public float getAnswerDegree() {
		return answerDegree;
	}
	public void setAnswerDegree(float answerDegree) {
		this.answerDegree = answerDegree;
	}
	public String getAnswerUnit() {
		return answerUnit;
	}
	public void setAnswerUnit(String answerUnit) {
		this.answerUnit = answerUnit;
	}
	
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
}
