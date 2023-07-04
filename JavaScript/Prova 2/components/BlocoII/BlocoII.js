import React, {useState} from 'react';
import {View, Text, Pressable, ActivityIndicator} from 'react-native';
import styles from '../../assets/style';

export default function IndicadorCarregamento(){
  const [tamanho, setTamanho] = useState('large');
  const [cor, setCor] = useState('green');

  return(
    <View>
      <Text style = {styles.textoAI}>
        Regule o indicador pelo botão:
      </Text>

      <ActivityIndicator
        style = {styles.indicadorAI}
        color = {cor}
        size = {tamanho}
        animating = {true}
      />

      <Pressable
        style = {styles.botaoPressable}
        onLongPress = {()=> {setTamanho('small'), setCor('red')}}
        onPress = {()=> {setTamanho('large'), setCor('green')}}
      >
        <Text style = {styles.textoPressable}>Toque Breve: Aumentar</Text>
        <Text style = {styles.textoPressable}>Toque Demordo: Diminuir</Text>
      </Pressable>
    </View>
  );
}