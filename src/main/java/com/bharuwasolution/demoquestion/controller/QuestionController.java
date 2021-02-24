/**
 * 
 */
package com.bharuwasolution.demoquestion.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharuwasolution.demoquestion.controller.dtos.QuestionSearchReqDTO;
import com.bharuwasolution.demoquestion.domain.QuestionEntity;
import com.bharuwasolution.demoquestion.service.IQuestionService;

/**
 * @author abhijeetsinha
 *
 */
@RestController
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	private IQuestionService questionService;

	@PostMapping("/search")
	public ResponseEntity<Set<QuestionEntity>> getQuestionListByTag(@RequestBody QuestionSearchReqDTO dto) {
		return new ResponseEntity<Set<QuestionEntity>>(questionService.getQuestionsByTag(dto.getTags()), HttpStatus.OK);
		
	
	}
	
}
