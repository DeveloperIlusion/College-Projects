import React, {useState} from 'react';
import {View, Text, TouchableOpacity} from 'react-native';
import styles from '../assets/styles';

export default function BtnCalcular(props){
  return(
    <View style = {styles.bloco}>
      <TouchableOpacity
        style = {styles.btnCalcular}
        onPress = {() => props.aoClicar()}
      >
        <Text style = {styles.txtBtn}>Calcular IMC</Text>
      </TouchableOpacity>
    </View>
  );
}