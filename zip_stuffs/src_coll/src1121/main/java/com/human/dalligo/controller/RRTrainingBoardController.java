package com.human.dalligo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.human.dalligo.service.RRTrainingBoardService;
import com.human.dalligo.vo.RRTrainerVO;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class RRTrainingBoardController {
	
	private final  RRTrainingBoardService trainingboardservice;
	
  @GetMapping("/")
  public String getTrain() {
      return "/training/trainingBoard";
  }
  
  
  @PostMapping ("/insert")
	public String insert(@ModelAttribute RRTrainerVO traingnerdvo, 
			@RequestParam (value="files",required=false) List<MultipartFile> files ) {
		//boardservice.insert(boardvo);
		//debug
		//System.out.println( boardvo.toString());
		//파일정보가 클라이언트로부터 전송되는지 확인하겠다는 의미.
//		for(MultipartFile f: files) {
//			System.out.println(f.getOriginalFilename());
//		}
		trainingboardservice.insert(traingnerdvo);
		return "redirect:/board/list";
	}
  
  
  
}
