fun main(args: Array<String>) {
    var meson1=Mueble()
    meson1=Mesa("madera", 5.6,true)
    var Casa1=Unifamiliar(52.4,3,5,1)
    Casa1=Chalet(52.4,3,5,1)
}

//Mueble(superclase) y mesa/armario(clases hijas) son un ejemplo de especialización ya que mesa y armario son tipos específicos de mueble, con características adicionales

open class Mueble{ //Especialización
    var material=""
    var pesoKg=0
    var ruedas=false
    fun area(largo: Float, ancho: Float, altura: Float): Float {
        return largo*ancho*altura
    }
}

class Mesa(material:String, pesoKg: Double, ruedas: Boolean): Mueble() {
    var superficie=""
    var patas=0
    var cargaKg=0
}

class Armario(material:String ,peso: Float,ruedas: Boolean): Mueble() {
    var numPuertas=0
    var empotrado=false
    var tablas=0
}

//Mueble(superclase) y mesa/armario(clases hijas) son un ejemplo de especialización ya que mesa y armario son tipos específicos de mueble, con características adicionales
//Unifamiliar(superclase) y piso/chalet(clases hijas) son un caso de extensión, ya que las
//clases hijas heredan de unifamiliar, que más que ser un caso más general es simplemente otro tipo de vivienda, del que las hijas extienden la funcionalidad.
//Se podrían definir todas las propiedades del padre directamente en las clases hijas con los mismos tipos de datos, pero sería más tosco. Por ejemplo,
//respecto a construcción, puedo acceder a las propiedades que quiera, ya que en el caso de construcción son privadas para la encapsulación.

open class Unifamiliar(squareMt:Double,plantas:Int,habitaciones:Int,banos:Int) { // Extensión
    var squareMt=squareMt
    var plantas=plantas
    var habitaciones=habitaciones
    var banos=banos
}

class Piso(squareMt: Double, plantas: Int,habitaciones:Int,banos:Int):Unifamiliar(squareMt, plantas, habitaciones, banos){
    var piso=0
    var ascensor=false
}

class Chalet(squareMt: Double, plantas: Int,habitaciones:Int,banos:Int):Unifamiliar(squareMt, plantas, habitaciones, banos){
    var squareMtJardin=0
    var piscina=false
}