import React, {useState} from 'react';
import {View, Image} from 'react-native';
import TabelaIMC from '../assets/tabela-imc.png'
import styles from '../assets/styles';

export default function Tabela(){
  return(
    <View style = {styles.tabela}>
      <Image
        source = {TabelaIMC}
        style = {styles.tabela}
      />     
    </View>
  );
}