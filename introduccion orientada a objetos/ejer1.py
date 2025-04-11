class Persona:
    def __init__(self, nombre: str, edad: int, ciudad: str):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    
    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")
    
    def es_mayor_de_edad(self):
        return self.edad >= 18
    
    def main():
        p1 = Persona("Juan", 20, "La Paz")
        p2 = Persona("Ana", 17, "Cochabamba")
        p3 = Persona("Luis", 25, "Santa Cruz")
        
        p1.saludar()
        print(f"Mayor de edad: {p1.es_mayor_de_edad()}")
        
        p2.saludar()
        print(f"Mayor de edad: {p2.es_mayor_de_edad()}")
        
        p3.saludar()
        print(f"Mayor de edad: {p3.es_mayor_de_edad()}")

if __name__ == "__main__":
    Persona.main()
