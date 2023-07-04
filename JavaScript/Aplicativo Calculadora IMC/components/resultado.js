import React, {useState} from 'react';
import {View, Text} from 'react-native';
import styles from '../assets/styles';

export default function Resultado(props){
  return(
    <View style = {styles.resultado}>
      <Text style = {styles.textoComum}>IMC:  {props.imc}</Text>
      <Text style = {styles.textoComum}>classificação:  {props.resultado}</Text>
    </View>
  );
}