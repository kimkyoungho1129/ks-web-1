package com.kyoungho.app;

import com.kyoungho.app.entity.*;
import com.kyoungho.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository,InterestsRepository interestsRepository,SkillRepository skillRepository,WorkRepository workRepository){
		this.personRepository=personRepository;
		this.socialMediaRepository=socialMediaRepository;
		this.interestsRepository=interestsRepository;
		this.skillRepository=skillRepository;
		this.workRepository=workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("김경호","모바일","hello@test.com","010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("","","https://www.instagram.com/anonymous","https://www.facebook.com/anonymous"));
		interestsRepository.save(new Interests("롤토체스, 맥주마시기"));
		skillRepository.save(new Skill("Skill",25));
		workRepository.save(new Work("position","company","time","desc"));
	}
}
