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
  container2: {
    flex: 1,
    backgroundColor: '#e5e5e5',
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'row',
  },
  ItemLP:{
    backgroundColor: '#DC143C',
    padding: 15,
    marginVertical: 8,
    marginHorizontal: 16,
    borderRadius: 15,
    shadowRadius: 12,
    shadowOpacity: 1,
    shadowColor: '#DC143C',
  },
  textoLP: {
    fontSize: 20,
    color: 'white',
    textAlign: 'center',
  },
})