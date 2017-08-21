/**
 * Padrão Template Method
 */
/**
 * @author felipe
 *
 * Quando temos diferentes algoritmos que possuem estruturas parecidas, 
 * o Template Method é uma boa solução. Com ele, conseguimos definir,
 * em um nível mais macro, a estrutura do algoritmo e deixar "buracos",
 * que serão implementados de maneira diferente por cada uma das
 * implementações específicas. 
 * 
 * Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos
 * possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto
 * dos detalhes do algoritmo, já que cada classe tem sua responsabilidade 
 * bem separada.
 *
 */
package br.com.designpatterns.templatemethod;