import { StyleSheet, Dimensions } from 'react-native';

export default StyleSheet.create({
  display: {
    flex: 1,
    padding: 20,
    justifyContent: 'center',
    alignItems: 'flex-end',
    backgroundColor: '#444',
    width: '100%',
  },
  textDisplayResultado: {
    fontSize: 50,
    color: '#fff', 
  },
  txtDisplayOperacao: {
    fontSize: 25,
    color: '#fff',
  },
  container: {
    flex: 1,
    justifyContent: 'flex-start',
    alignItems: 'center',
  },
  buttons: {
    flexDirection: 'row',
    flexWrap: 'wrap',
  },
  btn: {
    fontSize: 30,
    height: Dimensions.get('window').width/4,
    width: Dimensions.get('window').width/4,
    padding: 20,
    backgroundColor: '#000',
    color: '#a0a0a0',
    borderWidth: 1,
    borderColor: '#fff',
    textAlign: 'center',
  },
  btnIgual: {
    color: '#f00',
  },
  btnOperacao: {
    color: '#0f0',
  },
  btnAC: {
    color: '#ff0',
  },
  btnBS: {
    color: '#0ff',
  },
  btnDuplo: {
    width: Dimensions.get('window').width/2,
  },
});
