public class Carrera {
    public Carrera() {
    }
    public void main(String[] args) {
        Coche coche1 = new Coche("Ford", "Mustang", 3000, 450, "1234ABC");
        Coche coche2 = new Coche("Chevrolet", "Camaro", 2800, 420, "4321CBA");
        Carrera carrera1 = new Carrera(coche1, coche2, 500, 10);

        System.out.println("Datos del coche 1:");
        coche1.mostrarDatos();
        System.out.println("Datos del coche 2:");
        coche2.mostrarDatos();

        pruebaCarrera.iniciarCarrera();

    }

    class pruebaCarrera {
        public void Carrera(Coche coche1, Coche coche2, int kmTotales, int numeroVueltas) {
            this.coche1 = coche1;
            this.coche2 = coche2;
            this.kmTotales = kmTotales;
            this.numeroVueltas = numeroVueltas;
        }
        private int cocheGanador;
        private int kmTotalesRecorridos;
        private int numeroVueltas;
        private int kmTotales;
        private Coche coche1;
        private Coche coche2;

        public void iniciarCarrera() {

            for (int i = 0; i < numeroVueltas; i++) {
                System.out.println("---------");
                System.out.println("Vuelta " + (i + 1));
                coche1.acelerar(kmTotalesRecorridos);
                coche2.acelerar(kmTotalesRecorridos);

                if (coche1.getKmRecorridos() >= kmTotalesRecorridos || coche2.getKmRecorridos() >= kmTotalesRecorridos) {
                    if (coche1.getKmRecorridos() >= kmTotalesRecorridos && coche2.getKmRecorridos() >= kmTotalesRecorridos) {
                        System.out.println("¡Empate!");
                    } else if (coche1.getKmRecorridos() >= kmTotalesRecorridos) {
                        cocheGanador = 1;
                    } else {
                        cocheGanador = 2;
                    }
                    System.out.println("El ganador ha sido el coche con matrícula: " + cocheGanador + getKmTotalesRecorridos());
                    break;


                }


            }


        }
        public int getCocheGanador() {
            return cocheGanador;
        }

        public void setCocheGanador(int cocheGanador) {
            this.cocheGanador = cocheGanador;
        }

        public int getKmTotalesRecorridos() {
            return kmTotalesRecorridos;
        }

        public void setKmTotalesRecorridos(int kmTotalesRecorridos) {
            this.kmTotalesRecorridos = kmTotalesRecorridos;
        }

        public int getNumeroVueltas() {
            return numeroVueltas;
        }

        public void setNumeroVueltas(int numeroVueltas) {
            this.numeroVueltas = numeroVueltas;
        }
    }



}
