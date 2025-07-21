alert('Bem vindo ao jogo do número secreto');
let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;

while (chute != numeroSecreto) {
    chute = prompt('Escolha um número.');
    if (chute == numeroSecreto) {
        break;
    } else {
        if (chute > numeroSecreto) {
            alert('O númer secreto é menor que ' + chute);
        } else {
            alert('O número secreto é maior que ' + chute);
        }
        //tentativas = tentativas + 1;
        tentativas++;
    }
}

let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
    alert(`Parabéns, você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}.`);

/*if (tentativas > 1) {
    alert('Parabéns, você descobriu o número secreto ' + numeroSecreto + ' com ' + tentativas + ' tentativas.');
} else {
    alert('Parabéns, você descobriu o número secreto ' + numeroSecreto + ' com ' + tentativas + ' tentativa.');
}*/

