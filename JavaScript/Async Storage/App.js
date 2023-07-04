import React, {useState, useEffect} from 'react';
import {StyleSheet, Text, View} from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';
import ASyncStorageComponent from './components/Armazenamento';

export default function App() {
  return (
    <View>
      <ASyncStorageComponent />
    </View>
  );
}