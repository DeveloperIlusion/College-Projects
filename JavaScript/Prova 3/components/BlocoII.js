import React, {useState, useEffect} from 'react';
import {ActivityIndicator, FlatList, View, Text} from 'react-native';
import styles from '../assets/style';

export default function Api(){

  const [carregando, setCarregando] = useState(false);
  const [dados, setDados] = useState([]);

  async function getMovies(){
    try{
      const url = 'https://reactnative.dev/movies.json';
      const resposta = await fetch(url);
      const json = await resposta.json();
      setDados(json.movies);
    }catch(error){
      console.log(error);
    }finally{
      setCarregando(false);
    }
  }

  useEffect(() => {
    getMovies();
  },[]);
  
  return(
    <View style = {styles.container2}>
      {carregando ? <ActivityIndicator/> : (
        <FlatList
          data = {dados}
          keyExtractor = {(movies) => movies.id}
          renderItem = {({item}) => (
            <View style = {styles.ItemLP}>
              <Text style = {styles.textoLP}>
                Id: {item.id} <br />
                Filme: {item.title} <br />
                Ano: {item.releaseYear} <br />
              </Text>
            </View>
          )}
        />
      )}
    </View>
  );
}