package com.arjaycodes.codejokes.bootstrap;

import com.arjaycodes.codejokes.entity.Joke;
import com.arjaycodes.codejokes.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private JokeRepository jokeRepo;

    public DevBootstrap(JokeRepository jokeRepo) {
        this.jokeRepo = jokeRepo;
    }


    public void initData() {
        Joke joke1 = new Joke();
        Joke joke2 = new Joke();
        Joke joke3 = new Joke();
        Joke joke4 = new Joke();

        joke1.setJokeName("Joke 1");
        joke1.setJokeContent("Haha");
        jokeRepo.save(joke1);

        joke2.setJokeName("Joke 2");
        joke2.setJokeName("Very Funny");
        jokeRepo.save(joke2);

        joke3.setJokeName("Joke 3");
        joke3.setJokeContent("Knock knock");
        jokeRepo.save(joke3);

        joke4.setJokeName("Joke 4");
        joke4.setJokeContent("No Seriously");
        jokeRepo.save(joke4);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.initData();
    }
}
