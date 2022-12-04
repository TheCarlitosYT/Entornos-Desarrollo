### TASCA 3. - FITXERS JAR 1 
Els fitxers JAR permeten tindre empaquetades classes d'utilitat que podem usar en els nostres
projectes futurs. Aquesta pràctica tracta d'usar la classe MZFecha empaquetada en un .jar des
d'un altre projecte que no tinga el codi de la classe MZFecha.
Donada la classe proporcionada MZFecha ( en el seu arxiu .java corresponent).

#### PART A: CREAR UN FITXER JAR:
###### 1. Crea un projecte INTELLIJ anomenat utiles-data en el qual estiga el fitxer MZFecha.java dins del directori src.

He creat un projecte en IJ IDEA, dins d'aquest està MZFECHA

![](Imagenes/Evidencia1.png)

###### 2. Exporta aquest fitxer a un fitxer JAR denominat utiles-data.jar (Mira com es fa en el PDF d’apunts) 

He creat el document JAR


![](Imagenes/CreandoElJAR1.png)

![](Imagenes/JARCreado.png)

Ahora lo construiré:

![](Imagenes/Creado.png)

Creat 

![](Imagenes/Build.png)


#### PART B: USAR EL FITXER .JAR EN UN ALTRE PROJECTE




###### 3. Crea un nou projecte INTELLIJ denominat ED-JAR1-MZFecha


![](Imagenes/NuevoProyecto.png)


###### • Crea una carpeta denominada lib dins d'aquest projecte

Lib creat

###### • Còpia el fitxer utiles-data.jar creat anteriorment dins del directori lib


![](Imagenes/DentrodeLib.png)

###### • Afig el JAR al nou projecte com s'indica en els apunts:

![](Imagenes/Seleccionando1Opc.png)

![](Imagenes/SeleccionandoJARDesdeOtroFichero.png)



##### A partir d'ací crea una classe Principal amb un mètode main que utilitze la classe MZFecha, en la qual:


###### Aquest programa mostrarà un menú per a poder provar les opcions de la classe MZFecha:


###### • establir data → Demana el dia, mes i any


###### • imprimir Data → Imprimeix la data establida


###### • Diferència entre dues dates → Demana una altra data (d,m,a) i calcula la diferència entre les 2 dates.

El resto está en el ejercicio