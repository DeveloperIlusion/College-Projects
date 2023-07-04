import React, {useState} from 'react';
import {View, Text, TextInput} from 'react-native';
import styles from '../assets/styles';

export default function Altura(props){
  return(
    <View style = {styles.bloco}>
      <Text>Altura:</Text>
        <TextInput
          style = {styles.textos}
          autoFocus = {false}
          placeholder = 'Informe sua altura'
          keyboardType = {'numeric'}
          onChangeText = {text => props.aoModificar(text)}
        />      
    </View>
  );
}