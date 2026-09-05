package com.example.primepuzzles;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions(
            String category,
            int level) {

        List<Question> questions =
                new ArrayList<>();

        // UPSC
        if (category.equals("UPSC")) {

            if (level == 1) {

                questions.add(new Question(
                        "Who is known as the Father of the Indian Constitution?",
                        "Mahatma Gandhi",
                        "B. R. Ambedkar",
                        "Jawaharlal Nehru",
                        "Sardar Patel",
                        2
                ));

                questions.add(new Question(
                        "The Constitution of India came into effect on:",
                        "15 August 1947",
                        "26 January 1950",
                        "26 November 1949",
                        "2 October 1950",
                        2
                ));

                questions.add(new Question(
                        "Who was the first President of India?",
                        "Dr. Rajendra Prasad",
                        "Jawaharlal Nehru",
                        "S. Radhakrishnan",
                        "Sardar Patel",
                        1
                ));

                questions.add(new Question(
                        "Which body is known as the guardian of the Constitution?",
                        "Parliament",
                        "Supreme Court",
                        "President",
                        "Election Commission",
                        2
                ));

                questions.add(new Question(
                        "Who appoints the Prime Minister of India?",
                        "Chief Justice",
                        "President",
                        "Lok Sabha Speaker",
                        "Vice President",
                        2
                ));

                questions.add(new Question(
                        "How many Fundamental Rights are currently guaranteed by the Indian Constitution?",
                        "5",
                        "6",
                        "7",
                        "8",
                        2
                ));

                questions.add(new Question(
                        "The Indian Constitution was adopted on:",
                        "15 August 1947",
                        "26 January 1950",
                        "26 November 1949",
                        "2 October 1949",
                        3
                ));

                questions.add(new Question(
                        "Which house of Parliament is also called the House of the People?",
                        "Rajya Sabha",
                        "Lok Sabha",
                        "Vidhan Sabha",
                        "Vidhan Parishad",
                        2
                ));

                questions.add(new Question(
                        "What is the minimum age to become the President of India?",
                        "25 years",
                        "30 years",
                        "35 years",
                        "40 years",
                        3
                ));

                questions.add(new Question(
                        "Who is the constitutional head of India?",
                        "Prime Minister",
                        "President",
                        "Chief Justice",
                        "Home Minister",
                        2
                ));
            }


            if (level == 2) {

                questions.add(new Question(
                        "Which Article deals with equality before law?",
                        "Article 12",
                        "Article 14",
                        "Article 16",
                        "Article 21",
                        2
                ));

                questions.add(new Question(
                        "Which Article is related to protection of life and personal liberty?",
                        "Article 14",
                        "Article 19",
                        "Article 21",
                        "Article 32",
                        3
                ));

                questions.add(new Question(
                        "Who was the Chairman of the Drafting Committee?",
                        "Jawaharlal Nehru",
                        "B. R. Ambedkar",
                        "Rajendra Prasad",
                        "Sardar Patel",
                        2
                ));

                questions.add(new Question(
                        "The Directive Principles of State Policy were inspired by the Constitution of:",
                        "USA",
                        "Ireland",
                        "Canada",
                        "Australia",
                        2
                ));

                questions.add(new Question(
                        "Fundamental Duties were added by which amendment?",
                        "42nd Amendment",
                        "44th Amendment",
                        "73rd Amendment",
                        "86th Amendment",
                        1
                ));

                questions.add(new Question(
                        "The Rajya Sabha is a:",
                        "Temporary House",
                        "Permanent House",
                        "State House",
                        "Judicial House",
                        2
                ));

                questions.add(new Question(
                        "Who presides over the Lok Sabha?",
                        "President",
                        "Vice President",
                        "Speaker",
                        "Prime Minister",
                        3
                ));

                questions.add(new Question(
                        "The Supreme Court of India is located in:",
                        "Mumbai",
                        "New Delhi",
                        "Kolkata",
                        "Chennai",
                        2
                ));

                questions.add(new Question(
                        "What is the maximum strength of the Lok Sabha?",
                        "545",
                        "550",
                        "552",
                        "560",
                        3
                ));

                questions.add(new Question(
                        "Which amendment lowered the voting age from 21 to 18?",
                        "42nd",
                        "44th",
                        "61st",
                        "73rd",
                        3
                ));
            }

        }


        // MPSC
        else if (category.equals("MPSC")) {

            if (level == 1) {

                questions.add(new Question(
                        "What is the capital of Maharashtra?",
                        "Mumbai",
                        "Pune",
                        "Nagpur",
                        "Nashik",
                        1
                ));

                questions.add(new Question(
                        "Which city is known as the cultural capital of Maharashtra?",
                        "Mumbai",
                        "Pune",
                        "Nagpur",
                        "Kolhapur",
                        2
                ));

                questions.add(new Question(
                        "Who founded the Maratha Empire?",
                        "Chhatrapati Shivaji Maharaj",
                        "Sambhaji Maharaj",
                        "Bajirao I",
                        "Balaji Vishwanath",
                        1
                ));

                questions.add(new Question(
                        "Which sea lies to the west of Maharashtra?",
                        "Arabian Sea",
                        "Bay of Bengal",
                        "Indian Ocean",
                        "Red Sea",
                        1
                ));

                questions.add(new Question(
                        "Which is the highest peak in Maharashtra?",
                        "Kalsubai",
                        "Mahabaleshwar",
                        "Torna",
                        "Rajgad",
                        1
                ));

                questions.add(new Question(
                        "Which river is known as the lifeline of Maharashtra?",
                        "Godavari",
                        "Krishna",
                        "Bhima",
                        "Tapi",
                        1
                ));

                questions.add(new Question(
                        "Which city is famous for the Deekshabhoomi?",
                        "Nagpur",
                        "Pune",
                        "Mumbai",
                        "Nashik",
                        1
                ));

                questions.add(new Question(
                        "Which festival is widely celebrated in Maharashtra?",
                        "Ganesh Chaturthi",
                        "Onam",
                        "Bihu",
                        "Pongal",
                        1
                ));

                questions.add(new Question(
                        "Which fort is associated with Chhatrapati Shivaji Maharaj?",
                        "Red Fort",
                        "Raigad Fort",
                        "Agra Fort",
                        "Golconda Fort",
                        2
                ));

                questions.add(new Question(
                        "Which language is primarily spoken in Maharashtra?",
                        "Hindi",
                        "Gujarati",
                        "Marathi",
                        "Kannada",
                        3
                ));
            }

        }


        // Science
        else if (category.equals("Science")) {

            if (level == 1) {

                questions.add(new Question(
                        "Which planet is known as the Red Planet?",
                        "Earth",
                        "Mars",
                        "Jupiter",
                        "Venus",
                        2
                ));

                questions.add(new Question(
                        "What is the chemical formula of water?",
                        "CO2",
                        "O2",
                        "H2O",
                        "NaCl",
                        3
                ));

                questions.add(new Question(
                        "Which gas do plants absorb from the atmosphere?",
                        "Oxygen",
                        "Nitrogen",
                        "Carbon Dioxide",
                        "Hydrogen",
                        3
                ));

                questions.add(new Question(
                        "What is the largest organ in the human body?",
                        "Heart",
                        "Brain",
                        "Skin",
                        "Liver",
                        3
                ));

                questions.add(new Question(
                        "How many bones are there in an adult human body?",
                        "196",
                        "206",
                        "216",
                        "226",
                        2
                ));

                questions.add(new Question(
                        "Which is the nearest star to Earth?",
                        "Moon",
                        "Mars",
                        "Sun",
                        "Venus",
                        3
                ));

                questions.add(new Question(
                        "What force keeps us on the ground?",
                        "Magnetic force",
                        "Gravitational force",
                        "Frictional force",
                        "Electric force",
                        2
                ));

                questions.add(new Question(
                        "Which vitamin is produced when skin is exposed to sunlight?",
                        "Vitamin A",
                        "Vitamin B",
                        "Vitamin C",
                        "Vitamin D",
                        4
                ));

                questions.add(new Question(
                        "What is the boiling point of water at sea level?",
                        "50°C",
                        "75°C",
                        "100°C",
                        "150°C",
                        3
                ));

                questions.add(new Question(
                        "Which organ pumps blood throughout the body?",
                        "Lungs",
                        "Brain",
                        "Heart",
                        "Kidney",
                        3
                ));
            }

        }


        // Computer & Technology
        else if (category.equals("Computer & Technology")) {

            if (level == 1) {

                questions.add(new Question(
                        "What does CPU stand for?",
                        "Central Processing Unit",
                        "Computer Personal Unit",
                        "Central Program Utility",
                        "Control Processing Unit",
                        1
                ));

                questions.add(new Question(
                        "Which language is used in this Android application?",
                        "Python",
                        "Java",
                        "PHP",
                        "SQL",
                        2
                ));

                questions.add(new Question(
                        "What does RAM stand for?",
                        "Random Access Memory",
                        "Read Access Memory",
                        "Rapid Application Memory",
                        "Run Access Module",
                        1
                ));

                questions.add(new Question(
                        "Which device is used to enter text into a computer?",
                        "Monitor",
                        "Keyboard",
                        "Speaker",
                        "Printer",
                        2
                ));

                questions.add(new Question(
                        "What does URL stand for?",
                        "Uniform Resource Locator",
                        "Universal Resource Link",
                        "Uniform Reference Link",
                        "Universal Routing Locator",
                        1
                ));

                questions.add(new Question(
                        "Which one is an operating system?",
                        "Google",
                        "Windows",
                        "Chrome",
                        "Facebook",
                        2
                ));

                questions.add(new Question(
                        "Which language is mainly used to style web pages?",
                        "HTML",
                        "CSS",
                        "SQL",
                        "Python",
                        2
                ));

                questions.add(new Question(
                        "What does HTML stand for?",
                        "Hyper Text Markup Language",
                        "High Text Machine Language",
                        "Hyperlink Text Management Language",
                        "Home Tool Markup Language",
                        1
                ));

                questions.add(new Question(
                        "Which company develops Android?",
                        "Microsoft",
                        "Google",
                        "Apple",
                        "IBM",
                        2
                ));

                questions.add(new Question(
                        "What is Git mainly used for?",
                        "Video editing",
                        "Version control",
                        "Photo editing",
                        "Database management",
                        2
                ));
            }

        }

        return questions;
    }
}