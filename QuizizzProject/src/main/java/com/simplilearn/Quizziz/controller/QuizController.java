package com.simplilearn.Quizziz.controller;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@Controller
public class QuizController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/index")
	public String index1(Model model) {
		return "index";
	}
	
	@RequestMapping("/home")
	public String index2(Model model) {
		return "index";
	}
	
	
	
	@PostMapping("/capitals")
	public Object startCapitalsQuiz(Model model) throws IOException {
		try {

			FileReader reader = new FileReader("C:\\Users\\RKrishna\\eclipse-workspace\\SpringJDBC_12092021 - Copy\\src\\main\\resources\\templates\\data.json");
			JSONParser jsonParser = new JSONParser();
			try {
				Object obj = jsonParser.parse(reader);
				model.addAttribute("obj", obj);
				System.out.println(obj);
				return "quizpage";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/leaders")
	public Object startLeadersQuiz(Model model) {
		try {
			FileReader reader = new FileReader("C:\\Users\\RKrishna\\eclipse-workspace\\SpringJDBC_12092021 - Copy\\src\\main\\resources\\templates\\leaders1.json");
			JSONParser jsonParser = new JSONParser();
			try {
				Object obj = jsonParser.parse(reader);
				model.addAttribute("obj", obj);
				System.out.println(obj);
				return "quizpage";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	@PostMapping("/nature")
	public Object startNatureQuiz(Model model) {
		try {
			FileReader reader = new FileReader("C:\\Users\\RKrishna\\eclipse-workspace\\SpringJDBC_12092021 - Copy\\src\\main\\resources\\templates\\nature.json");
			JSONParser jsonParser = new JSONParser();
			try {
				Object obj = jsonParser.parse(reader);
				model.addAttribute("obj", obj);
				System.out.println(obj);
				return "quizpage";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/sports")
	public Object startSportsQuiz(Model model) {
		try {
			FileReader reader = new FileReader("C:\\Users\\RKrishna\\eclipse-workspace\\SpringJDBC_12092021 - Copy\\src\\main\\resources\\templates\\sports.json");
			JSONParser jsonParser = new JSONParser();
			try {
				Object obj = jsonParser.parse(reader);
				model.addAttribute("obj", obj);
				System.out.println(obj);
				return "quizpage";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/history")
	public Object startHistoryQuiz(Model model) {
		try {
			FileReader reader = new FileReader("C:\\Users\\RKrishna\\eclipse-workspace\\SpringJDBC_12092021 - Copy\\src\\main\\resources\\templates\\history.json");
			JSONParser jsonParser = new JSONParser();
			try {
				Object obj = jsonParser.parse(reader);
				model.addAttribute("obj", obj);
				System.out.println(obj);
				return "quizpage";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}