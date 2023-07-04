import React, {useState} from 'react';
import {View, Text, TextInput} from 'react-native';
import styles from '../assets/styles';

export default function Idade(props){
  return(
    <View style = {styles.bloco}>
      <Text>Idade:</Text>
        <TextInput
          style = {styles.textos}
          autoFocus = {false}
          placeholder = 'Informe sua idade'
          keyboardType = {'numeric'}
          onChangeText = {text => props.aoModificar(text)}
        />      
    </View>
  );
}