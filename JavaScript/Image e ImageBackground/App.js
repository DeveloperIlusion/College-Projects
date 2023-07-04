import React from 'react';
import { Text, View, Image } from 'react-native';
import Estilos from './styles/styles';
import BancoDeDados from './components/BancoDeDados';
import PHP from './components/PHP';
import Imagem from './assets/imgBrunoCassiano.png';

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
      <Image
        source = {Imagem}
        style = {Estilos.imagem}
      />
    </View>
  );
}
