fun main(args: Array<String>) {
    var numbers = listOf("one", "two", "three", "four")

    var numbersRev = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev))

        println("Error")

    else

        println("Correcto")

    println(numbersRev)
}

class Pila<T>{
    private var pila = mutableListOf<T>()
    fun tope(): T{
        return pila.last()
    }
    fun push(valor: T){
        pila.add(valor)
    }
    fun pop(): T? {
        return pila.removeLastOrNull()
    }
    fun empty(): Boolean{
        return pila.isEmpty()
    }

}

fun <T> reverse(lista: List<T>): List<T?> {
    var pila1=Pila<T>()
    var listaReversed= mutableListOf<T?>()
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