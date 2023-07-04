import React from 'react';
import { Text, View, FlatList } from 'react-native';
import Estilos from '../styles/styles';

const flatlist = [
  {
    id: '001',
    NomedaCidade: 'Ouro Preto',
    UF: 'MG',
    AtracaoTuristica: 'Historia'
  },
  {
    id: '002',
    NomedaCidade: 'Manaus',
    UF: 'AM',
    AtracaoTuristica: 'Floresta',
  },
  {
    id: '003',
    NomedaCidade: 'Foz do Iguaçu',
    UF: 'PR',
    AtracaoTuristica: 'Cataratas',
  },
  {
    id: '004',
    NomedaCidade: 'Florianopolis',
    UF: 'SC',
    AtracaoTuristica: 'Cachoeiras',
  },
  {
    id: '005',
    NomedaCidade: 'Natal',
    UF: 'RN',
    AtracaoTuristica: 'Praias',
  },
  {
    id: '006',
    NomedaCidade: 'Recife',
    UF: 'PE',
    AtracaoTuristica: 'Cultura',
  },
  {
    id: '007',
    NomedaCidade: 'Rio de Janeiro',
    UF: 'RJ',
    AtracaoTuristica: 'Carnaval',
  },
  {
    id: '008',
    NomedaCidade: 'Salvador',
    UF: 'BA',
    AtracaoTuristica: 'Gastronomia',
  },
];

export default function ListaPlana(){
  return(
    <View>
      <FlatList
        data = {flatlist}
        keyExtractor = {item => item.id}
        renderItem = {
          ({item}) => <View style = {Estilos.texto}>
            <Text style = {Estilos.texto}>
            NomedaCidade: {item.NomedaCidade}
            <br />
            UF: {item.UF}
            <br />
            AtracaoTuristica: {item.AtracaoTuristica}
            </Text>
          </View>
        }
      />
    </View>
  )
}