import {StyleSheet} from "react-native";

const styles = StyleSheet.create({
  principal:{
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1,
  },
  bloco:{
    marginTop: 10,
    marginBottom: 10,
    fontSize: 20,
    justifyContent: 'center',
    alignItems: 'center',
  },
  titulo:{
    padding: 20,
    marginTop: 25,
    alignSelf: 'center',
    justifyContent: 'center',
    alignItems: 'center',
  },
  button:{
    backgroundColor: 'green',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 7,
    padding: 15,
    width: '200px',
    height: '50px',
  },
  textoButton:{
    textTransfor: 'uppercase',
    color: 'white',
    padding: '15',
    justifyContent: 'center',
    alignItems: 'center',
  },
  textoInput:{
    borderColor: 'black',
    borderWidth:  2,
    height: 40,
    alignSelf: 'center',
    justifyContent: 'center',
    alignItems: 'center',
  },
  label:{
    paddingTop: 15,
    justifyContent: 'center',
    alignItems: 'center',
  },
})

export default styles;