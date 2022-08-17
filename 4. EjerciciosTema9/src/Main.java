public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setTelefono(123456789);
        cliente.setNombre("Sebastian Escobar");
        cliente.setCredito(2000000);
        System.out.println("YO SOY UN CLIENTE");
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Credito: " + cliente.getCredito() + " de pesos");
        System.out.println();
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(22);
        trabajador.setTelefono(987654321);
        trabajador.setNombre("Camila Morales");
        trabajador.setSalario(1000000);
        System.out.println("YO SOY UNA TRABAJADORA");
        System.out.println("Edad: " + trabajador.getEdad() + " años");
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Salario: " + trabajador.getSalario() + " de pesos");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
