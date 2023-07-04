import React from 'react';
import {Text, View, TouchableHighlight} from 'react-native';
import styles from '../assets/styles/styles';

export default function Botao(props){
  const stylesBotoes = [styles.btn];

  if (props.duplo) {
    stylesBotoes.push(styles.btnDuplo);
  }

  if (props.igual) {
    stylesBotoes.push(styles.btnIgual);
  }

  if (props.operacao) {
    stylesBotoes.push(styles.btnOperacao);
  }

  if (props.ac) {
    stylesBotoes.push(styles.btnAC);
  }

  if (props.bs) {
    stylesBotoes.push(styles.btnBS);
  }

  return(
    <TouchableHighlight
      onPress = {props.aoClicar}
    >
      <Text style = {stylesBotoes}>
          {props.label}
      </Text>
    </TouchableHighlight>
  );
}