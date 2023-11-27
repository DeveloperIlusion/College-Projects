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
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (context, index) {
        return ListTile(
          title: Text('Item $index'),
          leading: Icon(Icons.arrow_right),
          textColor: Colors.red,
          onTap: () {
            debugPrint('Item $index foi selecionado');
          },
        );
      },
    );
  }
}