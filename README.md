# maxEvenAddend Exercise

**SPA** - Ejercicio para calcular el número par más alto que obtendríamos al sumar todos o parte de los números que nos dan en una lista. Así, por ejemplo, si nos dieran los siguientes números: [-5, 1, 12, 27] el número par más alto sería 40, excluyendo al -5. La función debe devolver un *long*.<br>La lista debe contener por lo menos un número par.

SOLUCIÓN:
1. Creamos dos variables: *result*, que recibirá el resultado; y *aux*. Al primero se le asigna 0 y al segundo el número negativo más grande para un *long*.
2. Ordenamos la lista, de menor a mayor.
3. Recorremos la lista, sumando todos los números positivos que tenga en ella y almacenando la suma en *result*. Si después de este proceso es par lo retornamos.
4. Recorremos nuevamente la lista, número por número. En caso de que sea negativo, si la suma a *result* es par y el número es mayor a *aux* almacenamos dicha suma en *aux*, sobreescribiendo la variable. En caso contrario, si el número es positivo se le resta a *result* si el resultado es par y se almacena en *aux* si es un número mayor al que tuviera en ese momento.
5. Finalmente y tras recorrer por segunda vez la lista tenemos en la variable *aux* el número par más elevado posible sumando números presentes en la lista entregada, por lo que sobreescribimos la variable *result* con el número recogido en *aux* y lo retornamos.
<br><br>

**EN** - Exercise to calculate the highest even number that we would obtain by adding all or part of the numbers given to us in a list. So, for example, if we were given the following numbers: [-5, 1, 12, 27] the highest even number would be 40, excluding -5. The function must return a *long*.<br>The list must contain at least one even number.

SOLUTION:
1. We create two variables: *result*, which will receive the result; and *aux*. The first is assigned 0 and the second is assigned the largest negative number for a *long*.
2. We order the list, from smallest to largest.
3. We loop through the list, adding all the positive numbers it has in it and storing the sum in *result*. If after this process it is even, we return it.
4. We go through the list again, number by number. In case it is negative, if the sum to *result* is even and the number is greater than *aux*, we store that sum in *aux*, overwriting the variable. Otherwise, if the number is positive, it is subtracted from *result* if the result is even and it is stored in *aux* if it is a higher number than it had at that moment.
5. Finally, and after going through the list for the second time, we have in the variable *aux* the highest even number possible by adding numbers present in the delivered list, so we overwrite the variable *result* with the number collected in *aux* and we return it.
