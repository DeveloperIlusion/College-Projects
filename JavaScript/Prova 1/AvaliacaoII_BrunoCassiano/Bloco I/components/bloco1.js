import React, {useState} from 'react';
import {View, Text, Switch, Modal} from 'react-native';
import EstilosI from '../styles/styles';

export default function BlocoI(props){

  const [favorito, setFavorito] = useState(false);

  titulos = props.titulos;
    <View>
      <Text>
            <Text style = {EstilosI.poteI}>
          TIMES FAVORITOS AO TÍTULO
      </Text>
      </Text>
    </View>
  return(
    <View style = {EstilosI.texto}>
      <Text style = {EstilosI.texto}>
        time: {props.time}
      </Text>
      <Switch

          value = {favorito}
          onValueChange = {() => {favorito ? setFavorito(false) : setFavorito(true)}}
          trackColor = {favorito ? 'green' : 'red'}
          thumbColor = {favorito ? 'green' : 'red'}
        />
        <Text style = {EstilosI.texto} visible={favorito}>
          Time Favorito: {favorito ? 'Sim' : 'Não'}
        </Text>
    </View>
  );
}