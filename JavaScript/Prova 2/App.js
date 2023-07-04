import React, {useState} from 'react';
import { Text, View, Button, TouchableHighlight, StyleSheet } from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createStackNavigator} from '@react-navigation/stack';
import BlocoI from './components/BlocoI/BlocoI';
import BlocoII from './components/BlocoII/BlocoII';
import styles from './assets/style';

export  default function App() {
  return (
    <BlocoI />
  );
}
