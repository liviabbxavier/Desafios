alert('Bem vindo ao jogo do número secreto');
let numeroSecreto = 15;
let chute = prompt('Dê o seu chute');

if (numeroSecreto == chute) {
    alert('Parabéns, este foi o número escolhido' + numeroSecreto );
} else {
    alert('Número incorreto :(');
}