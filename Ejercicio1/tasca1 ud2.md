# TASCA 1.
###### Donat el projecte IntelliJ adjunt, comproveu mitjançant depuració del sistema:

##### 1. En la función 1… Què fan aquestes línies de codi?
String string2 = "string2";

string2= string2.substring(0, string2.length()-1);

string2=string2+"1";


> La primera linea crea e indica que el string (cadena de texto) tenga de valores "String2"
>
>La segunda indica que el String llamado Atring2 empieza por cero hasta el final, y pierde el ultimo dígito (el -1)
>
> La tercera linea le proporciona al String string2, el dígito 1 haciendo que su valor sea string1.

##### 2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?
if(string1 == string2 ) {

System.out.println("SÓN IGUALS " + a );
    
} else {

System.out.println("SÓN DIFERENTS");

}

> Las variables string1 y string2 tienen el mismo valor (string1), ya que como comenté en el ejercicio anterior, se eliminó el último caracter de string2, reemplazando este por un 1, quedando ambos como string1.

##### 3. Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest?
> El operador == funciona cuando son INTs, en este caso al usarse Strings (cadenas de carateres) se hace de una manera diferente, en este caso sería if (string1.equals(string2))

##### 4. La función2() està declarada com segueix:
public void funcion2() {

System.out.println("--------------------");

System.out.println("Aquesta és la funció 2");

System.out.println("Com faig la crida perquè funcione????");

}

##### Aquesta funció com l'he de cridar des del mètode MAIN perquè funcione. Existeixen 2 possibilitats. Explica-les.
> Antes de explicar 2 posibilidades, para que funcione el archivo hay que hacerlo static ya que no lo estaba antes:
> Al poner el public static void podemos llamarlo de 2 maneras:

###### 1. Invocarlo desde el main:
> Podemos invocar la función 2 desde el main poniendo la siguiente linea:
> funcion2();
> con esto se ejecutarán todas las lineas de comandos que tenga la función 2.

###### 2. Llamarlo desde la clase:
> Si te sabes el nombre de la clase lo puedes llamarlo desde ahí, esto también sirve si la clase está en un fichero a parte:
> En mi caso la clase se llama ED_Debug así que:
> ED_Debug.funcion2();

<br>
• Crea un directori de treball anomenat EntornosDesarrollo

| Qué hacer
|______
|◦ Inicializalo amb GIT
|◦ Sincronitza-ho en el teu GitHub Remot



• Crea un carpeta dins de Entorns de Desenvolupament anomenada “Tasca-Depuracion1”

• Contesta les preguntes en un document MarkDown dins d'aquesta carpeta.

• Actualitza amb GIT el repositori d'Entorns de Desenvolupament local i REMOT

• Envia la URL del repositori

