import React, {useState} from 'react';
import {View, Text, TextInput} from 'react-native';
import styles from '../assets/styles';

export default function Peso(props){
  return(
    <View style = {styles.bloco}>
      <Text>Peso:</Text>
        <TextInput
          style = {styles.textos}
          autoFocus = {false}
          placeholder = 'Informe seu peso'
          keyboardType = {'numeric'}
          onChangeText = {text => props.aoModificar(text)}
        />      
    </View>
  );
}