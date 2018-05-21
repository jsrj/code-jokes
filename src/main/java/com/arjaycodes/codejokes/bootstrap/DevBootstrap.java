package com.arjaycodes.codejokes.bootstrap;

import com.arjaycodes.codejokes.entity.Joke;
import com.arjaycodes.codejokes.repository.JokeRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private JokeRepository jokeRepository;

    public DevBootstrap(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Joke joke1 = new Joke("Joke 1", "Haha");
        jokeRepository.save(joke1);

        Joke joke2 = new Joke("Joke 2", "Very Funny");
        jokeRepository.save(joke2);

        Joke joke3 = new Joke("Joke 3", "Knock knock");
        jokeRepository.save(joke3);

        Joke joke4 = new Joke("Joke 4", "No Seriously");
        jokeRepository.save(joke4);

        System.out.println("Created new jokes");
    }
}
