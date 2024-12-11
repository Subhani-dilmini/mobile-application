// A class containing button labels and values
class Btn {
  static const String del = "D";   // Delete button
  static const String clr = "C";   // Clear button
  static const String per = "%";   // Percentage button
  static const String multiply = "×";      // Multiplication button
  static const String divide = "÷";        // Division button
  static const String add = "+";        // Addition button
  static const String subtract = "-";       // Subtraction button
  static const String calculate = "=";      // Equals button
  static const String dot = ".";          // Decimal point button

   // Numeric button values
  static const String n0 = "0";
  static const String n1 = "1";
  static const String n2 = "2";
  static const String n3 = "3";
  static const String n4 = "4";
  static const String n5 = "5";
  static const String n6 = "6";
  static const String n7 = "7";
  static const String n8 = "8";
  static const String n9 = "9";

  // List of all button values in the order they appear on the calculator
  static const List<String> buttonValues = [
    del,
    clr,
    per,
    multiply,
    n7,
    n8,
    n9,
    divide,
    n4,
    n5,
    n6,
    subtract,
    n1,
    n2,
    n3,
    add,
    n0,
    dot,
    calculate,
  ];
}