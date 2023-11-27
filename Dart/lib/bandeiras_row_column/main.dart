//ignore: unnecessary_import
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Widgets Básicos'),
        ),
        body: Container(
          width: double.infinity,
          color: Colors.purple,
          child: WidgetRowColumn(),
        ),
      ),
    );
  }
}

WidgetRowColumn() {
  return Column(
    mainAxisSize: MainAxisSize.max,
    mainAxisAlignment: MainAxisAlignment.center,
    crossAxisAlignment: CrossAxisAlignment.center,
    textBaseline: TextBaseline.alphabetic,
    children: <Widget>[
      SizedBox(height: 20),
      SizedBox(
          height: 200.0,
          child: Image.asset(
            "assets/images/alemanha.jpg",
            fit: BoxFit.cover,
            alignment: Alignment.center,
            height: 200,
            width: 200,
          )),
      SizedBox(height: 20),
      SizedBox(
          height: 200.0,
          child: Image.asset(
            "assets/images/franca.jpg",
            fit: BoxFit.cover,
            alignment: Alignment.center,
            height: 200,
            width: 200,
          )),
      SizedBox(height: 20),
      SizedBox(
          height: 200.0,
          child: Image.asset(
            "assets/images/espanha.jpg",
            fit: BoxFit.cover,
            alignment: Alignment.center,
            height: 200,
            width: 200,
          )),
    ],
  );
}
