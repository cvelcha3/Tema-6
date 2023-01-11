fun main(args: Array<String>) {
    var meson1=Mueble()
    meson1=Mesa("madera", 5.6,true)
    var Casa1=Unifamiliar(52.4,3,5,1)
    Casa1=Chalet(52.4,3,5,1)
}

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
}

class Armario(material:String ,peso: Float,ruedas: Boolean): Mueble() {
    var numPuertas=0
    var empotrado=false
}

open class Unifamiliar(squareMt:Double,plantas:Int,habitaciones:Int,banos:Int) {
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