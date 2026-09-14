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
                        "Mumbai",
                        "New Delhi",
                        "Kolkata",
                        "Chennai",
                        2
                ));

                questions.add(new Question(
                        "Which is the national animal of India?",
                        "Lion",
                        "Tiger",
                        "Elephant",
                        "Leopard",
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
                        "Atlantic Ocean",
                        "Indian Ocean",
                        "Pacific Ocean",
                        "Arctic Ocean",
                        3
                ));

                questions.add(new Question(
                        "Which planet is known as the Red Planet?",
                        "Venus",
                        "Mars",
                        "Jupiter",
                        "Mercury",
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
                        "Rose",
                        "Lotus",
                        "Jasmine",
                        "Sunflower",
                        2
                ));

                questions.add(new Question(
                        "Which is the longest river in India?",
                        "Ganga",
                        "Yamuna",
                        "Godavari",
                        "Narmada",
                        1
                ));

                questions.add(new Question(
                        "Who wrote the Indian national anthem?",
                        "Bankim Chandra Chattopadhyay",
                        "Rabindranath Tagore",
                        "Sarojini Naidu",
                        "Subhas Chandra Bose",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest state of India by area?",
                        "Madhya Pradesh",
                        "Maharashtra",
                        "Rajasthan",
                        "Uttar Pradesh",
                        3
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which is the smallest state of India by area?",
                        "Goa",
                        "Sikkim",
                        "Tripura",
                        "Manipur",
                        1
                ));

                questions.add(new Question(
                        "Which city is known as the Pink City?",
                        "Jaipur",
                        "Jodhpur",
                        "Udaipur",
                        "Bikaner",
                        1
                ));

                questions.add(new Question(
                        "Which is the highest mountain peak in the world?",
                        "K2",
                        "Mount Everest",
                        "Kangchenjunga",
                        "Lhotse",
                        2
                ));

                questions.add(new Question(
                        "What is the national aquatic animal of India?",
                        "Blue Whale",
                        "Ganges River Dolphin",
                        "Crocodile",
                        "Turtle",
                        2
                ));

                questions.add(new Question(
                        "Which Indian state has the longest coastline?",
                        "Tamil Nadu",
                        "Gujarat",
                        "Maharashtra",
                        "Andhra Pradesh",
                        2
                ));

                questions.add(new Question(
                        "Who was the first Indian to win a Nobel Prize?",
                        "C. V. Raman",
                        "Rabindranath Tagore",
                        "Mother Teresa",
                        "Amartya Sen",
                        2
                ));

                questions.add(new Question(
                        "Which organization conducts India's population census?",
                        "RBI",
                        "Election Commission",
                        "Office of the Registrar General and Census Commissioner",
                        "NITI Aayog",
                        3
                ));

                questions.add(new Question(
                        "What is the SI unit of temperature?",
                        "Celsius",
                        "Kelvin",
                        "Fahrenheit",
                        "Joule",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest desert in India?",
                        "Thar Desert",
                        "Kalahari Desert",
                        "Gobi Desert",
                        "Sahara Desert",
                        1
                ));

                questions.add(new Question(
                        "Which Indian city is called the Silicon Valley of India?",
                        "Hyderabad",
                        "Pune",
                        "Bengaluru",
                        "Chennai",
                        3
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which line divides the Earth into Northern and Southern Hemispheres?",
                        "Tropic of Cancer",
                        "Equator",
                        "Prime Meridian",
                        "Arctic Circle",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest freshwater lake in India by surface area?",
                        "Wular Lake",
                        "Dal Lake",
                        "Loktak Lake",
                        "Chilika Lake",
                        1
                ));

                questions.add(new Question(
                        "The Tropic of Cancer passes through how many Indian states?",
                        "6",
                        "7",
                        "8",
                        "9",
                        3
                ));

                questions.add(new Question(
                        "Which is the deepest ocean trench known on Earth?",
                        "Java Trench",
                        "Mariana Trench",
                        "Tonga Trench",
                        "Puerto Rico Trench",
                        2
                ));

                questions.add(new Question(
                        "Which country is known as the Land of the Rising Sun?",
                        "China",
                        "Japan",
                        "Thailand",
                        "South Korea",
                        2
                ));

                questions.add(new Question(
                        "Which Indian state is famous for the Hornbill Festival?",
                        "Assam",
                        "Nagaland",
                        "Meghalaya",
                        "Mizoram",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest island in India?",
                        "Majuli",
                        "Great Nicobar",
                        "Diu",
                        "Elephanta",
                        2
                ));

                questions.add(new Question(
                        "Which gas is most abundant in Earth's atmosphere?",
                        "Oxygen",
                        "Nitrogen",
                        "Carbon dioxide",
                        "Argon",
                        2
                ));

                questions.add(new Question(
                        "What is the study of earthquakes called?",
                        "Ecology",
                        "Seismology",
                        "Meteorology",
                        "Geology",
                        2
                ));

                questions.add(new Question(
                        "Which Indian city is situated on the banks of the Sabarmati River?",
                        "Ahmedabad",
                        "Surat",
                        "Vadodara",
                        "Rajkot",
                        1
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which strait separates India and Sri Lanka?",
                        "Malacca Strait",
                        "Palk Strait",
                        "Bering Strait",
                        "Hormuz Strait",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest planet in the Solar System?",
                        "Saturn",
                        "Earth",
                        "Jupiter",
                        "Neptune",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state is the largest producer of tea?",
                        "Kerala",
                        "Assam",
                        "West Bengal",
                        "Tamil Nadu",
                        2
                ));

                questions.add(new Question(
                        "Which is the only continent through which all lines of longitude pass?",
                        "Asia",
                        "Africa",
                        "Antarctica",
                        "Europe",
                        3
                ));

                questions.add(new Question(
                        "Which country has the largest population in the world?",
                        "India",
                        "China",
                        "USA",
                        "Indonesia",
                        1
                ));

                questions.add(new Question(
                        "Which Indian river is also called Dakshin Ganga?",
                        "Krishna",
                        "Godavari",
                        "Kaveri",
                        "Mahanadi",
                        2
                ));

                questions.add(new Question(
                        "Which is the world's largest hot desert?",
                        "Gobi",
                        "Thar",
                        "Sahara",
                        "Arabian Desert",
                        3
                ));

                questions.add(new Question(
                        "Which Indian state has the largest forest cover by area?",
                        "Madhya Pradesh",
                        "Arunachal Pradesh",
                        "Odisha",
                        "Chhattisgarh",
                        1
                ));

                questions.add(new Question(
                        "Which is the largest internal organ of the human body?",
                        "Heart",
                        "Liver",
                        "Lung",
                        "Kidney",
                        2
                ));

                questions.add(new Question(
                        "Which Indian city is called the City of Lakes?",
                        "Bhopal",
                        "Jaipur",
                        "Lucknow",
                        "Patna",
                        1
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which is the world's largest delta?",
                        "Nile Delta",
                        "Ganges-Brahmaputra Delta",
                        "Mekong Delta",
                        "Mississippi Delta",
                        2
                ));

                questions.add(new Question(
                        "Which Indian pass connects Srinagar with Leh?",
                        "Nathu La",
                        "Zoji La",
                        "Shipki La",
                        "Bara-Lacha La",
                        2
                ));

                questions.add(new Question(
                        "Which is the largest river island in India?",
                        "Majuli",
                        "Diu",
                        "Elephanta",
                        "Srirangam",
                        1
                ));

                questions.add(new Question(
                        "Which country is crossed by both the Equator and the Prime Meridian?",
                        "Brazil",
                        "Ghana",
                        "Indonesia",
                        "No country",
                        4
                ));

                questions.add(new Question(
                        "Which ocean current is a warm current in the North Atlantic?",
                        "Labrador Current",
                        "Gulf Stream",
                        "Peru Current",
                        "Canary Current",
                        2
                ));

                questions.add(new Question(
                        "Which Indian state has the maximum number of districts?",
                        "Uttar Pradesh",
                        "Maharashtra",
                        "Rajasthan",
                        "Madhya Pradesh",
                        1
                ));

                questions.add(new Question(
                        "Which is the world's largest coral reef system?",
                        "Belize Barrier Reef",
                        "Great Barrier Reef",
                        "Red Sea Reef",
                        "Florida Reef",
                        2
                ));

                questions.add(new Question(
                        "Which Indian lake is famous for floating islands called phumdis?",
                        "Wular",
                        "Loktak",
                        "Sambhar",
                        "Vembanad",
                        2
                ));

                questions.add(new Question(
                        "Which latitude is approximately 23.5 degrees north?",
                        "Tropic of Capricorn",
                        "Equator",
                        "Tropic of Cancer",
                        "Arctic Circle",
                        3
                ));

                questions.add(new Question(
                        "Which country is called the Land of a Thousand Lakes?",
                        "Norway",
                        "Finland",
                        "Sweden",
                        "Iceland",
                        2
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which phenomenon explains the apparent deflection of winds due to Earth's rotation?",
                        "Greenhouse effect",
                        "Coriolis effect",
                        "Doppler effect",
                        "Photoelectric effect",
                        2
                ));

                questions.add(new Question(
                        "Which Indian river forms the Dhuandhar Falls near Jabalpur?",
                        "Narmada",
                        "Tapti",
                        "Son",
                        "Betwa",
                        1
                ));

                questions.add(new Question(
                        "Which is the deepest lake in the world?",
                        "Lake Superior",
                        "Lake Baikal",
                        "Lake Victoria",
                        "Caspian Sea",
                        2
                ));

                questions.add(new Question(
                        "Which country has the longest coastline in the world?",
                        "Russia",
                        "Canada",
                        "Australia",
                        "Indonesia",
                        2
                ));

                questions.add(new Question(
                        "Which Indian state contains the cold desert of Ladakh?",
                        "Himachal Pradesh",
                        "Jammu and Kashmir",
                        "Ladakh",
                        "Uttarakhand",
                        3
                ));

                questions.add(new Question(
                        "Which ocean has the greatest average depth?",
                        "Atlantic",
                        "Indian",
                        "Pacific",
                        "Arctic",
                        3
                ));

                questions.add(new Question(
                        "Which river is known as the Sorrow of Bihar?",
                        "Ganga",
                        "Kosi",
                        "Son",
                        "Gandak",
                        2
                ));

                questions.add(new Question(
                        "Which Indian city is located near the confluence of the Ganga and Yamuna?",
                        "Varanasi",
                        "Prayagraj",
                        "Kanpur",
                        "Agra",
                        2
                ));

                questions.add(new Question(
                        "Which is the world's largest peninsula?",
                        "Arabian Peninsula",
                        "Indian Peninsula",
                        "Scandinavian Peninsula",
                        "Iberian Peninsula",
                        1
                ));

                questions.add(new Question(
                        "Which Indian state is known for the Sundarbans mangrove forest?",
                        "Odisha",
                        "West Bengal",
                        "Andhra Pradesh",
                        "Kerala",
                        2
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
                        "Central Program Utility",
                        "Control Processing Unit",
                        1
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
                        "Which device is used to type text?",
                        "Monitor",
                        "Keyboard",
                        "Speaker",
                        "Printer",
                        2
                ));

                questions.add(new Question(
                        "Which is an operating system?",
                        "Google",
                        "Windows",
                        "Chrome",
                        "Facebook",
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

                questions.add(new Question(
                        "Which part of a computer displays visual output?",
                        "Keyboard",
                        "Monitor",
                        "Mouse",
                        "Scanner",
                        2
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Which language is used to add structure to web pages?",
                        "HTML",
                        "CSS",
                        "SQL",
                        "Bash",
                        1
                ));

                questions.add(new Question(
                        "Which language is commonly used to program Android apps in this project?",
                        "Python",
                        "Java",
                        "PHP",
                        "SQL",
                        2
                ));

                questions.add(new Question(
                        "What does SQL stand for?",
                        "Structured Query Language",
                        "Simple Query Language",
                        "System Query Logic",
                        "Sequential Question Language",
                        1
                ));

                questions.add(new Question(
                        "Which device connects a computer to a network?",
                        "Router",
                        "Monitor",
                        "Keyboard",
                        "Projector",
                        1
                ));

                questions.add(new Question(
                        "What is a database?",
                        "A collection of organized data",
                        "A display device",
                        "A programming language",
                        "An operating system",
                        1
                ));

                questions.add(new Question(
                        "Which is a web browser?",
                        "Chrome",
                        "Linux",
                        "Oracle",
                        "Python",
                        1
                ));

                questions.add(new Question(
                        "What does HTTP stand for?",
                        "HyperText Transfer Protocol",
                        "HighText Transmission Program",
                        "Hyperlink Transfer Process",
                        "Host Transfer Protocol",
                        1
                ));

                questions.add(new Question(
                        "Which storage device has no moving mechanical parts?",
                        "HDD",
                        "SSD",
                        "Floppy disk",
                        "Tape drive",
                        2
                ));

                questions.add(new Question(
                        "What does PDF stand for?",
                        "Portable Document Format",
                        "Personal Data File",
                        "Public Document Form",
                        "Program Data Format",
                        1
                ));

                questions.add(new Question(
                        "Which symbol is commonly used for comments in Java?",
                        "//",
                        "##",
                        "<!--",
                        "**",
                        1
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which data structure follows LIFO?",
                        "Queue",
                        "Stack",
                        "Tree",
                        "Graph",
                        2
                ));

                questions.add(new Question(
                        "Which data structure follows FIFO?",
                        "Stack",
                        "Queue",
                        "Heap",
                        "Tree",
                        2
                ));

                questions.add(new Question(
                        "Which protocol is used to securely browse websites?",
                        "HTTP",
                        "HTTPS",
                        "FTP",
                        "SMTP",
                        2
                ));

                questions.add(new Question(
                        "What does API stand for?",
                        "Application Programming Interface",
                        "Applied Program Internet",
                        "Application Process Integration",
                        "Advanced Programming Input",
                        1
                ));

                questions.add(new Question(
                        "Which SQL command is used to retrieve data?",
                        "INSERT",
                        "SELECT",
                        "UPDATE",
                        "DELETE",
                        2
                ));

                questions.add(new Question(
                        "Which SQL command adds a new row?",
                        "INSERT",
                        "SELECT",
                        "ALTER",
                        "DROP",
                        1
                ));

                questions.add(new Question(
                        "Which keyword is used to create a class in Java?",
                        "class",
                        "define",
                        "struct",
                        "object",
                        1
                ));

                questions.add(new Question(
                        "What is an IP address used for?",
                        "Identifying a device/interface on a network",
                        "Editing images",
                        "Compressing files",
                        "Formatting text",
                        1
                ));

                questions.add(new Question(
                        "Which is an example of a relational database?",
                        "MySQL",
                        "Photoshop",
                        "Android",
                        "Git",
                        1
                ));

                questions.add(new Question(
                        "What does IDE stand for?",
                        "Integrated Development Environment",
                        "Internet Development Engine",
                        "Integrated Data Editor",
                        "Internal Design Environment",
                        1
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which HTTP status code means Not Found?",
                        "200",
                        "301",
                        "404",
                        "500",
                        3
                ));

                questions.add(new Question(
                        "Which HTTP method is commonly used to update a complete resource?",
                        "GET",
                        "POST",
                        "PUT",
                        "TRACE",
                        3
                ));

                questions.add(new Question(
                        "What is normalization in databases mainly used for?",
                        "Reducing redundancy",
                        "Increasing screen size",
                        "Encrypting passwords",
                        "Compiling code",
                        1
                ));

                questions.add(new Question(
                        "Which key uniquely identifies a row in a relational table?",
                        "Foreign key",
                        "Primary key",
                        "Candidate file",
                        "Index page",
                        2
                ));

                questions.add(new Question(
                        "What does JSON stand for?",
                        "JavaScript Object Notation",
                        "Java Source Object Network",
                        "Joined Standard Object Notation",
                        "JavaScript Online Network",
                        1
                ));

                questions.add(new Question(
                        "Which algorithmic complexity describes binary search on a sorted array?",
                        "O(n)",
                        "O(log n)",
                        "O(n²)",
                        "O(2n)",
                        2
                ));

                questions.add(new Question(
                        "What is polymorphism in object-oriented programming?",
                        "One interface with multiple forms",
                        "Only one object",
                        "Deleting a class",
                        "Storing files",
                        1
                ));

                questions.add(new Question(
                        "Which Git command creates a local copy of a remote repository?",
                        "git push",
                        "git clone",
                        "git merge",
                        "git reset",
                        2
                ));

                questions.add(new Question(
                        "What is DNS mainly responsible for?",
                        "Mapping domain names to IP addresses",
                        "Encrypting disks",
                        "Compiling Java",
                        "Storing images",
                        1
                ));

                questions.add(new Question(
                        "Which layer of the OSI model handles routing?",
                        "Physical",
                        "Data Link",
                        "Network",
                        "Presentation",
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
                        "Breadth-first search",
                        "Depth-first search",
                        "Level-order only",
                        "Hash search",
                        2
                ));

                questions.add(new Question(
                        "What is a hash function used for in a hash table?",
                        "Mapping keys to positions",
                        "Sorting images",
                        "Compiling code",
                        "Opening ports",
                        1
                ));

                questions.add(new Question(
                        "Which ACID property means a transaction is all-or-nothing?",
                        "Consistency",
                        "Isolation",
                        "Atomicity",
                        "Durability",
                        3
                ));

                questions.add(new Question(
                        "What does CAP theorem discuss in distributed systems?",
                        "Consistency, availability and partition tolerance",
                        "Classes, arrays and pointers",
                        "CPU, API and processes",
                        "Caching, authentication and privacy",
                        1
                ));

                questions.add(new Question(
                        "Which technique helps prevent SQL injection?",
                        "Parameterized queries",
                        "String concatenation",
                        "Disabling indexes",
                        "Using larger tables",
                        1
                ));

                questions.add(new Question(
                        "What is a deadlock in operating systems?",
                        "Processes wait indefinitely for resources",
                        "A crashed monitor",
                        "A full hard disk",
                        "A syntax error",
                        1
                ));

                questions.add(new Question(
                        "Which memory is typically fastest among these?",
                        "Hard disk",
                        "RAM",
                        "CPU cache",
                        "Optical disk",
                        3
                ));

                questions.add(new Question(
                        "What does REST commonly emphasize for web services?",
                        "Stateless client-server interaction",
                        "Desktop-only applications",
                        "Binary-only communication",
                        "Local-only storage",
                        1
                ));

                questions.add(new Question(
                        "Which Git command uploads local commits to a remote repository?",
                        "git pull",
                        "git push",
                        "git fetch",
                        "git init",
                        2
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which scheduling algorithm can cause starvation if priorities are not managed?",
                        "Priority scheduling",
                        "FCFS only",
                        "Round robin only",
                        "FIFO queue",
                        1
                ));

                questions.add(new Question(
                        "What is virtual memory?",
                        "Using secondary storage to extend apparent memory",
                        "A faster CPU",
                        "A type of monitor",
                        "A network cable",
                        1
                ));

                questions.add(new Question(
                        "Which database index structure is commonly used for range queries?",
                        "B-tree",
                        "Stack",
                        "Queue",
                        "Bitmap image",
                        1
                ));

                questions.add(new Question(
                        "What does idempotent mean for an HTTP operation?",
                        "Repeating it has the same intended effect",
                        "It always fails",
                        "It requires a browser",
                        "It encrypts data",
                        1
                ));

                questions.add(new Question(
                        "Which cryptographic approach uses a public and private key pair?",
                        "Asymmetric cryptography",
                        "Hashing only",
                        "Plain text",
                        "Compression",
                        1
                ));

                questions.add(new Question(
                        "What is a race condition?",
                        "Output depends on uncontrolled timing of concurrent operations",
                        "A network speed test",
                        "A CPU benchmark",
                        "A syntax rule",
                        1
                ));

                questions.add(new Question(
                        "Which design principle suggests a class should have one reason to change?",
                        "Single Responsibility Principle",
                        "Open/Closed Principle",
                        "Liskov Principle",
                        "Dependency Inversion only",
                        1
                ));

                questions.add(new Question(
                        "What is memoization?",
                        "Caching results of expensive function calls",
                        "Deleting variables",
                        "Encrypting databases",
                        "Compressing source code",
                        1
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
                        "Packaging an application with its dependencies",
                        "Increasing monitor resolution",
                        "Replacing all databases",
                        "Editing source images",
                        1
                ));
            }
        }

        // SCIENCE
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
                        "Which gas do plants absorb during photosynthesis?",
                        "Oxygen",
                        "Nitrogen",
                        "Carbon dioxide",
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
                        "Which vitamin is produced in the skin with sunlight exposure?",
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

            if (level == 2) {
                questions.add(new Question(
                        "What is the basic unit of life?",
                        "Atom",
                        "Cell",
                        "Tissue",
                        "Organ",
                        2
                ));

                questions.add(new Question(
                        "Which gas is essential for human respiration?",
                        "Oxygen",
                        "Nitrogen",
                        "Carbon dioxide",
                        "Helium",
                        1
                ));

                questions.add(new Question(
                        "What is the center of an atom called?",
                        "Electron cloud",
                        "Nucleus",
                        "Shell",
                        "Molecule",
                        2
                ));

                questions.add(new Question(
                        "Which blood cells help fight infections?",
                        "Red blood cells",
                        "White blood cells",
                        "Platelets",
                        "Plasma cells only",
                        2
                ));

                questions.add(new Question(
                        "Which part of a plant mainly absorbs water?",
                        "Flower",
                        "Root",
                        "Fruit",
                        "Stem",
                        2
                ));

                questions.add(new Question(
                        "What is the SI unit of force?",
                        "Joule",
                        "Newton",
                        "Watt",
                        "Pascal",
                        2
                ));

                questions.add(new Question(
                        "Which metal is liquid at room temperature?",
                        "Iron",
                        "Mercury",
                        "Copper",
                        "Aluminium",
                        2
                ));

                questions.add(new Question(
                        "What is the process by which plants make food?",
                        "Respiration",
                        "Photosynthesis",
                        "Digestion",
                        "Fermentation",
                        2
                ));

                questions.add(new Question(
                        "Which organ is primarily responsible for filtering blood?",
                        "Kidney",
                        "Lung",
                        "Stomach",
                        "Brain",
                        1
                ));

                questions.add(new Question(
                        "Sound cannot travel through which medium?",
                        "Air",
                        "Water",
                        "Steel",
                        "Vacuum",
                        4
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which particle has a negative electric charge?",
                        "Proton",
                        "Neutron",
                        "Electron",
                        "Photon",
                        3
                ));

                questions.add(new Question(
                        "What is the SI unit of power?",
                        "Joule",
                        "Watt",
                        "Newton",
                        "Volt",
                        2
                ));

                questions.add(new Question(
                        "Which gas is mainly responsible for the greenhouse effect among these?",
                        "Oxygen",
                        "Carbon dioxide",
                        "Nitrogen",
                        "Hydrogen",
                        2
                ));

                questions.add(new Question(
                        "What is the pH of a neutral solution at 25°C?",
                        "0",
                        "5",
                        "7",
                        "14",
                        3
                ));

                questions.add(new Question(
                        "Which law states that every action has an equal and opposite reaction?",
                        "Newton's First Law",
                        "Newton's Second Law",
                        "Newton's Third Law",
                        "Ohm's Law",
                        3
                ));

                questions.add(new Question(
                        "What is the powerhouse of the cell?",
                        "Nucleus",
                        "Ribosome",
                        "Mitochondrion",
                        "Golgi body",
                        3
                ));

                questions.add(new Question(
                        "Which blood group is commonly called the universal donor for red cells?",
                        "AB positive",
                        "O negative",
                        "A positive",
                        "B negative",
                        2
                ));

                questions.add(new Question(
                        "What is the speed of light in vacuum approximately?",
                        "3 × 10^6 m/s",
                        "3 × 10^8 m/s",
                        "3 × 10^10 m/s",
                        "3 × 10^12 m/s",
                        2
                ));

                questions.add(new Question(
                        "Which lens is used to correct myopia?",
                        "Convex",
                        "Concave",
                        "Cylindrical only",
                        "Bifocal only",
                        2
                ));

                questions.add(new Question(
                        "Which hormone regulates blood glucose level?",
                        "Insulin",
                        "Adrenaline",
                        "Thyroxine",
                        "Melatonin",
                        1
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "What is Avogadro's number approximately?",
                        "6.022 × 10^23",
                        "6.022 × 10^20",
                        "9.8 × 10^23",
                        "3.14 × 10^23",
                        1
                ));

                questions.add(new Question(
                        "Which principle explains why a ship floats?",
                        "Archimedes' principle",
                        "Pascal's law",
                        "Hooke's law",
                        "Boyle's law",
                        1
                ));

                questions.add(new Question(
                        "Which electromagnetic wave has the shortest wavelength?",
                        "Radio waves",
                        "Microwaves",
                        "Visible light",
                        "Gamma rays",
                        4
                ));

                questions.add(new Question(
                        "What is the SI unit of electric resistance?",
                        "Volt",
                        "Ohm",
                        "Ampere",
                        "Watt",
                        2
                ));

                questions.add(new Question(
                        "Which organelle is responsible for protein synthesis?",
                        "Ribosome",
                        "Lysosome",
                        "Vacuole",
                        "Centrosome",
                        1
                ));

                questions.add(new Question(
                        "Which process converts liquid into gas?",
                        "Condensation",
                        "Evaporation",
                        "Freezing",
                        "Sublimation only",
                        2
                ));

                questions.add(new Question(
                        "What is the main component of natural gas?",
                        "Methane",
                        "Ethane",
                        "Propane",
                        "Butane",
                        1
                ));

                questions.add(new Question(
                        "Which type of reaction releases heat?",
                        "Endothermic",
                        "Exothermic",
                        "Neutralization only",
                        "Photochemical only",
                        2
                ));

                questions.add(new Question(
                        "Which part of the brain controls balance and coordination?",
                        "Cerebrum",
                        "Cerebellum",
                        "Medulla",
                        "Hypothalamus",
                        2
                ));

                questions.add(new Question(
                        "Which acid is present in the stomach?",
                        "Sulfuric acid",
                        "Hydrochloric acid",
                        "Nitric acid",
                        "Acetic acid",
                        2
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "What is the approximate acceleration due to gravity near Earth's surface?",
                        "4.9 m/s²",
                        "9.8 m/s²",
                        "19.6 m/s²",
                        "98 m/s²",
                        2
                ));

                questions.add(new Question(
                        "Which quantum number describes the shape of an orbital?",
                        "Principal",
                        "Azimuthal",
                        "Magnetic",
                        "Spin",
                        2
                ));

                questions.add(new Question(
                        "What is the genetic material in most organisms?",
                        "DNA",
                        "ATP",
                        "Glucose",
                        "Lipid",
                        1
                ));

                questions.add(new Question(
                        "Which phenomenon causes the bending of light when it enters another medium?",
                        "Reflection",
                        "Refraction",
                        "Diffraction only",
                        "Polarization only",
                        2
                ));

                questions.add(new Question(
                        "What is the oxidation state of oxygen usually in water?",
                        "+2",
                        "-2",
                        "0",
                        "+1",
                        2
                ));

                questions.add(new Question(
                        "Which enzyme begins carbohydrate digestion in the mouth?",
                        "Pepsin",
                        "Amylase",
                        "Lipase",
                        "Trypsin",
                        2
                ));

                questions.add(new Question(
                        "What is the function of hemoglobin?",
                        "Transport oxygen",
                        "Digest fats",
                        "Produce insulin",
                        "Filter urine",
                        1
                ));

                questions.add(new Question(
                        "Which nuclear process powers the Sun?",
                        "Nuclear fission",
                        "Nuclear fusion",
                        "Radioactive decay",
                        "Combustion",
                        2
                ));

                questions.add(new Question(
                        "What is the Doppler effect?",
                        "Change in observed frequency due to relative motion",
                        "Splitting of atoms",
                        "Reflection of heat",
                        "Change in mass",
                        1
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
                        "F = ma",
                        "PV = nRT",
                        "V = IR",
                        1
                ));

                questions.add(new Question(
                        "What is entropy most closely associated with?",
                        "Measure of disorder or energy dispersal",
                        "Electric charge",
                        "Mass density",
                        "Magnetic field strength",
                        1
                ));

                questions.add(new Question(
                        "Which particle mediates the electromagnetic force?",
                        "Photon",
                        "Gluon",
                        "Electron",
                        "Neutron",
                        1
                ));

                questions.add(new Question(
                        "What is the approximate pKa of acetic acid?",
                        "2.76",
                        "4.76",
                        "7.00",
                        "9.25",
                        2
                ));

                questions.add(new Question(
                        "Which cellular process produces most ATP aerobically?",
                        "Glycolysis only",
                        "Oxidative phosphorylation",
                        "Transcription",
                        "Translation",
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
                        "Charles's law",
                        "Avogadro's law",
                        "Faraday's law",
                        1
                ));

                questions.add(new Question(
                        "What is a catalyst's main effect on a reaction?",
                        "Lowers activation energy",
                        "Changes equilibrium constant",
                        "Gets permanently consumed",
                        "Changes products",
                        1
                ));

                questions.add(new Question(
                        "Which particle has no electric charge?",
                        "Proton",
                        "Electron",
                        "Neutron",
                        "Positron",
                        3
                ));

                questions.add(new Question(
                        "What is the main cause of Earth's seasons?",
                        "Earth's axial tilt",
                        "Distance from Sun alone",
                        "Moon's gravity",
                        "Ocean currents",
                        1
                ));
            }
        }

        // HISTORY
        else if (category.equals("History")) {

            if (level == 1) {
                questions.add(new Question(
                        "Who founded the Maurya Empire?",
                        "Ashoka",
                        "Chandragupta Maurya",
                        "Bindusara",
                        "Harsha",
                        2
                ));

                questions.add(new Question(
                        "Who was known as the Father of the Nation in India?",
                        "Jawaharlal Nehru",
                        "Mahatma Gandhi",
                        "Sardar Patel",
                        "B. R. Ambedkar",
                        2
                ));

                questions.add(new Question(
                        "In which year did India gain independence?",
                        "1945",
                        "1947",
                        "1950",
                        "1952",
                        2
                ));

                questions.add(new Question(
                        "Who built the Taj Mahal?",
                        "Akbar",
                        "Shah Jahan",
                        "Aurangzeb",
                        "Humayun",
                        2
                ));

                questions.add(new Question(
                        "Who was the first Mughal emperor of India?",
                        "Akbar",
                        "Babur",
                        "Humayun",
                        "Jahangir",
                        2
                ));

                questions.add(new Question(
                        "The Battle of Plassey was fought in which year?",
                        "1757",
                        "1764",
                        "1857",
                        "1707",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Maratha Empire?",
                        "Bajirao I",
                        "Chhatrapati Shivaji Maharaj",
                        "Sambhaji Maharaj",
                        "Balaji Vishwanath",
                        2
                ));

                questions.add(new Question(
                        "Who gave the slogan 'Do or Die'?",
                        "Subhas Chandra Bose",
                        "Mahatma Gandhi",
                        "Bhagat Singh",
                        "Bal Gangadhar Tilak",
                        2
                ));

                questions.add(new Question(
                        "The Dandi March was associated with which movement?",
                        "Quit India Movement",
                        "Civil Disobedience Movement",
                        "Swadeshi Movement",
                        "Non-Cooperation Movement",
                        2
                ));

                questions.add(new Question(
                        "Who was the first President of independent India?",
                        "Rajendra Prasad",
                        "S. Radhakrishnan",
                        "Jawaharlal Nehru",
                        "Sardar Patel",
                        1
                ));
            }

            if (level == 2) {
                questions.add(new Question(
                        "Who was the last major Mauryan emperor?",
                        "Chandragupta Maurya",
                        "Ashoka",
                        "Bindusara",
                        "Brihadratha",
                        2
                ));

                questions.add(new Question(
                        "Which ancient university was located in present-day Bihar?",
                        "Nalanda",
                        "Takshashila",
                        "Vikramashila",
                        "All of these",
                        4
                ));

                questions.add(new Question(
                        "Who wrote Arthashastra?",
                        "Kalidasa",
                        "Kautilya",
                        "Banabhatta",
                        "Megasthenes",
                        2
                ));

                questions.add(new Question(
                        "Who was the founder of the Gupta dynasty?",
                        "Chandragupta I",
                        "Samudragupta",
                        "Sri Gupta",
                        "Skandagupta",
                        3
                ));

                questions.add(new Question(
                        "Which ruler is associated with the Kalinga War?",
                        "Chandragupta Maurya",
                        "Ashoka",
                        "Harsha",
                        "Kanishka",
                        2
                ));

                questions.add(new Question(
                        "Who founded the Slave Dynasty?",
                        "Qutb-ud-din Aibak",
                        "Iltutmish",
                        "Balban",
                        "Alauddin Khalji",
                        1
                ));

                questions.add(new Question(
                        "Who introduced the Mansabdari system in the Mughal Empire?",
                        "Akbar",
                        "Babur",
                        "Shah Jahan",
                        "Aurangzeb",
                        1
                ));

                questions.add(new Question(
                        "Who wrote Akbarnama?",
                        "Abul Fazl",
                        "Amir Khusrau",
                        "Badauni",
                        "Tulsidas",
                        1
                ));

                questions.add(new Question(
                        "The Revolt of 1857 began at which place?",
                        "Delhi",
                        "Meerut",
                        "Kanpur",
                        "Lucknow",
                        2
                ));

                questions.add(new Question(
                        "Who founded the Indian National Congress?",
                        "A. O. Hume",
                        "Dadabhai Naoroji",
                        "Gopal Krishna Gokhale",
                        "W. C. Bonnerjee",
                        1
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which dynasty built the Brihadeeswarar Temple at Thanjavur?",
                        "Chola",
                        "Pallava",
                        "Chalukya",
                        "Gupta",
                        1
                ));

                questions.add(new Question(
                        "Who was the author of Rajatarangini?",
                        "Kalhana",
                        "Kalidasa",
                        "Banabhatta",
                        "Vishakhadatta",
                        1
                ));

                questions.add(new Question(
                        "Which Gupta ruler is known for extensive conquests?",
                        "Chandragupta II",
                        "Samudragupta",
                        "Skandagupta",
                        "Kumaragupta",
                        2
                ));

                questions.add(new Question(
                        "Which Delhi Sultan is associated with market control reforms?",
                        "Iltutmish",
                        "Alauddin Khalji",
                        "Firoz Shah Tughlaq",
                        "Sikandar Lodi",
                        2
                ));

                questions.add(new Question(
                        "Who was the first woman ruler of the Delhi Sultanate?",
                        "Nur Jahan",
                        "Razia Sultan",
                        "Rani Durgavati",
                        "Rani Lakshmibai",
                        2
                ));

                questions.add(new Question(
                        "Which Mughal emperor abolished the jizya in 1564?",
                        "Akbar",
                        "Aurangzeb",
                        "Jahangir",
                        "Humayun",
                        1
                ));

                questions.add(new Question(
                        "The Treaty of Purandar was signed in 1665 between Shivaji Maharaj and whom?",
                        "Shaista Khan",
                        "Jai Singh I",
                        "Aurangzeb",
                        "Afzal Khan",
                        2
                ));

                questions.add(new Question(
                        "Who started the Home Rule movement in India along with Annie Besant?",
                        "Bal Gangadhar Tilak",
                        "Gandhi",
                        "Nehru",
                        "Patel",
                        1
                ));

                questions.add(new Question(
                        "The Non-Cooperation Movement was launched in which year?",
                        "1919",
                        "1920",
                        "1922",
                        "1930",
                        2
                ));

                questions.add(new Question(
                        "Who presided over the Lahore session of Congress in 1929?",
                        "Mahatma Gandhi",
                        "Jawaharlal Nehru",
                        "Sardar Patel",
                        "Subhas Chandra Bose",
                        2
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which inscription provides information about Samudragupta's conquests?",
                        "Allahabad Pillar inscription",
                        "Junagadh inscription",
                        "Hathigumpha inscription",
                        "Aihole inscription",
                        1
                ));

                questions.add(new Question(
                        "Who was the ruler of the Chalukyas of Badami known for defeating Harsha?",
                        "Pulakeshin II",
                        "Vikramaditya I",
                        "Kirtivarman I",
                        "Mangalesha",
                        1
                ));

                questions.add(new Question(
                        "Which Bhakti saint is associated with Varkari tradition?",
                        "Tukaram",
                        "Kabir",
                        "Surdas",
                        "Mirabai",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Vijayanagara Empire?",
                        "Harihara and Bukka",
                        "Krishnadevaraya and Bukka",
                        "Devaraya and Harihara",
                        "Rama Raya and Bukka",
                        1
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
                        "Lord Cornwallis",
                        "Lord Wellesley",
                        "Lord Dalhousie",
                        "Lord Curzon",
                        1
                ));

                questions.add(new Question(
                        "The Swadeshi Movement began mainly in response to which event?",
                        "Partition of Bengal",
                        "Rowlatt Act",
                        "Jallianwala Bagh",
                        "Simon Commission",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Forward Bloc?",
                        "Subhas Chandra Bose",
                        "Jawaharlal Nehru",
                        "Rajendra Prasad",
                        "C. R. Das",
                        1
                ));

                questions.add(new Question(
                        "The Cabinet Mission came to India in which year?",
                        "1942",
                        "1945",
                        "1946",
                        "1947",
                        3
                ));

                questions.add(new Question(
                        "Who was the first Governor-General of independent India?",
                        "Lord Mountbatten",
                        "C. Rajagopalachari",
                        "Warren Hastings",
                        "Rajendra Prasad",
                        1
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which ancient text is attributed to Panini?",
                        "Ashtadhyayi",
                        "Arthashastra",
                        "Indica",
                        "Mudrarakshasa",
                        1
                ));

                questions.add(new Question(
                        "The Hathigumpha inscription is associated with which ruler?",
                        "Kharavela",
                        "Ashoka",
                        "Rudradaman",
                        "Samudragupta",
                        1
                ));

                questions.add(new Question(
                        "Which Chola ruler sent naval expeditions to Southeast Asia?",
                        "Rajendra Chola I",
                        "Rajaraja I",
                        "Kulottunga I",
                        "Aditya I",
                        1
                ));

                questions.add(new Question(
                        "Who was the author of Prithviraj Raso?",
                        "Chand Bardai",
                        "Kalhana",
                        "Amir Khusrau",
                        "Bana",
                        1
                ));

                questions.add(new Question(
                        "Which Mughal emperor's reign is associated with the translation of Mahabharata into Persian as Razmnama?",
                        "Akbar",
                        "Jahangir",
                        "Shah Jahan",
                        "Aurangzeb",
                        1
                ));

                questions.add(new Question(
                        "The Ilbert Bill controversy occurred during the viceroyalty of whom?",
                        "Lord Ripon",
                        "Lord Lytton",
                        "Lord Curzon",
                        "Lord Dufferin",
                        1
                ));

                questions.add(new Question(
                        "Which Congress session declared Purna Swaraj as its goal?",
                        "Lahore, 1929",
                        "Calcutta, 1906",
                        "Surat, 1907",
                        "Lucknow, 1916",
                        1
                ));

                questions.add(new Question(
                        "The Gandhi-Irwin Pact was signed in which year?",
                        "1928",
                        "1931",
                        "1935",
                        "1942",
                        2
                ));

                questions.add(new Question(
                        "Which Act introduced provincial autonomy in British India?",
                        "Government of India Act 1919",
                        "Government of India Act 1935",
                        "Indian Councils Act 1909",
                        "Charter Act 1833",
                        2
                ));

                questions.add(new Question(
                        "Who led the Indian National Army in its later phase?",
                        "Subhas Chandra Bose",
                        "Rash Behari Bose",
                        "Bhagat Singh",
                        "Lala Lajpat Rai",
                        1
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which source is a major account of ancient India by Megasthenes?",
                        "Indica",
                        "Periplus",
                        "Arthashastra",
                        "Rajatarangini",
                        1
                ));

                questions.add(new Question(
                        "Which Gupta ruler adopted the title Vikramaditya?",
                        "Chandragupta II",
                        "Samudragupta",
                        "Kumaragupta",
                        "Skandagupta",
                        1
                ));

                questions.add(new Question(
                        "The Second Battle of Tarain was fought in which year?",
                        "1191",
                        "1192",
                        "1206",
                        "1210",
                        2
                ));

                questions.add(new Question(
                        "Who established the Ryotwari system in parts of British India?",
                        "Thomas Munro",
                        "Cornwallis",
                        "Wellesley",
                        "Dalhousie",
                        1
                ));

                questions.add(new Question(
                        "Which event immediately preceded the launch of the Quit India Movement?",
                        "Cripps Mission failure",
                        "Simon Commission",
                        "Partition of Bengal",
                        "Dandi March",
                        1
                ));

                questions.add(new Question(
                        "The August Offer was made by the British government in which year?",
                        "1939",
                        "1940",
                        "1942",
                        "1945",
                        2
                ));

                questions.add(new Question(
                        "Who was the president of the Constituent Assembly?",
                        "B. R. Ambedkar",
                        "Rajendra Prasad",
                        "Jawaharlal Nehru",
                        "Sardar Patel",
                        2
                ));

                questions.add(new Question(
                        "Which agreement ended the First Anglo-Maratha War?",
                        "Treaty of Salbai",
                        "Treaty of Purandar",
                        "Treaty of Bassein",
                        "Treaty of Surat",
                        1
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
                        "B. R. Ambedkar",
                        "Madan Mohan Malaviya",
                        "Rajendra Prasad",
                        "M. A. Jinnah",
                        1
                ));
            }
        }

        // SPORTS
        else if (category.equals("Sports")) {

            if (level == 1) {
                questions.add(new Question(
                        "How many players are there in a cricket team?",
                        "9",
                        "10",
                        "11",
                        "12",
                        3
                ));

                questions.add(new Question(
                        "Which sport uses a shuttlecock?",
                        "Tennis",
                        "Badminton",
                        "Hockey",
                        "Squash",
                        2
                ));

                questions.add(new Question(
                        "How many rings are on the Olympic flag?",
                        "4",
                        "5",
                        "6",
                        "7",
                        2
                ));

                questions.add(new Question(
                        "Which country is associated with sumo wrestling?",
                        "China",
                        "Japan",
                        "Korea",
                        "Thailand",
                        2
                ));

                questions.add(new Question(
                        "In football, how many players from one team are normally on the field?",
                        "9",
                        "10",
                        "11",
                        "12",
                        3
                ));

                questions.add(new Question(
                        "Which sport is played at Wimbledon?",
                        "Football",
                        "Tennis",
                        "Cricket",
                        "Hockey",
                        2
                ));

                questions.add(new Question(
                        "What is the highest score possible with one dart?",
                        "50",
                        "60",
                        "100",
                        "180",
                        4
                ));

                questions.add(new Question(
                        "Which sport uses a bat, ball and wickets?",
                        "Baseball",
                        "Cricket",
                        "Hockey",
                        "Rugby",
                        2
                ));

                questions.add(new Question(
                        "How many points is a basketball free throw worth?",
                        "1",
                        "2",
                        "3",
                        "4",
                        1
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
                        "2",
                        "3",
                        "4",
                        "5",
                        3
                ));

                questions.add(new Question(
                        "Which sport awards the Davis Cup?",
                        "Tennis",
                        "Golf",
                        "Hockey",
                        "Football",
                        1
                ));

                questions.add(new Question(
                        "What is a hat-trick in cricket?",
                        "Three wickets in three consecutive balls",
                        "Three runs in one ball",
                        "Three catches in an innings",
                        "Three boundaries",
                        1
                ));

                questions.add(new Question(
                        "Which sport uses the term 'birdie'?",
                        "Golf",
                        "Cricket",
                        "Tennis",
                        "Boxing",
                        1
                ));

                questions.add(new Question(
                        "How long is an Olympic swimming pool?",
                        "25 m",
                        "50 m",
                        "75 m",
                        "100 m",
                        2
                ));

                questions.add(new Question(
                        "Which country won the first Cricket World Cup in 1975?",
                        "Australia",
                        "West Indies",
                        "England",
                        "India",
                        2
                ));

                questions.add(new Question(
                        "What is the standard marathon distance?",
                        "40.195 km",
                        "41.195 km",
                        "42.195 km",
                        "43.195 km",
                        3
                ));

                questions.add(new Question(
                        "Which sport has positions such as scrum-half and fly-half?",
                        "Rugby",
                        "Football",
                        "Basketball",
                        "Volleyball",
                        1
                ));

                questions.add(new Question(
                        "How many players are on court for one volleyball team?",
                        "5",
                        "6",
                        "7",
                        "8",
                        2
                ));

                questions.add(new Question(
                        "Which sport is associated with the Ryder Cup?",
                        "Golf",
                        "Tennis",
                        "Cricket",
                        "Boxing",
                        1
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Who is awarded the Ballon d'Or?",
                        "Best football player",
                        "Best cricketer",
                        "Best tennis player",
                        "Best swimmer",
                        1
                ));

                questions.add(new Question(
                        "In cricket, what does LBW stand for?",
                        "Leg Before Wicket",
                        "Long Ball Wicket",
                        "Leg Bat Wicket",
                        "Left Before Wicket",
                        1
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
                        "3",
                        "6",
                        "7",
                        "8",
                        2
                ));

                questions.add(new Question(
                        "What is the term for zero in tennis?",
                        "Nil",
                        "Love",
                        "Duck",
                        "Blank",
                        2
                ));

                questions.add(new Question(
                        "Which sport features the pommel horse?",
                        "Gymnastics",
                        "Equestrian",
                        "Wrestling",
                        "Cycling",
                        1
                ));

                questions.add(new Question(
                        "The Ashes is contested between England and which country?",
                        "India",
                        "Australia",
                        "South Africa",
                        "New Zealand",
                        2
                ));

                questions.add(new Question(
                        "Which sport uses a puck?",
                        "Ice hockey",
                        "Field hockey",
                        "Lacrosse",
                        "Curling",
                        1
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
                        "Germany",
                        "Argentina",
                        "Brazil",
                        "Italy",
                        3
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "In cricket, how many legal balls are there in a standard over?",
                        "5",
                        "6",
                        "7",
                        "8",
                        2
                ));

                questions.add(new Question(
                        "Which tennis Grand Slam is played on clay?",
                        "Wimbledon",
                        "US Open",
                        "French Open",
                        "Australian Open",
                        3
                ));

                questions.add(new Question(
                        "What is the maximum break in snooker?",
                        "147",
                        "155",
                        "180",
                        "200",
                        1
                ));

                questions.add(new Question(
                        "Which country hosted the 2016 Summer Olympics?",
                        "Brazil",
                        "China",
                        "UK",
                        "Japan",
                        1
                ));

                questions.add(new Question(
                        "In Formula 1, what does pole position mean?",
                        "Fastest qualifying position at the front",
                        "Last position",
                        "Pit-lane position",
                        "Championship lead",
                        1
                ));

                questions.add(new Question(
                        "Which sport has the Stanley Cup?",
                        "Ice hockey",
                        "Baseball",
                        "Basketball",
                        "Football",
                        1
                ));

                questions.add(new Question(
                        "How many gold medals are awarded for an individual Olympic event?",
                        "1",
                        "2",
                        "3",
                        "4",
                        1
                ));

                questions.add(new Question(
                        "Which Indian sportsperson is associated with the term 'Flying Sikh'?",
                        "Milkha Singh",
                        "Dhyan Chand",
                        "Abhinav Bindra",
                        "P. T. Usha",
                        1
                ));

                questions.add(new Question(
                        "In chess, which piece can move in an L-shape?",
                        "Bishop",
                        "Knight",
                        "Rook",
                        "Queen",
                        2
                ));

                questions.add(new Question(
                        "Which country originated modern table tennis?",
                        "England",
                        "China",
                        "Japan",
                        "USA",
                        1
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "What is the Duckworth-Lewis-Stern method used for?",
                        "Setting targets in rain-affected limited-overs cricket",
                        "Ranking tennis players",
                        "Timing races",
                        "Scoring gymnastics",
                        1
                ));

                questions.add(new Question(
                        "In chess, what is stalemate?",
                        "A draw where the player to move has no legal move and is not in check",
                        "Checkmate",
                        "A winning move",
                        "A repeated opening",
                        1
                ));

                questions.add(new Question(
                        "Which cycling race is one of the three Grand Tours?",
                        "Tour de France",
                        "Paris Masters",
                        "Davis Cup",
                        "Six Nations",
                        1
                ));

                questions.add(new Question(
                        "What is the standard height of a basketball hoop?",
                        "2.75 m",
                        "3.05 m",
                        "3.25 m",
                        "3.50 m",
                        2
                ));

                questions.add(new Question(
                        "Which athlete won India's first individual Olympic gold medal?",
                        "Neeraj Chopra",
                        "Abhinav Bindra",
                        "Sushil Kumar",
                        "Rajyavardhan Rathore",
                        2
                ));

                questions.add(new Question(
                        "Which sport uses the term 'ippon'?",
                        "Judo",
                        "Boxing",
                        "Fencing",
                        "Archery",
                        1
                ));

                questions.add(new Question(
                        "What is the maximum score in a single frame of ten-pin bowling?",
                        "20",
                        "30",
                        "40",
                        "50",
                        2
                ));

                questions.add(new Question(
                        "Which event combines swimming, cycling and running?",
                        "Triathlon",
                        "Decathlon",
                        "Pentathlon",
                        "Heptathlon",
                        1
                ));

                questions.add(new Question(
                        "In baseball, how many strikes usually result in a strikeout?",
                        "2",
                        "3",
                        "4",
                        "5",
                        2
                ));

                questions.add(new Question(
                        "Which country is famous for the All Blacks rugby team?",
                        "Australia",
                        "New Zealand",
                        "South Africa",
                        "England",
                        2
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "In cricket, what is a 'googly'?",
                        "A deceptive delivery by a leg-spinner",
                        "A type of bat",
                        "A fielding position",
                        "A batting shot",
                        1
                ));

                questions.add(new Question(
                        "Which Formula 1 flag indicates the race has been stopped?",
                        "Yellow",
                        "Red",
                        "Blue",
                        "Green",
                        2
                ));

                questions.add(new Question(
                        "In tennis, what is a 'break point'?",
                        "A point that could win the receiving player the game",
                        "A point after a tie-break",
                        "The first point",
                        "A service fault",
                        1
                ));

                questions.add(new Question(
                        "Which Olympic event includes the disciplines 100m, long jump, shot put and high jump?",
                        "Decathlon",
                        "Pentathlon",
                        "Heptathlon",
                        "Triathlon",
                        1
                ));

                questions.add(new Question(
                        "What is the term for three consecutive strikes in bowling?",
                        "Turkey",
                        "Eagle",
                        "Hat-trick",
                        "Triple",
                        1
                ));

                questions.add(new Question(
                        "Which country has hosted the Summer Olympics most often as of the modern era?",
                        "USA",
                        "France",
                        "UK",
                        "Japan",
                        1
                ));

                questions.add(new Question(
                        "In volleyball, what is a libero primarily known for?",
                        "Defensive specialist",
                        "Server only",
                        "Attacker only",
                        "Referee",
                        1
                ));

                questions.add(new Question(
                        "Which boxing weight class is above lightweight and below welterweight?",
                        "Featherweight",
                        "Light welterweight",
                        "Middleweight",
                        "Heavyweight",
                        2
                ));

                questions.add(new Question(
                        "What is the name of the trophy awarded to the winner of the ICC Men's Cricket World Cup?",
                        "Webb Ellis Cup",
                        "Cricket World Cup Trophy",
                        "Davis Cup",
                        "Bledisloe Cup",
                        2
                ));

                questions.add(new Question(
                        "In athletics, what is the steeplechase?",
                        "Distance race with barriers and water jump",
                        "Short sprint",
                        "Long jump event",
                        "Walking event",
                        1
                ));
            }
        }

        // UPSC
        else if (category.equals("UPSC")) {

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
                        "How many Fundamental Rights are currently guaranteed?",
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
                        "Which house is called the House of the People?",
                        "Rajya Sabha",
                        "Lok Sabha",
                        "Vidhan Sabha",
                        "Vidhan Parishad",
                        2
                ));

                questions.add(new Question(
                        "What is the minimum age to become President of India?",
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
                        "Which Article protects life and personal liberty?",
                        "Article 14",
                        "Article 19",
                        "Article 21",
                        "Article 32",
                        3
                ));

                questions.add(new Question(
                        "Who was Chairman of the Drafting Committee?",
                        "Jawaharlal Nehru",
                        "B. R. Ambedkar",
                        "Rajendra Prasad",
                        "Sardar Patel",
                        2
                ));

                questions.add(new Question(
                        "Directive Principles were inspired by the Constitution of:",
                        "USA",
                        "Ireland",
                        "Canada",
                        "Australia",
                        2
                ));

                questions.add(new Question(
                        "Fundamental Duties were added by which amendment?",
                        "42nd",
                        "44th",
                        "73rd",
                        "86th",
                        1
                ));

                questions.add(new Question(
                        "Rajya Sabha is a:",
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
                        "The Supreme Court is located in:",
                        "Mumbai",
                        "New Delhi",
                        "Kolkata",
                        "Chennai",
                        2
                ));

                questions.add(new Question(
                        "Which amendment lowered voting age from 21 to 18?",
                        "42nd",
                        "44th",
                        "61st",
                        "73rd",
                        3
                ));

                questions.add(new Question(
                        "Which Article is associated with constitutional remedies?",
                        "Article 14",
                        "Article 19",
                        "Article 21",
                        "Article 32",
                        4
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Which schedule contains provisions relating to anti-defection?",
                        "Eighth",
                        "Tenth",
                        "Eleventh",
                        "Twelfth",
                        2
                ));

                questions.add(new Question(
                        "Which constitutional amendment gave constitutional status to Panchayats?",
                        "42nd",
                        "61st",
                        "73rd",
                        "74th",
                        3
                ));

                questions.add(new Question(
                        "Which constitutional amendment gave constitutional status to municipalities?",
                        "73rd",
                        "74th",
                        "86th",
                        "91st",
                        2
                ));

                questions.add(new Question(
                        "Who is the ex-officio Chairman of Rajya Sabha?",
                        "President",
                        "Vice President",
                        "Prime Minister",
                        "Speaker",
                        2
                ));

                questions.add(new Question(
                        "A Money Bill can be introduced only in:",
                        "Rajya Sabha",
                        "Lok Sabha",
                        "Either House",
                        "State Assembly only",
                        2
                ));

                questions.add(new Question(
                        "Who decides whether a bill is a Money Bill?",
                        "President",
                        "Prime Minister",
                        "Lok Sabha Speaker",
                        "Finance Minister",
                        3
                ));

                questions.add(new Question(
                        "Which Article deals with amendment of the Constitution?",
                        "Article 32",
                        "Article 356",
                        "Article 368",
                        "Article 370",
                        3
                ));

                questions.add(new Question(
                        "The President of India is elected by:",
                        "Direct vote of citizens",
                        "Elected MPs and elected MLAs",
                        "Only Parliament",
                        "Only state legislatures",
                        2
                ));

                questions.add(new Question(
                        "Which body recommends distribution of tax revenues between Union and States?",
                        "Finance Commission",
                        "Election Commission",
                        "UPSC",
                        "NITI Aayog",
                        1
                ));

                questions.add(new Question(
                        "The Comptroller and Auditor General is appointed by:",
                        "Prime Minister",
                        "President",
                        "Parliament",
                        "Chief Justice",
                        2
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which writ is used to produce a person alleged to be unlawfully detained?",
                        "Mandamus",
                        "Habeas Corpus",
                        "Certiorari",
                        "Quo Warranto",
                        2
                ));

                questions.add(new Question(
                        "Which writ commands a public authority to perform a legal duty?",
                        "Habeas Corpus",
                        "Mandamus",
                        "Prohibition",
                        "Quo Warranto",
                        2
                ));

                questions.add(new Question(
                        "Which Article provides for President's Rule in a state?",
                        "352",
                        "356",
                        "360",
                        "365",
                        2
                ));

                questions.add(new Question(
                        "National Emergency can be proclaimed on grounds including:",
                        "War, external aggression or armed rebellion",
                        "Financial crisis only",
                        "Elections only",
                        "Natural disasters only",
                        1
                ));

                questions.add(new Question(
                        "The basic structure doctrine was established in which case?",
                        "Golaknath case",
                        "Kesavananda Bharati case",
                        "Minerva Mills case",
                        "Maneka Gandhi case",
                        2
                ));

                questions.add(new Question(
                        "Which institution is the final interpreter of the Constitution?",
                        "Parliament",
                        "Supreme Court",
                        "Election Commission",
                        "President",
                        2
                ));

                questions.add(new Question(
                        "The Attorney General of India is appointed by:",
                        "President",
                        "Prime Minister",
                        "Chief Justice",
                        "Parliament",
                        1
                ));

                questions.add(new Question(
                        "Which Article deals with equality of opportunity in public employment?",
                        "Article 14",
                        "Article 15",
                        "Article 16",
                        "Article 17",
                        3
                ));

                questions.add(new Question(
                        "Which part of the Constitution contains Fundamental Duties?",
                        "Part III",
                        "Part IVA",
                        "Part IV",
                        "Part V",
                        2
                ));

                questions.add(new Question(
                        "Which body conducts elections to Parliament and state legislatures?",
                        "UPSC",
                        "Election Commission of India",
                        "Finance Commission",
                        "CAG",
                        2
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which principle limits Parliament's amending power?",
                        "Doctrine of pleasure",
                        "Basic structure doctrine",
                        "Collective responsibility",
                        "Separation of religion",
                        2
                ));

                questions.add(new Question(
                        "Which case expanded the interpretation of Article 21 significantly?",
                        "Maneka Gandhi case",
                        "Shah Bano case",
                        "Berubari case",
                        "S. R. Bommai case",
                        1
                ));

                questions.add(new Question(
                        "Which schedule deals with allocation of seats in Rajya Sabha?",
                        "Third",
                        "Fourth",
                        "Fifth",
                        "Sixth",
                        2
                ));

                questions.add(new Question(
                        "Which schedule contains forms of oaths and affirmations?",
                        "Second",
                        "Third",
                        "Fourth",
                        "Fifth",
                        2
                ));

                questions.add(new Question(
                        "Which schedule deals with tribal areas in Assam, Meghalaya, Tripura and Mizoram?",
                        "Fifth",
                        "Sixth",
                        "Seventh",
                        "Ninth",
                        2
                ));

                questions.add(new Question(
                        "Which list contains subjects on which only Parliament normally legislates?",
                        "State List",
                        "Union List",
                        "Concurrent List",
                        "Residuary List",
                        2
                ));

                questions.add(new Question(
                        "Residuary legislative powers in India belong to:",
                        "States",
                        "Union Parliament",
                        "President alone",
                        "Supreme Court",
                        2
                ));

                questions.add(new Question(
                        "The Inter-State Council is provided under which Article?",
                        "263",
                        "280",
                        "324",
                        "356",
                        1
                ));

                questions.add(new Question(
                        "Which body replaced the Planning Commission?",
                        "Finance Commission",
                        "NITI Aayog",
                        "GST Council",
                        "CAG",
                        2
                ));

                questions.add(new Question(
                        "The GST Council is established under which Article?",
                        "279A",
                        "280",
                        "301",
                        "312",
                        1
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which constitutional provision enables Parliament to legislate on a State List subject in national interest when Rajya Sabha passes a resolution?",
                        "Article 249",
                        "Article 250",
                        "Article 252",
                        "Article 253",
                        1
                ));

                questions.add(new Question(
                        "Under Article 312, Parliament can create:",
                        "All-India Services",
                        "Municipal bodies",
                        "Election tribunals only",
                        "State legislatures",
                        1
                ));

                questions.add(new Question(
                        "Which case is closely associated with the federal character of the Constitution and President's Rule?",
                        "S. R. Bommai case",
                        "Kesavananda Bharati case",
                        "Golaknath case",
                        "ADM Jabalpur case",
                        1
                ));

                questions.add(new Question(
                        "Which Article empowers the Supreme Court to issue writs for Fundamental Rights?",
                        "32",
                        "136",
                        "226",
                        "143",
                        1
                ));

                questions.add(new Question(
                        "High Courts can issue writs under which Article?",
                        "32",
                        "136",
                        "226",
                        "280",
                        3
                ));

                questions.add(new Question(
                        "Which amendment inserted the words Socialist, Secular and Integrity into the Preamble?",
                        "24th",
                        "42nd",
                        "44th",
                        "52nd",
                        2
                ));

                questions.add(new Question(
                        "Which amendment introduced the anti-defection provisions?",
                        "42nd",
                        "44th",
                        "52nd",
                        "61st",
                        3
                ));

                questions.add(new Question(
                        "Which amendment lowered the voting age to 18?",
                        "42nd",
                        "44th",
                        "61st",
                        "73rd",
                        3
                ));

                questions.add(new Question(
                        "Which constitutional authority audits Union and State government accounts?",
                        "CAG",
                        "Finance Commission",
                        "UPSC",
                        "Election Commission",
                        1
                ));

                questions.add(new Question(
                        "The doctrine of parliamentary sovereignty in India is limited primarily by:",
                        "Judicial review and the Constitution",
                        "Governor's powers",
                        "Local governments",
                        "Customary law alone",
                        1
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
                        "Which river is one of the major rivers of Maharashtra and flows eastward?",
                        "Godavari",
                        "Sabarmati",
                        "Yamuna",
                        "Sutlej",
                        1
                ));

                questions.add(new Question(
                        "Which city is famous for Deekshabhoomi?",
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
                        "Which fort was the capital of Chhatrapati Shivaji Maharaj's kingdom?",
                        "Raigad",
                        "Red Fort",
                        "Agra Fort",
                        "Golconda",
                        1
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
                        "Pune",
                        "Nagpur",
                        "Nashik",
                        "Satara",
                        1
                ));

                questions.add(new Question(
                        "Which fort is located near Pune and is associated with Shivaji Maharaj?",
                        "Torna",
                        "Red Fort",
                        "Chittorgarh",
                        "Golconda",
                        1
                ));

                questions.add(new Question(
                        "Which hill station is known as the Queen of the Sahyadri?",
                        "Mahabaleshwar",
                        "Lonavala",
                        "Matheran",
                        "Panchgani",
                        1
                ));

                questions.add(new Question(
                        "Which district is famous for the Ellora Caves?",
                        "Aurangabad/Chhatrapati Sambhajinagar",
                        "Pune",
                        "Nashik",
                        "Kolhapur",
                        1
                ));

                questions.add(new Question(
                        "Which UNESCO World Heritage site is near Mumbai?",
                        "Ajanta Caves",
                        "Elephanta Caves",
                        "Sanchi",
                        "Hampi",
                        2
                ));

                questions.add(new Question(
                        "Which city is associated with the Kumbh Mela in Maharashtra?",
                        "Nashik",
                        "Pune",
                        "Kolhapur",
                        "Solapur",
                        1
                ));

                questions.add(new Question(
                        "Which river is a major tributary of the Krishna in Maharashtra?",
                        "Bhima",
                        "Ganga",
                        "Yamuna",
                        "Chambal",
                        1
                ));

                questions.add(new Question(
                        "Which crop is strongly associated with the black soil regions of Maharashtra?",
                        "Cotton",
                        "Tea",
                        "Jute",
                        "Rubber",
                        1
                ));

                questions.add(new Question(
                        "Which city is a major center of Maharashtra's sugar industry?",
                        "Kolhapur",
                        "Mumbai",
                        "Nashik",
                        "Nagpur",
                        1
                ));
            }

            if (level == 3) {
                questions.add(new Question(
                        "Who was the spiritual guide traditionally associated with Chhatrapati Shivaji Maharaj?",
                        "Samarth Ramdas",
                        "Sant Tukaram",
                        "Dnyaneshwar",
                        "Namdev",
                        1
                ));

                questions.add(new Question(
                        "Who wrote the Dnyaneshwari?",
                        "Sant Dnyaneshwar",
                        "Sant Tukaram",
                        "Eknath",
                        "Namdev",
                        1
                ));

                questions.add(new Question(
                        "Who wrote the famous Marathi devotional work 'Abhangas'?",
                        "Sant Tukaram",
                        "Kalidasa",
                        "Banabhatta",
                        "Bhasa",
                        1
                ));

                questions.add(new Question(
                        "Which social reformer founded Satyashodhak Samaj?",
                        "Jyotirao Phule",
                        "M. G. Ranade",
                        "Gopal Hari Deshmukh",
                        "V. D. Savarkar",
                        1
                ));

                questions.add(new Question(
                        "Satyashodhak Samaj was founded in which year?",
                        "1873",
                        "1885",
                        "1905",
                        "1920",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Prarthana Samaj along with others in Bombay Presidency context?",
                        "Atmaram Pandurang",
                        "Jyotirao Phule",
                        "Tilak",
                        "Savarkar",
                        1
                ));

                questions.add(new Question(
                        "Which newspaper was started by Bal Gangadhar Tilak?",
                        "Kesari",
                        "Harijan",
                        "Young India",
                        "The Hindu",
                        1
                ));

                questions.add(new Question(
                        "Who is associated with the reform movement against social injustice in Maharashtra and women's education?",
                        "Savitribai Phule",
                        "Rani Lakshmibai",
                        "Sarojini Naidu",
                        "Annie Besant",
                        1
                ));

                questions.add(new Question(
                        "Which fort is associated with the coronation of Shivaji Maharaj?",
                        "Raigad",
                        "Sinhagad",
                        "Pratapgad",
                        "Shivneri",
                        1
                ));

                questions.add(new Question(
                        "Which battle involved Shivaji Maharaj and Afzal Khan?",
                        "Battle of Pratapgad",
                        "Battle of Panipat",
                        "Battle of Plassey",
                        "Battle of Buxar",
                        1
                ));
            }

            if (level == 4) {
                questions.add(new Question(
                        "Which treaty followed the conflict between Shivaji Maharaj and Jai Singh I in 1665?",
                        "Treaty of Purandar",
                        "Treaty of Salbai",
                        "Treaty of Bassein",
                        "Treaty of Surat",
                        1
                ));

                questions.add(new Question(
                        "Who was the first Peshwa under Chhatrapati Shahu Maharaj?",
                        "Balaji Vishwanath",
                        "Bajirao I",
                        "Madhavrao I",
                        "Nana Fadnavis",
                        1
                ));

                questions.add(new Question(
                        "Which Peshwa is famous for rapid northern expansion of the Maratha power?",
                        "Bajirao I",
                        "Balaji Vishwanath",
                        "Raghunathrao",
                        "Madhavrao II",
                        1
                ));

                questions.add(new Question(
                        "Which social reformer wrote 'Gulamgiri'?",
                        "Jyotirao Phule",
                        "Gopal Ganesh Agarkar",
                        "Tilak",
                        "Ranade",
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
                        "Bombay",
                        "Nagpur",
                        "Nashik",
                        "Satara",
                        1
                ));

                questions.add(new Question(
                        "Who was known as Lokmanya?",
                        "Bal Gangadhar Tilak",
                        "Gopal Krishna Gokhale",
                        "V. D. Savarkar",
                        "Jyotirao Phule",
                        1
                ));

                questions.add(new Question(
                        "Which movement is strongly associated with the Ganapati festival as a public nationalist event?",
                        "Tilak's nationalist movement",
                        "Quit India Movement",
                        "Home Rule only",
                        "Khilafat only",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Rashtriya Swayamsevak Sangh in Nagpur in 1925?",
                        "K. B. Hedgewar",
                        "V. D. Savarkar",
                        "Tilak",
                        "Gokhale",
                        1
                ));

                questions.add(new Question(
                        "Which reformer worked prominently for widow remarriage and women's education in Maharashtra?",
                        "D. K. Karve",
                        "Afzal Khan",
                        "Nana Fadnavis",
                        "Bajirao I",
                        1
                ));
            }

            if (level == 5) {
                questions.add(new Question(
                        "Which agreement in 1775 is associated with the First Anglo-Maratha War?",
                        "Treaty of Surat",
                        "Treaty of Salbai",
                        "Treaty of Purandar",
                        "Treaty of Bassein",
                        1
                ));

                questions.add(new Question(
                        "The Treaty of Salbai was signed in which year?",
                        "1761",
                        "1782",
                        "1802",
                        "1818",
                        2
                ));

                questions.add(new Question(
                        "Which treaty of 1802 greatly affected Maratha politics and led to British intervention?",
                        "Treaty of Bassein",
                        "Treaty of Salbai",
                        "Treaty of Purandar",
                        "Treaty of Surat",
                        1
                ));

                questions.add(new Question(
                        "Who was Nana Fadnavis?",
                        "A prominent Maratha statesman",
                        "A Mughal emperor",
                        "A British governor",
                        "A social reformer of Bengal",
                        1
                ));

                questions.add(new Question(
                        "Which Maratha ruler was associated with the Third Anglo-Maratha War period?",
                        "Baji Rao II",
                        "Bajirao I",
                        "Shivaji Maharaj",
                        "Shahu I",
                        1
                ));

                questions.add(new Question(
                        "The Peshwa's headquarters was located at:",
                        "Pune",
                        "Mumbai",
                        "Nagpur",
                        "Nashik",
                        1
                ));

                questions.add(new Question(
                        "Which institution was founded by Dhondo Keshav Karve for women's education?",
                        "SNDT Women's University",
                        "Deccan College",
                        "Fergusson College",
                        "University of Bombay",
                        1
                ));

                questions.add(new Question(
                        "Who was the first Indian woman to become a doctor trained in Western medicine from Maharashtra?",
                        "Anandibai Joshi",
                        "Savitribai Phule",
                        "Pandita Ramabai",
                        "Ramabai Ranade",
                        1
                ));

                questions.add(new Question(
                        "Which organization was founded by Jyotirao Phule to promote social equality?",
                        "Satyashodhak Samaj",
                        "Arya Samaj",
                        "Brahmo Samaj",
                        "Servants of India Society",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Servants of India Society?",
                        "Gopal Krishna Gokhale",
                        "Tilak",
                        "Phule",
                        "Agarkar",
                        1
                ));
            }

            if (level == 6) {
                questions.add(new Question(
                        "Which fort is associated with the historic encounter between Shivaji Maharaj and Afzal Khan?",
                        "Pratapgad",
                        "Raigad",
                        "Shivneri",
                        "Sinhagad",
                        1
                ));

                questions.add(new Question(
                        "Which Maratha administrative council consisted traditionally of eight ministers?",
                        "Ashtapradhan",
                        "Navaratna",
                        "Panchayat",
                        "Diwan-i-Kohi",
                        1
                ));

                questions.add(new Question(
                        "Who held the office of Peshwa during the Third Battle of Panipat?",
                        "Balaji Baji Rao",
                        "Bajirao I",
                        "Madhavrao I",
                        "Baji Rao II",
                        1
                ));

                questions.add(new Question(
                        "The Third Battle of Panipat was fought in:",
                        "1757",
                        "1761",
                        "1764",
                        "1775",
                        2
                ));

                questions.add(new Question(
                        "Which Maratha leader is associated with the capture of Sinhagad in 1670?",
                        "Tanaji Malusare",
                        "Baji Prabhu Deshpande",
                        "Murarbaji Deshpande",
                        "Netaji Palkar",
                        1
                ));

                questions.add(new Question(
                        "Who founded the Bahishkrit Hitakarini Sabha?",
                        "B. R. Ambedkar",
                        "Jyotirao Phule",
                        "Gopal Ganesh Agarkar",
                        "Shahu Maharaj",
                        1
                ));

                questions.add(new Question(
                        "Which Maharaja of Kolhapur supported social reforms and reservation for non-Brahmin communities?",
                        "Shahu Maharaj",
                        "Sayajirao Gaekwad",
                        "Ranjit Singh",
                        "Krishnaraja Wadiyar",
                        1
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
                        "Land-gift movement",
                        "Swadeshi movement",
                        "Home Rule movement",
                        "Khilafat movement",
                        1
                ));
            }
        }

        return questions;
    }
}
