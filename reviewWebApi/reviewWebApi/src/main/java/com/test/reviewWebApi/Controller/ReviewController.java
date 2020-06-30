package com.test.reviewWebApi.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.reviewWebApi.Model.QaModel;
import com.test.reviewWebApi.Service.ReviewService;

@Controller
public class ReviewController {
	
	
	@Autowired
	ReviewService reviewService;
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.print("HomePage");
		
		return "index";
	}
	
	@RequestMapping(value = "/inputQuestion",
			method = RequestMethod.POST)
	public String inputQuestion(@RequestParam("questionDegree") String qDegree,
								@RequestParam("questionUnit") String qUnit,
								@RequestParam("answerDegree") String aDegree,
								@RequestParam("answerUnit") String aUnit) {
	  QaModel question = new QaModel(Float.valueOf(qDegree), qUnit,
			  Float.valueOf(aDegree), aUnit, false);
	  List<QaModel> list = new ArrayList();
	  reviewService.reviewQuestion(question);
		reviewService.outputResults(String.valueOf(question.isCorrect()));
		
		return "index";
	}

	@RequestMapping(value = "/returnList",
			method = RequestMethod.POST)
	public List<QaModel> returnList() {
		return null;
	}
	
	
	
}
