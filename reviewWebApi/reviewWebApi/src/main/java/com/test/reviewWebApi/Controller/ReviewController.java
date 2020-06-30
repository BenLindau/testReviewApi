package com.test.reviewWebApi.Controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.reviewWebApi.Dao.QaModelDao;
import com.test.reviewWebApi.Model.QaModel;
import com.test.reviewWebApi.Service.ReviewService;

@Controller
public class ReviewController {
	
	Logger log = Logger.getLogger(ReviewController.class.getName());
	
	@Autowired
	ReviewService reviewService;
	@Autowired
	QaModelDao qaModelDao;
	
	@GetMapping("/")
	public String showHomePage(Model model) {
		System.out.print("HomePage");
		return "index";
	}
	
	@RequestMapping(value = "/inputQuestion",
			method = RequestMethod.POST)
	public String inputQuestion(@RequestParam("questionDegree") String qDegree,
								@RequestParam("questionUnit") String qUnit,
								@RequestParam("answerDegree") String aDegree,
								@RequestParam("answerUnit") String aUnit) {
	try {
	  QaModel question = new QaModel(Double.valueOf(qDegree), qUnit,
			  Double.valueOf(aDegree), aUnit, false);
	  	
	  	reviewService.reviewQuestion(question);
		reviewService.outputResults(String.valueOf(question.isCorrect()));
		
		qaModelDao.createQuestion(question);
		
	} catch (Exception e) {
		log.log(Level.INFO, "Please enter a number!");
		new Exception("Please enter a number!", e);
	}
		return "redirect:returnList";
	}

	
	@RequestMapping(value = "/returnList",
			method = RequestMethod.GET)
	public String showTest(Model model) {
		System.out.print("returnList");
		List<QaModel> questions = qaModelDao.getAllQuestions();
		
		model.addAttribute("questions", questions);
		System.out.print(questions);
		return "returnList";
	}
	
	
}
