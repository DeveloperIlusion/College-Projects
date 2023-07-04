import React, {useState} from 'react';
import {Text, TouchableHighlight, View} from 'react-native';
import styles from '../assets/styles';

export default props=> {
  return(
    <View style = {styles.bloco}>
      <TouchableHighlight
        style = {styles.button}
        onPress = {props.aoPressionar}
      >
        <Text style= {styles.textoButton}>Converter</Text>
      </TouchableHighlight>
    </View>
  );
}