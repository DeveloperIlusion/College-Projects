import React, {useState} from 'react';
import {SafeAreaView, Text} from 'react-native';
import styles from './assets/styles';
import Dolar from './components/Dolar';
import DolarCotacao from './components/DolarCotacao'
import BtnCalcular from './components/BtnCalcular';
import Imposto from './components/Imposto';

export  default function App() {

const [dolar, setDolar] = useState(0);
const [dolarCotacao, setDolarCotacao] = useState(0);
const [calculo, setCalculo] = useState('');
const [imposto, setImposto] = useState('');

const calcular =()=> {
  if (!dolar){
    alert('Informe o valor em dólar:');
  }

  if (!dolarCotacao){
    alert('Informe a cotação do dólar:');
  }

  let calculo = (dolar * dolarCotacao).toFixed(2);

  let imposto = ((calculo * 6.28)/100).toFixed(2);

  alert('Valor convertido em reais: R$ '+ calculo + ' e deverá pagar imposto de R$ ' + imposto);

  setImposto(imposto);
  setCalculo(calculo);
}

  const limpar =()=> {
    setImposto(calculo);
    setCalculo('');
  }

  const setarReal =(v)=> {
    limpar('');
    setDolar(v);
  }

  const setarDolar =(v)=> {
    limpar('');
    setDolarCotacao(v);
  }

  return (
    <SafeAreaView style = {styles.principal}>
      <Text  style = {styles.titulo}>Converter Moeda FASM:</Text>
      <Dolar aoModificar={setDolar}/>
      <DolarCotacao aoModificar={setDolarCotacao}/>
      <BtnCalcular aoPressionar={calcular} />
      <Imposto imposto={imposto} calculo={calculo} />
    </SafeAreaView>
  )
}