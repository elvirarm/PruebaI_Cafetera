class Cafetera(var ubicacion: String){

    var capacidad = 1000

    var cantidad = 0

    constructor(ubicacion: String, capacidad: Int):this(ubicacion){
        this.cantidad = this.capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion){
        if (cantidad > capacidad){
            this.cantidad = capacidad
        }
    }

    fun llenar(){
        cantidad = capacidad
    }

    fun servirTaza(taza: Taza){
        if (this.cantidad != 0){
            taza.cantidad += this.cantidad
            this.cantidad -= taza.capacidad

        }

        if (this.cantidad != 0 && this.cantidad < taza.capacidad){

            taza.cantidad += this.cantidad
            this.cantidad -= this.cantidad

        }

    }

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cantidadCafe: Int){
        if (cantidadCafe < capacidad){
            cantidad += cantidadCafe
        }else{
            cantidad = capacidad
        }
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)\""
    }
}
