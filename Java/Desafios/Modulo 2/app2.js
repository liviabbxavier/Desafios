function mensagemOla() {
    console.log('Olá, mundo');
}
mensagemOla();

function olaNome(nome) {
    return (`Olá, ${nome}`);
}
console.log(olaNome('Lívia'));

function numero(numero1) {
    return numero1 * 2;
}
let dobroNumero = numero(7);
console.log(dobroNumero);

function recebeTres(a, b, c) {
    return (a, b, c) /3 
}
let resultado = recebeTres(5, 5, 5);
console.log(resultado);

function numeroMaior(a, b) {
    return a > b ? a : b;
}
let resultadoMaior = numeroMaior(10, 20);
console.log(resultadoMaior);

function vezesNumero(numero2) {
    return numero2 * numero2;
}
let resultadomulti = vezesNumero(7);
console.log(resultadomulti);
