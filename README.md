# Decent Work & Economic Growth Android App

An Android application focused on UN Sustainable Development Goal 8: Decent Work and Economic Growth.

## Features

### 1. Home Screen
- Overview of SDG Goal 8
- Navigation to all app sections
- Clean Material Design 3 interface

### 2. Job Opportunities
- Browse available jobs with fair wages
- View detailed job descriptions
- Filter by job type (Full-time, Part-time, Contract, Remote)
- See requirements and benefits
- Apply to positions

### 3. Economic Indicators
- Track key economic metrics
- View unemployment rate, GDP growth, minimum wage
- Monitor labor force participation
- Visual trend indicators (up/down/stable)
- Real-time economic data

### 4. Worker Rights
- Learn about workplace rights and protections
- Expandable cards with detailed information
- Categories: Safety, Compensation, Working Hours, Rights, Equality
- Key points for each right

### 5. Career Resources
- Access training and education programs
- Professional certifications
- Workshops and skill development
- Duration and provider information
- Direct links to resources

## Technology Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM pattern with repository
- **Material Design**: Material 3
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36

## Project Structure

```
app/src/main/java/com/example/decentwork/
├── MainActivity.kt
├── data/
│   ├── Models.kt           # Data classes and enums
│   └── DataRepository.kt   # Sample data provider
├── ui/
│   ├── navigation/
│   │   └── Navigation.kt   # App navigation logic
│   ├── screens/
│   │   ├── HomeScreen.kt
│   │   ├── JobsScreen.kt
│   │   ├── IndicatorsScreen.kt
│   │   ├── RightsScreen.kt
│   │   └── ResourcesScreen.kt
│   └── theme/              # Material theme configuration
```

## How to Run

1. Open the project in Android Studio
2. Sync Gradle files
3. Run on an emulator or physical device (Android 7.0+)

## Key Components

### Data Models
- `Job`: Job listings with details
- `EconomicIndicator`: Economic metrics with trends
- `WorkerRight`: Workplace rights information
- `CareerResource`: Training and education resources

### Screens
- **HomeScreen**: Main navigation hub
- **JobsScreen**: Job listings and details
- **IndicatorsScreen**: Economic metrics dashboard
- **RightsScreen**: Worker rights information
- **ResourcesScreen**: Career development resources

## Future Enhancements

- Real API integration for live data
- User authentication and profiles
- Job application tracking
- Bookmarking favorite jobs/resources
- Push notifications for new opportunities
- Multi-language support
- Dark mode optimization
- Offline data caching

## Contributing

This app promotes decent work and economic growth. Contributions are welcome to enhance features and reach more users.

## License

This project is created for educational purposes to promote UN SDG Goal 8.
