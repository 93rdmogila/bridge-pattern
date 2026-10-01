# Assignment 3: Bridge Pattern — Topic C (Reports)

**Student Name:** Yerzhanov Amanzhol  
**Group:** SE-2526  
**Topic Letter:** C (Reports)  
**Repository URL:** https://github.com/93rdmogila/bridge-pattern  
**Base Commit Hash:** `5378aa2edc4115ee42808097cf76c5b44c297066`  

---

## Role Map & Key Code Locations

| Pattern Role | Class / Interface Name | Source Path | Key Methods / Fields |
| :--- | :--- | :--- | :--- |
| **Abstraction** | `Report` | `src/Report.java` | **Bridge Field:** `private Formatter formatter;`<br>**Set Implementation:** `setImplementation(Formatter)`<br>**Abstract Execute:** `public abstract String execute();` |
| **Refined Abstraction 1 (A1)** | `AttendanceReport` | `src/AttendanceReport.java` | **Execute Implementation:** `execute()` (calculates % and delegates via `getFormatter().format(...)`) |
| **Refined Abstraction 2 (A2)** | `GradeReport` | `src/GradeReport.java` | **Execute Implementation:** `execute()` (calculates average and delegates via `getFormatter().format(...)`) |
| **Implementor** | `Formatter` | `src/Formatter.java` | **Low-level Operation:** `String format(String title, String text);` |
| **Concrete Implementor 1 (I1)** | `TextFormatter` | `src/TextFormatter.java` | Plain text formatting |
| **Concrete Implementor 2 (I2)** | `HtmlFormatter` | `src/HtmlFormatter.java` | HTML `<div><h1>...</h1><p><b>...</b></p>` formatting |
| **Concrete Implementor 3 (I3)** | `MarkDownFormatter` | `src/MarkDownFormatter.java` | Markdown `# Title` and `**Text**` formatting |
| **Client & Demo Checks** | `Main` | `src/Main.java` | **T5 Runtime Switch Check:** `main()` method |

---

## Standard Build and Run Commands

From the project root directory, run:

```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main --demo
Expected Outcomes for T1–T7 Checks
T1 PASS | AttendanceReport + TextFormatter | Title: Attendance\nText: 3 of 4 was taken, which is 75%

T2 PASS | AttendanceReport + HtmlFormatter | <div><h1>Attendance</h1>\n<p><b>3 of 4 was taken, which is 75%</b></p>

T3 PASS | GradeReport + TextFormatter | Title: Grade Report\nText: Average grade is 80

T4 PASS | GradeReport + HtmlFormatter | <div><h1>Grade Report</h1>\n<p><b>Average grade is 80</b></p>

T5 PASS | sameObject=true | stateUnchanged=true | before=<Text result> | after=<Html result>

T6 PASS | AttendanceReport + MarkDownFormatter | #Attendance\n**3 of 4 was taken, which is 75%**

T7 PASS | GradeReport + MarkDownFormatter | #Grade Report\n**Average grade is 80**
