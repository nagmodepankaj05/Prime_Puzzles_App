package com.example.primepuzzles;

import java.util.ArrayList;
import java.util.List;

/**
 * Offline question bank for Prime Puzzles.
 * 7 categories × 6 levels × 10 questions = 420 questions.
 * No API, Firebase, database or internet connection is required.
 */
public class QuestionBank {

    public static List<Question> getQuestions(String category, int level) {

        List<Question> questions = new ArrayList<>();

        if (category == null) {
            return questions;
        }

        // =====================================================
        // Each category contains exactly 6 levels.
        // Each level contains exactly 10 questions.
        // =====================================================

        // GENERAL KNOWLEDGE
        if (category.equals("General Knowledge")) {

            if (level == 1) {
                questions.add(new Question(
                        "What is the capital of India?",
                        "New Delhi",
                        "Chennai",
                        "Kolkata",
                        "Mumbai",
                        1
                ));

                questions.add(new Question(
                        "Which is the national animal of India?",
                        "Lion",
                        "Tiger",
                        "Leopard",
                        "Elephant",
                        2
                ));

                questions.add(new Question(
                        "What is the currency of India?",
                        "Rupee",
                        "Dollar",
                        "Yen",
                        "Euro",
                        1
                ));

                questions.add(new Question(
                        "Which is the largest ocean on Earth?",
                        "Arctic Ocean",
                        "Pacific Ocean",
                        "Indian Ocean",
                        "Atlantic Ocean",
                        2
                ));

                questions.add(new Question(
                        "Which planet is known as the Red Planet?",
                        "Jupiter",
                        "Mars",
                        "Mercury",
                        "Venus",
                        2
                ));

                questions.add(new Question(
                        "How many continents are there?",
                        "5",
                        "6",
                        "7",
                        "8",
                        3
                ));

                questions.add(new Question(
                        "What is the national flower of India?",
                        "Jasmine",
                        "Lotus",
                        "Rose",
                        "Sunflower",
                        2
                ));

                questions.add(new Question(
                        "Which is the longest river in India?",
                        "Ganga",
                        "Godavari",
                        "Narmada",
                        "Yamuna",
                        1
                ));

                questions.add(new Question(
                        "Who wrote the Indian national anthem?",
                        "Sarojini Naidu",
                        "Rabindranath Tagore",
                        "Bankim Chandra Chattopadhyay",
                        "Subhas Chandra Bose",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest state of India by area?",
                        "Madhya Pradesh",
                        "Uttar Pradesh",
                        "Rajasthan",
                        "Maharashtra",
                        3
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which is the smallest state of India by area?",
                        "Sikkim",
                        "Goa",
                        "Manipur",
                        "Tripura",
                        2
                ));

                questions.add(new Question(
                        "Which city is known as the Pink City?",
                        "Jodhpur",
                        "Jaipur",
                        "Udaipur",
                        "Bikaner",
                        2
                ));

                questions.add(new Question(
                        "Which is the highest mountain peak in the world?",
                        "Lhotse",
                        "K2",
                        "Mount Everest",
                        "Kangchenjunga",
                        3
                ));

                questions.add(new Question(
                        "What is the national aquatic animal of India?",
                        "Blue Whale",
                        "Turtle",
                        "Crocodile",
                        "Ganges River Dolphin",
                        4
                ));

                questions.add(new Question(
                        "Which Indian state has the longest coastline?",
                        "Gujarat",
                        "Andhra Pradesh",
                        "Tamil Nadu",
                        "Maharashtra",
                        1
                ));

                questions.add(new Question(
                        "Who was the first Indian to win a Nobel Prize?",
                        "C. V. Raman",
                        "Mother Teresa",
                        "Rabindranath Tagore",
                        "Amartya Sen",
                        3
                ));

                questions.add(new Question(
                        "Which organization conducts India's population census?",
                        "Election Commission",
                        "Office of the Registrar General and Census Commissioner",
                        "NITI Aayog",
                        "RBI",
                        2
                ));

                questions.add(new Question(
                        "What is the SI unit of temperature?",
                        "Celsius",
                        "Fahrenheit",
                        "Kelvin",
                        "Joule",
                        3
                ));

                questions.add(new Question(
                        "Which is the largest desert in India?",
                        "Gobi Desert",
                        "Kalahari Desert",
                        "Thar Desert",
                        "Sahara Desert",
                        3
                ));

                questions.add(new Question(
                        "Which Indian city is called the Silicon Valley of India?",
                        "Chennai",
                        "Pune",
                        "Bengaluru",
                        "Hyderabad",
                        3
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which line divides the Earth into Northern and Southern Hemispheres?",
                        "Arctic Circle",
                        "Prime Meridian",
                        "Equator",
                        "Tropic of Cancer",
                        3
                ));

                questions.add(new Question(
                        "Which is the largest freshwater lake in India by surface area?",
                        "Wular Lake",
                        "Loktak Lake",
                        "Dal Lake",
                        "Chilika Lake",
                        1
                ));

                questions.add(new Question(
                        "The Tropic of Cancer passes through how many Indian states?",
                        "7",
                        "6",
                        "9",
                        "8",
                        4
                ));

                questions.add(new Question(
                        "Which is the deepest ocean trench known on Earth?",
                        "Puerto Rico Trench",
                        "Mariana Trench",
                        "Tonga Trench",
                        "Java Trench",
                        2
                ));

                questions.add(new Question(
                        "Which country is known as the Land of the Rising Sun?",
                        "China",
                        "Thailand",
                        "Japan",
                        "South Korea",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state is famous for the Hornbill Festival?",
                        "Mizoram",
                        "Meghalaya",
                        "Nagaland",
                        "Assam",
                        3
                ));

                questions.add(new Question(
                        "Which is the largest island in India?",
                        "Elephanta",
                        "Diu",
                        "Great Nicobar",
                        "Majuli",
                        3
                ));

                questions.add(new Question(
                        "Which gas is most abundant in Earth's atmosphere?",
                        "Argon",
                        "Oxygen",
                        "Carbon dioxide",
                        "Nitrogen",
                        4
                ));

                questions.add(new Question(
                        "What is the study of earthquakes called?",
                        "Geology",
                        "Ecology",
                        "Seismology",
                        "Meteorology",
                        3
                ));

                questions.add(new Question(
                        "Which Indian city is situated on the banks of the Sabarmati River?",
                        "Rajkot",
                        "Surat",
                        "Vadodara",
                        "Ahmedabad",
                        4
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which strait separates India and Sri Lanka?",
                        "Malacca Strait",
                        "Hormuz Strait",
                        "Palk Strait",
                        "Bering Strait",
                        3
                ));

                questions.add(new Question(
                        "Which is the largest planet in the Solar System?",
                        "Jupiter",
                        "Earth",
                        "Neptune",
                        "Saturn",
                        1
                ));

                questions.add(new Question(
                        "Which Indian state is the largest producer of tea?",
                        "Kerala",
                        "West Bengal",
                        "Tamil Nadu",
                        "Assam",
                        4
                ));

                questions.add(new Question(
                        "Which is the only continent through which all lines of longitude pass?",
                        "Europe",
                        "Asia",
                        "Antarctica",
                        "Africa",
                        3
                ));

                questions.add(new Question(
                        "Which country has the largest population in the world?",
                        "India",
                        "Indonesia",
                        "China",
                        "USA",
                        1
                ));

                questions.add(new Question(
                        "Which Indian river is also called Dakshin Ganga?",
                        "Kaveri",
                        "Mahanadi",
                        "Godavari",
                        "Krishna",
                        3
                ));

                questions.add(new Question(
                        "Which is the world's largest hot desert?",
                        "Thar",
                        "Arabian Desert",
                        "Sahara",
                        "Gobi",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state has the largest forest cover by area?",
                        "Chhattisgarh",
                        "Madhya Pradesh",
                        "Arunachal Pradesh",
                        "Odisha",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest internal organ of the human body?",
                        "Lung",
                        "Kidney",
                        "Heart",
                        "Liver",
                        4
                ));

                questions.add(new Question(
                        "Which Indian city is called the City of Lakes?",
                        "Patna",
                        "Lucknow",
                        "Jaipur",
                        "Bhopal",
                        4
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which is the world's largest delta?",
                        "Ganges-Brahmaputra Delta",
                        "Mekong Delta",
                        "Nile Delta",
                        "Mississippi Delta",
                        1
                ));

                questions.add(new Question(
                        "Which Indian pass connects Srinagar with Leh?",
                        "Nathu La",
                        "Shipki La",
                        "Zoji La",
                        "Bara-Lacha La",
                        3
                ));

                questions.add(new Question(
                        "Which is the largest river island in India?",
                        "Diu",
                        "Elephanta",
                        "Majuli",
                        "Srirangam",
                        3
                ));

                questions.add(new Question(
                        "Which country is crossed by both the Equator and the Prime Meridian?",
                        "No country",
                        "Indonesia",
                        "Brazil",
                        "Ghana",
                        1
                ));

                questions.add(new Question(
                        "Which ocean current is a warm current in the North Atlantic?",
                        "Labrador Current",
                        "Peru Current",
                        "Gulf Stream",
                        "Canary Current",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state has the maximum number of districts?",
                        "Maharashtra",
                        "Uttar Pradesh",
                        "Rajasthan",
                        "Madhya Pradesh",
                        2
                ));

                questions.add(new Question(
                        "Which is the world's largest coral reef system?",
                        "Red Sea Reef",
                        "Great Barrier Reef",
                        "Belize Barrier Reef",
                        "Florida Reef",
                        2
                ));

                questions.add(new Question(
                        "Which Indian lake is famous for floating islands called phumdis?",
                        "Vembanad",
                        "Sambhar",
                        "Wular",
                        "Loktak",
                        4
                ));

                questions.add(new Question(
                        "Which latitude is approximately 23.5 degrees north?",
                        "Arctic Circle",
                        "Tropic of Cancer",
                        "Tropic of Capricorn",
                        "Equator",
                        2
                ));

                questions.add(new Question(
                        "Which country is called the Land of a Thousand Lakes?",
                        "Sweden",
                        "Finland",
                        "Iceland",
                        "Norway",
                        2
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which phenomenon explains the apparent deflection of winds due to Earth's rotation?",
                        "Doppler effect",
                        "Coriolis effect",
                        "Greenhouse effect",
                        "Photoelectric effect",
                        2
                ));

                questions.add(new Question(
                        "Which Indian river forms the Dhuandhar Falls near Jabalpur?",
                        "Son",
                        "Betwa",
                        "Tapti",
                        "Narmada",
                        4
                ));

                questions.add(new Question(
                        "Which is the deepest lake in the world?",
                        "Caspian Sea",
                        "Lake Superior",
                        "Lake Victoria",
                        "Lake Baikal",
                        4
                ));

                questions.add(new Question(
                        "Which country has the longest coastline in the world?",
                        "Indonesia",
                        "Russia",
                        "Canada",
                        "Australia",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state contains the cold desert of Ladakh?",
                        "Ladakh",
                        "Himachal Pradesh",
                        "Jammu and Kashmir",
                        "Uttarakhand",
                        1
                ));

                questions.add(new Question(
                        "Which ocean has the greatest average depth?",
                        "Pacific",
                        "Arctic",
                        "Indian",
                        "Atlantic",
                        1
                ));

                questions.add(new Question(
                        "Which river is known as the Sorrow of Bihar?",
                        "Ganga",
                        "Kosi",
                        "Gandak",
                        "Son",
                        2
                ));

                questions.add(new Question(
                        "Which Indian city is located near the confluence of the Ganga and Yamuna?",
                        "Varanasi",
                        "Agra",
                        "Kanpur",
                        "Prayagraj",
                        4
                ));

                questions.add(new Question(
                        "Which is the world's largest peninsula?",
                        "Arabian Peninsula",
                        "Indian Peninsula",
                        "Iberian Peninsula",
                        "Scandinavian Peninsula",
                        1
                ));

                questions.add(new Question(
                        "Which Indian state is known for the Sundarbans mangrove forest?",
                        "West Bengal",
                        "Andhra Pradesh",
                        "Kerala",
                        "Odisha",
                        1
                ));
            }
        }

        // COMPUTER & TECHNOLOGY
        else if (category.equals("Computer & Technology")) {

            if (level == 1) {
                questions.add(new Question(
                        "What does CPU stand for?",
                        "Central Processing Unit",
                        "Computer Personal Unit",
                        "Control Processing Unit",
                        "Central Program Utility",
                        1
                ));

                questions.add(new Question(
                        "What does RAM stand for?",
                        "Run Access Module",
                        "Rapid Application Memory",
                        "Read Access Memory",
                        "Random Access Memory",
                        4
                ));

                questions.add(new Question(
                        "Which device is used to type text?",
                        "Speaker",
                        "Monitor",
                        "Keyboard",
                        "Printer",
                        3
                ));

                questions.add(new Question(
                        "Which is an operating system?",
                        "Facebook",
                        "Chrome",
                        "Windows",
                        "Google",
                        3
                ));

                questions.add(new Question(
                        "What does URL stand for?",
                        "Uniform Reference Link",
                        "Universal Resource Link",
                        "Universal Routing Locator",
                        "Uniform Resource Locator",
                        4
                ));

                questions.add(new Question(
                        "Which language is mainly used to style web pages?",
                        "HTML",
                        "Python",
                        "SQL",
                        "CSS",
                        4
                ));

                questions.add(new Question(
                        "What does HTML stand for?",
                        "High Text Machine Language",
                        "Hyperlink Text Management Language",
                        "Home Tool Markup Language",
                        "Hyper Text Markup Language",
                        4
                ));

                questions.add(new Question(
                        "Which company develops Android?",
                        "Apple",
                        "IBM",
                        "Google",
                        "Microsoft",
                        3
                ));

                questions.add(new Question(
                        "What is Git mainly used for?",
                        "Version control",
                        "Database management",
                        "Photo editing",
                        "Video editing",
                        1
                ));

                questions.add(new Question(
                        "Which part of a computer displays visual output?",
                        "Scanner",
                        "Mouse",
                        "Keyboard",
                        "Monitor",
                        4
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which language is used to add structure to web pages?",
                        "CSS",
                        "HTML",
                        "Bash",
                        "SQL",
                        2
                ));

                questions.add(new Question(
                        "Which language is commonly used to program Android apps in this project?",
                        "Python",
                        "SQL",
                        "Java",
                        "PHP",
                        3
                ));

                questions.add(new Question(
                        "What does SQL stand for?",
                        "System Query Logic",
                        "Sequential Question Language",
                        "Structured Query Language",
                        "Simple Query Language",
                        3
                ));

                questions.add(new Question(
                        "Which device connects a computer to a network?",
                        "Router",
                        "Keyboard",
                        "Projector",
                        "Monitor",
                        1
                ));

                questions.add(new Question(
                        "What is a database?",
                        "An operating system",
                        "A collection of organized data",
                        "A programming language",
                        "A display device",
                        2
                ));

                questions.add(new Question(
                        "Which is a web browser?",
                        "Oracle",
                        "Linux",
                        "Python",
                        "Chrome",
                        4
                ));

                questions.add(new Question(
                        "What does HTTP stand for?",
                        "Hyperlink Transfer Process",
                        "HighText Transmission Program",
                        "Host Transfer Protocol",
                        "HyperText Transfer Protocol",
                        4
                ));

                questions.add(new Question(
                        "Which storage device has no moving mechanical parts?",
                        "Floppy disk",
                        "SSD",
                        "Tape drive",
                        "HDD",
                        2
                ));

                questions.add(new Question(
                        "What does PDF stand for?",
                        "Portable Document Format",
                        "Program Data Format",
                        "Personal Data File",
                        "Public Document Form",
                        1
                ));

                questions.add(new Question(
                        "Which symbol is commonly used for comments in Java?",
                        "//",
                        "**",
                        "<!--",
                        "##",
                        1
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which data structure follows LIFO?",
                        "Graph",
                        "Tree",
                        "Queue",
                        "Stack",
                        4
                ));

                questions.add(new Question(
                        "Which data structure follows FIFO?",
                        "Queue",
                        "Tree",
                        "Stack",
                        "Heap",
                        1
                ));

                questions.add(new Question(
                        "Which protocol is used to securely browse websites?",
                        "FTP",
                        "SMTP",
                        "HTTP",
                        "HTTPS",
                        4
                ));

                questions.add(new Question(
                        "What does API stand for?",
                        "Advanced Programming Input",
                        "Applied Program Internet",
                        "Application Process Integration",
                        "Application Programming Interface",
                        4
                ));

                questions.add(new Question(
                        "Which SQL command is used to retrieve data?",
                        "DELETE",
                        "SELECT",
                        "UPDATE",
                        "INSERT",
                        2
                ));

                questions.add(new Question(
                        "Which SQL command adds a new row?",
                        "DROP",
                        "SELECT",
                        "INSERT",
                        "ALTER",
                        3
                ));

                questions.add(new Question(
                        "Which keyword is used to create a class in Java?",
                        "define",
                        "object",
                        "class",
                        "struct",
                        3
                ));

                questions.add(new Question(
                        "What is an IP address used for?",
                        "Identifying a device/interface on a network",
                        "Compressing files",
                        "Editing images",
                        "Formatting text",
                        1
                ));

                questions.add(new Question(
                        "Which is an example of a relational database?",
                        "Photoshop",
                        "Git",
                        "MySQL",
                        "Android",
                        3
                ));

                questions.add(new Question(
                        "What does IDE stand for?",
                        "Internet Development Engine",
                        "Internal Design Environment",
                        "Integrated Development Environment",
                        "Integrated Data Editor",
                        3
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which HTTP status code means Not Found?",
                        "200",
                        "500",
                        "404",
                        "301",
                        3
                ));

                questions.add(new Question(
                        "Which HTTP method is commonly used to update a complete resource?",
                        "TRACE",
                        "GET",
                        "POST",
                        "PUT",
                        4
                ));

                questions.add(new Question(
                        "What is normalization in databases mainly used for?",
                        "Reducing redundancy",
                        "Compiling code",
                        "Increasing screen size",
                        "Encrypting passwords",
                        1
                ));

                questions.add(new Question(
                        "Which key uniquely identifies a row in a relational table?",
                        "Primary key",
                        "Foreign key",
                        "Index page",
                        "Candidate file",
                        1
                ));

                questions.add(new Question(
                        "What does JSON stand for?",
                        "Java Source Object Network",
                        "JavaScript Online Network",
                        "JavaScript Object Notation",
                        "Joined Standard Object Notation",
                        3
                ));

                questions.add(new Question(
                        "Which algorithmic complexity describes binary search on a sorted array?",
                        "O(log n)",
                        "O(n)",
                        "O(n²)",
                        "O(2n)",
                        1
                ));

                questions.add(new Question(
                        "What is polymorphism in object-oriented programming?",
                        "Only one object",
                        "Storing files",
                        "Deleting a class",
                        "One interface with multiple forms",
                        4
                ));

                questions.add(new Question(
                        "Which Git command creates a local copy of a remote repository?",
                        "git reset",
                        "git push",
                        "git merge",
                        "git clone",
                        4
                ));

                questions.add(new Question(
                        "What is DNS mainly responsible for?",
                        "Storing images",
                        "Mapping domain names to IP addresses",
                        "Compiling Java",
                        "Encrypting disks",
                        2
                ));

                questions.add(new Question(
                        "Which layer of the OSI model handles routing?",
                        "Physical",
                        "Presentation",
                        "Network",
                        "Data Link",
                        3
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which data structure is commonly used for breadth-first search?",
                        "Stack",
                        "Queue",
                        "Hash table",
                        "Heap",
                        2
                ));

                questions.add(new Question(
                        "Which traversal is naturally implemented using a stack?",
                        "Level-order only",
                        "Depth-first search",
                        "Hash search",
                        "Breadth-first search",
                        2
                ));

                questions.add(new Question(
                        "What is a hash function used for in a hash table?",
                        "Opening ports",
                        "Mapping keys to positions",
                        "Compiling code",
                        "Sorting images",
                        2
                ));

                questions.add(new Question(
                        "Which ACID property means a transaction is all-or-nothing?",
                        "Atomicity",
                        "Consistency",
                        "Durability",
                        "Isolation",
                        1
                ));

                questions.add(new Question(
                        "What does CAP theorem discuss in distributed systems?",
                        "Classes, arrays and pointers",
                        "Consistency, availability and partition tolerance",
                        "CPU, API and processes",
                        "Caching, authentication and privacy",
                        2
                ));

                questions.add(new Question(
                        "Which technique helps prevent SQL injection?",
                        "Using larger tables",
                        "Disabling indexes",
                        "Parameterized queries",
                        "String concatenation",
                        3
                ));

                questions.add(new Question(
                        "What is a deadlock in operating systems?",
                        "A crashed monitor",
                        "Processes wait indefinitely for resources",
                        "A full hard disk",
                        "A syntax error",
                        2
                ));

                questions.add(new Question(
                        "Which memory is typically fastest among these?",
                        "Hard disk",
                        "CPU cache",
                        "Optical disk",
                        "RAM",
                        2
                ));

                questions.add(new Question(
                        "What does REST commonly emphasize for web services?",
                        "Stateless client-server interaction",
                        "Desktop-only applications",
                        "Local-only storage",
                        "Binary-only communication",
                        1
                ));

                questions.add(new Question(
                        "Which Git command uploads local commits to a remote repository?",
                        "git push",
                        "git pull",
                        "git fetch",
                        "git init",
                        1
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which scheduling algorithm can cause starvation if priorities are not managed?",
                        "Priority scheduling",
                        "Round robin only",
                        "FCFS only",
                        "FIFO queue",
                        1
                ));

                questions.add(new Question(
                        "What is virtual memory?",
                        "Using secondary storage to extend apparent memory",
                        "A faster CPU",
                        "A network cable",
                        "A type of monitor",
                        1
                ));

                questions.add(new Question(
                        "Which database index structure is commonly used for range queries?",
                        "Bitmap image",
                        "B-tree",
                        "Stack",
                        "Queue",
                        2
                ));

                questions.add(new Question(
                        "What does idempotent mean for an HTTP operation?",
                        "It always fails",
                        "It encrypts data",
                        "It requires a browser",
                        "Repeating it has the same intended effect",
                        4
                ));

                questions.add(new Question(
                        "Which cryptographic approach uses a public and private key pair?",
                        "Hashing only",
                        "Compression",
                        "Asymmetric cryptography",
                        "Plain text",
                        3
                ));

                questions.add(new Question(
                        "What is a race condition?",
                        "A network speed test",
                        "A syntax rule",
                        "Output depends on uncontrolled timing of concurrent operations",
                        "A CPU benchmark",
                        3
                ));

                questions.add(new Question(
                        "Which design principle suggests a class should have one reason to change?",
                        "Dependency Inversion only",
                        "Open/Closed Principle",
                        "Single Responsibility Principle",
                        "Liskov Principle",
                        3
                ));

                questions.add(new Question(
                        "What is memoization?",
                        "Compressing source code",
                        "Encrypting databases",
                        "Deleting variables",
                        "Caching results of expensive function calls",
                        4
                ));

                questions.add(new Question(
                        "Which protocol is commonly used to transfer email between mail servers?",
                        "SMTP",
                        "HTTP",
                        "SSH",
                        "DNS",
                        1
                ));

                questions.add(new Question(
                        "What is containerization primarily used for?",
                        "Increasing monitor resolution",
                        "Replacing all databases",
                        "Packaging an application with its dependencies",
                        "Editing source images",
                        3
                ));
            }
        }

        // SCIENCE
        else if (category.equals("Science")) {

            if (level == 1) {
                questions.add(new Question(
                        "Which planet is known as the Red Planet?",
                        "Mars",
                        "Venus",
                        "Earth",
                        "Jupiter",
                        1
                ));

                questions.add(new Question(
                        "What is the chemical formula of water?",
                        "O2",
                        "CO2",
                        "H2O",
                        "NaCl",
                        3
                ));

                questions.add(new Question(
                        "Which gas do plants absorb during photosynthesis?",
                        "Oxygen",
                        "Carbon dioxide",
                        "Hydrogen",
                        "Nitrogen",
                        2
                ));

                questions.add(new Question(
                        "What is the largest organ in the human body?",
                        "Brain",
                        "Liver",
                        "Skin",
                        "Heart",
                        3
                ));

                questions.add(new Question(
                        "How many bones are there in an adult human body?",
                        "216",
                        "226",
                        "206",
                        "196",
                        3
                ));

                questions.add(new Question(
                        "Which is the nearest star to Earth?",
                        "Mars",
                        "Sun",
                        "Moon",
                        "Venus",
                        2
                ));

                questions.add(new Question(
                        "What force keeps us on the ground?",
                        "Frictional force",
                        "Gravitational force",
                        "Electric force",
                        "Magnetic force",
                        2
                ));

                questions.add(new Question(
                        "Which vitamin is produced in the skin with sunlight exposure?",
                        "Vitamin D",
                        "Vitamin B",
                        "Vitamin A",
                        "Vitamin C",
                        1
                ));

                questions.add(new Question(
                        "What is the boiling point of water at sea level?",
                        "75°C",
                        "150°C",
                        "50°C",
                        "100°C",
                        4
                ));

                questions.add(new Question(
                        "Which organ pumps blood throughout the body?",
                        "Heart",
                        "Kidney",
                        "Lungs",
                        "Brain",
                        1
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "What is the basic unit of life?",
                        "Cell",
                        "Atom",
                        "Tissue",
                        "Organ",
                        1
                ));

                questions.add(new Question(
                        "Which gas is essential for human respiration?",
                        "Oxygen",
                        "Helium",
                        "Nitrogen",
                        "Carbon dioxide",
                        1
                ));

                questions.add(new Question(
                        "What is the center of an atom called?",
                        "Molecule",
                        "Shell",
                        "Electron cloud",
                        "Nucleus",
                        4
                ));

                questions.add(new Question(
                        "Which blood cells help fight infections?",
                        "Platelets",
                        "White blood cells",
                        "Plasma cells only",
                        "Red blood cells",
                        2
                ));

                questions.add(new Question(
                        "Which part of a plant mainly absorbs water?",
                        "Flower",
                        "Root",
                        "Stem",
                        "Fruit",
                        2
                ));

                questions.add(new Question(
                        "What is the SI unit of force?",
                        "Joule",
                        "Newton",
                        "Pascal",
                        "Watt",
                        2
                ));

                questions.add(new Question(
                        "Which metal is liquid at room temperature?",
                        "Copper",
                        "Aluminium",
                        "Iron",
                        "Mercury",
                        4
                ));

                questions.add(new Question(
                        "What is the process by which plants make food?",
                        "Photosynthesis",
                        "Digestion",
                        "Respiration",
                        "Fermentation",
                        1
                ));

                questions.add(new Question(
                        "Which organ is primarily responsible for filtering blood?",
                        "Brain",
                        "Stomach",
                        "Kidney",
                        "Lung",
                        3
                ));

                questions.add(new Question(
                        "Sound cannot travel through which medium?",
                        "Steel",
                        "Water",
                        "Air",
                        "Vacuum",
                        4
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which particle has a negative electric charge?",
                        "Photon",
                        "Electron",
                        "Proton",
                        "Neutron",
                        2
                ));

                questions.add(new Question(
                        "What is the SI unit of power?",
                        "Volt",
                        "Newton",
                        "Watt",
                        "Joule",
                        3
                ));

                questions.add(new Question(
                        "Which gas is mainly responsible for the greenhouse effect among these?",
                        "Hydrogen",
                        "Carbon dioxide",
                        "Oxygen",
                        "Nitrogen",
                        2
                ));

                questions.add(new Question(
                        "What is the pH of a neutral solution at 25°C?",
                        "5",
                        "7",
                        "0",
                        "14",
                        2
                ));

                questions.add(new Question(
                        "Which law states that every action has an equal and opposite reaction?",
                        "Newton's Third Law",
                        "Ohm's Law",
                        "Newton's Second Law",
                        "Newton's First Law",
                        1
                ));

                questions.add(new Question(
                        "What is the powerhouse of the cell?",
                        "Golgi body",
                        "Nucleus",
                        "Ribosome",
                        "Mitochondrion",
                        4
                ));

                questions.add(new Question(
                        "Which blood group is commonly called the universal donor for red cells?",
                        "O negative",
                        "AB positive",
                        "A positive",
                        "B negative",
                        1
                ));

                questions.add(new Question(
                        "What is the speed of light in vacuum approximately?",
                        "3 × 10^6 m/s",
                        "3 × 10^8 m/s",
                        "3 × 10^12 m/s",
                        "3 × 10^10 m/s",
                        2
                ));

                questions.add(new Question(
                        "Which lens is used to correct myopia?",
                        "Concave",
                        "Bifocal only",
                        "Convex",
                        "Cylindrical only",
                        1
                ));

                questions.add(new Question(
                        "Which hormone regulates blood glucose level?",
                        "Melatonin",
                        "Adrenaline",
                        "Thyroxine",
                        "Insulin",
                        4
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "What is Avogadro's number approximately?",
                        "9.8 × 10^23",
                        "6.022 × 10^23",
                        "3.14 × 10^23",
                        "6.022 × 10^20",
                        2
                ));

                questions.add(new Question(
                        "Which principle explains why a ship floats?",
                        "Hooke's law",
                        "Boyle's law",
                        "Archimedes' principle",
                        "Pascal's law",
                        3
                ));

                questions.add(new Question(
                        "Which electromagnetic wave has the shortest wavelength?",
                        "Visible light",
                        "Gamma rays",
                        "Radio waves",
                        "Microwaves",
                        2
                ));

                questions.add(new Question(
                        "What is the SI unit of electric resistance?",
                        "Volt",
                        "Ampere",
                        "Ohm",
                        "Watt",
                        3
                ));

                questions.add(new Question(
                        "Which organelle is responsible for protein synthesis?",
                        "Ribosome",
                        "Vacuole",
                        "Lysosome",
                        "Centrosome",
                        1
                ));

                questions.add(new Question(
                        "Which process converts liquid into gas?",
                        "Sublimation only",
                        "Freezing",
                        "Condensation",
                        "Evaporation",
                        4
                ));

                questions.add(new Question(
                        "What is the main component of natural gas?",
                        "Propane",
                        "Butane",
                        "Ethane",
                        "Methane",
                        4
                ));

                questions.add(new Question(
                        "Which type of reaction releases heat?",
                        "Exothermic",
                        "Neutralization only",
                        "Photochemical only",
                        "Endothermic",
                        1
                ));

                questions.add(new Question(
                        "Which part of the brain controls balance and coordination?",
                        "Medulla",
                        "Cerebrum",
                        "Hypothalamus",
                        "Cerebellum",
                        4
                ));

                questions.add(new Question(
                        "Which acid is present in the stomach?",
                        "Nitric acid",
                        "Acetic acid",
                        "Hydrochloric acid",
                        "Sulfuric acid",
                        3
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "What is the approximate acceleration due to gravity near Earth's surface?",
                        "19.6 m/s²",
                        "98 m/s²",
                        "9.8 m/s²",
                        "4.9 m/s²",
                        3
                ));

                questions.add(new Question(
                        "Which quantum number describes the shape of an orbital?",
                        "Magnetic",
                        "Principal",
                        "Azimuthal",
                        "Spin",
                        3
                ));

                questions.add(new Question(
                        "What is the genetic material in most organisms?",
                        "DNA",
                        "Lipid",
                        "Glucose",
                        "ATP",
                        1
                ));

                questions.add(new Question(
                        "Which phenomenon causes the bending of light when it enters another medium?",
                        "Reflection",
                        "Polarization only",
                        "Diffraction only",
                        "Refraction",
                        4
                ));

                questions.add(new Question(
                        "What is the oxidation state of oxygen usually in water?",
                        "0",
                        "+1",
                        "+2",
                        "-2",
                        4
                ));

                questions.add(new Question(
                        "Which enzyme begins carbohydrate digestion in the mouth?",
                        "Lipase",
                        "Pepsin",
                        "Trypsin",
                        "Amylase",
                        4
                ));

                questions.add(new Question(
                        "What is the function of hemoglobin?",
                        "Transport oxygen",
                        "Digest fats",
                        "Filter urine",
                        "Produce insulin",
                        1
                ));

                questions.add(new Question(
                        "Which nuclear process powers the Sun?",
                        "Nuclear fission",
                        "Combustion",
                        "Nuclear fusion",
                        "Radioactive decay",
                        3
                ));

                questions.add(new Question(
                        "What is the Doppler effect?",
                        "Reflection of heat",
                        "Change in observed frequency due to relative motion",
                        "Change in mass",
                        "Splitting of atoms",
                        2
                ));

                questions.add(new Question(
                        "Which vitamin is important for blood clotting?",
                        "Vitamin A",
                        "Vitamin C",
                        "Vitamin K",
                        "Vitamin E",
                        3
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which equation relates energy and mass in special relativity?",
                        "E = mc²",
                        "V = IR",
                        "F = ma",
                        "PV = nRT",
                        1
                ));

                questions.add(new Question(
                        "What is entropy most closely associated with?",
                        "Measure of disorder or energy dispersal",
                        "Electric charge",
                        "Magnetic field strength",
                        "Mass density",
                        1
                ));

                questions.add(new Question(
                        "Which particle mediates the electromagnetic force?",
                        "Electron",
                        "Gluon",
                        "Photon",
                        "Neutron",
                        3
                ));

                questions.add(new Question(
                        "What is the approximate pKa of acetic acid?",
                        "7.00",
                        "4.76",
                        "9.25",
                        "2.76",
                        2
                ));

                questions.add(new Question(
                        "Which cellular process produces most ATP aerobically?",
                        "Transcription",
                        "Oxidative phosphorylation",
                        "Translation",
                        "Glycolysis only",
                        2
                ));

                questions.add(new Question(
                        "What is the Hardy-Weinberg principle used to describe?",
                        "Genetic equilibrium in populations",
                        "Planetary motion",
                        "Chemical equilibrium only",
                        "Fluid pressure",
                        1
                ));

                questions.add(new Question(
                        "Which law relates pressure and volume of a fixed amount of gas at constant temperature?",
                        "Boyle's law",
                        "Avogadro's law",
                        "Charles's law",
                        "Faraday's law",
                        1
                ));

                questions.add(new Question(
                        "What is a catalyst's main effect on a reaction?",
                        "Changes equilibrium constant",
                        "Changes products",
                        "Lowers activation energy",
                        "Gets permanently consumed",
                        3
                ));

                questions.add(new Question(
                        "Which particle has no electric charge?",
                        "Proton",
                        "Electron",
                        "Positron",
                        "Neutron",
                        4
                ));

                questions.add(new Question(
                        "What is the main cause of Earth's seasons?",
                        "Moon's gravity",
                        "Earth's axial tilt",
                        "Ocean currents",
                        "Distance from Sun alone",
                        2
                ));
            }
        }

        // HISTORY
        else if (category.equals("History")) {

            if (level == 1) {
                questions.add(new Question(
                        "Who founded the Maurya Empire?",
                        "Harsha",
                        "Ashoka",
                        "Bindusara",
                        "Chandragupta Maurya",
                        4
                ));

                questions.add(new Question(
                        "Who was known as the Father of the Nation in India?",
                        "Mahatma Gandhi",
                        "Sardar Patel",
                        "B. R. Ambedkar",
                        "Jawaharlal Nehru",
                        1
                ));

                questions.add(new Question(
                        "In which year did India gain independence?",
                        "1952",
                        "1945",
                        "1947",
                        "1950",
                        3
                ));

                questions.add(new Question(
                        "Who built the Taj Mahal?",
                        "Humayun",
                        "Akbar",
                        "Aurangzeb",
                        "Shah Jahan",
                        4
                ));

                questions.add(new Question(
                        "Who was the first Mughal emperor of India?",
                        "Humayun",
                        "Akbar",
                        "Jahangir",
                        "Babur",
                        4
                ));

                questions.add(new Question(
                        "The Battle of Plassey was fought in which year?",
                        "1757",
                        "1707",
                        "1857",
                        "1764",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Maratha Empire?",
                        "Sambhaji Maharaj",
                        "Bajirao I",
                        "Balaji Vishwanath",
                        "Chhatrapati Shivaji Maharaj",
                        4
                ));

                questions.add(new Question(
                        "Who gave the slogan 'Do or Die'?",
                        "Bal Gangadhar Tilak",
                        "Subhas Chandra Bose",
                        "Mahatma Gandhi",
                        "Bhagat Singh",
                        3
                ));

                questions.add(new Question(
                        "The Dandi March was associated with which movement?",
                        "Non-Cooperation Movement",
                        "Civil Disobedience Movement",
                        "Swadeshi Movement",
                        "Quit India Movement",
                        2
                ));

                questions.add(new Question(
                        "Who was the first President of independent India?",
                        "S. Radhakrishnan",
                        "Sardar Patel",
                        "Rajendra Prasad",
                        "Jawaharlal Nehru",
                        3
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Who was the last major Mauryan emperor?",
                        "Bindusara",
                        "Brihadratha",
                        "Chandragupta Maurya",
                        "Ashoka",
                        4
                ));

                questions.add(new Question(
                        "Which ancient university was located in present-day Bihar?",
                        "All of these",
                        "Takshashila",
                        "Vikramashila",
                        "Nalanda",
                        1
                ));

                questions.add(new Question(
                        "Who wrote Arthashastra?",
                        "Kalidasa",
                        "Megasthenes",
                        "Kautilya",
                        "Banabhatta",
                        3
                ));

                questions.add(new Question(
                        "Who was the founder of the Gupta dynasty?",
                        "Sri Gupta",
                        "Chandragupta I",
                        "Skandagupta",
                        "Samudragupta",
                        1
                ));

                questions.add(new Question(
                        "Which ruler is associated with the Kalinga War?",
                        "Kanishka",
                        "Harsha",
                        "Chandragupta Maurya",
                        "Ashoka",
                        4
                ));

                questions.add(new Question(
                        "Who founded the Slave Dynasty?",
                        "Alauddin Khalji",
                        "Balban",
                        "Iltutmish",
                        "Qutb-ud-din Aibak",
                        4
                ));

                questions.add(new Question(
                        "Who introduced the Mansabdari system in the Mughal Empire?",
                        "Babur",
                        "Shah Jahan",
                        "Akbar",
                        "Aurangzeb",
                        3
                ));

                questions.add(new Question(
                        "Who wrote Akbarnama?",
                        "Tulsidas",
                        "Badauni",
                        "Amir Khusrau",
                        "Abul Fazl",
                        4
                ));

                questions.add(new Question(
                        "The Revolt of 1857 began at which place?",
                        "Lucknow",
                        "Kanpur",
                        "Meerut",
                        "Delhi",
                        3
                ));

                questions.add(new Question(
                        "Who founded the Indian National Congress?",
                        "W. C. Bonnerjee",
                        "A. O. Hume",
                        "Gopal Krishna Gokhale",
                        "Dadabhai Naoroji",
                        2
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which dynasty built the Brihadeeswarar Temple at Thanjavur?",
                        "Chola",
                        "Chalukya",
                        "Gupta",
                        "Pallava",
                        1
                ));

                questions.add(new Question(
                        "Who was the author of Rajatarangini?",
                        "Kalhana",
                        "Banabhatta",
                        "Kalidasa",
                        "Vishakhadatta",
                        1
                ));

                questions.add(new Question(
                        "Which Gupta ruler is known for extensive conquests?",
                        "Kumaragupta",
                        "Chandragupta II",
                        "Skandagupta",
                        "Samudragupta",
                        4
                ));

                questions.add(new Question(
                        "Which Delhi Sultan is associated with market control reforms?",
                        "Firoz Shah Tughlaq",
                        "Sikandar Lodi",
                        "Iltutmish",
                        "Alauddin Khalji",
                        4
                ));

                questions.add(new Question(
                        "Who was the first woman ruler of the Delhi Sultanate?",
                        "Razia Sultan",
                        "Nur Jahan",
                        "Rani Lakshmibai",
                        "Rani Durgavati",
                        1
                ));

                questions.add(new Question(
                        "Which Mughal emperor abolished the jizya in 1564?",
                        "Humayun",
                        "Akbar",
                        "Jahangir",
                        "Aurangzeb",
                        2
                ));

                questions.add(new Question(
                        "The Treaty of Purandar was signed in 1665 between Shivaji Maharaj and whom?",
                        "Jai Singh I",
                        "Afzal Khan",
                        "Aurangzeb",
                        "Shaista Khan",
                        1
                ));

                questions.add(new Question(
                        "Who started the Home Rule movement in India along with Annie Besant?",
                        "Gandhi",
                        "Nehru",
                        "Patel",
                        "Bal Gangadhar Tilak",
                        4
                ));

                questions.add(new Question(
                        "The Non-Cooperation Movement was launched in which year?",
                        "1922",
                        "1919",
                        "1920",
                        "1930",
                        3
                ));

                questions.add(new Question(
                        "Who presided over the Lahore session of Congress in 1929?",
                        "Sardar Patel",
                        "Subhas Chandra Bose",
                        "Mahatma Gandhi",
                        "Jawaharlal Nehru",
                        4
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which inscription provides information about Samudragupta's conquests?",
                        "Aihole inscription",
                        "Hathigumpha inscription",
                        "Allahabad Pillar inscription",
                        "Junagadh inscription",
                        3
                ));

                questions.add(new Question(
                        "Who was the ruler of the Chalukyas of Badami known for defeating Harsha?",
                        "Pulakeshin II",
                        "Vikramaditya I",
                        "Mangalesha",
                        "Kirtivarman I",
                        1
                ));

                questions.add(new Question(
                        "Which Bhakti saint is associated with Varkari tradition?",
                        "Kabir",
                        "Surdas",
                        "Mirabai",
                        "Tukaram",
                        4
                ));

                questions.add(new Question(
                        "Who founded the Vijayanagara Empire?",
                        "Devaraya and Harihara",
                        "Harihara and Bukka",
                        "Krishnadevaraya and Bukka",
                        "Rama Raya and Bukka",
                        2
                ));

                questions.add(new Question(
                        "Which battle ended the power of the Marathas in north India in 1761?",
                        "First Battle of Panipat",
                        "Third Battle of Panipat",
                        "Battle of Buxar",
                        "Battle of Plassey",
                        2
                ));

                questions.add(new Question(
                        "Who introduced the Permanent Settlement in Bengal?",
                        "Lord Dalhousie",
                        "Lord Curzon",
                        "Lord Cornwallis",
                        "Lord Wellesley",
                        3
                ));

                questions.add(new Question(
                        "The Swadeshi Movement began mainly in response to which event?",
                        "Rowlatt Act",
                        "Partition of Bengal",
                        "Simon Commission",
                        "Jallianwala Bagh",
                        2
                ));

                questions.add(new Question(
                        "Who founded the Forward Bloc?",
                        "Jawaharlal Nehru",
                        "Rajendra Prasad",
                        "Subhas Chandra Bose",
                        "C. R. Das",
                        3
                ));

                questions.add(new Question(
                        "The Cabinet Mission came to India in which year?",
                        "1945",
                        "1947",
                        "1946",
                        "1942",
                        3
                ));

                questions.add(new Question(
                        "Who was the first Governor-General of independent India?",
                        "Warren Hastings",
                        "Rajendra Prasad",
                        "C. Rajagopalachari",
                        "Lord Mountbatten",
                        4
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which ancient text is attributed to Panini?",
                        "Arthashastra",
                        "Ashtadhyayi",
                        "Mudrarakshasa",
                        "Indica",
                        2
                ));

                questions.add(new Question(
                        "The Hathigumpha inscription is associated with which ruler?",
                        "Rudradaman",
                        "Kharavela",
                        "Ashoka",
                        "Samudragupta",
                        2
                ));

                questions.add(new Question(
                        "Which Chola ruler sent naval expeditions to Southeast Asia?",
                        "Kulottunga I",
                        "Rajaraja I",
                        "Rajendra Chola I",
                        "Aditya I",
                        3
                ));

                questions.add(new Question(
                        "Who was the author of Prithviraj Raso?",
                        "Chand Bardai",
                        "Bana",
                        "Amir Khusrau",
                        "Kalhana",
                        1
                ));

                questions.add(new Question(
                        "Which Mughal emperor's reign is associated with the translation of Mahabharata into Persian as Razmnama?",
                        "Jahangir",
                        "Akbar",
                        "Aurangzeb",
                        "Shah Jahan",
                        2
                ));

                questions.add(new Question(
                        "The Ilbert Bill controversy occurred during the viceroyalty of whom?",
                        "Lord Lytton",
                        "Lord Ripon",
                        "Lord Curzon",
                        "Lord Dufferin",
                        2
                ));

                questions.add(new Question(
                        "Which Congress session declared Purna Swaraj as its goal?",
                        "Calcutta, 1906",
                        "Surat, 1907",
                        "Lucknow, 1916",
                        "Lahore, 1929",
                        4
                ));

                questions.add(new Question(
                        "The Gandhi-Irwin Pact was signed in which year?",
                        "1931",
                        "1935",
                        "1928",
                        "1942",
                        1
                ));

                questions.add(new Question(
                        "Which Act introduced provincial autonomy in British India?",
                        "Government of India Act 1935",
                        "Indian Councils Act 1909",
                        "Government of India Act 1919",
                        "Charter Act 1833",
                        1
                ));

                questions.add(new Question(
                        "Who led the Indian National Army in its later phase?",
                        "Rash Behari Bose",
                        "Bhagat Singh",
                        "Lala Lajpat Rai",
                        "Subhas Chandra Bose",
                        4
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which source is a major account of ancient India by Megasthenes?",
                        "Periplus",
                        "Rajatarangini",
                        "Indica",
                        "Arthashastra",
                        3
                ));

                questions.add(new Question(
                        "Which Gupta ruler adopted the title Vikramaditya?",
                        "Skandagupta",
                        "Chandragupta II",
                        "Kumaragupta",
                        "Samudragupta",
                        2
                ));

                questions.add(new Question(
                        "The Second Battle of Tarain was fought in which year?",
                        "1191",
                        "1192",
                        "1210",
                        "1206",
                        2
                ));

                questions.add(new Question(
                        "Who established the Ryotwari system in parts of British India?",
                        "Wellesley",
                        "Thomas Munro",
                        "Dalhousie",
                        "Cornwallis",
                        2
                ));

                questions.add(new Question(
                        "Which event immediately preceded the launch of the Quit India Movement?",
                        "Simon Commission",
                        "Partition of Bengal",
                        "Dandi March",
                        "Cripps Mission failure",
                        4
                ));

                questions.add(new Question(
                        "The August Offer was made by the British government in which year?",
                        "1942",
                        "1939",
                        "1945",
                        "1940",
                        4
                ));

                questions.add(new Question(
                        "Who was the president of the Constituent Assembly?",
                        "Jawaharlal Nehru",
                        "Rajendra Prasad",
                        "Sardar Patel",
                        "B. R. Ambedkar",
                        2
                ));

                questions.add(new Question(
                        "Which agreement ended the First Anglo-Maratha War?",
                        "Treaty of Bassein",
                        "Treaty of Salbai",
                        "Treaty of Purandar",
                        "Treaty of Surat",
                        2
                ));

                questions.add(new Question(
                        "Which Maratha ruler was known for the Ashtapradhan council?",
                        "Shivaji Maharaj",
                        "Sambhaji Maharaj",
                        "Shahu Maharaj",
                        "Bajirao I",
                        1
                ));

                questions.add(new Question(
                        "The Poona Pact of 1932 was signed between Mahatma Gandhi and whom?",
                        "Rajendra Prasad",
                        "B. R. Ambedkar",
                        "Madan Mohan Malaviya",
                        "M. A. Jinnah",
                        2
                ));
            }
        }

        // SPORTS
        else if (category.equals("Sports")) {

            if (level == 1) {
                questions.add(new Question(
                        "How many players are there in a cricket team?",
                        "11",
                        "12",
                        "9",
                        "10",
                        1
                ));

                questions.add(new Question(
                        "Which sport uses a shuttlecock?",
                        "Tennis",
                        "Squash",
                        "Hockey",
                        "Badminton",
                        4
                ));

                questions.add(new Question(
                        "How many rings are on the Olympic flag?",
                        "5",
                        "7",
                        "6",
                        "4",
                        1
                ));

                questions.add(new Question(
                        "Which country is associated with sumo wrestling?",
                        "Japan",
                        "China",
                        "Thailand",
                        "Korea",
                        1
                ));

                questions.add(new Question(
                        "In football, how many players from one team are normally on the field?",
                        "12",
                        "11",
                        "9",
                        "10",
                        2
                ));

                questions.add(new Question(
                        "Which sport is played at Wimbledon?",
                        "Cricket",
                        "Hockey",
                        "Tennis",
                        "Football",
                        3
                ));

                questions.add(new Question(
                        "What is the highest score possible with one dart?",
                        "60",
                        "50",
                        "100",
                        "180",
                        4
                ));

                questions.add(new Question(
                        "Which sport uses a bat, ball and wickets?",
                        "Cricket",
                        "Hockey",
                        "Baseball",
                        "Rugby",
                        1
                ));

                questions.add(new Question(
                        "How many points is a basketball free throw worth?",
                        "2",
                        "3",
                        "4",
                        "1",
                        4
                ));

                questions.add(new Question(
                        "Which country hosted the first modern Olympic Games in 1896?",
                        "France",
                        "Greece",
                        "Italy",
                        "UK",
                        2
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "How many Grand Slam tournaments are there in tennis each year?",
                        "5",
                        "4",
                        "2",
                        "3",
                        2
                ));

                questions.add(new Question(
                        "Which sport awards the Davis Cup?",
                        "Football",
                        "Hockey",
                        "Golf",
                        "Tennis",
                        4
                ));

                questions.add(new Question(
                        "What is a hat-trick in cricket?",
                        "Three boundaries",
                        "Three catches in an innings",
                        "Three wickets in three consecutive balls",
                        "Three runs in one ball",
                        3
                ));

                questions.add(new Question(
                        "Which sport uses the term 'birdie'?",
                        "Tennis",
                        "Golf",
                        "Boxing",
                        "Cricket",
                        2
                ));

                questions.add(new Question(
                        "How long is an Olympic swimming pool?",
                        "75 m",
                        "100 m",
                        "50 m",
                        "25 m",
                        3
                ));

                questions.add(new Question(
                        "Which country won the first Cricket World Cup in 1975?",
                        "West Indies",
                        "Australia",
                        "India",
                        "England",
                        1
                ));

                questions.add(new Question(
                        "What is the standard marathon distance?",
                        "43.195 km",
                        "40.195 km",
                        "42.195 km",
                        "41.195 km",
                        3
                ));

                questions.add(new Question(
                        "Which sport has positions such as scrum-half and fly-half?",
                        "Football",
                        "Rugby",
                        "Volleyball",
                        "Basketball",
                        2
                ));

                questions.add(new Question(
                        "How many players are on court for one volleyball team?",
                        "6",
                        "5",
                        "7",
                        "8",
                        1
                ));

                questions.add(new Question(
                        "Which sport is associated with the Ryder Cup?",
                        "Tennis",
                        "Boxing",
                        "Cricket",
                        "Golf",
                        4
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Who is awarded the Ballon d'Or?",
                        "Best tennis player",
                        "Best cricketer",
                        "Best swimmer",
                        "Best football player",
                        4
                ));

                questions.add(new Question(
                        "In cricket, what does LBW stand for?",
                        "Leg Bat Wicket",
                        "Left Before Wicket",
                        "Leg Before Wicket",
                        "Long Ball Wicket",
                        3
                ));

                questions.add(new Question(
                        "Which country is traditionally associated with the martial art judo?",
                        "Japan",
                        "Brazil",
                        "India",
                        "Russia",
                        1
                ));

                questions.add(new Question(
                        "How many points is a touchdown worth in American football before the extra point?",
                        "6",
                        "8",
                        "3",
                        "7",
                        1
                ));

                questions.add(new Question(
                        "What is the term for zero in tennis?",
                        "Nil",
                        "Blank",
                        "Duck",
                        "Love",
                        4
                ));

                questions.add(new Question(
                        "Which sport features the pommel horse?",
                        "Wrestling",
                        "Cycling",
                        "Gymnastics",
                        "Equestrian",
                        3
                ));

                questions.add(new Question(
                        "The Ashes is contested between England and which country?",
                        "New Zealand",
                        "Australia",
                        "India",
                        "South Africa",
                        2
                ));

                questions.add(new Question(
                        "Which sport uses a puck?",
                        "Lacrosse",
                        "Ice hockey",
                        "Curling",
                        "Field hockey",
                        2
                ));

                questions.add(new Question(
                        "What is a 'clean and jerk'?",
                        "Weightlifting movement",
                        "Swimming stroke",
                        "Boxing punch",
                        "Gymnastics move",
                        1
                ));

                questions.add(new Question(
                        "Which country has won the most men's FIFA World Cups?",
                        "Brazil",
                        "Argentina",
                        "Germany",
                        "Italy",
                        1
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "In cricket, how many legal balls are there in a standard over?",
                        "5",
                        "6",
                        "8",
                        "7",
                        2
                ));

                questions.add(new Question(
                        "Which tennis Grand Slam is played on clay?",
                        "Australian Open",
                        "French Open",
                        "Wimbledon",
                        "US Open",
                        2
                ));

                questions.add(new Question(
                        "What is the maximum break in snooker?",
                        "155",
                        "200",
                        "180",
                        "147",
                        4
                ));

                questions.add(new Question(
                        "Which country hosted the 2016 Summer Olympics?",
                        "UK",
                        "Brazil",
                        "Japan",
                        "China",
                        2
                ));

                questions.add(new Question(
                        "In Formula 1, what does pole position mean?",
                        "Pit-lane position",
                        "Championship lead",
                        "Last position",
                        "Fastest qualifying position at the front",
                        4
                ));

                questions.add(new Question(
                        "Which sport has the Stanley Cup?",
                        "Basketball",
                        "Ice hockey",
                        "Baseball",
                        "Football",
                        2
                ));

                questions.add(new Question(
                        "How many gold medals are awarded for an individual Olympic event?",
                        "2",
                        "1",
                        "3",
                        "4",
                        2
                ));

                questions.add(new Question(
                        "Which Indian sportsperson is associated with the term 'Flying Sikh'?",
                        "P. T. Usha",
                        "Abhinav Bindra",
                        "Dhyan Chand",
                        "Milkha Singh",
                        4
                ));

                questions.add(new Question(
                        "In chess, which piece can move in an L-shape?",
                        "Rook",
                        "Knight",
                        "Bishop",
                        "Queen",
                        2
                ));

                questions.add(new Question(
                        "Which country originated modern table tennis?",
                        "China",
                        "Japan",
                        "USA",
                        "England",
                        4
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "What is the Duckworth-Lewis-Stern method used for?",
                        "Scoring gymnastics",
                        "Setting targets in rain-affected limited-overs cricket",
                        "Timing races",
                        "Ranking tennis players",
                        2
                ));

                questions.add(new Question(
                        "In chess, what is stalemate?",
                        "Checkmate",
                        "A draw where the player to move has no legal move and is not in check",
                        "A winning move",
                        "A repeated opening",
                        2
                ));

                questions.add(new Question(
                        "Which cycling race is one of the three Grand Tours?",
                        "Six Nations",
                        "Davis Cup",
                        "Tour de France",
                        "Paris Masters",
                        3
                ));

                questions.add(new Question(
                        "What is the standard height of a basketball hoop?",
                        "3.25 m",
                        "3.50 m",
                        "2.75 m",
                        "3.05 m",
                        4
                ));

                questions.add(new Question(
                        "Which athlete won India's first individual Olympic gold medal?",
                        "Sushil Kumar",
                        "Rajyavardhan Rathore",
                        "Neeraj Chopra",
                        "Abhinav Bindra",
                        4
                ));

                questions.add(new Question(
                        "Which sport uses the term 'ippon'?",
                        "Archery",
                        "Boxing",
                        "Fencing",
                        "Judo",
                        4
                ));

                questions.add(new Question(
                        "What is the maximum score in a single frame of ten-pin bowling?",
                        "50",
                        "30",
                        "20",
                        "40",
                        2
                ));

                questions.add(new Question(
                        "Which event combines swimming, cycling and running?",
                        "Heptathlon",
                        "Decathlon",
                        "Pentathlon",
                        "Triathlon",
                        4
                ));

                questions.add(new Question(
                        "In baseball, how many strikes usually result in a strikeout?",
                        "2",
                        "5",
                        "3",
                        "4",
                        3
                ));

                questions.add(new Question(
                        "Which country is famous for the All Blacks rugby team?",
                        "Australia",
                        "England",
                        "New Zealand",
                        "South Africa",
                        3
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "In cricket, what is a 'googly'?",
                        "A batting shot",
                        "A fielding position",
                        "A deceptive delivery by a leg-spinner",
                        "A type of bat",
                        3
                ));

                questions.add(new Question(
                        "Which Formula 1 flag indicates the race has been stopped?",
                        "Red",
                        "Blue",
                        "Yellow",
                        "Green",
                        1
                ));

                questions.add(new Question(
                        "In tennis, what is a 'break point'?",
                        "A service fault",
                        "The first point",
                        "A point that could win the receiving player the game",
                        "A point after a tie-break",
                        3
                ));

                questions.add(new Question(
                        "Which Olympic event includes the disciplines 100m, long jump, shot put and high jump?",
                        "Decathlon",
                        "Heptathlon",
                        "Pentathlon",
                        "Triathlon",
                        1
                ));

                questions.add(new Question(
                        "What is the term for three consecutive strikes in bowling?",
                        "Hat-trick",
                        "Eagle",
                        "Turkey",
                        "Triple",
                        3
                ));

                questions.add(new Question(
                        "Which country has hosted the Summer Olympics most often as of the modern era?",
                        "Japan",
                        "USA",
                        "France",
                        "UK",
                        2
                ));

                questions.add(new Question(
                        "In volleyball, what is a libero primarily known for?",
                        "Attacker only",
                        "Referee",
                        "Defensive specialist",
                        "Server only",
                        3
                ));

                questions.add(new Question(
                        "Which boxing weight class is above lightweight and below welterweight?",
                        "Middleweight",
                        "Light welterweight",
                        "Featherweight",
                        "Heavyweight",
                        2
                ));

                questions.add(new Question(
                        "What is the name of the trophy awarded to the winner of the ICC Men's Cricket World Cup?",
                        "Bledisloe Cup",
                        "Webb Ellis Cup",
                        "Cricket World Cup Trophy",
                        "Davis Cup",
                        3
                ));

                questions.add(new Question(
                        "In athletics, what is the steeplechase?",
                        "Long jump event",
                        "Distance race with barriers and water jump",
                        "Walking event",
                        "Short sprint",
                        2
                ));
            }
        }

        // UPSC
        else if (category.equals("UPSC")) {

            if (level == 1) {
                questions.add(new Question(
                        "Who is known as the Father of the Indian Constitution?",
                        "Sardar Patel",
                        "B. R. Ambedkar",
                        "Mahatma Gandhi",
                        "Jawaharlal Nehru",
                        2
                ));

                questions.add(new Question(
                        "The Constitution of India came into effect on:",
                        "2 October 1950",
                        "26 January 1950",
                        "26 November 1949",
                        "15 August 1947",
                        2
                ));

                questions.add(new Question(
                        "Who was the first President of India?",
                        "Jawaharlal Nehru",
                        "S. Radhakrishnan",
                        "Dr. Rajendra Prasad",
                        "Sardar Patel",
                        3
                ));

                questions.add(new Question(
                        "Which body is known as the guardian of the Constitution?",
                        "Parliament",
                        "Supreme Court",
                        "Election Commission",
                        "President",
                        2
                ));

                questions.add(new Question(
                        "Who appoints the Prime Minister of India?",
                        "Lok Sabha Speaker",
                        "Chief Justice",
                        "Vice President",
                        "President",
                        4
                ));

                questions.add(new Question(
                        "How many Fundamental Rights are currently guaranteed?",
                        "5",
                        "7",
                        "6",
                        "8",
                        3
                ));

                questions.add(new Question(
                        "The Indian Constitution was adopted on:",
                        "26 January 1950",
                        "26 November 1949",
                        "2 October 1949",
                        "15 August 1947",
                        2
                ));

                questions.add(new Question(
                        "Which house is called the House of the People?",
                        "Lok Sabha",
                        "Vidhan Parishad",
                        "Vidhan Sabha",
                        "Rajya Sabha",
                        1
                ));

                questions.add(new Question(
                        "What is the minimum age to become President of India?",
                        "35 years",
                        "40 years",
                        "30 years",
                        "25 years",
                        1
                ));

                questions.add(new Question(
                        "Who is the constitutional head of India?",
                        "Chief Justice",
                        "President",
                        "Home Minister",
                        "Prime Minister",
                        2
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which Article deals with equality before law?",
                        "Article 16",
                        "Article 12",
                        "Article 21",
                        "Article 14",
                        4
                ));

                questions.add(new Question(
                        "Which Article protects life and personal liberty?",
                        "Article 14",
                        "Article 32",
                        "Article 19",
                        "Article 21",
                        4
                ));

                questions.add(new Question(
                        "Who was Chairman of the Drafting Committee?",
                        "B. R. Ambedkar",
                        "Sardar Patel",
                        "Rajendra Prasad",
                        "Jawaharlal Nehru",
                        1
                ));

                questions.add(new Question(
                        "Directive Principles were inspired by the Constitution of:",
                        "Ireland",
                        "Australia",
                        "Canada",
                        "USA",
                        1
                ));

                questions.add(new Question(
                        "Fundamental Duties were added by which amendment?",
                        "73rd",
                        "86th",
                        "44th",
                        "42nd",
                        4
                ));

                questions.add(new Question(
                        "Rajya Sabha is a:",
                        "Judicial House",
                        "Permanent House",
                        "Temporary House",
                        "State House",
                        2
                ));

                questions.add(new Question(
                        "Who presides over the Lok Sabha?",
                        "Vice President",
                        "President",
                        "Prime Minister",
                        "Speaker",
                        4
                ));

                questions.add(new Question(
                        "The Supreme Court is located in:",
                        "Kolkata",
                        "New Delhi",
                        "Mumbai",
                        "Chennai",
                        2
                ));

                questions.add(new Question(
                        "Which amendment lowered voting age from 21 to 18?",
                        "61st",
                        "42nd",
                        "73rd",
                        "44th",
                        1
                ));

                questions.add(new Question(
                        "Which Article is associated with constitutional remedies?",
                        "Article 14",
                        "Article 32",
                        "Article 19",
                        "Article 21",
                        2
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which schedule contains provisions relating to anti-defection?",
                        "Eighth",
                        "Eleventh",
                        "Twelfth",
                        "Tenth",
                        4
                ));

                questions.add(new Question(
                        "Which constitutional amendment gave constitutional status to Panchayats?",
                        "74th",
                        "42nd",
                        "61st",
                        "73rd",
                        4
                ));

                questions.add(new Question(
                        "Which constitutional amendment gave constitutional status to municipalities?",
                        "91st",
                        "74th",
                        "86th",
                        "73rd",
                        2
                ));

                questions.add(new Question(
                        "Who is the ex-officio Chairman of Rajya Sabha?",
                        "Vice President",
                        "Speaker",
                        "President",
                        "Prime Minister",
                        1
                ));

                questions.add(new Question(
                        "A Money Bill can be introduced only in:",
                        "Rajya Sabha",
                        "State Assembly only",
                        "Lok Sabha",
                        "Either House",
                        3
                ));

                questions.add(new Question(
                        "Who decides whether a bill is a Money Bill?",
                        "Prime Minister",
                        "Finance Minister",
                        "Lok Sabha Speaker",
                        "President",
                        3
                ));

                questions.add(new Question(
                        "Which Article deals with amendment of the Constitution?",
                        "Article 32",
                        "Article 356",
                        "Article 370",
                        "Article 368",
                        4
                ));

                questions.add(new Question(
                        "The President of India is elected by:",
                        "Only state legislatures",
                        "Direct vote of citizens",
                        "Elected MPs and elected MLAs",
                        "Only Parliament",
                        3
                ));

                questions.add(new Question(
                        "Which body recommends distribution of tax revenues between Union and States?",
                        "NITI Aayog",
                        "UPSC",
                        "Finance Commission",
                        "Election Commission",
                        3
                ));

                questions.add(new Question(
                        "The Comptroller and Auditor General is appointed by:",
                        "Parliament",
                        "Chief Justice",
                        "Prime Minister",
                        "President",
                        4
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which writ is used to produce a person alleged to be unlawfully detained?",
                        "Habeas Corpus",
                        "Mandamus",
                        "Certiorari",
                        "Quo Warranto",
                        1
                ));

                questions.add(new Question(
                        "Which writ commands a public authority to perform a legal duty?",
                        "Mandamus",
                        "Prohibition",
                        "Quo Warranto",
                        "Habeas Corpus",
                        1
                ));

                questions.add(new Question(
                        "Which Article provides for President's Rule in a state?",
                        "360",
                        "352",
                        "356",
                        "365",
                        3
                ));

                questions.add(new Question(
                        "National Emergency can be proclaimed on grounds including:",
                        "War, external aggression or armed rebellion",
                        "Elections only",
                        "Natural disasters only",
                        "Financial crisis only",
                        1
                ));

                questions.add(new Question(
                        "The basic structure doctrine was established in which case?",
                        "Minerva Mills case",
                        "Maneka Gandhi case",
                        "Kesavananda Bharati case",
                        "Golaknath case",
                        3
                ));

                questions.add(new Question(
                        "Which institution is the final interpreter of the Constitution?",
                        "President",
                        "Election Commission",
                        "Parliament",
                        "Supreme Court",
                        4
                ));

                questions.add(new Question(
                        "The Attorney General of India is appointed by:",
                        "President",
                        "Parliament",
                        "Prime Minister",
                        "Chief Justice",
                        1
                ));

                questions.add(new Question(
                        "Which Article deals with equality of opportunity in public employment?",
                        "Article 17",
                        "Article 16",
                        "Article 15",
                        "Article 14",
                        2
                ));

                questions.add(new Question(
                        "Which part of the Constitution contains Fundamental Duties?",
                        "Part III",
                        "Part IV",
                        "Part IVA",
                        "Part V",
                        3
                ));

                questions.add(new Question(
                        "Which body conducts elections to Parliament and state legislatures?",
                        "CAG",
                        "UPSC",
                        "Finance Commission",
                        "Election Commission of India",
                        4
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which principle limits Parliament's amending power?",
                        "Basic structure doctrine",
                        "Separation of religion",
                        "Doctrine of pleasure",
                        "Collective responsibility",
                        1
                ));

                questions.add(new Question(
                        "Which case expanded the interpretation of Article 21 significantly?",
                        "Shah Bano case",
                        "Berubari case",
                        "S. R. Bommai case",
                        "Maneka Gandhi case",
                        4
                ));

                questions.add(new Question(
                        "Which schedule deals with allocation of seats in Rajya Sabha?",
                        "Fourth",
                        "Sixth",
                        "Third",
                        "Fifth",
                        1
                ));

                questions.add(new Question(
                        "Which schedule contains forms of oaths and affirmations?",
                        "Fourth",
                        "Second",
                        "Third",
                        "Fifth",
                        3
                ));

                questions.add(new Question(
                        "Which schedule deals with tribal areas in Assam, Meghalaya, Tripura and Mizoram?",
                        "Fifth",
                        "Ninth",
                        "Sixth",
                        "Seventh",
                        3
                ));

                questions.add(new Question(
                        "Which list contains subjects on which only Parliament normally legislates?",
                        "Residuary List",
                        "State List",
                        "Union List",
                        "Concurrent List",
                        3
                ));

                questions.add(new Question(
                        "Residuary legislative powers in India belong to:",
                        "President alone",
                        "Supreme Court",
                        "Union Parliament",
                        "States",
                        3
                ));

                questions.add(new Question(
                        "The Inter-State Council is provided under which Article?",
                        "324",
                        "280",
                        "356",
                        "263",
                        4
                ));

                questions.add(new Question(
                        "Which body replaced the Planning Commission?",
                        "Finance Commission",
                        "NITI Aayog",
                        "CAG",
                        "GST Council",
                        2
                ));

                questions.add(new Question(
                        "The GST Council is established under which Article?",
                        "301",
                        "312",
                        "279A",
                        "280",
                        3
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which constitutional provision enables Parliament to legislate on a State List subject in national interest when Rajya Sabha passes a resolution?",
                        "Article 249",
                        "Article 253",
                        "Article 250",
                        "Article 252",
                        1
                ));

                questions.add(new Question(
                        "Under Article 312, Parliament can create:",
                        "All-India Services",
                        "State legislatures",
                        "Election tribunals only",
                        "Municipal bodies",
                        1
                ));

                questions.add(new Question(
                        "Which case is closely associated with the federal character of the Constitution and President's Rule?",
                        "Kesavananda Bharati case",
                        "S. R. Bommai case",
                        "Golaknath case",
                        "ADM Jabalpur case",
                        2
                ));

                questions.add(new Question(
                        "Which Article empowers the Supreme Court to issue writs for Fundamental Rights?",
                        "226",
                        "136",
                        "143",
                        "32",
                        4
                ));

                questions.add(new Question(
                        "High Courts can issue writs under which Article?",
                        "32",
                        "136",
                        "280",
                        "226",
                        4
                ));

                questions.add(new Question(
                        "Which amendment inserted the words Socialist, Secular and Integrity into the Preamble?",
                        "42nd",
                        "24th",
                        "44th",
                        "52nd",
                        1
                ));

                questions.add(new Question(
                        "Which amendment introduced the anti-defection provisions?",
                        "52nd",
                        "44th",
                        "61st",
                        "42nd",
                        1
                ));

                questions.add(new Question(
                        "Which amendment lowered the voting age to 18?",
                        "44th",
                        "61st",
                        "73rd",
                        "42nd",
                        2
                ));

                questions.add(new Question(
                        "Which constitutional authority audits Union and State government accounts?",
                        "Election Commission",
                        "UPSC",
                        "Finance Commission",
                        "CAG",
                        4
                ));

                questions.add(new Question(
                        "The doctrine of parliamentary sovereignty in India is limited primarily by:",
                        "Governor's powers",
                        "Local governments",
                        "Judicial review and the Constitution",
                        "Customary law alone",
                        3
                ));
            }
        }

        // MPSC
        else if (category.equals("MPSC")) {

            if (level == 1) {
                questions.add(new Question(
                        "What is the capital of Maharashtra?",
                        "Nashik",
                        "Pune",
                        "Mumbai",
                        "Nagpur",
                        3
                ));

                questions.add(new Question(
                        "Which city is known as the cultural capital of Maharashtra?",
                        "Mumbai",
                        "Kolhapur",
                        "Pune",
                        "Nagpur",
                        3
                ));

                questions.add(new Question(
                        "Who founded the Maratha Empire?",
                        "Balaji Vishwanath",
                        "Sambhaji Maharaj",
                        "Bajirao I",
                        "Chhatrapati Shivaji Maharaj",
                        4
                ));

                questions.add(new Question(
                        "Which sea lies to the west of Maharashtra?",
                        "Indian Ocean",
                        "Bay of Bengal",
                        "Red Sea",
                        "Arabian Sea",
                        4
                ));

                questions.add(new Question(
                        "Which is the highest peak in Maharashtra?",
                        "Rajgad",
                        "Torna",
                        "Kalsubai",
                        "Mahabaleshwar",
                        3
                ));

                questions.add(new Question(
                        "Which river is one of the major rivers of Maharashtra and flows eastward?",
                        "Godavari",
                        "Sutlej",
                        "Sabarmati",
                        "Yamuna",
                        1
                ));

                questions.add(new Question(
                        "Which city is famous for Deekshabhoomi?",
                        "Mumbai",
                        "Nagpur",
                        "Pune",
                        "Nashik",
                        2
                ));

                questions.add(new Question(
                        "Which festival is widely celebrated in Maharashtra?",
                        "Onam",
                        "Ganesh Chaturthi",
                        "Bihu",
                        "Pongal",
                        2
                ));

                questions.add(new Question(
                        "Which fort was the capital of Chhatrapati Shivaji Maharaj's kingdom?",
                        "Golconda",
                        "Agra Fort",
                        "Raigad",
                        "Red Fort",
                        3
                ));

                questions.add(new Question(
                        "Which language is primarily spoken in Maharashtra?",
                        "Marathi",
                        "Kannada",
                        "Gujarati",
                        "Hindi",
                        1
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which river originates near Trimbakeshwar in Maharashtra?",
                        "Godavari",
                        "Krishna",
                        "Tapi",
                        "Bhima",
                        1
                ));

                questions.add(new Question(
                        "Which city is known for the Aga Khan Palace?",
                        "Satara",
                        "Pune",
                        "Nagpur",
                        "Nashik",
                        2
                ));

                questions.add(new Question(
                        "Which fort is located near Pune and is associated with Shivaji Maharaj?",
                        "Red Fort",
                        "Torna",
                        "Golconda",
                        "Chittorgarh",
                        2
                ));

                questions.add(new Question(
                        "Which hill station is known as the Queen of the Sahyadri?",
                        "Mahabaleshwar",
                        "Matheran",
                        "Lonavala",
                        "Panchgani",
                        1
                ));

                questions.add(new Question(
                        "Which district is famous for the Ellora Caves?",
                        "Aurangabad/Chhatrapati Sambhajinagar",
                        "Kolhapur",
                        "Nashik",
                        "Pune",
                        1
                ));

                questions.add(new Question(
                        "Which UNESCO World Heritage site is near Mumbai?",
                        "Elephanta Caves",
                        "Ajanta Caves",
                        "Hampi",
                        "Sanchi",
                        1
                ));

                questions.add(new Question(
                        "Which city is associated with the Kumbh Mela in Maharashtra?",
                        "Nashik",
                        "Kolhapur",
                        "Solapur",
                        "Pune",
                        1
                ));

                questions.add(new Question(
                        "Which river is a major tributary of the Krishna in Maharashtra?",
                        "Ganga",
                        "Chambal",
                        "Yamuna",
                        "Bhima",
                        4
                ));

                questions.add(new Question(
                        "Which crop is strongly associated with the black soil regions of Maharashtra?",
                        "Rubber",
                        "Jute",
                        "Cotton",
                        "Tea",
                        3
                ));

                questions.add(new Question(
                        "Which city is a major center of Maharashtra's sugar industry?",
                        "Mumbai",
                        "Kolhapur",
                        "Nagpur",
                        "Nashik",
                        2
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Who was the spiritual guide traditionally associated with Chhatrapati Shivaji Maharaj?",
                        "Samarth Ramdas",
                        "Sant Tukaram",
                        "Namdev",
                        "Dnyaneshwar",
                        1
                ));

                questions.add(new Question(
                        "Who wrote the Dnyaneshwari?",
                        "Sant Tukaram",
                        "Namdev",
                        "Eknath",
                        "Sant Dnyaneshwar",
                        4
                ));

                questions.add(new Question(
                        "Who wrote the famous Marathi devotional work 'Abhangas'?",
                        "Sant Tukaram",
                        "Banabhatta",
                        "Kalidasa",
                        "Bhasa",
                        1
                ));

                questions.add(new Question(
                        "Which social reformer founded Satyashodhak Samaj?",
                        "V. D. Savarkar",
                        "M. G. Ranade",
                        "Gopal Hari Deshmukh",
                        "Jyotirao Phule",
                        4
                ));

                questions.add(new Question(
                        "Satyashodhak Samaj was founded in which year?",
                        "1920",
                        "1885",
                        "1873",
                        "1905",
                        3
                ));

                questions.add(new Question(
                        "Who founded the Prarthana Samaj along with others in Bombay Presidency context?",
                        "Jyotirao Phule",
                        "Atmaram Pandurang",
                        "Tilak",
                        "Savarkar",
                        2
                ));

                questions.add(new Question(
                        "Which newspaper was started by Bal Gangadhar Tilak?",
                        "The Hindu",
                        "Young India",
                        "Harijan",
                        "Kesari",
                        4
                ));

                questions.add(new Question(
                        "Who is associated with the reform movement against social injustice in Maharashtra and women's education?",
                        "Sarojini Naidu",
                        "Annie Besant",
                        "Savitribai Phule",
                        "Rani Lakshmibai",
                        3
                ));

                questions.add(new Question(
                        "Which fort is associated with the coronation of Shivaji Maharaj?",
                        "Shivneri",
                        "Raigad",
                        "Sinhagad",
                        "Pratapgad",
                        2
                ));

                questions.add(new Question(
                        "Which battle involved Shivaji Maharaj and Afzal Khan?",
                        "Battle of Buxar",
                        "Battle of Panipat",
                        "Battle of Plassey",
                        "Battle of Pratapgad",
                        4
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which treaty followed the conflict between Shivaji Maharaj and Jai Singh I in 1665?",
                        "Treaty of Salbai",
                        "Treaty of Surat",
                        "Treaty of Purandar",
                        "Treaty of Bassein",
                        3
                ));

                questions.add(new Question(
                        "Who was the first Peshwa under Chhatrapati Shahu Maharaj?",
                        "Nana Fadnavis",
                        "Madhavrao I",
                        "Bajirao I",
                        "Balaji Vishwanath",
                        4
                ));

                questions.add(new Question(
                        "Which Peshwa is famous for rapid northern expansion of the Maratha power?",
                        "Madhavrao II",
                        "Balaji Vishwanath",
                        "Raghunathrao",
                        "Bajirao I",
                        4
                ));

                questions.add(new Question(
                        "Which social reformer wrote 'Gulamgiri'?",
                        "Jyotirao Phule",
                        "Gopal Ganesh Agarkar",
                        "Ranade",
                        "Tilak",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Deccan Education Society with other leaders?",
                        "Bal Gangadhar Tilak and colleagues",
                        "Mahatma Gandhi alone",
                        "Savarkar alone",
                        "Shahu Maharaj alone",
                        1
                ));

                questions.add(new Question(
                        "Which city was the headquarters of the Prarthana Samaj movement in its early period?",
                        "Nagpur",
                        "Bombay",
                        "Satara",
                        "Nashik",
                        2
                ));

                questions.add(new Question(
                        "Who was known as Lokmanya?",
                        "Bal Gangadhar Tilak",
                        "Jyotirao Phule",
                        "V. D. Savarkar",
                        "Gopal Krishna Gokhale",
                        1
                ));

                questions.add(new Question(
                        "Which movement is strongly associated with the Ganapati festival as a public nationalist event?",
                        "Quit India Movement",
                        "Home Rule only",
                        "Khilafat only",
                        "Tilak's nationalist movement",
                        4
                ));

                questions.add(new Question(
                        "Who founded the Rashtriya Swayamsevak Sangh in Nagpur in 1925?",
                        "V. D. Savarkar",
                        "Tilak",
                        "K. B. Hedgewar",
                        "Gokhale",
                        3
                ));

                questions.add(new Question(
                        "Which reformer worked prominently for widow remarriage and women's education in Maharashtra?",
                        "Nana Fadnavis",
                        "D. K. Karve",
                        "Afzal Khan",
                        "Bajirao I",
                        2
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which agreement in 1775 is associated with the First Anglo-Maratha War?",
                        "Treaty of Surat",
                        "Treaty of Bassein",
                        "Treaty of Salbai",
                        "Treaty of Purandar",
                        1
                ));

                questions.add(new Question(
                        "The Treaty of Salbai was signed in which year?",
                        "1802",
                        "1818",
                        "1782",
                        "1761",
                        3
                ));

                questions.add(new Question(
                        "Which treaty of 1802 greatly affected Maratha politics and led to British intervention?",
                        "Treaty of Bassein",
                        "Treaty of Surat",
                        "Treaty of Purandar",
                        "Treaty of Salbai",
                        1
                ));

                questions.add(new Question(
                        "Who was Nana Fadnavis?",
                        "A social reformer of Bengal",
                        "A Mughal emperor",
                        "A prominent Maratha statesman",
                        "A British governor",
                        3
                ));

                questions.add(new Question(
                        "Which Maratha ruler was associated with the Third Anglo-Maratha War period?",
                        "Baji Rao II",
                        "Shahu I",
                        "Bajirao I",
                        "Shivaji Maharaj",
                        1
                ));

                questions.add(new Question(
                        "The Peshwa's headquarters was located at:",
                        "Pune",
                        "Nashik",
                        "Nagpur",
                        "Mumbai",
                        1
                ));

                questions.add(new Question(
                        "Which institution was founded by Dhondo Keshav Karve for women's education?",
                        "Fergusson College",
                        "SNDT Women's University",
                        "Deccan College",
                        "University of Bombay",
                        2
                ));

                questions.add(new Question(
                        "Who was the first Indian woman to become a doctor trained in Western medicine from Maharashtra?",
                        "Savitribai Phule",
                        "Ramabai Ranade",
                        "Anandibai Joshi",
                        "Pandita Ramabai",
                        3
                ));

                questions.add(new Question(
                        "Which organization was founded by Jyotirao Phule to promote social equality?",
                        "Servants of India Society",
                        "Brahmo Samaj",
                        "Arya Samaj",
                        "Satyashodhak Samaj",
                        4
                ));

                questions.add(new Question(
                        "Who founded the Servants of India Society?",
                        "Agarkar",
                        "Gopal Krishna Gokhale",
                        "Tilak",
                        "Phule",
                        2
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which fort is associated with the historic encounter between Shivaji Maharaj and Afzal Khan?",
                        "Shivneri",
                        "Pratapgad",
                        "Raigad",
                        "Sinhagad",
                        2
                ));

                questions.add(new Question(
                        "Which Maratha administrative council consisted traditionally of eight ministers?",
                        "Navaratna",
                        "Panchayat",
                        "Diwan-i-Kohi",
                        "Ashtapradhan",
                        4
                ));

                questions.add(new Question(
                        "Who held the office of Peshwa during the Third Battle of Panipat?",
                        "Baji Rao II",
                        "Madhavrao I",
                        "Bajirao I",
                        "Balaji Baji Rao",
                        4
                ));

                questions.add(new Question(
                        "The Third Battle of Panipat was fought in:",
                        "1775",
                        "1757",
                        "1764",
                        "1761",
                        4
                ));

                questions.add(new Question(
                        "Which Maratha leader is associated with the capture of Sinhagad in 1670?",
                        "Baji Prabhu Deshpande",
                        "Murarbaji Deshpande",
                        "Netaji Palkar",
                        "Tanaji Malusare",
                        4
                ));

                questions.add(new Question(
                        "Who founded the Bahishkrit Hitakarini Sabha?",
                        "B. R. Ambedkar",
                        "Jyotirao Phule",
                        "Shahu Maharaj",
                        "Gopal Ganesh Agarkar",
                        1
                ));

                questions.add(new Question(
                        "Which Maharaja of Kolhapur supported social reforms and reservation for non-Brahmin communities?",
                        "Krishnaraja Wadiyar",
                        "Shahu Maharaj",
                        "Ranjit Singh",
                        "Sayajirao Gaekwad",
                        2
                ));

                questions.add(new Question(
                        "Who was the first woman president of the Indian National Congress from Maharashtra?",
                        "Sarojini Naidu",
                        "Annie Besant",
                        "Nellie Sengupta",
                        "None of these",
                        4
                ));

                questions.add(new Question(
                        "Which newspaper was founded by Gopal Ganesh Agarkar?",
                        "Sudharak",
                        "Kesari",
                        "Mahratta",
                        "Young India",
                        1
                ));

                questions.add(new Question(
                        "Which movement in Maharashtra is closely associated with Vinoba Bhave's Bhoodan campaign?",
                        "Home Rule movement",
                        "Swadeshi movement",
                        "Khilafat movement",
                        "Land-gift movement",
                        4
                ));
            }
        }

        return questions;
    }
}
