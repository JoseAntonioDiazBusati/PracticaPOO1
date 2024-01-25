class Cafetera(var ubicacion:String) {
    var capacidad:IntRange = 0..1000
    var cantidad:Int = 0
    constructor(ubicacion: String, capacidad: IntRange) : this(ubicacion) {
        this.capacidad = capacidad
        this.cantidad = capacidad.last
    }
    constructor(ubicacion: String, capacidad: IntRange, cantidad: Int) : this(ubicacion, capacidad) {
        if (cantidad > capacidad.last) {
            this.cantidad = capacidad.last
        } else {
            this.cantidad = cantidad
        }
    }
}
