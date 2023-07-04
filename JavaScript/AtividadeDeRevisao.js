//Bruno Deluca Satil Cassiano

let categoria = 'A';

switch (categoria) {
  case 'A':
    console.log('Categoria de habilitação: A - Veículos de 2 ou 3 rodas acima de 50 cilindradas.');
    break;
  case 'B':
    console.log('Categoria de habilitação: B - Veículos de 4 rodas com 3500 kg e capacidade de até 8 passageiros.');
    break;
  case 'C':
    console.log('Categoria de habilitação: C - Todos veículos categoria B + veículos de carga com mais de 3500 kg.');
    break;
  case 'D':
    console.log('Categoria de habilitação: D - Veículos de transporte de passageiros com mais de 8 pessoas.');
    break;
  case 'E':
    console.log('Categoria de habilitação: E - Todos veículos categorias B, C, D e E + veículos com unidades acopladas que excedam 6 toneladas.');
    break;
  default:
    console.log('Categoria de habilitação inválida!');
    break;
}