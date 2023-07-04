import React, {useState} from 'react';
import {SafeAreaView, View, Text, Image} from 'react-native';
import Peso from './components/peso';
import Altura from './components/altura';
import Idade from './components/idade';
import BtnCalcular from './components/btnCalcular';
import Resultado from './components/resultado';
import Tabela from './components/tabela';
import styles from './assets/styles';

export default function IMC(){

  const [peso, setPeso] = useState(0);
  const [altura, setAltura] = useState(0);
  const [idade, setIdade] = useState(0);
  const [imc, setIMC] = useState(0);
  const [resultado, setResultado] = useState('');

  const calcularIMC =()=> {
    if(!idade || idade <= 0 || idade > 120){
      alert('Informe uma idade válida!');
    }

    if(!peso || peso <= 0 || peso > 300){
      alert('Informe um peso válido!');
    }

    if(!altura || altura <= 0 || altura > 3){
      alert('Informe uma altura válida !');
    }

    let classificacao;

    let calculo = (peso / (altura ** 2)).toFixed(2);

    if(idade < 65) {
      if(calculo < 18.5){
        classificacao = 'Abaixo do peso';
      } else if(calculo < 25){
        classificacao = 'Peso normal';
      } else if(calculo < 30){
        classificacao = 'Sobrepeso';
      } else if(calculo < 35){
        classificacao = 'Obesidade grau I';
      } else if(calculo < 40){
        classificacao = 'Obesidade grau II';
      } else if(calculo > 40){
        classificacao = 'Obesidade mórbida';
      }
    } else {
      if(calculo < 22){
        classificacao = 'Abaixo do peso';
      } else if(calculo < 27){
        classificacao = 'Peso normal';
      } else if(calculo > 27){
        classificacao = 'Sobrepeso';
      }
    }

    setIMC(calculo);
    setResultado(classificacao);
  }

  const limpar =()=> {
    setResultado('');
    setIMC('');
  }

  const setarIdade =(v)=> {
    limpar('');
    setIdade(v);
  }

  const setarPeso =(v)=> {
    limpar('');
    setPeso(v);
  }

  const setarAltura =(v)=> {
    limpar('');
    setAltura(v);
  }

  return(
    <SafeAreaView style = {styles.corpo}>
      <View style = {styles.titulo}>
        <Text  style = {styles.titulo}>Calculadora IMC - FASM</Text>
      </View>

      <Idade aoModificar = {setarIdade}/>
      <Peso aoModificar = {setarPeso} />
      <Altura aoModificar = {setarAltura} />
      <BtnCalcular aoClicar = {calcularIMC} />
      <Resultado resultado = {resultado} imc =  {imc}/>
      <Tabela />
    </SafeAreaView>
  );
}