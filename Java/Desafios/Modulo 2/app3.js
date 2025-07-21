function massaCorporal(altura, peso) {
    return peso / (altura * altura);
}
let resultado = massaCorporal(1.63, 50);
console.log(resultado);

function valorFatorial(numero) {
    let resultado2 = 1;
    let i = 2; i <= numero; i++;
    resultado2 *= i;
    console.log(resultado2);
    return resultado2;
}
valorFatorial(5);

function converteDolar(dolar) {
    let dolarVale = 4.80;
    let reaisVale = dolar * dolarVale;
    return (reaisVale);
}
let resultado3 = converteDolar(10);
console.log(resultado3);

function perimetroArea(altura, largura) {
    area = altura * largura
    perimetro = 2 * (altura + largura)
    return area, perimetro
}
let resultadoPEA = perimetroArea(15, 5);
console.log(`Área: ${area} metros quadrados`);
console.log(`Perímetro: ${perimetro} metros`);

function circuloPerimetro(raio) {
    area2 = Math.PI * raio * raio;
    perimetro2 = 2 * Math.PI * raio;
    return area2, perimetro2
}
let resultadoCirculo = circuloPerimetro(10);
console.log(resultadoCirculo);
console.log(`Área do circulo: ${area2} metros quadrados`);
console.log(`Perímetro do circulo: ${perimetro2} metros`);

function tabuada(numero) {
    let i = 1; i <= 10; i++;
    let resultado = numero * i;
    console.log(`${numero} x ${i} = ${resultado}`);
}
let resultadoTabuada = tabuada(10);