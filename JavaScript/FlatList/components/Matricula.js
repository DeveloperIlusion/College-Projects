import React from 'react';
import { Text, View } from 'react-native';
import Estilos from '../styles/styles';

export default function Matricula() {
  return (
    <View>
      <Text style={Estilos.matricula}>
        Nome: Bruno Deluca Satil Cassiano
        <br/>
        Matrícula: 11032110015
        <br/>
        <br/>
      </Text>
    </View>
  );
}

