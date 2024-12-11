//IM/2021/038
// Importing the calculator screen file
import 'package:calculator/Calculator_Screen.dart';
// Importing Flutter material library
import 'package:flutter/material.dart';

// Main function to run the app
void main() {
  // Running the root widget
  runApp(const MyApp());
}

// Root widget of the application
class MyApp extends StatelessWidget {
  // Constructor with a constant key
  const MyApp({super.key});

  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Calculator',   // App title
      theme: ThemeData.dark(),   // Using a dark theme for the app
      home: const CalculatorScreen(),     // Setting the home screen to CalculatorScreen
    );
  }
}

