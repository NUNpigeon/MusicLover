fun main() {
    val itemPrice = 1200 //цена 1-ой песни
    val itemCount = 11 //кол-во песен
    val discount = 100 //скидка
    var totalPrice = itemPrice * itemCount
    val discount2 = (totalPrice * 0.05).toInt() ////5% скидка
    val discount3 = (totalPrice * 0.01).toInt() // 1% скидка
    val regularCustomer: Boolean = false


    val result1 = if (totalPrice >= 1_001 && totalPrice <= 10_000) discount
    else if (totalPrice <= 1_000) 0
    else discount2

    val result2 = if (totalPrice >= 1_001 && totalPrice <= 10_000 && regularCustomer == true)
        discount + discount3
    else if (totalPrice <= 1_000) discount3
    else discount2 + discount3

    var totalResult = result1 + result2
    var totalSum = totalPrice - result2


    println("""Скидка составит $totalResult руб. | Сумма $totalSum руб.""")
}
