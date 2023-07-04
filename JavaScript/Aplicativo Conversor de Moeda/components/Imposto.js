import React from 'react';
import {Text, TextInput, View} from 'react-native';
import styles from '../assets/styles';

export default props=> {
  return(
    <View style = {styles.bloco}>
      <Text>Valor convertido em reais: R$ {props.calculo}</Text><br />
      <Text>Valor do imposto a ser pago: R$ {props.imposto}</Text><br />
    </View>
  );
}