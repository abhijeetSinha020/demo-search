/**
 * 
 */
package com.bharuwasolution.demoquestion.init;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bharuwasolution.demoquestion.domain.QuestionEntity;
import com.bharuwasolution.demoquestion.repository.QuestionRepository;

/**
 * @author abhijeetsinha
 *
 */
@Configuration
public class AppInit implements CommandLineRunner {
	
	@Autowired
	private QuestionRepository quesRepo;

	@Override
	public void run(String... args) throws Exception {
		generateQuestionsWithAnsAndTags();		
	}

	//

	private void generateQuestionsWithAnsAndTags() {
		QuestionEntity ques= QuestionEntity.builder().question(" how Muskmellon seeds are sown? ").answer("Muskmellon seed sown Answer->https://google.com/?muskmellon")
				.tags(Arrays.asList("Muskmellon","seeds","sown")).build();
		quesRepo.save(ques);
		
		QuestionEntity ques1= QuestionEntity.builder().question(" Ganne ki vaigyanik kheti ").answer("Ganne ki vaigyanik kheti ka answer")
				.tags(Arrays.asList("Ganne","vaigyanik","kheti")).build();
		quesRepo.save(ques1);
		

		QuestionEntity ques2= QuestionEntity.builder().question(" Pattedar sabji ki kheti ").answer("Pattedar sabji ki kheti ka answer")
				.tags(Arrays.asList("Pattedar","sabji","kheti")).build();
		quesRepo.save(ques2);
		
	}
}
