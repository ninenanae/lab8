import java.util.*

fun getInputList(scanner: Scanner): List<Int> {
    println("Введите числа (через пробел):")
    return scanner.nextLine().split(" ").map { it.toInt() }
}

fun sumList(numbers: List<Int>): Int {
    return numbers.sum()
}

fun differenceMaxMin(numbers: List<Int>): Int {
    return numbers.maxOrNull()!! - numbers.minOrNull()!!
}

fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}

fun isProfitable(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return (num1 + num2) < 100
}

fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}

fun calculateFrames(minutes: Int, fps: Int): Int {
    return minutes * 60 * fps
}

fun isPowerEquals(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()) == n.toDouble()
}

fun repetition(txt: String, n: Int): String {
    return if (n <= 0) "" else txt + repetition(txt, n - 1)
}

fun equation(equation: String): Int {
    return try {
        val result = javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(equation)
        result.toString().toInt()
    } catch (e: Exception) {
        0
    }
}

fun google(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}

fun greet() {
    println("Привет, мир!")
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun maxOf(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun sumArray(numbers: IntArray): Int {
    return numbers.sum()
}

fun maxInArray(numbers: IntArray): Int {
    return numbers.maxOrNull() ?: 0
}

fun sortArray(numbers: IntArray): IntArray {
    return numbers.sortedArray()
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun countCharacters(str: String): Int {
    return str.length
}

fun toUpperCase(str: String): String {
    return str.uppercase()
}

fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun getLastElement(array: IntArray): Int? {
    return array.lastOrNull()
}

fun containsElement(array: IntArray, element: Int): Boolean {
    return array.contains(element)
}

fun createArrayFrom1ToN(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}

fun findMaxMin(numbers: IntArray): Pair<Int?, Int?> {
    return Pair(numbers.maxOrNull(), numbers.minOrNull())
}

fun sumFrom1ToN(n: Int): Int {
    return (1..n).sum()
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun reverseString(str: String): String {
    return str.reversed()
}

fun findElementByIndex(array: IntArray, index: Int): Int? {
    return if (index in array.indices) array[index] else null
}

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}

fun sumOfFirstNNumbers(n: Int): Int {
    return (1..n).sum()
}

fun containsSubstring(str: String, substring: String): Boolean {
    return str.contains(substring)
}

fun printMultiplicationTable(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}

fun lengthOfString(str: String): Int {
    return str.length
}

fun reverseArray(array: IntArray): IntArray {
    return array.reversedArray()}

fun copyArray(array: IntArray): IntArray {
    return array.copyOf()
}

fun countVowels(str: String): Int {
    return str.count { it.lowercaseChar() in "aeiou" }
}

fun indexOfFirstOccurrence(array: IntArray, element: Int): Int {
    return array.indexOf(element)
}

fun main(){

    val scanner = Scanner(System.`in`)

//1
    val numbers1 = getInputList(scanner)
    println("Сумма элементов: ${sumList(numbers1)}")

// 2
    val numbers2 = getInputList(scanner)
    println("Разность: ${differenceMaxMin(numbers2)}")

// 3
    println("Введите первый список:")
    val list1 = getInputList(scanner)
    println("Введите второй список:")
    val list2 = getInputList(scanner)
    println("Объединенный список: ${mergeLists(list1, list2)}")

// 4
    println("Введите prob, prize и pay:")
    val prob = scanner.nextDouble()
    val prize = scanner.nextDouble()
    val pay = scanner.nextDouble()
    println("Результат: ${isProfitable(prob, prize, pay)}")

// 5
    println("Введите prob, prize и pay:")
    val prob2 = scanner.nextDouble()
    val prize2 = scanner.nextDouble()
    val pay2 = scanner.nextDouble()
    println("Результат: ${isProfitable(prob2, prize2, pay2)}")

// 6
    println("Введите два числа:")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    println("Сумма меньше 100? ${isSumLessThan100(num1, num2)}")

// 7
    println("Введите целое число:")
    val number = scanner.nextInt()
    println("Делится на 100? ${isDivisibleBy100(number)}")

// 8
    println("Введите количество минут и FPS:")
    val minutes = scanner.nextInt()
    val fps = scanner.nextInt()
    println("Количество кадров: ${calculateFrames(minutes, fps)}")

// 9
    println("Введите n и k:")
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    println("Результат: ${isPowerEquals(n, k)}")

// 10
    println("Введите строку и количество повторений:")
    val txt = scanner.next()
    val repeatCount = scanner.nextInt()
    println(repetition(txt, repeatCount))

// 11
    println("Введите уравнение (например, '1+1'):")
    val equationInput = scanner.next()
    println(equation(equationInput))

// 12
    println("Введите число для Google:")
    val googleCount = scanner.nextInt()
    println("Результат Google: ${google(googleCount)}")

// 13
    greet()

// 14
    println("Введите два числа:")
    val sumNum1 = scanner.nextInt()
    val sumNum2 = scanner.nextInt()
    println("Сумма: ${sum(sumNum1, sumNum2)}")

// 15
    println("Введите два числа:")
    val maxNum1 = scanner.nextInt()
    val maxNum2 = scanner.nextInt()
    println("Большее число: ${maxOf(maxNum1, maxNum2)}")

// 16
    println("Введите число для проверки на четность:")
    val evenNum = scanner.nextInt()
    println("Число четное? ${isEven(evenNum)}")

// 17
    println("Введите число для вычисления факториала:")
    val factorialNum = scanner.nextInt()
    println("Факториал: ${factorial(factorialNum)}")

// 18
    println("Введите число для проверки на простоту:")
    val primeNum = scanner.nextInt()
    println("Число простое? ${isPrime(primeNum)}")

// 19
    println("Введите массив целых чисел (через пробел):")
    val array19 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Сумма массива: ${sumArray(array19)}")

// 20
    println("Введите массив целых чисел (через пробел):")
    val array20 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Максимальное число в массиве: ${maxInArray(array20)}")

// 21
    println("Введите массив целых чисел (через пробел):")
    val array21 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Отсортированный массив: ${sortArray(array21).joinToString(", ")}")

// 22
    println("Введите строку для проверки на палиндром:")
    val palindromeStr = scanner.next()
    println("Строка является палиндромом? ${isPalindrome(palindromeStr)}")

// 23
    println("Введите строку для подсчета символов:")
    val characterCountStr = scanner.next()
    println("Количество символов в строке: ${countCharacters(characterCountStr)}")

// 24
    println("Введите строку для конвертации в верхний регистр:")
    val upperCaseStr = scanner.next()
    println("Строка в верхнем регистре: ${toUpperCase(upperCaseStr)}")

// 25
    println("Введите первую строку:")
    val str1 = scanner.next()
    println("Введите вторую строку:")
    val str2 = scanner.next()
    println("Объединение строк: ${concatenateStrings(str1, str2)}")

// 26
    println("Введите массив целых чисел (через пробел):")
    val array26 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Последний элемент массива: ${getLastElement(array26)}")

// 27
    println("Введите массив целых чисел (через пробел):")
    val array27 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Введите элемент для проверки:")
    val element27 = scanner.nextInt()
    println("Элемент присутствует в массиве? ${containsElement(array27, element27)}")

// 28
    println("Введите N для создания массива от 1 до N:")
    val n28 = scanner.nextInt()
    println("Массив от 1 до N: ${createArrayFrom1ToN(n28).joinToString(", ")}")

// 29
    println("Введите массив целых чисел (через пробел):")
    val array29 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    val (max, min) = findMaxMin(array29)
    println("Максимум: $max, минимум: $min")

// 30
    println("Введите N для суммы от 1 до N:")
    val n30 = scanner.nextInt()
    println("Сумма от 1 до N: ${sumFrom1ToN(n30)}")

//31
    println("Введите температуру в Цельсиях:")
    val celsius = scanner.nextDouble()
    println("Температура в Фаренгейтах: ${celsiusToFahrenheit(celsius)}")

// 32
    println("Введите строку для обратного порядка:")
    val reverseStr = scanner.next()
    println("Строка в обратном порядке: ${reverseString(reverseStr)}")

// 33
    println("Введите массив целых чисел (через пробел):")
    val array33 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Введите индекс для поиска:")
    val index33 = scanner.nextInt()
    println("Элемент по индексу: ${findElementByIndex(array33, index33)}")

// 34
    println("Введите строку для удаления пробелов:")
    val spaceStr = scanner.next()
    println("Строка без пробелов: ${removeSpaces(spaceStr)}")

// 35
    println("Введите N для суммы первых N натуральных чисел:")
    val n35 = scanner.nextInt()
    println("Сумма первых N натуральных чисел: ${sumOfFirstNNumbers(n35)}")

// 36
    println("Введите строку и подстроку для проверки наличия:")
    val mainStr = scanner.next()
    val subStr = scanner.next()
    println("Подстрока содержится в строке? ${containsSubstring(mainStr, subStr)}")

// 37
    println("Введите число для печати таблицы умножения:")
    val multiplicationNum = scanner.nextInt()
    printMultiplicationTable(multiplicationNum)

// 38
    println("Введите строку для нахождения длины:")
    val lengthStr = scanner.next()
    println("Длина строки: ${lengthOfString(lengthStr)}")

// 39
    println("Введите массив целых чисел (через пробел):")
    val array39 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Перевернутый массив: ${reverseArray(array39).joinToString(", ")}")

// 40
    println("Введите массив целых чисел (через пробел):")
    val array40 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Скопированный массив: ${copyArray(array40).joinToString(", ")}")

// 41
    println("Введите строку для подсчета гласных:")
    val vowelStr = scanner.next()
    println("Количество гласных в строке: ${countVowels(vowelStr)}")

// 42
    println("Введите массив целых чисел (через пробел):")
    val array42 = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()
    println("Введите элемент для поиска:")
    val searchElement = scanner.nextInt()
    println("Индекс первого вхождения элемента: ${indexOfFirstOccurrence(array42, searchElement)}")

}

