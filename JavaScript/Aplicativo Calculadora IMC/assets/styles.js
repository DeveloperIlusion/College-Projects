import React from 'react';
import {StyleSheet} from 'react-native';

const styles = StyleSheet.create({
  corpo: {
    padding: 30,
  },
  titulo:{
    fontSize: 25,
    fontWeight: 'bold',
    marginTop: 10,
    marginBottom: 10,
    justifyContent: 'center',
    alignItems: 'center',
  },
  bloco:{
    padding: 10,
  },
  resultado:{
    margin: 0,
    padding: 0,
  },
  textos:{
    width: '100%',
    borderWidth: 1,
    borderColor: '#000',
    borderRadius: 10,
    height: 50,
    padding: 10,
  },
  textoComum:{
    fontWeight: 600,
  },
  btnCalcular:{
    backgroundColor: 'green',
    justifyContent: 'center',
    alignItems: 'center',
    padding: 10,
    borderRadius: 20,
  },
  txtBtn:{
    fontSize: 15,
    textTransformation: 'uppercase',
    color: '#fff',
  },
  imagem:{
    marginBottom: 20,
    flex: 1,
  },
  tabela:{
    justifyContent: 'center',
    alignItems: 'center',
    width: '100%',
    resizeMode: 'contain',
    minHeight: 280,
    flex: 1,
  },
});

export default styles;