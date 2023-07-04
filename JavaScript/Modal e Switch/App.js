import React from 'react';
import { Text, View } from 'react-native';
import Estilos from './styles/styles';
import Matricula from './components/Matricula';
import ListaPlana from './components/ListaPlana';

export default function App() {
  return (
    <View>
      <View style={Estilos.app}>
          <Matricula />
          <Text style={Estilos.titulo}>Os melhores filmes são:</Text>
          <ListaPlana />
      </View>
    </View>
  );
}
