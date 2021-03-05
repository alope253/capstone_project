INSERT INTO users(id, email, first_name, last_name, password, role, username) VALUES
	('10', 'axebeak@axe.beak', 'axe', 'beak', 'axebeak', '1', 'axebeak'),
	('11', 'admin@ad.min', 'admin', 'admin', 'admin', '0', 'admin');


/* Adding Genres */
INSERT INTO genre(id, name, description) VALUES
	('1', 'Pop Rock', 'Upbeat variety of rock music'),
	('2', 'Baroque Pop', 'Rock music with classic music elements'),
	('3', 'Alternative Rock', 'Smaler, indipendent rock productions'),
	('4', 'Hip Hop', 'Stylized rhythmic music with similar vocals'),
	('5', 'R&B', 'Drom-backed music with smooth vocals'),
	('6', 'Electropop', 'Pop music relying heavily on electronic sounds'),
	('7', 'Pop', 'Accessible, commercialized music'),
	('8', 'Emo','Rock genre focusing on confessional, emotional lyrics');

/* Adding Artists */
INSERT INTO artist(id, artist_name) VALUES
	('1', 'Panic! At the Disco'),
	('2', 'J Cole'),
	('3', 'The Weeknd'),
	('4', 'Death Cab for Cutie');

/* Adding genre/artist relations */
INSERT INTO artist_genre(artist_id, genre_id) VALUES
	('1', '1'),
	('1', '2'),
	('1', '3'),
	('2', '4'),
	('3', '5'),
	('3', '6'),
	('3', '7'),
	('2', '7'),
	('4', '3'),
	('4', '8');

/* Adding Albums */
INSERT INTO product(id, title, price, release_date, description, product_type, artist_id) VALUES
	('100', 'Death of a Bachelor', '10.99', '2016-01-05', '', '0', '1'),
	('200', '2014 Forest Hills Drive', '12.99', '2014-12-09', '', '0', '2'),
	('300', 'After Hours', '12.99', '2020-03-20', '', '0', '3'),
	('400', 'Transatlanticism', '7.99', '2003-10-07', '', '0', '4');

/* Adding Songs */
INSERT INTO product(id, description, price, release_date, title, product_type, artist_id) VALUES
	('11', 'Alright alright', '1.25', '2015-09-29', 'Victorious', '1', '1'),
	('12', 'Tonight we are victorious', '1.25', '2015-12-31', 'Don''t Threaten Me with a Good Time', '1', '1'),
	('13', 'Oh, a moment you''ll never remember', '1.25', '2015-04-20', 'Hallelujah', '1', '1'),
	('14', 'Finders keepers, loosers weepers', '1.25', '2015-10-21', 'Emperor''s New Clothes', '1', '1'),
	('15', 'Do I Look Lonely?', '1.25', '2015-12-09', 'Death of a Bachelor', '1', '1'),
	('16', 'You can set yourself on fire', '1.25', '2015-01-15', 'Crazy=Genius', '1', '1'),
	('17', 'You got two black eyes from lovin'' too hard', '1.25', '2015-11-26', 'LA Devotee', '1', '1'),
	('18', 'I found a pile of Polaroids', '1.25', '2016-01-05', 'Golden Days', '1', '1'),
	('19', 'The good, the bad, and the dirty', '1.25', '2016-01-05', 'The Good, the Bad and the Dirty', '1', '1'),
	('20', 'If you''re a lover, you should know', '1.25', '2016-01-05', 'House of Memories', '1', '1'),
	('21', 'There''s no sunshine', '1.25', '2016-01-05', 'Impossible Year', '1', '1'),
	('22', 'Do you wanna, do you wanna be', '1.50', '2014-12-09', 'Intro', '1', '2'),
	('23', 'The real is back, the ville is back', '1.50', '2014-12-09', 'January 28th', '1', '2'),
	('24', 'Cole, Cole world', '1.50', '2014-12-09', 'Wet Dreamz', '1', '2'),
	('25', 'I grew up, a fuckin'' screw up', '1.50', '2014-12-09', '03'' Adolescence', '1', '2'),
	('26', 'Since a youngin'' always dreamed of gettin'' rich', '1.50', '2014-12-09', 'A Tale of 2 Citiez', '1', '2'),
	('27', 'Nigga why you actin'' like a ho?', '1.50', '2014-12-09', 'Fire Squad', '1', '2'),
	('28', 'Roll up and smoke my sins away', '1.50', '2014-12-09', 'St. Tropez', '1', '2'),
	('29', 'Hollywood Cole, Go', '1.50', '2014-12-09', 'G.O.M.D.', '1', '2'),
	('30', 'First things first rest in peace Uncle Phil', '1.50', '2014-12-09', 'No Role Modelz', '1', '2'),
	('31', 'Hello, hello, hello', '1.50', '2014-12-09', 'Hello', '1', '2'),
	('32', 'Oh right, oh', '1.50', '2014-12-09', 'Apparently', '1', '2'),
	('33', 'Love yours', '1.50', '2014-12-09', 'Love Yourz', '1', '2'),
	('34', 'And wherever we go', '1.50', '2014-12-09', 'Note to Self', '1', '2'),
	('35', 'Take off my disguise', '1.75', '2020-03-20', 'Alone Again', '1', '3'),
	('36', 'No-no, no-no, no-no-no', '1.75', '2020-03-20', 'Too Late', '1', '3'),
	('37', 'You try with me so many times, yeah', '1.75', '2020-03-20', 'Hardest to Love', '1', '3'),
	('38', 'When I saw the signs, I shoulda let you go', '1.75', '2020-03-08', 'Scared to Live', '1', '3'),
	('39', 'I used to pray when I was 16', '1.75', '2020-03-20', 'Snowchild', '1', '3'),
	('40', 'You pillow talk to me about the men who try to get in between us', '1.75', '2020-03-20', 'Escape from LA', '1', '3'),
	('41', 'I shouldn''t rush it', '1.75', '2019-11-27', 'Heartless', '1', '3'),
	('42', 'No, no, no, no, no-no', '1.75', '2020-03-20', 'Faith', '1', '3'),
	('43', 'Yeah, I''ve been tryin'' to call', '1.75', '2019-11-29', 'Blinding Lights', '1', '3'),
	('44', 'Oh, yeah, I just pretend that I''m in the dark', '1.75', '2020-03-20', 'In Your Eyes', '1', '3'),
	('45', 'Ooh, Yeah, I saw you dancing in a crowded room', '1.75', '2020-03-20', 'Save Your Tears', '1', '3'),
	('46', 'You don''t love him, you don''t love him', '1.75', '2020-03-20', 'Repeat After Me', '1', '3'),
	('47', 'Thought I almost died, in my dream again', '1.75', '2020-02-19', 'After Hours', '1', '3'),
	('48', 'I can''t move, I''m so paralyzed', '1.75', '2020-03-20', 'Until I Bleed Out', '1', '3'),
	('49', 'So this is the new year', '1.00', '2003-10-07', 'The New Year', '1', '4'),
	('50', 'There''s a tear in the fabric', '1.00', '2003-10-07', 'Lightness', '1', '4'),
	('51', 'The glove compartment is inaccurately named', '1.00', '2003-10-07', 'Title and Registration', '1', '4'),
	('52', 'Sometimes I think this cycle never ends', '1.00', '2003-10-07', 'Expo ''86', '1', '4'),
	('53', 'I''ve got a hunger, twisting my stomach into knots', '1.00', '2003-12-26', 'The Sound of Settling', '1', '4'),
	('54', 'This is the moment that you know', '1.00', '2003-10-07', 'Tiny Vessels', '1', '4'),
	('55', 'The Atlantic was born today, and I''ll tell you how', '1.00', '2003-10-07', 'Transatlanticism', '1', '4'),
	('56', ' I roll the window down', '1.00', '2003-10-07', 'Passenger Seat', '1', '4'),
	('57', 'You were the mother of three girls so sweet', '1.00', '2003-10-07', 'Death of an Interior Decorator', '1', '4'),
	('58', 'God bless the daylight', '1.00', '2003-10-07', 'We Looked Like Giants', '1', '4'),
	('59', 'And when I see you', '1.00', '2003-10-07', 'A Lack of Color', '1', '4');

INSERT INTO product_genre(product_id, genre_id) VALUES
	('11', '1'), ('11', '2'), ('11', '3'), ('12', '1'), ('12', '2'), 
	('13', '1'), ('13', '3'), ('14', '1'), ('14', '2'), ('15', '3'), 
	('16', '1'), ('16', '2'), ('17', '2'), ('17', '3'), ('18', '1'), 
	('19', '2'), ('19', '1'), ('20', '1'), ('21', '2'),
	('22', '4'), ('24', '4'), ('25', '4'), ('26', '4'), ('27', '4'), 
	('28', '4'), ('29', '4'), ('30', '4'), ('31', '4'), ('32', '4'), 
	('33', '4'), ('34', '4'), 
	('35', '5'), ('35', '6'), ('35', '7'), ('36', '5'), ('36', '6'), 
	('37', '5'), ('37', '7'), ('38', '6'), ('38', '7'), ('39', '5'), 
	('40', '6'), ('41', '7'), ('42', '7'), ('42', '6'), ('42', '5'),
	('43', '7'), ('43', '6'), ('44', '7'), ('44', '5'), ('45', '6'), 
	('45', '5'), ('46', '7'), ('47', '6'), ('48', '5'),
	('49', '3'), ('49', '8'), ('50', '3'), ('51', '8'), ('52', '3'), 
	('52', '8'), ('53', '3'), ('54', '8'), ('55', '3'), ('55', '8'), 
	('56', '3'), ('57', '8'), ('58', '3'), ('59', '8');
	
	