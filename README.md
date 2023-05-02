## Android MVVM Design Pattern

This is an Android project built using the Model-View-ViewModel (MVVM) design pattern. The main goal of this project is to demonstrate the use of MVVM pattern in Android application development. MVVM pattern separates the concerns of the application into three components: Model, View, and ViewModel.

## Getting Started

To get started with the project, clone this repository to your local machine and import it to Android Studio. The package name for this project is `com.rakibofc.androidmvvm`.

## MVVM Components

The MVVM design pattern is divided into three components:

### Model

The `MainData` model is responsible for holding data and state information. In this project, it represents the data that is displayed in the views.

### View

The `MainActivity` view is responsible for displaying data to the user. It contains two `TextView` and a `ToggleButton`.

### ViewModel

The `MainViewModel` is responsible for managing the data displayed in the view. It interacts with the `MainData` model to retrieve and update data. In this project, it updates the text of `TextView` based on the state of the `ToggleButton`.

## Functionality

This project demonstrates the following functionality:

* Separation of concerns into Model, View, and ViewModel.
* Displaying the Android version and API level when the toggle button is pressed.
* Displaying the current time in hh:mm:ss format.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
