import React from 'react';
import { Text, View } from 'react-native';
import EstilosI from './AvaliacaoII_BrunoCassiano/Bloco I/styles/styles';
import EstilosII from './AvaliacaoII_BrunoCassiano/Bloco II/styles/styles'
import TimesPoteI from './AvaliacaoII_BrunoCassiano/Bloco I/components/bloco1';
import FlatList from './AvaliacaoII_BrunoCassiano/Bloco II/components/bloco2';

export default function App() {
  return (
    <View>
      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "River Plate"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Palmeiras"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Flamengo"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Boca Juniors"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Nacional"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Athlético"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Independiente Del Valle"
        />
      </View>

      <View style = {EstilosI.poteI}>
        <TimesPoteI
            time = "Olímpia"
        />
      </View>

      <FlatList />
    </View>
  );
}
