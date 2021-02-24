/**
 * 
 */
package com.bharuwasolution.demoquestion.service;

import java.util.List;
import java.util.Set;

import com.bharuwasolution.demoquestion.domain.QuestionEntity;

/**
 * @author abhijeetsinha
 *
 */
public interface IQuestionService {

	Set<QuestionEntity> getQuestionsByTag(List<String> tags);

}
