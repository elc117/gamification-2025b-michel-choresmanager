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

### Changed

- Changed CalendarScreen to use its ViewModel
- Renamed helpers folder to utils

### Removed

- Greeting.kt

## [0.1.0] - 2025-11-01

### Added

- DateProvider to get date from each end (web, android, desktop)
- Added CalendarHelper for date logic treatment
- Added CalendarScreen as the main calendar
- Added diagrams folder for the Class Diagram

### Changed

- Removed unused functions from DateProvider
- Changed CalendarHelper from Class to Object