# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- Added CalendarViewModel
- Added Dependencies for future DI implementation
- Added directories for file organization
- Added Chore class hierarchy with 4 types of chores
- Added Chore List to DayCells in CalendarScreen
- Added static chores to demonstrate Chore List functionality
- Added popUp to add new chores to specific days in CalendarScreen
- Added Koin dependency injection
- Added SQLDelight for database implementation
- Added TimeTextField composable for time input
- Added DayOfWeekPicker composable for selecting days of the week
- Added DateTimeParser utility for Date and Time conversions
- Added DateTextField composable for date input
- Added Start and End Date pickers for AddChorePopup
- Added Priority selector for AddChorePopup
- Added Kolor Picker in AddChorePopup
- Added HomeScreen as the first screen of the app
- Added SideBar for viewing profile, achievements and disabling chores
- Added CircleUserIcon composable for user profile representation
- Added a picture of my cat as a placeholder for user profile image
- Added CircularProgressIndicator for showing current levelUp progress
- Added MVI architecture structure for CalendarScreen for better state management
- Added SharedChoreViewModel for shared chore data logic between screens
- Added Basic SideBarViewModel for using shared data in SideBar
- Added CalendarViewModel for state handling in CalendarScreen
- Added CalendarEvent sealed interface for defining user interactions in CalendarScreen
- Added CalendarState data class for holding UI state in CalendarScreen
- Added Chore click in DayCell for finishing chores while in testing
- Added Achievement class for handling user achievements
- Added AchievementHelper for achievement creation and login
- Added leveling up logic to SideBar based on completed chores
- Added achievement logic to SharedChoreViewModel based on completed chores

### Changed

- Changed CalendarScreen to use its ViewModel
- Renamed helpers folder to utils
- Changed mapping function logic allowing multiple chores per day
- Changed finishedDate to nullable in Chore class
- Moved DayCell compose function to its own file
- Moved ChorePopup to its own file
- Changed AddChorePopup to be a DropdownMenu instead of a Popup
- Made chore in day cell clickable to future implementation of chore details
- Changed CalendarViewModel to HomeViewModel
- Refactored components and screens folders for better organization
- Changed Chore child classes to use Chore in constructor
- Changed User class to have level and experience properties
- Changed choreId to uuid string for better uniqueness while not using database

### Removed

- Greeting.kt
- Removed userId from Chore class
- Removed HomeViewModel

### Fixed

- Fixed clickable area of DayCell clipping out of bounds
- Fixed clickable area of DayOfWeekPicker options clipping out of bounds
- Fixed february date crashing because of wrong anchor date

## [0.1.0] - 2025-11-01

### Added

- DateProvider to get date from each end (web, android, desktop)
- Added CalendarHelper for date logic treatment
- Added CalendarScreen as the main calendar
- Added diagrams folder for the Class Diagram

### Changed

- Removed unused functions from DateProvider
- Changed CalendarHelper from Class to Object