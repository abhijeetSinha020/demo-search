/**
 * 
 */
package com.bharuwasolution.demoquestion.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharuwasolution.demoquestion.domain.QuestionEntity;
import com.bharuwasolution.demoquestion.repository.QuestionRepository;

/**
 * @author abhijeetsinha
 *
 */
@Service
public class QuestionService implements IQuestionService {
	@Autowired
	private QuestionRepository quesRepo;

	@Override
	public Set<QuestionEntity> getQuestionsByTag(List<String> tags) {
		System.out.println("TagsLengts**"+tags.size());
		List<List<QuestionEntity>> list=tags.stream().map(tag -> findQuestionsByTag(tag)).collect(Collectors.toList());
		//return tags.stream().map(tag -> findQuestionsByTag(tag)).collect(Collectors.toList());
		return list.stream().flatMap(Collection::stream).collect(Collectors.toSet());
	}

	private List<QuestionEntity> findQuestionsByTag(String tag) {
		return quesRepo.findByTags(tag);
	}
	
	
}
