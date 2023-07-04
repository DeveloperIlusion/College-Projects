import {StyleSheet} from "react-native";

export default StyleSheet.create({
  container: {
    flex: 1,
    backgroundCOlor: '#E6E6FA',
  },
  topo: {
    height: 80,
    padding: 20,
    paddingTop: 40,
    marginBottom: 20,
    backgroundColor: '#120A8F',
  },
  topoTitulo: {
    fontSize: 22,
    marginBottom: 10,
    color: '#FFF',
    textAlign: 'center',
    alignSelf: 'center',
  },
  cardConteudo: {
    borderWidth: 1,
    borderColor: '#1C1C1C',
    borderRadius: 4,
    marginBottom: 10,
    marginHorizontal: 20,
    padding: 10,
  },
  cardtitulo: {
    fontSize: 22,
    marginBottom: 20,
    textAlign: 'center',
    color: '#656565',
  },
  pokemonCaixa: {
    alignItems: 'center',
  },
  pokemonNome:{
    fontSize: 22,
  },
  pokemonExperiencia:{
    fontSize:18,
  },
  pokemonPeso:{
    fontSize:18,
  },
  pokemonImagem:{
    width: 150,
    height: 150,
  },
});