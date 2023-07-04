import React from 'react';
import { Text, View, FlatList } from 'react-native';
import Estilos from '../styles/styles';

const filmes = [
  {
    id: '001',
    titulo: ['Cínco Centímetros por Segundo', 2007]
  },
  {
    id: '002',
    titulo: ['O Jardim das Palavras', 2013]
  },
  {
    id: '003',
    titulo: ['A Voz do Silêncio', 2016]
  },
  {
    id: '004',
    titulo: ['O Tempo Com Você', 2019]
  },
  {
    id: '005',
    titulo: ['Josee, the Tiger and the Fish', 2020]
  },
];

export default function ListaPlana(){
  return(
    <View>
      <FlatList
        data = {filmes}
        keyExtractor = {item => item.id}
        renderItem = {
          ({item}) => <View style = {Estilos.listaCaixa}>
            <Text style = {Estilos.listaTexto}>Filme: {item.titulo[0]} - 
            Ano: {item.titulo[1]}</Text>
            <Text style = {Estilos.listaId}>id: {item.id}</Text>
          </View>
        }
      />
    </View>
  )
}