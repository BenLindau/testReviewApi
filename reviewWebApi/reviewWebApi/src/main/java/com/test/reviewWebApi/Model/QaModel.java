package com.test.reviewWebApi.Model;

public class QaModel {
	
	
	private double questionDegree;
	private String questionUnit;
	private double answerDegree;
	private String answerUnit;
	private boolean isCorrect;
	
	
	public QaModel(double inputQ,
				String inputUnit, 
				double answerQ, 
				String answerUnit, 
				boolean result) {
		this.questionDegree = inputQ;
		this.questionUnit = inputUnit;
		this.answerDegree = answerQ;
		this.answerUnit = answerUnit;
		this.isCorrect = result;
	}
	
	public double getQuestionDegree() {
		return questionDegree;
	}
	public void setQuestionDegree(double questionDegree) {
		this.questionDegree = questionDegree;
	}
	public String getQuestionUnit() {
		return questionUnit;
	}
	public void setQuestionUnit(String questionUnit) {
		this.questionUnit = questionUnit;
	}
	public double getAnswerDegree() {
		return answerDegree;
	}
	public void setAnswerDegree(double answerDegree) {
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
