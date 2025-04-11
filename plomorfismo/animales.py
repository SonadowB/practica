from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, nombre):
        self.nombre = nombre
    
    @abstractmethod
    def hacer_sonido(self):
        pass
    
    @abstractmethod
    def moverse(self):
        pass
class Perro(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Guau guau!")
    
    def moverse(self):
        print(f"{self.nombre} está corriendo")

class Gato(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Miau miau!")
    
    def moverse(self):
        print(f"{self.nombre} está saltando")

class Pajaro(Animal):
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Pío pío!")
    
    def moverse(self):
        print(f"{self.nombre} está volando")

def main():
    perro = Perro("Rex")
    gato = Gato("Misi")
    pajaro = Pajaro("Piolín")

    animales = [perro, gato, pajaro]

    print("=== SONIDOS DE ANIMALES ===")
    for animal in animales:
        animal.hacer_sonido()

    print("\n=== MOVIMIENTOS ===")
    for animal in animales:
        animal.moverse()

if __name__ == "__main__":
    main()
