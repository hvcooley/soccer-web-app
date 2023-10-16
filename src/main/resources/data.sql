--Users
INSERT INTO SOCCER_APP_USER (user_id, email, first_name, last_name, password, role) VALUES (1, 'harrison_v_cooley@me.com', 'Harrison', 'Cooley', 'password', 'Admin');
INSERT INTO SOCCER_APP_USER (user_id, email, first_name, last_name, password, role) VALUES (2, 'leo_cooley@me.com', 'Leo', 'Cooley', 'password', 'Coach');
INSERT INTO SOCCER_APP_USER (user_id, email, first_name, last_name, password, role) VALUES (3, 'steven_hadley@me.com', 'Steven', 'Hadley', 'password', 'Coach');


--Players
INSERT INTO PLAYER (player_id, first_name, last_name, team_id, jersey_number, soccer_position) VALUES (1, 'Claudio', 'Marchisio', 1, 8, 'Center Mid');
INSERT INTO PLAYER (player_id, first_name, last_name, team_id, jersey_number, soccer_position) VALUES (2, 'Giorgio', 'Chiellini', 1, 3, 'Center Back');
INSERT INTO PLAYER (player_id, first_name, last_name, team_id, jersey_number, soccer_position) VALUES (3, 'Andrea', 'Pirlo', 1, 21, 'Center Mid');
INSERT INTO PLAYER (player_id, first_name, last_name, team_id, jersey_number, soccer_position) VALUES (4, 'Gianluigi', 'Buffon', 1, 1, 'Goalie');
INSERT INTO PLAYER (player_id, first_name, last_name, team_id, jersey_number, soccer_position) VALUES (5, 'Arturo', 'Vidal', 1, 23, 'Center Mid');


--Teams
INSERT INTO TEAM (team_id, owner_id, team_name) VALUES (1, 1, 'My Juventus 2014 team');
INSERT INTO TEAM (team_id, owner_id, team_name) VALUES (2, 1, 'My Favorite team');
INSERT INTO TEAM (team_id, owner_id, team_name) VALUES (3, 1, 'My Team of Friends');


--Lineups
INSERT INTO LINEUP (lineup_id, lineup_name, creation_date, team_id, formation, owner_id) VALUES (1, 'Game against Milan', '2022-12-31', 1, '3-5-2', 1);
