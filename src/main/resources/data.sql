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

-- Inserting Data into PARTICIPANTS
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (1, '2019-03-18T07:32:50Z', '2019-03-14T14:36:53Z', 'Perkin');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (2, '2019-09-08T00:29:17Z', '2019-05-12T10:58:04Z', 'Dixie');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (3, '2019-01-22T14:20:42Z', '2019-10-06T17:39:33Z', 'Lewiss');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (4, '2019-06-15T17:01:36Z', '2019-10-17T17:37:15Z', 'Shay');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (5, '2019-02-14T03:47:28Z', '2019-09-23T03:56:57Z', 'Laney');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (6, '2019-11-20T13:47:26Z', '2019-04-10T05:05:26Z', 'Staford');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (7, '2019-10-20T17:28:59Z', '2019-05-27T11:01:16Z', 'Upton');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (8, '2019-09-08T22:25:55Z', '2019-06-23T00:18:34Z', 'Carlita');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (9, '2019-06-13T23:20:15Z', '2019-09-03T12:46:32Z', 'Kristoforo');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (10, '2019-07-26T14:37:39Z', '2019-01-16T00:25:50Z', 'Guntar');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (11, '2019-09-28T09:12:03Z', '2019-04-29T18:38:56Z', 'Gus');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (12, '2019-01-17T08:57:35Z', '2019-11-05T22:17:11Z', 'Craggie');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (13, '2019-05-16T08:14:49Z', '2019-07-31T03:02:45Z', 'Loutitia');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (14, '2019-05-30T17:17:28Z', '2019-04-12T02:04:40Z', 'Kristopher');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (15, '2019-03-03T17:33:57Z', '2019-10-27T04:25:42Z', 'Elnore');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (16, '2019-11-18T13:18:02Z', '2019-01-30T20:16:06Z', 'Velma');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (17, '2019-09-30T04:07:08Z', '2019-07-24T16:55:29Z', 'Lilyan');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (18, '2019-01-18T13:10:45Z', '2019-04-27T08:19:14Z', 'Alica');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (19, '2019-10-10T12:38:54Z', '2019-01-13T19:28:14Z', 'Rasia');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (20, '2019-02-07T00:17:14Z', '2019-06-24T03:30:55Z', 'Austina');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (21, '2019-10-23T20:16:55Z', '2019-08-27T23:04:51Z', 'Morgana');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (22, '2019-04-07T18:44:18Z', '2019-09-26T19:09:13Z', 'Tomasina');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (23, '2019-04-23T13:32:56Z', '2019-10-26T15:55:24Z', 'Cynthy');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (24, '2018-11-22T21:25:54Z', '2019-10-01T17:48:13Z', 'Helga');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (25, '2019-05-16T16:48:31Z', '2019-06-23T20:14:46Z', 'Horatius');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (26, '2019-05-06T13:40:31Z', '2019-05-24T17:25:56Z', 'Erina');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (27, '2019-11-15T16:47:02Z', '2019-10-06T05:32:26Z', 'Ursulina');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (28, '2019-10-22T11:24:15Z', '2019-04-29T01:03:16Z', 'Gael');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (29, '2019-09-04T12:54:31Z', '2019-11-07T19:51:54Z', 'Inge');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (30, '2019-06-13T22:53:51Z', '2019-07-06T08:33:39Z', 'Barnett');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (31, '2019-11-07T08:01:45Z', '2018-12-06T03:47:28Z', 'Pietrek');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (32, '2019-07-12T12:52:18Z', '2018-12-12T06:14:42Z', 'Lynnelle');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (33, '2019-02-12T03:52:37Z', '2019-08-21T21:59:31Z', 'Esmeralda');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (34, '2019-01-24T16:15:44Z', '2019-04-14T02:53:16Z', 'Cynthia');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (35, '2019-02-16T01:14:42Z', '2018-12-31T11:52:02Z', 'Cathie');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (36, '2019-06-28T09:26:23Z', '2019-01-06T12:05:28Z', 'Gianni');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (37, '2018-12-31T05:34:15Z', '2019-04-24T18:30:13Z', 'Dolph');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (38, '2018-12-27T16:30:17Z', '2019-08-10T18:54:35Z', 'Colver');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (39, '2019-03-17T20:40:05Z', '2019-05-10T03:56:24Z', 'Ogden');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (40, '2019-01-22T06:47:36Z', '2019-10-17T20:17:26Z', 'Adam');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (41, '2019-07-09T17:42:59Z', '2019-07-15T00:15:28Z', 'Avram');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (42, '2019-02-12T14:55:03Z', '2019-02-10T06:55:15Z', 'William');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (43, '2019-11-16T17:19:35Z', '2019-07-22T04:11:26Z', 'Codie');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (44, '2019-04-01T07:04:24Z', '2019-09-09T09:55:41Z', 'Aili');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (45, '2019-02-04T07:29:44Z', '2019-06-07T13:38:37Z', 'Gus');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (46, '2019-05-25T10:49:43Z', '2018-11-28T23:32:00Z', 'Ermengarde');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (47, '2019-11-06T06:54:40Z', '2019-07-26T12:45:19Z', 'Bren');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (48, '2019-10-29T22:10:14Z', '2019-01-20T17:04:57Z', 'Kaye');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (49, '2019-09-16T15:56:46Z', '2019-02-08T22:05:38Z', 'Pru');
insert into participants (ID, CREATED_DATE, LAST_MODIFIED_DATE, NAME) values (50, '2019-02-24T23:32:10Z', '2019-01-04T23:40:34Z', 'Leoine');

-- Inserting Data into PARTICIPANTS_TALKS
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 1);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 2);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 3);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 4);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 5);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 6);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 7);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 8);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 9);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 10);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 11);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 12);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 13);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 14);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 15);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 16);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 17);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 18);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 19);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 20);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 21);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 22);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 23);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 24);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 25);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 26);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 27);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 28);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 29);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 30);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 31);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 32);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 33);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 34);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 35);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 36);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 37);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 38);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 39);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 40);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 41);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 42);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 43);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 44);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 45);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 46);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (4, 47);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (2, 48);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (1, 49);
insert into PARTICIPANTS_TALKS  (TALK_ID, PARTICIPANT_ID) values (3, 50);