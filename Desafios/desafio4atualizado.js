console.log('Seja bem vindo!');
let nome = 'Lívia';
console.log(`Olá, ${nome}`);
let nome2 = 'Lívia';
alert (`Olá, ${nome2}`);
let = prompt('Qual a linguagem de programação que você mais gosta?');
let resposta = 'Java';

let valor1 = 7;
let valor2 = 29;
let resultado = 36;
console.log(`A soma de ${valor1} e ${valor2} é igual a ${resultado}.`);

let valor3 = 7;
let valor4 = 29;
let resultado1 = 22;
console.log(`A diferença entre ${valor3} e ${valor4} é igual a ${resultado1}.`);

let idade = prompt('Digite sua idade.');
if (idade >= 18) {
    console.log('Você é maior de idade!');
} else {
    console.log('Você é menor de idade!');
}

let numero = prompt('Digite um número negativo ou positivo.');
if (numero <= -1) {
    console.log('Este número é negativo!');
} else {
    console.log('Este número é positivo!');
}

let contador = 1;
while (contador != 11) {
    console.log(`O contador neste momento é ${contador}`);
    contador++;
}

let nota = 29;
if (nota >= 7) {
    console.log('Aprovado!');
} else {
    console.log('Reprovado');
}

let numeroAleatorio = parseInt(Math.random() * 100);
let numeroAleatorio2 = parseInt(Math.random() * 3);
let numeroAleatorio3 = parseInt(Math.random() * 542);