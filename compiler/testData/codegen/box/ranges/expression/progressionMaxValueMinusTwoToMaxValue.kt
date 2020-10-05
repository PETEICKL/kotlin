// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


val MaxI = Int.MAX_VALUE
val MaxB = Byte.MAX_VALUE
val MaxS = Short.MAX_VALUE
val MaxL = Long.MAX_VALUE
val MaxC = Char.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (MaxI - 2)..MaxI step 2
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(MaxI - 2, MaxI)) {
        return "Wrong elements for (MaxI - 2)..MaxI step 2: $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (MaxB - 2).toByte()..MaxB step 2
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>((MaxB - 2).toInt(), MaxB.toInt())) {
        return "Wrong elements for (MaxB - 2).toByte()..MaxB step 2: $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (MaxS - 2).toShort()..MaxS step 2
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>((MaxS - 2).toInt(), MaxS.toInt())) {
        return "Wrong elements for (MaxS - 2).toShort()..MaxS step 2: $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (MaxL - 2).toLong()..MaxL step 2
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>((MaxL - 2).toLong(), MaxL)) {
        return "Wrong elements for (MaxL - 2).toLong()..MaxL step 2: $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = (MaxC - 2)..MaxC step 2
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>((MaxC - 2), MaxC)) {
        return "Wrong elements for (MaxC - 2)..MaxC step 2: $list5"
    }

    return "OK"
}
