# Sobre o Projeto
## Este projeto apresenta uma série de desafios para demonstrar o uso de conceitos fundamentais de POO em Java. Cada seção aborda um conceito específico com um desafio prático para exemplificar sua implementação.


# Conceitos Abordados

## Herança
Desafio: Crie uma hierarquia de classes para representar veículos em uma 
concessionária. Comece com uma classe Veiculo que contém características básicas, 
como marca, modelo e ano. Depois, crie classes Carro, Moto e Caminhao que herdam de 
Veiculo e possuem propriedades específicas, como quantidadeDePortas para Carro e 
capacidadeDeCargapara Caminhao. Implemente um método para exibir informações 
detalhadas de cada veículo e demonstre a herança.

## Encapsulamento
Desafio: Desenvolva uma classe ContaBancaria que represente uma conta em um 
banco, com atributos privados como saldo e titular. Implemente métodos públicos para 
depositar e sacar, garantindo que o saldo não fique negativo (verificação no método 
sacar). Adicione também métodos para visualizar o saldo e alterar o titular, garantindo que 
os valores sejam acessados e modificados de forma segura e controlada.

## Interface
Desafio: Crie uma interface AreaCalculavel que declare um método calcularArea(). Em 
seguida, implemente essa interface em classes como Retangulo, Circulo e Triangulo. 
Cada classe deve fornecer sua própria implementação para o cálculo da área. Em uma 
classe principal, crie uma lista de objetos AreaCalculavel e calcule a área de cada objeto, 
mostrando o uso do contrato da interface.

## Polimorfismo
Desafio: Desenvolva um sistema de gerenciamento de pagamento onde diferentes tipos 
de funcionários (por exemplo, Funcionario, Gerente, Diretor) possuem métodos para 
calcular o salário. Cada classe deve implementar seu próprio método de cálculo de 
salário, considerando o polimorfismo. Em uma classe FolhaPagamento, crie um método 
que receba uma lista de funcionários e imprima o salário de cada um, chamando o 
método correto de acordo com o tipo do funcionário.
