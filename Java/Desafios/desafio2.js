alert('Seja bem-vindo(a)!');
let diaDaSemana = prompt('Digite o dia da semana');
if (diaDaSemana == 'Sábado'|| diaDaSemana == 'Domingo') {
    alert('Bom final de semana!');
} else {
    alert('Boa semana');
};

let numero = prompt('Digite um número positivo ou negativo');
if (numero >= 0) {
    alert('Este número é positivo!');
} else {
    alert('Este número é negativo!');
};

let suaPontuação;
do{
suaPontuação = prompt('Digite sua pontuação');
if (suaPontuação >= 5000) {
    alert('Parabéns, você venceu!');
} else {
    alert('Que pena, tente novamente para ganhar.');
} 
} while(suaPontuação < 5000);
