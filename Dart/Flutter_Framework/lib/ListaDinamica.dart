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
          title: Text("Roteiro de férias"),
        ),
        body: buildListView(),
      ),
    );
  }

  buildListView() {
    return ListView(
      children: [
        ListTile(
          leading: Icon(Icons.sports_golf),
          title: Text("Golf"),
          subtitle: Text("Esporte para relaxar a mente."),
          trailing: Icon(Icons.golf_course),
          selected: true,
          enabled: true,
        ),
        ListTile(
          leading: Icon(Icons.sports_basketball),
          title: Text("Basquete"),
          subtitle: Text("Lançamentos de 3 pontos enchem os olhos!"),
          trailing: Icon(Icons.sports_handball),
          enabled: false,
        ),
        ListTile(
          leading: Icon(Icons.pool),
          title: Text("Natação"),
          subtitle: Text("100M rasos são difíceis de fazer..."),
          trailing: Icon(Icons.water),
          onTap: () {
            print("Preparar... JÁ!");
          },
        ),
        ListTile(
            leading: Icon(Icons.snowboarding),
            title: Text("Snowboarding"),
            subtitle: Text("Se surfar já é bom, imagina na neve!"),
            trailing: Icon(Icons.snowing),
            onLongPress: () {
              print("AVALANCHE!!!");
            }),
        ListTile(
          leading: Icon(Icons.sports_rugby),
          title: Text("Futebol Americano"),
          subtitle: Text(
              "O brasileiro já vi em estádio, espero um dia ver o americano também..."),
          trailing: Icon(Icons.stadium),
          hoverColor: Color.fromARGB(1, 10, 15, 1),
        ),
      ],
    );
  }
}
