import React, {useState, useEffect} from 'react';
import {StyleSheet, Text, View} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import BlocoI from './components/BlocoI';
import BlocoII from './components/BlocoII';

export default function App() {
  return (
    <View>
      <BlocoI />
    </View>
  );
}