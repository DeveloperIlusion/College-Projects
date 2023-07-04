import React, {useState} from 'react';
import { Text, View, SafeAreaView, TextInput, TouchableHighlight } from 'react-native';
import Display from './components/Display';
import Botao from './components/Botao';
import styles from './assets/styles/styles';

export default function Calculadora(){

  const [operacao, setOperacao] = useState(0);
  const [resultado, setResultado] = useState(0);

  const calcular =()=> {
    setResultado(eval(operacao));
  }

  return (
    <SafeAreaView style = {styles.container}>
    
        <Text>
          Calculadora - FASM
        </Text>

        <Display valor = {0} resultado =  {0} />

        <View style = {styles.buttons}>
          <Botao label = 'AC' ac aoClicar = {()=> {}} />
          <Botao label = '(' aoClicar = {()=> {}} />
          <Botao label = ')' aoClicar = {()=> {}} />
          <Botao label = '/' operacao aoClicar = {()=> {}} />
          <Botao label = '7' aoClicar = {()=> {}} />
          <Botao label = '8' aoClicar = {()=> {}} />
          <Botao label = '9' aoClicar = {()=> {}} />
          <Botao label = '*' operacao aoClicar = {()=> {}} />
          <Botao label = '4' aoClicar = {()=> {}} />
          <Botao label = '5' aoClicar = {()=> {}} />
          <Botao label = '6' aoClicar = {()=> {}} />
          <Botao label = '-' operacao aoClicar = {()=> {}} />
          <Botao label = '1' aoClicar = {()=> {}} />
          <Botao label = '2' aoClicar = {()=> {}} />
          <Botao label = '3' aoClicar = {()=> {}} />
          <Botao label = '+' operacao aoClicar = {()=> {}} />
          <Botao label = '0' aoClicar = {()=> {}} />
          <Botao label = '.' aoClicar = {()=> {}} />
          <Botao label = '<-' bs aoClicar = {()=> {}} />
          <Botao label = '=' igual aoClicar = {()=> {}} />
        </View>

    </SafeAreaView>
  );
}
