import React from 'react';
import {Text, TextInput, View} from 'react-native';
import styles from '../assets/styles';

export default props=> {
  return(
    <View style = {styles.bloco}>
      <Text>Digite a cotação do dólar:</Text>
      <TextInput
        style = {styles.textoInput}
        keyboardType = 'numeric'
        onChangeText = {text => props.aoModificar(text)}
      />
    </View>
  );
}