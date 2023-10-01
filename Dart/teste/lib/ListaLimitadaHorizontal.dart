import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text("Nome: Bruno Deluca Satil Cassiano \nMatrícula: 11032110015"),
        ),
        body: buildListView(),
      ),
    );
  }
  
  buildListView() {
    final itens = List<String>.generate(100, (i) => "Item $i");
    
    return ListView.builder(
      scrollDirection: Axis.horizontal,
      itemCount: itens.length,
      itemBuilder: (context, index) {
        return ListTile(
          title: Text('${itens[index]}'),
          leading: Icon(Icons.arrow_right),
          onTap: () {
            debugPrint('${itens[index]} foi selecionada');
          },
        );
      }
    );
  }
}