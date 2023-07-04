import React from 'react';
import { Text, View } from 'react-native';
import Estilos from './styles/styles';
import ScrollAndRefresh from './components/ScrollAndRefresh';

export default function App() {
  return (
    <View style={Estilos.app}>
        <ScrollAndRefresh />
    </View>
  );
}
