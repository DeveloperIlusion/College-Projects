import React, {useState, useEffect} from 'react';
import {Text, TextInput, View, TouchableHighlight, Switch} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import styles from '../assets/style';

export default function Armazenamento(){

  const[filme, setFilme] = useState('');
  const[cartaz, setCartaz] = useState('Ainda não informado');
  const[ligado, setLigado] = useState(false);

  async function recuperar(){
    const resposta = await AsyncStorage.getItem('@App1');
    if(resposta != null){
      setCartaz(resposta);
      setLigado(true);
    }else{
      setCartaz('Ainda não informado.');
      setLigado(false);
    }
  }

  async function salvar(){
    await AsyncStorage.setItem('@App1', filme);
    alert('Filme salvo com sucesso!');
    setLigado(true);
  }

  async function deletar(){
    await AsyncStorage.removeItem('@App1');
    alert('Filme excluído com sucesso!');
    setCartaz('Ainda não informado');
    setLigado(false);
  }

  useEffect(()=> {
    recuperar();
  }, []);

  return(
    <View style = {styles.container}>
    
      <Text style = {styles.titulo}>
        Cinema FASM
      </Text>

      <Text style = {styles.textInputs}>
        O filme em cartaz de hoje é: {cartaz}
      </Text>

      <Text style = {styles.textInputs}>
        O cinema está aberto: {ligado ? 'Sim' : 'Não'}
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
        placeholder = {'Informe o filme em cartaz'}
        value = {filme}
        onChangeText = {(value) => setFilme(value)}
      />

      <TouchableHighlight
        style = {styles.buttonInsert}
        onPress = {salvar}
      >
        <Text style = {styles.buttonText}>Gravar Filme</Text>
      </TouchableHighlight>

      <TouchableHighlight
        style = {styles.buttonVisualize}
        onPress = {recuperar}
      >
        <Text style = {styles.buttonText}>Exibir Filme</Text>
      </TouchableHighlight>

      <TouchableHighlight
        style = {styles.buttonDelete}
        onPress = {deletar}
      >
        <Text style = {styles.buttonText}>Excluir Filme</Text>
      </TouchableHighlight>

    </View>
    );
}