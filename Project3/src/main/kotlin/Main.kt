import java.util.*
import kotlin.collections.distinct as distinct

fun conditionalOperatorsTask1()
{
    println("Введите число: ")
    val x = readln().toDouble()
    if(x > 10)
        println("Число больше десяти")
    else if(x < 10)
        println("Число меньше десяти")
    else println("Число равно 10")
}


fun conditionalOperatorsTask2()
{
    println("Введите первое число: ")
    val x = readln().toDouble()
    println("Введите второе число: ")
    val y = readln().toDouble()

    if(x > y)
        println("Первое число больше, чем второе")
    else if(x < y)
        println("Первое число меньше, чем второе")
    else println("Числа равны")
}


fun conditionalOperatorsTask3()
{
    println("Введите сторону а: ")
    val a = readln().toDouble()
    println("Введите сторону b: ")
    val b = readln().toDouble()
    println("Введите сторону c: ")
    val c = readln().toDouble()

    if(a==b && a==c)
        println("Треугольник равносторонний")
    else if(a==b || a==c || b==c)
        println("Треугольник равнобедренный")
    else println("Треугольник разносторонний")
}


fun conditionalOperatorsTask4()
{
    println("Введите первое число: ")
    val a = readln().toDouble()
    println("Введите второе число: ")
    val b = readln().toDouble()
    println("Введите третье число: ")
    val c = readln().toDouble()
    println("Введите четвертое число: ")
    val d = readln().toDouble()
    val arr = doubleArrayOf(a, b, c, d)

    var positive = 0
    var negative = 0

    for (i in 0..3)
    {
        if(arr[i]>=0)
           positive++
        else
            negative++
    }
    println("Количество положительных чисел: $positive")
    println("Количество положительных чисел: $negative")
}


fun conditionalOperatorsTask5()
{
    println("Введите первое число: ")
    val a = readln().toDouble()
    println("Введите второе число: ")
    val b = readln().toDouble()
    println("Введите третье число: ")
    val c = readln().toDouble()

    if(a > b && a > c)
        println("Самым большим числом является $a")
    else if(b > a && b > c)
        println("Самым большим числом является $b")
    else
        println("Самым большим числом является $c")
}


fun conditionalOperatorsTask6()
{
    println("Введите первое число: ")
    val a = readln().toDouble()
    println("Введите второе число: ")
    val b = readln().toDouble()
    println("Введите третье число: ")
    val c = readln().toDouble()

    var max : Double = if(a > b && a > c)
        a
    else if(b > a && b > c)
        b
    else
        c

    var min : Double = if(a < b && a < c)
        a
    else if(b < a && b < c)
        b
    else
        c

    println("Сумма максимального и минимального чисел равна ${max + min}")
    /*
    val arr = doubleArrayOf(a, b, c)
    arr.sort()
    println("Minimum: ${arr.first()}")
    println("Maximum: ${arr.last()}")*/
}


fun conditionalOperatorsTask7()
{
    println("Введите целочисленное число: ")
    val x = readln().toInt()

    if(x % 2 == 0)
        println("Число четное")
    else println("Число нечетное")
}


fun menuTask8()
{
    println("Стоимость продуктов в магазине:")
    println("1) Молоко - 90 руб")
    println("2) Хлеб - 30 руб")
    println("3) Яйца - 100 руб")
    println("\t Выберите номер товара:")
}

fun messageTask8(sum: Int, product: String)
{
    val cost : Int = when (product) {
        1.toString() -> 90
        2.toString() -> 30
        else -> 100
    }

    if(sum < cost)
        println("Денег не хватает!")
    else if(sum == cost)
        println("Спасибо за покупку!")
    else
        println("Ваша сдача: ${sum - cost}")
}

fun conditionalOperatorsTask8()
{
    menuTask8()
    var product = Scanner(System.`in`).nextLine()
    while((product > 3.toString()) || (product <= 0.toString()))
    {
        println("Введено неверное значение! Попробуйте еще раз")
        product = Scanner(System.`in`).nextLine()
    }

    while(product == "1" || product == "2" || product == "3")
    {
        println("Введите сумму денег: ")
        var sum = readln().toInt()
        while(sum <= 0)
        {
            println("Введено неверное значение! Попробуйте еще раз")
            sum = readln().toInt()
        }
        messageTask8(sum, product)
        println("\t Для выхода введите любое число \n")

        println("Выберите товар:")
        product = Scanner(System.`in`).nextLine()
        while(product <= 0.toString())
        {
            println("Введено неверное значение! Попробуйте еще раз")
            product = Scanner(System.`in`).nextLine()
        }
    }
}


fun cyclesTask1()
{
    println("Таблица умножения на 4:")
    for(i in 1..10)
        println("4 * $i = ${4*i}")
}

fun cyclesTask2()
{
    println("Введите целое положительное число: ")
    val x = readln().toInt()
    println("Все четные числа от нуля до $x: ")
    for(i in 0..x)
        if(i%2 == 0)
            println(i)
}

fun cyclesTask3()
{
    println("Введите целое положительное число: ")
    val n = readln().toInt()

    var fibonacci1 = 1
    var fibonacci2 = 1

    for(i in 0 until n-2)
    {
        var fibonacciSum = fibonacci1 + fibonacci2
        fibonacci1 = fibonacci2
        fibonacci2 = fibonacciSum
    }
    println("Число в последовательности Фибоначчи с индексом $n равно $fibonacci2")
}

fun cyclesTask4()
{
    println("Введите целое положительное число: ")
    val x = readln().toInt()
    var factorial = 1
    for(i in 2..x)
        factorial *= i
    println("Факториал числа $x = $factorial")
}

fun cyclesTask5()
{
    println("Введите строку: ")
    val str = readln()
    for (element in str)
        println(element)
}


fun arraysTask1()
{
    val array = (1..10).map { (-20..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..9)
        println(array[i])

    var positive = 0
    var negative = 0

    for(i in 0..9)
    {
        if(array[i]>=0)
            positive++
        else negative++
    }
    println("Массив содержит $positive положительных чисел и $negative отрицательных")
}

fun arraysTask2()
{
    val array = (1..10).map { (1..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..9)
        println(array[i])

    var sum = 0
    for(i in 0..9)
    {
        if((i+1)%2 == 0)
            sum += array[i]
    }
    println("Сумма элементов с четными индексами равна $sum")
}

fun arraysTask3()
{
    val array = (1..10).map { (1..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..9)
        println(array[i])

    var sum = 0
    for(i in 0..9)
    {
        if(array[i]%2 == 0)
            sum += array[i]
    }
    println("Сумма четных элементов массива равна $sum")
}

fun arraysTask4()
{
    val array = (1..10).map { (1..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..9)
        println(array[i])
    println("Максимальное значение массива: ${array.maxOf { it }}")
}

fun arraysTask5()
{
    val array = (1..10).map { (10..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..9)
        println(array[i])

    if(array.size == array.distinct().count())
    {
        println("Повторяющихся элементов в массиве нет")
    }
    else
    {
        val countByElement = array.sortedByDescending { it }.groupingBy { it }.eachCount()
        val maximumByCount = countByElement.maxBy { it.value }.key

        println("Частота вхождений элементов $countByElement")
        println("Наиболее часто встречающееся значение $maximumByCount")
    }
}

fun arraysTask6()
{
    val array = arrayOf((1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() })

    println("Двумерный массив 10x10:")
    for (i in array.indices)
    {
        var j = 0
        while (j < array[i]?.size!!)
        {
            print(array[i][j].toString() + " ")
            j++
        }
        println()
    }

    println("Диагональные элементы массива от [0][0] до [9][9]:")
    for(i in 0..9)
    {
        print(array[i][i].toString() + "\n")
    }
}

fun arraysTask7()
{
    val array = arrayOf((1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() })

    println("Двумерный массив 10x10:")
    for (i in array.indices)
    {
        var j = 0
        while (j < 10)
        {
            print(array[i][j].toString() + " ")
            j++
        }
        println()
    }

    println("Диагональные элементы массива от [0][9] до [9][0]:")
    var j = 9
    for(i in 0..9)
    {
        print(array[i][j].toString() + "\n")
        j--
    }
}

fun arraysTask8()
{
    val array = arrayOf((1..5).map { (1..9).random() },
        (1..5).map { (1..9).random() },
        (1..5).map { (1..9).random() },
        (1..5).map { (1..9).random() },
        (1..5).map { (1..9).random() })

    println("Двумерный массив 5x5:")
    for (i in array.indices)
    {
        var j = 0
        while (j < array[i]?.size!!)
        {
            print(array[i][j].toString() + " ")
            j++
        }
        println()
    }

    var arraySum = intArrayOf(0, 0, 0, 0, 0)
    var sum = 0
    for(i in 0..4)
    {
        for(j in 0..4)
        {
            sum += array[j][i]
        }
        arraySum[i] = sum
        sum = 0
    }
    println("Сумма элементов первого столбца массива равна ${arraySum[0]}")
    println("Сумма элементов второго столбца массива равна ${arraySum[1]}")
    println("Сумма элементов третьего столбца массива равна ${arraySum[2]}")
    println("Сумма элементов четвертого столбца массива равна ${arraySum[3]}")
    println("Сумма элементов пятого столбца массива равна ${arraySum[4]} \n")

    arraySum.sort()
    println("Наибольшая сумма равна ${arraySum[4]}")
}



fun main() {
    //УСЛОВНЫЕ ОПЕРАТОРЫ
    println("УСЛОВНЫЕ ОПЕРАТОРЫ \n")
    println("ЗАДАНИЕ 1")
    conditionalOperatorsTask1()
    println("\n")

    println("ЗАДАНИЕ 2")
    conditionalOperatorsTask2()
    println("\n")

    println("ЗАДАНИЕ 3")
    conditionalOperatorsTask3()
    println("\n")

    println("ЗАДАНИЕ 4")
    conditionalOperatorsTask4()
    println("\n")

    println("ЗАДАНИЕ 5")
    conditionalOperatorsTask5()
    println("\n")

    println("ЗАДАНИЕ 6")
    conditionalOperatorsTask6()
    println("\n")

    println("ЗАДАНИЕ 7")
    conditionalOperatorsTask7()
    println("\n")

    println("ЗАДАНИЕ 8")
    conditionalOperatorsTask8()
    println("\n")


    //ЦИКЛЫ
    println("ЦИКЛЫ \n")
    println("ЗАДАНИЕ 1")
    cyclesTask1()
    println("\n")

    println("ЗАДАНИЕ 2")
    cyclesTask2()
    println("\n")

    println("ЗАДАНИЕ 3")
    cyclesTask3()
    println("\n")

    println("ЗАДАНИЕ 4")
    cyclesTask4()
    println("\n")

    println("ЗАДАНИЕ 5")
    cyclesTask5()
    println("\n")


    //МАССИВЫ
    println("МАССИВЫ \n")
    println("ЗАДАНИЕ 1")
    arraysTask1()
    println("\n")

    println("ЗАДАНИЕ 2")
    arraysTask2()
    println("\n")

    println("ЗАДАНИЕ 3")
    arraysTask3()
    println("\n")

    println("ЗАДАНИЕ 4")
    arraysTask4()
    println("\n")

    println("ЗАДАНИЕ 5")
    arraysTask5()
    println("\n")

    println("ЗАДАНИЕ 6")
    arraysTask6()
    println("\n")

    println("ЗАДАНИЕ 7")
    arraysTask7()
    println("\n")

    println("ЗАДАНИЕ 8")
    arraysTask8()
    println("\n")
}