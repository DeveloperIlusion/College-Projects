import React, {useState} from 'react';
import { Text, View, Button, TouchableHighlight } from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createStackNavigator} from '@react-navigation/stack';
import styles from '../../assets/style';

const Pilha = createStackNavigator();

export function TelaAluno({navigation}){
  return(
    <View style = {styles.viewTN}>
      <Text style = {styles.textoIN}>Nome: Bruno Deluca Satil Cassiano</Text>
      <Text style = {styles.textoIN}>Nº da Matrícula: 11032110015</Text>
      <TouchableHighlight
        style = {styles.pressableCurso}
        onPress = {()=> navigation.navigate('Curso')}
      >
        <Text style = {styles.pressableCurso}>Tela Curso</Text>
      </TouchableHighlight>
      <TouchableHighlight
        style = {styles.pressableDisciplina}
        onPress = {()=> navigation.navigate('Disciplina')}
      >
        <Text style = {styles.pressableDisciplina}>Tela Disciplina</Text>
      </TouchableHighlight>
    </View>
  );
}

export function TelaDisciplina({navigation}){
  return(
    <View style = {styles.viewTN}>
      <Text style = {styles.textoIN}>C++ -> Lucas</Text>
      <Text style = {styles.textoIN}>Empreendedorismo -> André</Text>
      <Text style = {styles.textoIN}>Banco de Dados -> Myrian</Text>
      <TouchableHighlight
        style = {styles.pressableAluno}
        onPress = {()=> navigation.navigate('Aluno')}
      >
        <Text style = {styles.pressableAluno}>Tela Aluno</Text>
      </TouchableHighlight>
      <TouchableHighlight
        style = {styles.pressableCurso}
        onPress = {()=> navigation.navigate('Curso')}
      >
        <Text style = {styles.pressableCurso}>Tela Curso</Text>
      </TouchableHighlight>
    </View>
  );
}

export function TelaCurso({navigation}){
  return(
    <View style = {styles.viewTN}>
      <Text style = {styles.textoIN}>ADS</Text>
      <Text style = {styles.textoIN}>Faculdade Santa Marcelina</Text>
      <TouchableHighlight
        style = {styles.pressableDisciplina}
        onPress = {()=> navigation.navigate('Disciplina')}
      >
        <Text style = {styles.pressableDisciplina}>Tela Disciplina</Text>
      </TouchableHighlight>
      <TouchableHighlight
        style = {styles.pressableAluno}
        onPress = {()=> navigation.navigate('Aluno')}
      >
        <Text style = {styles.pressableAluno}>Tela Aluno</Text>
      </TouchableHighlight>
    </View>
  );
}

export default function Navegacao(){
  return(
    <NavigationContainer>
      <Pilha.Navigator initialRouteName = 'Aluno'>
        <Pilha.Screen
            name = 'Aluno'
            component = {TelaAluno}
            options = {{
              title: 'Tela Aluno',
              headerStyle:{
                backgroundColor: 'black',
              },
              headerTintColor: '#fff',
              headerTintStyle: {
                fontWeight: 'bold',
              }
            }}
          />

        <Pilha.Screen
          name = 'Disciplina'
          component = {TelaDisciplina}
          options = {{
            title: 'Tela Disciplina',
            headerStyle:{
              backgroundColor: 'black',
            },
            headerTintColor: '#fff',
            headerTintStyle: {
              fontWeight: 'bold',
            }
          }}
        />

        <Pilha.Screen
          name = 'Curso'
          component = {TelaCurso}
          options = {{
            title: 'Tela Curso',
            headerStyle:{
              backgroundColor: 'black',
            },
            headerTintColor: '#fff',
            headerTintStyle: {
              fontWeight: 'bold',
            }
          }}
        />

      </Pilha.Navigator>
    </NavigationContainer>
  );
}