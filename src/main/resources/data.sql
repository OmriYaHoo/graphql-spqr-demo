insert into PUBLIC.speakers (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME)
values (1, now(), now(), 'Omri'),
       (2, now(), now(), 'Oded'),
       (3, now(), now(), 'Alon'),
       (4, now(), now(), 'David')
;

insert into PUBLIC.talks (ID, CREATED_DATE, LAST_MODIFIED_DATE, SUBJECT, SPEAKER_ID)
values (1, now(), now(), 'Maven', 2),
       (2, now(), now(), 'Logging Stack', 4),
       (3, now(), now(), 'Clean Code', 3),
       (4, now(), now(), 'GraphQL', 1)
;



insert into PUBLIC.participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME)
values (1, now(), now(), 'Shahar'),
       (2, now(), now(), 'Maayan'),
       (3, now(), now(), 'Lior'),
       (4, now(), now(), 'Neta'),
       (5, now(), now(), 'Nethanel'),
       (6, now(), now(), 'Emmanuel'),
       (7, now(), now(), 'Dana'),
       (8, now(), now(), 'Gal'),
       (9, now(), now(), 'Hadar'),
       (10, now(), now(), 'Asaf')
;

insert into PUBLIC.PARTICIPANTS_TALKS (talk_id, participant_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (1, 5),
       (1, 8),
       (1, 9),
       (1, 10),
       (2, 1),
       (2, 2),
       (2, 4),
       (2, 5),
       (2, 6),
       (2, 7),
       (2, 8),
       (2, 9),
       (2, 10),
       (3, 1),
       (3, 2),
       (3, 3),
       (3, 4),
       (3, 5),
       (3, 6),
       (3, 7),
       (3, 8),
       (3, 9),
       (4, 1),
       (4, 2),
       (4, 3),
       (4, 4),
       (4, 5),
       (4, 6),
       (4, 7),
       (4, 8),
       (4, 9),
       (4, 10);
-- PARTICIPANTS_TALK
-- SPEAKERS_TALK
-- TALKS_PARTICIPANTS
