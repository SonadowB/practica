class Coche:
    def __init__(self, marca: str, modelo: str):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0
    
    def acelerar(self):
        self.velocidad += 10
    
    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0
    
    def mostrar_velocidad(self):
        print(f"Coche {self.marca} {self.modelo} va a {self.velocidad} km/h")
    
    def main():
        coche1 = Coche("Toyota", "Corolla")
        coche2 = Coche("Ford", "Mustang")
        
        coche1.acelerar()
        coche1.acelerar()
        coche1.frenar()
        
        coche2.acelerar()
        coche2.frenar()
        coche2.frenar()
        
        coche1.mostrar_velocidad()
        coche2.mostrar_velocidad()

if __name__ == "__main__":
    Coche.main()
