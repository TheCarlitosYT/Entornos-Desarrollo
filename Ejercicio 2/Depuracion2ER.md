#### TASCA 2.
###### Objectiu:
Saber obtindre les dades d'un codi java mitjançant eina de depuració de codi.
Enunciat:

Donat el codi a JAVA de la classe cotxe que compta amb els mètodes:

> • Constructor on se li estableix la marca, model, color i la velocita inicial del qual és 0.
>
> • getters i setters de cada paràmetre.
>
> • Mètode accelera (int vel) que incrementa la velocitat del cotxe en “vel” Km/h.
>
> • Mètode frena(int vel) que decrementa la velocitat del cotxe en “vel” Km/h.
>
> • para() que posa la velocitat a 0.
>
> • pinta() que pinta el cotxe més a prop o més lluny segons la velocitat que tinga en aqueix moment.

A més , la classe Principal té el mètode:

public static void main(String [] args) → punt d'inici del programa 

###### 0. Importar el projecte en INTELLIJ.


![](Capturas/CapturaIJ.png)

###### 1. Explicad QUÈ FA EL MÈTODE MAIN.

 El mètode main executa el codi que hi ha, també es anomena punt d'entrada.
 En aquestos 2 documents anomenats principals i cotxes, el mètode main se encarrega de crear nombres aleatoris i en funció del numero aleatori que tinga, el cotxe es desplaçarà més o menys que els altres.
 
###### 2. Posad un punt de ruptura (breakpoint) en la línia 27 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3. Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.
Les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3, obteneixen nombres aleatoris. 

![](Capturas/Variables1.png)



Els diferents cotxes apareixen amb els seus variables que els identifiquen:


![](Capturas/VarCoches.png)


###### 3. Posad un punt de ruptura (breakpoint) en la línia 46 del mètode main de la classe Principal i esbrineu els valors de les variables velocitat_nueva1, velocitat_nueva2 i velocitat_nueva3. Esbrineu també quines dades tenen en els seus paràmetres els cotxes amb variables c,c2 i c3.

![](Capturas/VelocidadNueva.png)


![](Capturas/Ces.png)


Nota: Realitzeu les captures de pantalla que cregueu convenient per a adjuntar en el document.
(per exemple com pinta els cotxes el programa abans de frenar i després de frenar)

Contesteu les qüestions en un fitxer markdown i pugeu-lo al vostre repositori GITHUB. Dins d'una carpeta anomenada Depuración2 Compartiu la URL del repositori.

Nota: El mètode nextInt(valor) de la clase Random obtí un número aleatori entre 0 i val