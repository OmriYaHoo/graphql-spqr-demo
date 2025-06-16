package com.omriyahoo.graphqlspqr.configuration;

import com.github.javafaker.Faker;
import com.omriyahoo.graphqlspqr.entities.Attendee;
import com.omriyahoo.graphqlspqr.entities.Speaker;
import com.omriyahoo.graphqlspqr.entities.Talk;
import com.omriyahoo.graphqlspqr.repos.AttendeeRepository;
import com.omriyahoo.graphqlspqr.repos.SpeakerRepository;
import com.omriyahoo.graphqlspqr.repos.TalkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class DataLoader {

    @Bean
    @Profile("!test") // Don't run in test profile
    public CommandLineRunner loadData(SpeakerRepository speakerRepository,
                                      TalkRepository talkRepository,
                                      AttendeeRepository attendeeRepository) {
        return args -> {
            Faker faker = new Faker();
            Random random = new Random();

            // Create speakers (same as in your SQL)
            Speaker speaker1 = createSpeaker("Omri");
            Speaker speaker2 = createSpeaker("Oded");
            Speaker speaker3 = createSpeaker("Alon");
            Speaker speaker4 = createSpeaker("David");

            List<Speaker> speakers = List.of(speaker1, speaker2, speaker3, speaker4);
            speakerRepository.saveAll(speakers);

            // Create talks (same as in your SQL)
            Talk talk1 = createTalk("Maven", speaker2);
            Talk talk2 = createTalk("Logging Stack", speaker4);
            Talk talk3 = createTalk("Clean Code", speaker3);
            Talk talk4 = createTalk("GraphQL", speaker1);

            List<Talk> talks = List.of(talk1, talk2, talk3, talk4);
            talkRepository.saveAll(talks);

            // Create 50 attendees with faker
            List<Attendee> attendees = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                var attendee = Attendee.builder()
                        .name(faker.name().fullName())
                        .build();
                // Assign random talk(s) to each attendee
                Talk randomTalk = talks.get(random.nextInt(talks.size()));
                attendee.setTalks(List.of(randomTalk));

                attendees.add(attendee);
            }

            attendeeRepository.saveAll(attendees);
        };
    }

    private Speaker createSpeaker(String name) {
        return Speaker.builder()
                .name(name)
                .build();
    }

    private Talk createTalk(String subject, Speaker speaker) {
        return Talk.builder()
                .subject(subject)
                .speaker(speaker)
                .build();
    }
}