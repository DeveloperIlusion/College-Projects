import React from 'react';
import {View, Text, TouchableHighlight, ColorPropType} from 'react-native';
import styles from '../assets/styles/styles';

export default function Display(props){
  return(
      <View style = {styles.display}>
        <Text 
          style = {styles.txtDisplayOperacao}
          numberOfLines={1}  
        >
          {props.valor}
        </Text>

        <Text 
          style = {styles.textDisplayResultado}
          numberOfLines={1}  
        >
          {props.resultado}
        </Text>
      </View>
  );
}