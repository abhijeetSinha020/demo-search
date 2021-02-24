/**
 * 
 */
package com.bharuwasolution.demoquestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharuwasolution.demoquestion.domain.QuestionEntity;

/**
 * @author abhijeetsinha
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {
	List<QuestionEntity> findByTags(String tag);
}
