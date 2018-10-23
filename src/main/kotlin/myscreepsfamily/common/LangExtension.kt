package myscreepsfamily.common

fun <T : Any> Any.orNullIf(condition: () -> Boolean): T? = if (condition()) {
    this.unsafeCast<T>()
} else {
    null
}