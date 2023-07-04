import React, {useState} from 'react';
import {Alert, View, Text, Image, Button, ScrollView} from 'react-native';
import styles from '../assets/styles';

const pokemonLista = [
  {id: 1, nome: 'Bulbassauro'},
  {id: 2, nome: 'Ivysaur'},
  {id: 3, nome: 'Venasaur'},
  {id: 4, nome: 'Charmander'},
  {id: 5, nome: 'Charmaleon'},
  {id: 6, nome: 'Charizard'},
  {id: 7, nome: 'Squirtle'},
  {id: 8, nome: 'Wartotle'},
  {id: 9, nome: 'Blastoise'},
  {id: 10, nome: 'Caterpie'},
  {id: 11, nome: 'Metapod'},
  {id: 12, nome: 'Buterfree'},
  {id: 13, nome: 'Weedle'},
  {id: 14, nome: 'Kakuna'},
  {id: 15, nome: 'Beedrill'},
  {id: 16, nome: 'Pidgey'},
  {id: 17, nome: 'Pidgeotto'},
  {id: 18, nome: 'Pidgeot'},
  {id: 19, nome: 'Rattata'},
  {id: 20, nome: 'Raticate'},
]

export default function Pokemon(){

  const [pokemonSelecionado, setPokemonSelecionado] = useState(null);

  const getPokemonData = (idPokemon) =>{
    const endpoint = `https://pokeapi.co/api/v2/pokemon/${idPokemon}/`;

    fetch(endpoint)
      .then(resposta => resposta.json())
        .then(json => {
          const pokemon = {
            nome: json.name,
            img: json.sprites.other['official-artwork'].front_default,
            experiencia: json.base_experience,
            peso: json.weight,
          }

          setPokemonSelecionado(pokemon);
        })

        .catch(() => {
          Alert.alert('Erro', 'Não foi possível carregar os dados do pokémon selecionado');
        })
  }

  return(
    <View style = {styles.container}>
      <ScrollView>
        <View style = {styles.topo}>
          <Text style = {styles.topoTitulo}>
            Selecione seu Pokémon
          </Text>
        </View>

        {pokemonSelecionado != null && (
          <View style = {styles.pokemonCaixa}>
            <Text style = {styles.pokemonNome}>
              Nome: {pokemonSelecionado.nome}
            </Text>

            <Text style = {styles.pokemonExperiencia}>
              Experiência: {pokemonSelecionado.experiencia}
            </Text>

            <Text style = {styles.pokemonPeso}>
              Peso: {pokemonSelecionado.peso}
            </Text>

            <Image 
              resizeMode = 'stretch'
              style = {styles.pokemonImagem}
              source = {{uri: pokemonSelecionado.img}}
            />
          </View>
        )}

        {pokemonLista.map(pokemon => (
          <View style = {styles.cardConteudo}>
            <Text style = {styles.cardTitulo}>
              {pokemon.nome}
            </Text>

            <Button 
              title = 'Exiber dados'
              onPress = {() => getPokemonData(pokemon.id)}
              color = {'#120ABF'}
            />
          </View>
        ))}
      </ScrollView>
    </View>
  );
}