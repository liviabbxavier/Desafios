let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do desafio';
function verificarChute() {
    console.log('O botão foi clicado');
    alert('Eu amo JS');
}
let cidadeBrasil;
cidadeBrasil = prompt('Digite o nome de uma cidade do Brasil');
alert('Estive em ' + cidadeBrasil + ' e lembrei de você.');

let numero1;
numero1 = prompt('Digite um número');
let numero2;
numero2 = prompt('Digite outro número');
let soma = (Number(numero1) + Number(numero2));
alert('A soma dos números é ' + soma );