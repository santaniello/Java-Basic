/**
 * Padrão Strategy
 */
/**
 * @author felipe
 *
 *	O padrão Strategy é muito útil quando temos um conjunto de 
 *	algoritmos similares, e precisamos alternar entre eles em diferentes
 *  pedaços da aplicação. No exemplo do vídeo, temos diferentes maneiras 
 *  de calcular o imposto, e precisamos alternar entre elas.
 *
 *	O Strategy nos oferece uma maneira flexível para escrever diversos 
 *  algoritmos diferentes, e de passar esses algoritmos para classes 
 *  clientes que precisam deles. Esses clientes desconhecem qual é o 
 *  algoritmo "real" que está sendo executado, e apenas mandam o algoritmo 
 *  rodar. Isso faz com que o código da classe cliente fique bastante 
 *  desacoplado das implementações concretas de algoritmos, possibilitando
 *  assim com que esse cliente consiga trabalhar com N diferentes algoritmos
 *  sem precisar alterar o seu código.
 */
package br.com.designpatterns.strategy;