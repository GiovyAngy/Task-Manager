# 🚀 Task Manager (Spring Boot + H2)

Eine kleine, didaktische Webanwendung zur Verwaltung von Aufgaben.  
Ideal für Demonstrationen, kleine Projekte oder als Grundlage für größere Anwendungen.

---

## ⚡ Schnellstart

1. Projekt herunterladen / klonen
2. Im Projektverzeichnis ausführen:

```bash
mvn spring-boot:run 
````
Öffne im Browser:

Aufgabenliste: http://localhost:8081/tasks

H2-Datenbankkonsole: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:taskdb

Benutzername / Passwort: leer lassen (Standard)

🛠 Technologien
Komponente	Beschreibung
Spring Boot	Vereinfacht die Erstellung und den Start von Java-Apps
H2	Integrierte, kompakte Datenbank, keine Installation erforderlich
Thymeleaf	Template Engine für HTML-Seiten
Maven	Projekt- und Abhängigkeitsmanagement

✨ Features
Aufgaben hinzufügen, anzeigen und verwalten

Statusanzeige jeder Aufgabe (OPEN standardmäßig)

In-Memory Datenbank (Daten verschwinden beim Neustart)

Schnelle Einrichtung ohne externe Datenbank

📂 Projektstruktur
```bash
Code kopieren
src/
├─ main/
│  ├─ java/com/example/taskmanager
│  │   ├─ Application.java
│  │   ├─ controller/TaskController.java
│  │   ├─ model/Task.java
│  │   └─ repository/TaskRepository.java
│  └─ resources/
│      ├─ application.properties
│      └─ templates/tasks.html
└─ pom.xml
````
💡 Hinweise
Perfekt für das Vorführen von Spring Boot Grundkenntnissen

Kann leicht auf eine persistentere Datenbank (z.B. MySQL oder PostgreSQL) umgestellt werden

Stil und Layout können mit CSS angepasst werden (Beispiel: style.css)