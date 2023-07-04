import React, {useState, useEffect} from 'react';
import {Text, TextInput, View, TouchableHighlight, Switch} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import styles from '../assets/style';

export default function Armazenamento(){

  const[filme, setFilme] = useState('');
  const[cartaz, setCartaz] = useState('Nome do sabor ainda não informado.');
  const[ligado, setLigado] = useState(false);

  async function recuperar(){
    const resposta = await AsyncStorage.getItem('@App1');
    if(resposta != null){
      setCartaz(resposta);
      setLigado(true);
    }else{
      setCartaz('Nome do sabor ainda não informado.');
      setLigado(false);
    }
  }

  async function salvar(){
    await AsyncStorage.setItem('@App1', filme);
    alert('Sabor salvo com sucesso!');
    setLigado(true);
    recuperar();
  }

  async function deletar(){
    await AsyncStorage.removeItem('@App1');
    alert('Sabor excluído com sucesso!');
    setCartaz('Nome do sabor ainda não informado.');
    setLigado(false);
    recuperar();
  }

  useEffect(()=> {
    recuperar();
  }, []);

  return(
    <View style = {styles.container}>
    
      <Text style = {styles.titulo}>
        Pizzaria FASM
      </Text>

      <Text style = {styles.textInputs}>
        Sabor de pizza em promoção: {cartaz}
      </Text>

      <Text style = {styles.textInputs}>
        A pizzaria está aberta: {ligado ? 'Sim' : 'Não'}
      </Text>
      <Switch
          style = {styles.switch}
          value = {ligado}
          onValueChange = {() => {ligado ? setLigado(false) : setLigado(true)}}
          trackColor = {ligado ? 'green' : 'red'}
          thumbColor = {ligado ? 'green' : 'red'}
      />

      <TextInput
        style = {styles.input}
        placeholder = {'Informe o sabor da pizza em promoção'}
        value = {filme}
        onChangeText = {(value) => setFilme(value)}
      />

      <TouchableHighlight
        style = {styles.buttonInsert}
        onPress = {salvar}
      >
        <Text style = {styles.buttonText}>Gravar Sabor</Text>
      </TouchableHighlight>

      <TouchableHighlight
        style = {styles.buttonDelete}
        onPress = {deletar}
      >
        <Text style = {styles.buttonText}>Excluir Sabor</Text>
      </TouchableHighlight>

    </View>
    );
}