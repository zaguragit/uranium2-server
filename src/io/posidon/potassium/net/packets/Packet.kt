package io.posidon.potassium.net.packets

abstract class Packet(val name: String) {
    protected abstract fun packToString(): String
    override fun toString(): String = name + '&' + packToString()
}