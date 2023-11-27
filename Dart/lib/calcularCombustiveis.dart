import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primaryColor: Colors.red),
      home: Home(),
    );
  }
}

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  GlobalKey<FormState> _formKey = GlobalKey<FormState>();

  TextEditingController gasolinaController = TextEditingController();
  TextEditingController etanolController = TextEditingController();
  TextEditingController gasolinaAditivadaController = TextEditingController();

  String _infoText = "Informe o valor de cada combustível";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Calculadora de Combustível"),
        centerTitle: true,
        backgroundColor: Colors.red,
        actions: <Widget>[
          IconButton(
              onPressed: () {
                _resetaValores();
              },
              icon: Icon(Icons.refresh))
        ],
      ),
      backgroundColor: Colors.white,
      body: SingleChildScrollView(
        padding: EdgeInsets.fromLTRB(20.0, 0, 20.0, 0),
        child: Form(
          key: _formKey,
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.center,
            children: <Widget>[
              Icon(Icons.directions_car, size: 60.0, color: Colors.red),
              buildTextFormFieldGasolina(),
              SizedBox(
                height: 10,
              ),
              buildTextFormFieldEtanol(),
              SizedBox(
                height: 10,
              ),
              buildTextFormFieldGasolinaAditivada(),
              SizedBox(
                height: 10,
              ),
              buildContainerButton(context),
              SizedBox(
                height: 10,
              ),
              buildTextInfo(),
            ],
          ),
        ),
      ),
    );
  }

  buildTextFormFieldGasolina() {
    return TextFormField(
      keyboardType: TextInputType.number,
      decoration: InputDecoration(
        labelText: "Preço da Gasolina",
        labelStyle: TextStyle(
          color: Colors.black,
          fontSize: 20.0,
        ),
      ),
      controller: gasolinaController,
      validator: ((value) {
        if (value!.isEmpty) {
          return ("Informe o valor da gasolina.");
        }
        return null;
      }),
    );
  }

  buildTextFormFieldEtanol() {
    return TextFormField(
      keyboardType: TextInputType.number,
      decoration: InputDecoration(
        labelText: "Preço do Etanol",
        labelStyle: TextStyle(
          color: Colors.black,
          fontSize: 20.0,
        ),
      ),
      controller: etanolController,
      validator: ((value) {
        if (value!.isEmpty) {
          return ("Informe o valor do etanol.");
        }
        return null;
      }),
    );
  }

  buildTextFormFieldGasolinaAditivada() {
    return TextFormField(
      keyboardType: TextInputType.number,
      decoration: InputDecoration(
        labelText: "Preço da Gasolina Aditivada",
        labelStyle: TextStyle(
          color: Colors.black,
          fontSize: 20.0,
        ),
      ),
      controller: gasolinaAditivadaController,
      validator: ((value) {
        if (value!.isEmpty) {
          return ("Informe o valor da gasolina aditivada.");
        }
        return null;
      }),
    );
  }

  buildContainerButton(BuildContext context) {
    return Container(
      height: 50.0,
      child: ElevatedButton(
        style: ElevatedButton.styleFrom(backgroundColor: Colors.red),
        onPressed: () {
          if (_formKey.currentState!.validate()) {
            calcula();
            FocusScope.of(context).requestFocus(new FocusNode());
          }
        },
        child: Text("Calcular",
            style: TextStyle(color: Colors.white, fontSize: 20.0)),
      ),
    );
  }

  buildTextInfo() {
    return Text(
      _infoText,
      textAlign: TextAlign.left,
      style: TextStyle(color: Colors.black, fontSize: 20.0),
    );
  }

  void calcula() {
    setState(() {
      double gasolina = double.parse(gasolinaController.text);
      double etanol = double.parse(etanolController.text);
      double gasolinaAditivada = double.parse(gasolinaAditivadaController.text);

      double resultado = (etanol / gasolina) * 100;
      String mensagem = "Percentual do etanol em relação a gasolina: ${resultado.toStringAsFixed(2)}%";

      if (resultado < 70) {
        _infoText = mensagem + "\n\nAbasteça com etanol!";
      } else if (resultado <= 90) {
        _infoText = mensagem + "\n\nAbasteça com gasolina!";
      } else {
        _infoText = mensagem + "\n\nAbasteça com gasolina aditivada!";
      }
    });
  }

  _resetaValores() {
    setState(() {
      gasolinaController.text = "";
      etanolController.text = "";
      gasolinaAditivadaController.text = "";
      _infoText = "Informe o valor de cada combustível!";
    });
  }
}
