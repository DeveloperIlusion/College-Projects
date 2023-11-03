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
          title: Text(
              "Nome: Nathan Bittencourt de Oliveira\nMatrícula: 11032110477"),
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
          onTap: () {
            debugPrint('Item $index foi selecionado');
          },
        );
      },
    );
  }
}
