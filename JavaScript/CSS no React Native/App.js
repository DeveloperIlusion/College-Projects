import React from 'react';
import { Text, View } from 'react-native';
import Estilos from './styles/styles';
import BancoDeDados from './components/BancoDeDados';
import PHP from './components/PHP';

export default function App() {
  return (
    <View style={Estilos.app}>
      <Text>
        Nome: Bruno Deluca Satil Cassiano
      </Text>
      <Text>
        Matrícula: 11032110015
      </Text>
      
      <BancoDeDados />
      <PHP />
    </View>
  );
}
