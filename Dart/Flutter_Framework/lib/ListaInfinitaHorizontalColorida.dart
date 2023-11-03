import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("Nome: Bruno Deluca Satil Cassiano\nMatrícula: 11032110015"),
          backgroundColor: Colors.red,
        ),
        body: InfiniteListView(),
      ),
    );
  }
}

class InfiniteListView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      scrollDirection: Axis.horizontal,
      itemBuilder: (context, index) {
        return Container(
          margin: const EdgeInsets.symmetric(horizontal: 1.0),
          padding: const EdgeInsets.all(10.0),
          color: Colors.red,
          child: Text(
            'Item $index',
            style: TextStyle(color: Colors.white)
          ),
        );
      },
    );
  }
}
