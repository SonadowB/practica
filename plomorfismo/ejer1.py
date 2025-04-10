class Videojuego:
    def __init__(self, nombre="Sin nombre", genero="Desconocido", jugadores=0):
        self.nombre = nombre
        self.genero = genero
        self.jugadores = jugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Género: {self.genero}, Jugadores: {self.jugadores}")
        
    def agregar_jugadores(self, cantidad=1):
        self.jugadores += cantidad
if __name__ == "__main__":
    v1 = Videojuego("FIFA 25", "Deportes", 1)
    v2 = Videojuego("Zelda")

    v1.mostrar()
    v2.mostrar()

    v1.agregar_jugadores()    
    v2.agregar_jugadores(3)      

    print("\nDespués de agregar jugadores:")
    v1.mostrar()
    v2.mostrar()
