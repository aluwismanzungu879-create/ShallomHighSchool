# ShallomHighSchool
A Java Swing school management system for Shallom High School with role-based dashboards, fees payment, and persistent storage.
give me a README.md
📄 README.md for Shallom High School Management System
Here's your complete, ready-to-use README.md file. Just copy everything below, save it as README.md in your project folder, and don't forget to replace the [bracketed] placeholders.

markdown
# 🎓 Shallom High School Management System

A **Java Swing desktop application** for managing secondary school operations at **Shallom High School**.  
Built as a Java Programming course project demonstrating OOP, Collections, Exception Handling,  
File Serialization, Multithreading, and Java 8 features.

> _"Knowledge • Discipline • Excellence"_

---

## 📖 Table of Contents

- [About the Project](#-about-the-project)
- [Features](#-features)
- [Screenshots](#-screenshots)
- [Demo Login Credentials](#-demo-login-credentials)
- [How to Run](#-how-to-run)
- [Project Structure](#-project-structure)
- [Syllabus Topics Demonstrated](#-syllabus-topics-demonstrated)
- [Built With](#-built-with)
- [Colour Theme](#-colour-theme)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)
- [License](#-license)
- [Acknowledgements](#-acknowledgements)

---

## 📘 About the Project

The **Shallom High School Management System** is a desktop application written in **Java** using the **Swing** GUI toolkit. It provides a secure, role-based platform for managing the daily academic and administrative operations of a secondary school.

The system supports **five distinct user categories**, each with a dashboard tailored to their real-world duties:

- 👨‍🎓 **Students**
- 👨‍🏫 **Teachers**
- 🧹 **Ancillary Staff**
- 🎯 **Deputy Headmaster**
- 👑 **Headmaster**

Each user logs in with a unique **ID and password** and is then presented with a menu built specifically for their role.

---

## ✨ Features

### 🔐 Authentication & Security
- Secure login screen with ID and password validation
- Custom `InvalidLoginException` for clear error messages
- Role-based access control — every user sees only their own menu

### 👥 Role-Based Dashboards

| Role | Menu Options |
|------|--------------|
| **Student** | View Subjects, Sports, Pay Fees, My Class Teacher, Timetable, Results |
| **Teacher** | My Subjects, My Class, Enter Marks, Class Register, Sports Duties, Timetable |
| **Ancillary Staff** | Duty Roster, Report Issue, View Notices, Grounds Status |
| **Deputy Headmaster** | All Class Teachers, Subject Allocation, Discipline, Staff, Sports, Fee Reports |
| **Headmaster** | School Overview, Class Teachers, Staff, Subjects, Sports, Fees, All Payments |

### 📚 Academic Modules
- **Subjects Offered** — 15 subjects displayed in a sorted grid
- **Sports Offered** — 10 sports with practice day information
- **Class Teachers Table** — All 10 classes (Form 1A → Upper 6) with assigned teachers

### 💳 Financial Module
- Complete **School Fees Payment** form
- Multiple payment methods: **EcoCash, Bank Transfer, Cash, Swipe, ZIPIT**
- Auto-generated reference numbers
- Printable receipt dialog

### 💾 Data Persistence
- **Java Serialization** saves users and payments to `.dat` files
- Data **survives app restarts**
- **Auto-save daemon thread** writes a report every 30 seconds
- Text export of payments to `payments_report.txt`

### 🎨 User Interface
- Custom-drawn circular **SHS logo**
- Gradient green background with gold accents
- Colour-coded header, sidebar, and cards
- Clean, responsive layout built with `GridBagLayout` and `BoxLayout`

---

## 🖼️ Screenshots

> _Replace these placeholders with your own screenshots after running the app._

### Login Screen
![Login Screen](screenshots/login.png)

### Student Dashboard
![Student Dashboard](screenshots/student_dashboard.png)

### Subjects Offered
![Subjects](screenshots/subjects.png)

### Class Teachers
![Class Teachers](screenshots/class_teachers.png)

### Fee Payment Form
![Fee Payment](screenshots/fees.png)

### Headmaster Dashboard
![Headmaster](screenshots/headmaster.png)

---

## 🔑 Demo Login Credentials

| Role | Username | Password |
|------|----------|----------|
| Student | `student1` | `pass123` |
| Student (2nd) | `student2` | `pass123` |
| Teacher | `teacher1` | `teach123` |
| Teacher (2nd) | `teacher2` | `teach123` |
| Ancillary Staff | `ancil1` | `ancil123` |
| Ancillary Staff (2nd) | `ancil2` | `ancil123` |
| Deputy Headmaster | `deputy` | `dep123` |
| Headmaster | `headmaster` | `head123` |

---

## 🚀 How to Run

### Prerequisites

- **Java JDK 8 or higher** — [Download from Oracle](https://www.oracle.com/java/technologies/downloads/)
- Any IDE (**IntelliJ IDEA**, **Eclipse**, **NetBeans**) **OR** the terminal

Verify Java is installed by running:

```bash
java -version
javac -version
▶️ Option 1: Run from Terminal
bash
# 1. Navigate to the project folder
cd ShallomHighSchool

# 2. Compile the source file
javac ShallomHighSchool.java

# 3. Run the application
java ShallomHighSchool
The login window will appear. Use any credential from the table above.

▶️ Option 2: Run in IntelliJ IDEA
Open IntelliJ IDEA

Click File → Open and select the ShallomHighSchool folder

Locate ShallomHighSchool.java in the Project panel

Right-click it → Run 'ShallomHighSchool.main()'

The login screen will appear

▶️ Option 3: Run in VS Code
Install the Extension Pack for Java

Open the ShallomHighSchool folder

Open ShallomHighSchool.java

Click the ▶ Run button at the top right

🗂️ Project Structure
text
ShallomHighSchool/
│
├── ShallomHighSchool.java       # Main source file (all classes)
├── README.md                    # This file
│
├── users.dat                    # Auto-generated (user data)
├── payments.dat                 # Auto-generated (payment records)
├── payments_report.txt          # Auto-generated (text report)
│
└── screenshots/                 # Screenshots for this README
    ├── login.png
    ├── student_dashboard.png
    ├── subjects.png
    ├── class_teachers.png
    ├── fees.png
    └── headmaster.png
Note: The .dat and .txt files are created automatically on first run. You do not need to commit them to GitHub.

🧠 Syllabus Topics Demonstrated
This project was built to demonstrate the full range of Java Programming course topics:

Topic	Where Used
Arrays (1D & 2D)	SUBJECTS[], SPORTS[], Object[][] for JTable
Sorting & Searching	Arrays.sort(), Arrays.binarySearch() in findByUsername()
Collections (List/Set/Map)	HashMap, LinkedHashMap, ArrayList
Iterators & Generics	Menu iteration with Iterator<String>, typed collections
Custom Exceptions	InvalidLoginException, PaymentException, DuplicateUserException
Try-Catch-Finally	Login flow, file I/O, payment validation
Throw/Throws	authenticate() declares throws InvalidLoginException
File I/O Streams	ObjectOutputStream, ObjectInputStream, PrintWriter
Serialization	User and Payment implement Serializable
Persistence	.dat files survive application restarts
Multithreading	AutoSaveThread daemon saves every 30 seconds
Lambdas	Event listeners like e -> doLogin()
Method References	Comparator.comparingLong(Payment::getTimestamp)
Streams	payments.stream().sorted(...).forEach(...)
Design Patterns	Singleton (UserDatabase), MVC, Factory (role-based menu)
🛠️ Built With
Java SE 8+

Java Swing — GUI toolkit

Java Serialization — data persistence

No external libraries — pure JDK

🎨 Colour Theme
The application uses the official Shallom High School colours:

Colour	Hex Code	Usage
🟢 Deep Green	#006633	Primary (headers, buttons, borders)
🟡 Gold	#FFC107	Accent (logo, motto, borders)
⚪ Light Green	#F0FFF4	Content backgrounds
⚫ Dark Green	#142819	Sidebar menu
⚪ White	#FFFFFF	Cards, login panel
🔮 Future Enhancements
Ideas for extending the system:

□ Migrate from file storage to MySQL or SQLite database
□ Add PDF report card generation
□ Add SMS/email notifications for fee reminders
□ Add attendance tracking module
□ Build a mobile companion app using JavaFX or Android
□ Add exam scheduling and results processing
□ Add library management module
□ Add timetable generator with conflict detection
👤 Author
[Aluwis Manzungu]

Student Number: [C03261115]

Course: Java Programming

Institution: [Reformed Church University]

Email: [aluwismanzungu879@gmail.com]

📄 License
This project is submitted for academic purposes as a Java Programming course assignment.

© [2026] [Aluwis Manzungu] — Shallom High School Management System.

🙏 Acknowledgements
Lecturer: [MR Fanyana]

Shallom High School — fictional school used for this assignment

Oracle Java Documentation — docs.oracle.com/javase

Stack Overflow Community — for Java Swing reference solutions

⭐ Support
If this project helped you or inspired you, please consider giving it a ⭐ on GitHub!

<div align="center">
Shallom High School Management System
"Knowledge • Discipline • Excellence"

Made with ❤️ in Java

</div> ```
