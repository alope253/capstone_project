/*
INSERT INTO genre(genre_id, name, description) VALUES
	('1', 'Pop Rock', 'Upbeat variety of rock music'),
	('2', 'Baroque Pop', 'Rock music with classic music elements'),
	('3', 'Alternative Rock', 'Smaler, indipendent rock productions'),
	('4', 'Hip Hop', 'Stylized rhythmic music with similar vocals'),
	('5', 'R&B', 'Drom-backed music with smooth vocals'),
	('6', 'Electropop', 'Pop music relying heavily on electronic sounds'),
	('7', 'Pop', 'Accessible, commercialized music'),
	('8','Emo','Rock genre focusing on confessional, emotional lyrics');

INSERT INTO album(album_id, title, price, release_date) VALUES
	('1', 'Death of a Bachelor', '10.99', '2016-01-05'),
	('2', '2014 Forest Hills Drive', '12.99', '2014-12-09'),
	('3', 'After Hours', '12.99', '2020-03-20'),
	('4', 'Transatlanticism', '7.99', '2003-10-07');
	
INSERT INTO artist(artist_id, artist_name) VALUES
	('1', 'Panic! At the Disco'),
	('2', 'J Cole'),
	('3', 'The Weeknd'),
	('4', 'Death Cab for Cutie');
	
INSERT INTO song(song_id, description, price, release_date, title, artist_artist_id) VALUES
	('1', 'Alright alright', '1.25', '2015-09-29', 'Victorious', '1'),
	('2', 'Tonight we are victorious', '1.25', '2015-12-31', 'Don''t Threaten Me with a Good Time', '1'),
	('3', 'Oh, a moment you''ll never remember', '1.25', '2015-04-20', 'Hallelujah', '1'),
	('4', 'Finders keepers, loosers weepers', '1.25', '2015-10-21', 'Emperor''s New Clothes', '1'),
	('5', 'Do I Look Lonely?', '1.25', '2015-12-09', 'Death of a Bachelor', '1'),
	('6', 'You can set yourself on fire', '1.25', '2015-01-15', 'Crazy=Genius', '1'),
	('7', 'You got two black eyes from lovin'' too hard', '1.25', '2015-11-26', 'LA Devotee', '1'),
	('8', 'I found a pile of Polaroids', '1.25', '2016-01-05', 'Golden Days', '1'),
	('9', 'The good, the bad, and the dirty', '1.25', '2016-01-05', 'The Good, the Bad and the Dirty', '1'),
	('10', 'If you''re a lover, you should know', '1.25', '2016-01-05', 'House of Memories', '1'),
	('11', 'There''s no sunshine', '1.25', '2016-01-05', 'Impossible Year', '1'),
	('12', 'Do you wanna, do you wanna be', '1.50', '2014-12-09', 'Intro', '2'),
	('13', 'The real is back, the ville is back', '1.50', '2014-12-09', 'January 28th', '2'),
	('14', 'Cole, Cole world', '1.50', '2014-12-09', 'Wet Dreamz', '2'),
	('15', 'I grew up, a fuckin'' screw up', '1.50', '2014-12-09', '03'' Adolescence', '2'),
	('16', 'Since a youngin'' always dreamed of gettin'' rich', '1.50', '2014-12-09', 'A Tale of 2 Citiez', '2'),
	('17', 'Nigga why you actin'' like a ho?', '1.50', '2014-12-09', 'Fire Squad', '2'),
	('18', 'Roll up and smoke my sins away', '1.50', '2014-12-09', 'St. Tropez', '2'),
	('19', 'Hollywood Cole, Go', '1.50', '2014-12-09', 'G.O.M.D.', '2'),
	('20', 'First things first rest in peace Uncle Phil', '1.50', '2014-12-09', 'No Role Modelz', '2'),
	('21', 'Hello, hello, hello', '1.50', '2014-12-09', 'Hello', '2'),
	('22', 'Oh right, oh', '1.50', '2014-12-09', 'Apparently', '2'),
	('23', 'Love yours', '1.50', '2014-12-09', 'Love Yourz', '2'),
	('24', 'And wherever we go', '1.50', '2014-12-09', 'Note to Self', '2'),
	('25', 'Take off my disguise', '1.75', '2020-03-20', 'Alone Again', '3'),
	('26', 'No-no, no-no, no-no-no', '1.75', '2020-03-20', 'Too Late', '3'),
	('27', 'You try with me so many times, yeah', '1.75', '2020-03-20', 'Hardest to Love', '3'),
	('28', 'When I saw the signs, I shoulda let you go', '1.75', '2020-03-08', 'Scared to Live', '3'),
	('29', 'I used to pray when I was 16', '1.75', '2020-03-20', 'Snowchild', '3'),
	('30', 'You pillow talk to me about the men who try to get in between us', '1.75', '2020-03-20', 'Escape from LA', '3'),
	('31', 'I shouldn''t rush it', '1.75', '2019-11-27', 'Heartless', '3'),
	('32', 'No, no, no, no, no-no', '1.75', '2020-03-20', 'Faith', '3'),
	('33', 'Yeah, I''ve been tryin'' to call', '1.75', '2019-11-29', 'Blinding Lights', '3'),
	('34', 'Oh, yeah, I just pretend that I''m in the dark', '1.75', '2020-03-20', 'In Your Eyes', '3'),
	('35', 'Ooh, Yeah, I saw you dancing in a crowded room', '1.75', '2020-03-20', 'Save Your Tears', '3'),
	('36', 'You don''t love him, you don''t love him', '1.75', '2020-03-20', 'Repeat After Me', '3'),
	('37', 'Thought I almost died, in my dream again', '1.75', '2020-02-19', 'After Hours', '3'),
	('38', 'I can''t move, I''m so paralyzed', '1.75', '2020-03-20', 'Until I Bleed Out', '3'),
	('39', 'So this is the new year', '1.00', '2003-10-07', 'The New Year', '4'),
	('40', 'There''s a tear in the fabric', '1.00', '2003-10-07', 'Lightness', '4'),
	('41', 'The glove compartment is inaccurately named', '1.00', '2003-10-07', 'Title and Registration', '4'),
	('42', 'Sometimes I think this cycle never ends', '1.00', '2003-10-07', 'Expo ''86', '4'),
	('43', 'I''ve got a hunger, twisting my stomach into knots', '1.00', '2003-12-26', 'The Sound of Settling', '4'),
	('44', 'This is the moment that you know', '1.00', '2003-10-07', 'Tiny Vessels', '4'),
	('45', 'The Atlantic was born today, and I''ll tell you how', '1.00', '2003-10-07', 'Transatlanticism', '4'),
	('46', ' I roll the window down', '1.00', '2003-10-07', 'Passenger Seat', '4'),
	('47', 'You were the mother of three girls so sweet', '1.00', '2003-10-07', 'Death of an Interior Decorator', '4'),
	('48', 'God bless the daylight', '1.00', '2003-10-07', 'We Looked Like Giants', '4'),
	('49', 'And when I see you', '1.00', '2003-10-07', 'A Lack of Color', '4');
	
*/
	
	