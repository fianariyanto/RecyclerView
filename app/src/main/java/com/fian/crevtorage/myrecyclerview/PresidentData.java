package com.fian.crevtorage.myrecyclerview;

import java.util.ArrayList;

public class PresidentData{
    public static String[][] data = new String[][]{
    /*      {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_the_Philippines.svg/125px-Flag_of_the_Philippines.svg.png"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
*/
            {"Arsene Wenger", "Manager", "https://static.foba1.com/bilder/spieler/gross/4289.jpg","France",
            "He is a French football manager and former player. He has been the manager of Arsenal since October 1996, where he has since become the club's longest-serving manager and most successful in terms of major titles won. Football pundits give Wenger credit for his contribution to the revolutionising of football in England in the late 1990s through the introduction of changes in the training and diet of players."},
            {"Steve Bould", "Asst. Manager", "https://static.foba1.com/bilder/spieler/gross/30541.jpg","England",
                    "He is an English former professional footballer and assistant manager of Premier League side Arsenal. As a player, he was a defender from 1980 until 2000. Bould began his football career with his hometown club Stoke City where he gained a reputation as an impressive young defender. After spending seven seasons with the Potters, and becoming one of English football's most coveted centre-backs, he moved to Arsenal in 1988. At Highbury he formed a formidable back line with Tony Adams, Nigel Winterburn and his former Stoke teammate Lee Dixon and ended up with nine major honours to his name. "},
            {"Petr Cech", "Goalkeeper", "https://static.foba1.com/bilder/spieler/gross/7965.jpg","Czech Republic",
                    " He is the former captain for the Czech Republic national team. Čech has previously played for Chmel Blšany, Sparta Prague, Rennes and Chelsea. He is the most capped player in the history of the Czech national team with 124 caps, and represented the country at the 2006 World Cup, as well as the 2004, 2008, 2012, and 2016 European Championships. He was voted into the Euro 2004 all-star team after helping the Czechs reach the semi-finals. "},
            {"Laurent Koscielny", "Defender", "https://static.foba1.com/bilder/spieler/gross/59488.jpg","France",
                    "Koscielny was born in the city of Tulle and began his football career playing for a host of amateur and youth clubs such as Brive, Tulle Corrèze and Limoges. In 2003, he moved to Guingamp, where he made his professional debut the following year. Koscielny joined Tours for an undisclosed fee to play in the third tier of the French league in 2007 and enjoyed promotion with his new side before being named in the Ligue 2 Team of the Season the following campaign.In 2009, newly promoted Ligue 1 side Lorient signed Koscielny for around €1.7 million, and his performances caught the eye of Arsenal manager Arsène Wenger, who signed him in 2010. Since then, he is regarded as one of the best players in his position in the Premier League."},
            {"Per Mertesacker", "Defender", "https://static.foba1.com/bilder/spieler/gross/11758.jpg","Germany",
                    "He also played for the Germany national team but retired in August 2014 after winning the World Cup.Mertesacker is a youth product of Hannover 96 and he made his senior league debut in November 2003. He was soon dubbed \"the Defence Pole\" (\"die Abwehrlatte\") by German tabloids and gained a reputation for his good disciplinary record, going 31 Bundesliga games without being booked.Since joining Arsenal, their fans have nicknamed him \"the BFG\", which is short for \"Big Fucking German\" and an allusion to Roald Dahl's The BFG due to his height.He has been described as an imposing, reliable, dominant and an accomplished defender."},
            {"Shkodran Mustafi", "Defender", "https://static.foba1.com/bilder/spieler/gross/151551.jpg","Germany",
                    "He began his career in the youth ranks of Hamburger SV and English club Everton, where he made one substitute appearance in two-and-a-half-years before leaving to Sampdoria in January 2012. He signed a five-year deal at Valencia in August 2014, and moved to Arsenal for a reported £35 million two years later.Mustafi made his full international debut against Poland on 13 May 2014, and was part of the German teams that won the 2014 FIFA World Cup and the 2017 FIFA Confederations Cup, also competing at UEFA Euro 2016."},
            {"Granit Xhaka", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/166663.jpg","Switzerland",
                    "Xhaka began his career at hometown club Basel, winning the Swiss Super League in each his first two seasons. He then moved to Bundesliga team Borussia Mönchengladbach in 2012, developing a reputation as a technically gifted player and natural leader alongside criticism for his temperament.He was made captain of Borussia Mönchengladbach in 2015 at the age of 22, leading the team to UEFA Champions' League qualification for a second successive season.He completed a high-profile transfer to Arsenal in May 2016 for a fee in the region of £30 million."},
            {"Santi Cazorla", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/18086.jpg","Spain",
                    "He also plays for Spain national team as an attacking midfielder who can also play as a winger and a central midfielding role, Cazorla is noted for his speed, shooting accuracy, capacity to change the rhythm of gameplay and excellent close control. He was ranked as the tenth-best footballer in Europe by Bloomberg in 2013. Cazorla spent most of the first half of his professional career with Villarreal, amassing La Liga totals of 253 games and 39 goals over the course of nine seasons. He also represented Recreativo de Huelva, where he won the Spanish Footballer of the Year award for the 2006–07 campaign. In 2012, he signed for Arsenal from Málaga, quickly making an impact in the first team in his first year at the club with 13 assists, after which he was voted Arsenal Player of the Season."},
            {"Aaron Ramsey", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/94953.jpg","Wales",
                    "Ramsey mainly plays as a box-to-box midfielder, but has also been deployed on the left and right wings. He played as a schoolboy for Cardiff City, where he spent eight years in youth football, became the club's youngest ever first team player, and made 22 appearances for the senior team – including the 2008 FA Cup Final. Ramsey moved to Arsenal in 2008 in a £5 million deal, where he quickly gained first team experience. However, his career stalled significantly after he suffered a broken leg in a match against Stoke City in February 2010."},
            {"Mesut Ozil", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/43165.jpg","Germany",
                    "Özil plays mostly as an attacking midfielder, but can also be deployed as a winger. He began his senior career as a member of his hometown club Schalke 04 in the Bundesliga, departing two seasons later to join Werder Bremen for €5 million. He garnered breakout attention at the 2010 FIFA World Cup, where at age 22, Özil was instrumental in the side's campaign where they reached the semi-finals, losing to eventual champions Spain. He was also nominated for the Golden Ball Award, as well as being ranked first in assists in major European and domestic competitions with 25. This garnered him a €15 million transfer to La Liga club Real Madrid."},
            {"Mohammed Elneny", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/230658.jpg","Egypt",
                    "He began his senior career at El Mokawloon and moved to Basel in January 2013. He won eight honours at Basel, including the Swiss Super League in each of his four seasons. In January 2016, he was transferred to Arsenal. Elneny competed at the 2012 Summer Olympics for the Egyptian Under-23 team."},
            {"Francis Coquelin", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/151536.jpg","France",
                    "Born in Laval, Mayenne, Coquelin began his career playing for AS Laval Bourny before departing in 2005 for the biggest club in the commune, Stade Lavallois. Coquelin spent three years at the club before being spotted by renowned Arsenal scout Gilles Grimandi, while on international duty, playing in a 2008 UEFA European Under-17 Football Championship elite round qualification match against Israel. "},
            {"Theo Walcott", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/42606.jpg","England",
                    "Walcott is a product of the Southampton Academy and started his career with Southampton before joining Arsenal for £5 million in 2006. His speedy pace and ball crossing led his manager Arsène Wenger to deploy him on the wing for most of his career. Walcott has been played as a striker since the 2012–13 season when he was Arsenal's top scorer, and he has scored more than 100 goals for the club. "},
            {"Danny Welbeck", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/113762.jpg","England",
                    "Welbeck made his way through the youth teams at Manchester United before making his senior debut in 2008 and scoring in the process. He was with United when they won the 2008–09 League Cup and the 2008 FIFA Club World Cup before being sent on loan to Preston North End and more recently Sunderland. From the 2011–12 season, Welbeck was a regular figure in the Manchester United first team. He was transferred to Arsenal in September 2014 for a £16 million fee."},
            {"Alexis Sánchez", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/50628.jpg","Chile",
                    "Sánchez began his career as a youth player for Cobreloa at age 17, completing a season at the club before relocating to Italy to play for Udinese in 2006. He won his first trophies in the following seasons, winning consecutive league titles in loans spells to Colo-Colo and River Plate. In 2008, he returned to Udinese, becoming an integral member of the team in his first full season at the club. After three fruitful seasons in Italy, Sánchez moved to FC Barcelona in a transfer worth €30 million (£25 million), becoming the most expensive Chilean player of all time."},
            {"Olivier Giroud", "Midfielder", "https://static.foba1.com/bilder/spieler/gross/59947.jpg","France",
                    "He began his career at Grenoble in Ligue 2 before joining Tours in 2008. In his second season at Tours, he was the division's top scorer with 21 goals, earning him a move to top-flight side Montpellier. Giroud was again the top scorer with 21 goals in the 2011–12 season, giving the club their first ever Ligue 1 title before moving to Arsenal. Giroud won the FA Cup with Arsenal in 2014, 2015 and 2017, and is one of only seven players to score 50 Premier League goals for the club.\n" +
                            "\n" +
                            "Giroud made his full international debut for France in 2011. He has earned over 50 caps, and was part of the teams which reached the quarter-finals at UEFA Euro 2012 and the 2014 FIFA World Cup, as well as the final of UEFA Euro 2016, in which he finished as the joint second-highest goalscorer of the competition, and was awarded the Bronze Boot."}

    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            president = new President();
            president.setName(data[i][0]);
            president.setRemarks(data[i][1]);
            president.setPhoto(data[i][2]);
            president.setNationality(data[i][3]);
            president.setDesc(data[i][4]);
            list.add(president);
        }

        return list;
    }
}