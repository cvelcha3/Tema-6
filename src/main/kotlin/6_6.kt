fun main(args: Array<String>) {
    var numbers = listOf("one", "two", "three", "four")

    var numbersRev = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev))

        println("Error")

    else

        println("Correcto")

    println(numbersRev)
}

class Pila{
    private var pila = mutableListOf<Any>()
    fun tope(): Any{
        return pila.last()
    }
    fun push(valor: Any){
        pila.add(valor)
    }
    fun pop(): Any? {
        return pila.removeLastOrNull()
    }
    fun empty(): Boolean{
        return pila.isEmpty()
    }

}

fun reverse(lista: List<Any>): List<Any?> {
    var pila1=Pila()
    var listaReversed= mutableListOf<Any?>()
    var listaIterator = lista.listIterator()
    while (listaIterator.hasNext()){
        pila1.push(listaIterator.next())
    }
    while (listaIterator.hasPrevious()){
        listaReversed.add(pila1.pop())
        listaIterator.previous()
    }
    return listaReversed
}