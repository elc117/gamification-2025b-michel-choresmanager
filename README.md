# Chores Manager
A calendar manager made with the Kotlin Multiplatform and Compose Multiplatform frameworks

by **Michel Augusto Altmann** <br>
Sistemas de Informação

## What is it

*Chores Manager*, as the name suggests, is a calendar that makes it possible to add chores and manage them at some level, this can be done in a specified range,
that could be a single day of the week, or multiple depending on how the date is configured, in this calendar the user gets achievements by completing a set of 
"challenges" which are all according to what they want/need to do in their time, and its completely up to them to decide if they just want to complete all the achievements
by spamming chores, or to actually use the calendar as intended.

## Functionalities

Below is a list of some of the functionalities that Chores Manager provides:

- Web and desktop apps
- Data persistence across both platforms
- Month view of the calendar
- Weekly view of the calendar
- Add chore by clicking on the selected day of the month
- Add chore with a set start time when adding on the weekly view
- List of all enabled and disabled user chores
- Level system based on completed chores and achievements
- Dark and Light modes
- Custom theme selection for users above level 5
- Four different types of chores

and more!

## Chore types

These are all the chore types the user can create:

- Default: A default chore with the title, color, date and time range that you want, all the other chores have these fields too
- College: A chore with the course name, professor name, total hours of the course and calculates how many times you can skip class, considering a 75% presence needed
- Grocery: A chore with a list of items that have name and quantity, that you can add or remove when needed
- Gym: A chore with an Exercise day field, to put in what muscle group you will be training on that day, and the option to add different exercises to a list you can view as you need

## About the development

### Starting out

The development started by me doing nothing other than watching [Philip Lackner](https://www.youtube.com/@PhilippLackner) videos (which are super helpful),
and reading about Kotlin Multiplatform and Compose Multiplatform, to get a good base as to how to start the project and maintain a relatively 
good code structure, but even tho its my first time working with these frameworks, I already have some knowledge about Android development, 
which helped tremendously, since both use kotlin and ViewModels for the architecture.

### Multiplatform issues

The main challenge was to make everything work on both platforms, since at first glance it seemed that Compose Multiplatform was a do-it-all solution, but there were still some technicalities
in the development process that needed a bit more work on, like on the very start of the project, when I first implemented the crucial thing for a calendar,
the date, and I found out that the DateTime library for Kotlin Multiplatform didn't support web at the time, so I had to implement
different approaches for each platform, using the standard library for JS and the DateTime library for JVM, using an expect/actual declaration to make it work properly.

Little did I know that this was not going to be the only time I had to do something like this, as the Kolor Picker library I used for selecting the chore color
would also not be available in the web platform, so I had to implement a very simple color picker just for the web version of the app.

Its good to note that this happened because the libraries I used were not fully multiplatform, since the web support is still in beta, but this is something that will probably be addressed in the future.

### Building it up

The development process was pretty smooth after getting past the initial hurdles, since Compose Multiplatform provides a lot of the components I
used for building the UI, and the actual logic for building a calendar is rather simple, since its mostly date calculations and list filtering.

### The first version

After a couple of days of development, I had a pretty simple version of the app working, with just the month view of the calendar, and the
ability to click on a day to select it, and that was it, no chore adding, no list of active chores, no achievements, nothing, just a simple plain
calendar.

### The Second version

After that, I started doing the heavy lifting of the app, implementing how the app was actually supposed to work, starting with how I should actually
model the classes I wanted to use, like the Chore class and its subclasses, the Achievement class, the User class, and so on, after having a good idea
of how the data should be structured, I started actually implementing the features, which started coming together rather quickly.

During the development of the second version, I started to take more attention to the architecture of the app, since I wanted to make sure that the code was clean
and maintainable to some degree, so I watched more videos about how it should be done, and decided to implement a simple MVI architecture for the CalendarScreen and AddChorePopup,
which worked pretty well, since the state management was pretty straightforward, and that made the code way cleaner, since with the creation of a EventHandler for
the calendar and the states, I could separate the UI completely from the logic, making it way easier to read and maintain, doing all the heavy logic in the ViewModel.

A feature that was not implemented but I tried during this time was a proper local database solution, I initially planned to use Room for the development, but
found out that it was not available for multiplatform projects, so I had to search for alternatives, and found out that SQLDelight was a good
option, but after around four frustrating days of nothing working as expected, I decided to drop the idea of a local database for now, since
SQLDelight also happened to have issues with web support.

This was the version that I mostly worked on OOP (Object Oriented Programming) principles, making sure that each class had a single responsibility, which is directly correlated to
the MVI architecture, since each ViewModel has its own responsibility, some singletons as helpers, and the screen responsibilities are divided between the different objects, such as
the event handler interface, the state holder data class, and so on.

This was also the version I implemented the chores and their base functionalities, like adding, finishing, listing, alongside specific chore functions specific to 
each type, like calculating the maximum number of skipped classes the user can have on CollegeChore, or adding and removing items from the GroceryChore.

Alongside the MVI architecture implementation, I also added Koin for dependency injection, which made it easier to manage the dependencies between 
different classes, mainly ViewModels, and made it easier to test the app in the future, if I decide to do so.


This was the version that I submitted for the first delivery of the project, which I feel was a good milestone, since it had the core functionalities of the app working, and a good architecture to build upon.

## The Final version

Even though the second version was already pretty good, I still had a lot of features to implement, like all the different fields for each chore type, the weekly view of the calendar,
even small things like a cancel button for the chore popup, a lot was needed to be done to make the app feel complete, so I started working on those features one by one.

As the days quickly went by, I still had a lot to implement, and I started to feel the pressure of the deadline approaching, so I had to prioritize the features that were more important,
like the weekly view of the calendar, which is crucial for a app centered around chores and time management, another feature that I prioritized was the achievements system, since that is
the sole thing that is actually gamifying the app, and makes it more engaging for the user, so I had to make sure that it was working properly, but achievements without a level system is
as good as nothing, so I had to implement that too, which was not that hard, since it was just a matter of calculating the experience points based on the completed chores and achievements.

After having the level system in place I took some time to implement the custom themes for the users, which was supposed to be more elaborate, since I was going to implement a full theme
builder, with primary, secondary, background and other colors to choose from, and calculate each corresponding color based on hue, saturation and lightness. That's the reason why I made my own
color slider component, which is 3 sliders for each of the HSL values, however, due to time constraints and the difficulty of implementing the actual logic for color manipulation, I decided to
use a simpler approach, which is just selecting a primary color, and then using Material Kolor library to generate the whole theme base on that color, which worked pretty well, but restrained the 
user to have only one unlock, locked behind level 5.

After all the core features were implemented, I took some time to take a look again at how I could develop the data persistence for the app. 

### Data Persistence

After developing the core functions for the app, I reached a point where I felt comfortable spending some time creating a ktor API to handle the data persistence,
so I took advantage of a holiday to create a simple REST API using Ktor server, which was pretty simple to start up, however, was much more difficult to make it work together
of actual client, since the serialization of LocalDate, LocalTime and Color is not as straightforward as I thought, so I set up all the necessary response classes (which actually act as requests too), interfaces and singletons 
for making the api calls as easy as possible, which made it really simple in this project, however, the hard part was to build the actual database to hold the data, which involved 
a lot of foreign keys and splitting up the objects that are related to each other, which added some layers of complexity. 

This API, which is not in this repository, can be found on my private GitHub account, it is actually being hosted by myself on a local server, which everyone can access thanks to
cloudflare tunneling system, which makes it possible to access my local server from anywhere in the world using the domain I set up for it.

After having the API ready, I built the App with the new IP address, and started testing the data persistence, which worked pretty well, however, I found out that the web version was having some issues with CORS policy,
so I had to set up the necessary headers on the server side to make it work properly, which was a bit tricky, but after some research I managed to make it work.

So now the app has data persistence across both platforms 🎉.

### What could be improved

As mentioned before, the theme builder could be way more elaborate, giving the user more freedom to customize their app experience, however, due to time constraints I had to settle for a
simpler approach, but I might make a project in the future to implement a full theme builder.

Another thing that could be improved is the local database solution, since SQLDelight was not working as expected, I had to settle for a server-side database, which is not ideal for a
app of this type, since it would be better to have it work offline, however, due to difficulties I had to settle for this approach, but I might add it for desktop in the future, and web
only work with the server-side database, which would be a good compromise.

## Kotlin x Java

Some code examples that I use in kotlin and how they would look like in java.

Kotlin has a lot of syntactic sugar that makes it way more concise than Java, so some code snippets might look a bit different, but the core logic is the same.
This example shows how a singleton object in Kotlin is represented as a class with static methods in Java, pretty straightforward.

### Kotlin
```kotlin
object DateTimeParser {

  fun parseTimeToText(time: LocalTime): String {
    val hours = time.hour
    val minutes = time.minute
    val hoursTxt = hours.toString().padStart(2, '0')
    val minutesTxt = minutes.toString().padStart(2, '0')
    return ("$hoursTxt:$minutesTxt")
  }
    // ... other functions
}

```
### Java
```java
public class DateTimeParser {
    public static String parseTimeToText(LocalTime time) {
        int hours = time.getHour();
        int minutes = time.getMinute();
        String hoursTxt = String.format("%02d", hours);
        String minutesTxt = String.format("%02d", minutes);
        return hoursTxt + ":" + minutesTxt;
    }
    // ... other functions
}
```

This next example shows how a data class in kotlin is represented as a regular class in Java, with the addition of getters, setters and contructors.

### Kotlin

```kotlin
open class Chore(
  val choreId: Int?,
  val startTime: LocalTime,
  val endTime: LocalTime,
  val daysOfWeek: List<DayOfWeek>,
  val startDate: LocalDate,
  val endDate: LocalDate,
  var choreException: List<LocalDate> = emptyList(),
  val title: String,
  val description: String?,
  var priority: Priority,
  val deleted: Boolean? = false,
  var finished: Boolean = false,
  val color: Color = Color.DarkGray
) {

  open fun duration(): Int {
    return abs(endTime.hour * 60 + endTime.minute) - (startTime.hour * 60 + startTime.minute)
  }

  open fun finishChore() {
    finished = true
  }

  fun isException(date: LocalDate): Boolean {
    return choreException.contains(date)
  }
}
```

### Java

```java
public class Chore {
    private final Integer choreId;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final List<DayOfWeek> daysOfWeek;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private List<LocalDate> choreException;
    private final String title;
    private final String description;
    private Priority priority;
    private final Boolean deleted;
    private Boolean finished;
    private final Color color;
    
    public Chore(Integer choreId, LocalTime startTime, LocalTime endTime, List<DayOfWeek> daysOfWeek,
                 LocalDate startDate, LocalDate endDate, List<LocalDate> choreException, String title,
                 String description, Priority priority, Boolean deleted, Boolean finished, Color color) {
        this.choreId = choreId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.daysOfWeek = daysOfWeek;
        this.startDate = startDate;
        this.endDate = endDate;
        this.choreException = choreException != null ? choreException : new ArrayList<>();
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deleted = deleted != null ? deleted : false;
        this.finished = finished != null ? finished : false;
        this.color = color != null ? color : Color.DARK_GRAY;
    }
    
    public int duration() {
        return Math.abs(endTime.getHour() * 60 + endTime.getMinute()) - (startTime.getHour() * 60 + startTime.getMinute());
    }
    
    public void finishChore() {
        this.finished = true;
    }
    
    public boolean isException(LocalDate date) {
        return choreException.contains(date);
    }
    
    public int getChoreId() {
        return choreId;
    }
    
    public LocalTime getStartTime() {
        return startTime;
    }
    
    public LocalTime getEndTime() {
        return endTime;
    }
    
    public List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public List<LocalDate> getChoreException() {
        return choreException;
    }
    
    public void setChoreException(List<LocalDate> choreException) {
        this.choreException = choreException;
    }
    
    // ... other getters and setters
    
}
```

Thats where the main differences lie, kotlin is a lot more concise and easier to read, while Java is more verbose and requires more boilerplate code.
As the example above shows, kotlin completely removes the need for getters, setters and constructors in data classes, it just verifies if the fields are val or var,
and creates the necessary methods automatically, thats why the val fields are all gets in the java version, and the var field has both get and set methods.



## Depenciencies used

|        Name        |                       What is it                        |
|:------------------:|:-------------------------------------------------------:|
|  Compose-runtime   |       Core Compose runtime (state, recomposition)       |
| Compose-foundation | Basic Compose UI primitives (layout, gestures, drawing) |
| Compose-Material3  |      Material 3 components and theming for Compose      |
| Compose-Viewmodel  |           ViewModel integration for Compose             |
|      DateTime      |           Kotlin multiplatform date/time API            |
|     Koin-core      |           Koin deependency-injection library            |
|    Koin-compose    |                Koin compose integration                 |
|   Serialization    |  Serialization core for (de)serializing kotlin objects  |
|     Ktor-core      |                  Ktor HTTP client core                  |
|  Ktor-nogotiation  |        Content negotiation for Ktor (JSON, etc.)        |
| Ktor-serialization |      Ktor serialization plugin using kotlinx.json       |
|    Ktor-okhttp     |          OkHttp engine for Ktor (Android/JVM)           |
|    Ktor-desktop    |           Desktop/JVM engine for Ktor client            |
|      Ktor-js       |                JS engine for Ktor client                |
|     Ktor-wasm      |               WASM engine for Ktor client               |
|   Material-kolor   |   Material color utilities / helpers (theme builder)    |
|    Kolorpicker     |            Color picker UI component library            |



### Class structure

The class diagram was made using PlantUML and for that reason it does not show all the details of the classes, such as field types, since PlantUML does not support kotlin 
syntax natively, however, it gives a good overview of how the classes are structured and how they relate to each other.

#### Models

<img width="3361" height="945" alt="models" src="https://github.com/user-attachments/assets/0bf1bb65-9ab6-402e-900b-1734c9ae34cc" />

#### ViewModels

<img width="1642" height="1013" alt="viewmodels" src="https://github.com/user-attachments/assets/3ba127a0-8eae-4d5b-8609-f4601b7cf78d" />

Omitted EventHandlers to make the diagram readable

#### Theme

<img width="1316" height="485" alt="theme" src="https://github.com/user-attachments/assets/17e31a71-b839-4906-b2fd-90f41738da05" />

#### Utils

<img width="1526" height="584" alt="utils" src="https://github.com/user-attachments/assets/6f7b7c13-1d4d-47bc-98b8-9033886882cd" />

#### Repository

<img width="1150" height="605" alt="repository" src="https://github.com/user-attachments/assets/26a7f779-bf08-4096-ac52-cb8622b176ae" />

#### Network

<img width="2005" height="926" alt="network" src="https://github.com/user-attachments/assets/40b12298-c436-4eee-9e21-b6a47c73bcc2" />

Different ChoresResponses were omitted to make diagram readable

### Build and Run Desktop (JVM) Application

To build and run the development version of the desktop app, use the run configuration from the run widget
in your IDE’s toolbar or run it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:run
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:run
  ```

### Build and Run Web Application

To build and run the development version of the web app, use the run configuration from the run widget
in your IDE's toolbar or run it directly from the terminal:
- for the Wasm target (faster, modern browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:wasmJsBrowserDevelopmentRun
    ```
- for the JS target (slower, supports older browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:jsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:jsBrowserDevelopmentRun
    ```

---
