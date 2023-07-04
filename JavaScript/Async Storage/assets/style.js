import { StyleSheet } from 'react-native';

export default StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    justifyContent: 'center',
    alignItems: 'center',
  },
  input:{
    borderWidth: 1,
    borderColor: '#000',
    borderRadius: 10,
    padding: 5,
    marginVertical: 10,
    fontSize: 16
  },
  textInputs:{
    width: '100%',
    padding: 20,
    marginTop: 10,
  },
  buttonInsert:{
    borderRadius: 10,
    padding: 15,
    marginTop: 15,
    backgroundColor: 'green',
  },
  buttonDelete:{
    borderRadius: 10,
    padding: 15,
    marginTop: 15,
    backgroundColor: 'red',
  },
  buttonVisualize:{
    borderRadius: 10,
    padding: 15,
    marginTop: 15,
    backgroundColor: 'blue',
  },
  buttonText:{
    color: '#fff',
    fontSize: 16,
    marginVertical: 10,
    justifyContent: 'center',
    alignItems: 'center',
  },
  switch:{
    alignSelf: 'center',
    marginBottom: 20,
  },
  titulo: {
    fontSize: 20,
    margin: 20,
    textAlign: 'center',
  },
})