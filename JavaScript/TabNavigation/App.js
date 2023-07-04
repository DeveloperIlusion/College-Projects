import * as React from 'react';
import { Text, View } from 'react-native';
import Estilos from './assets/style';
import { NavigationContainer } from '@react-navigation/native';
import {createBottomTabNavigator} from '@react-navigation/bottom-tabs';
import {Ionicons} from '@expo/vector-icons';

const Guias = createBottomTabNavigator();

function TelaHome({navigation}){
  return(
    <View style = {Estilos.viewTN}>
      <Text style = {Estilos.textTN}>Tela Home</Text>
      <Text style = {Estilos.textTN}>Faculdade Santa Marcelina</Text>
    </View>
  );
}

function TelaCurso({navigation}){
  return(
    <View style = {Estilos.viewTN}>
      <Text style = {Estilos.textTN}>Tela Curso</Text>
      <Text style = {Estilos.textTN}>Análise e Desenvolvimento de Sistemas</Text>
    </View>
  );
}

function TelaAluno({navigation}){
  return(
    <View style = {Estilos.viewTN}>
      <Text style = {Estilos.textTN}>Tela Aluno</Text>
      <Text style = {Estilos.textTN}>Nome: Bruno Deluca Satil Cassiano</Text>
      <Text style = {Estilos.textTN}>Matrícula: 11032110015</Text>
    </View>
  );
}

export default function App(){
  return(
    <NavigationContainer>
      <Guias.Navigator initialRouteName='TelaHome'>
        <Guias.Screen
          name = 'Home'
          component={TelaHome}
          options={{
            title: 'Tela Inicial',
            headerStyle:{
              backgroundColor: '#008',
            },
            headerTintColor: '#fff',
            tabBarLabel: 'Home',
            tabBarIcon: ({color, size}) => (
              <Ionicons name='home' color={color} size={size} />
            )
          }}
        />

        <Guias.Screen
          name = 'Curso'
          component={TelaCurso}
          options={{
            title: 'Tela Curso',
            headerStyle:{
              backgroundColor: '#008',
            },
            headerTintColor: '#fff',
            tabBarLabel: 'Curso',
            tabBarIcon: ({color, size}) => (
              <Ionicons name='book' color={color} size={size} />
            )
          }}
        />

        <Guias.Screen
          name = 'Aluno'
          component={TelaAluno}
          options={{
            title: 'Tela Aluno',
            headerStyle:{
              backgroundColor: '#63C5DA',
            },
            headerTintColor: '#000',
            tabBarLabel: 'Aluno',
            tabBarIcon: ({color, size}) => (
              <Ionicons name='alarm-sharp' color={color} size={size} />
            )
          }}
        />
      </Guias.Navigator> 
    </NavigationContainer>
  );
}

