import React, {useState} from 'react';
import { Text, View, Modal, Switch } from 'react-native';
import Estilos from '../styles/styles';

export default function Matricula() {
  
  const [visivel, setVisivel] = useState(false);

  return (
    <View>
      <Modal
        animationType='fade'
        transparent={true}
        visible={visivel}
      >
        <View style={Estilos.switch}>
          <Text style={Estilos.matricula}>
            Nome: Bruno Deluca Satil Cassiano
          </Text>
          <Text style={Estilos.matricula}>
            Matricula: 11032110015
          </Text>

          <Switch
            value = {visivel}
            onValueChange = {() => {setVisivel(false)}}
            trackColor = {visivel ? 'blue' : '#ff6600'}
            thumbColor = {visivel ? 'blue' : '#ff6600'}
          />
        </View>
      </Modal>
      <Switch
        value = {visivel}
        onValueChange = {() => {setVisivel(true)}}
        trackColor = {visivel ? 'blue' : '#ff6600'}
        thumbColor = {visivel ? 'blue' : '#ff6600'}
      />
    </View>
  );
}
