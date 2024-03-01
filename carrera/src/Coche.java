public class Coche {

    private String marca, modelo, matricula;
    public int cc, cv, velocidad, kmRecorridos;



    public Coche(String marca, String modelo, int cc, int cv, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.cc = cc;
        this.cv = cv;
        this.matricula = matricula;
       // this.velocidad = 0;
        //this.kmRecorridos = 0;
    }

    public void mostrarDatos() {
        System.out.println("marca " + marca);
        System.out.println("modelo " + modelo);
        System.out.println("cc " + cc);
        System.out.println("cv " + cv);
        System.out.println("matricula " + matricula);
        System.out.println("velocidad " + velocidad);
        System.out.println("kmRecorridos " + kmRecorridos);
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void acelerar (int velocidad) {
        if (cv >= 100) {
            setVelocidad(getVelocidad() + velocidad +(int)(Math.random() * 30) + 10);
        } else {
            setVelocidad(getVelocidad() + velocidad + (int)Math.random());
        }
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCc() {
        return cc;
    }

    public int getCv() {
        return cv;
    }

    public String getMatricula() {
        return matricula;
    }


    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }
}


