package org.example;


import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //DATOS DEL JUGADOR
        String nickname;
        String nicknameBD="Manuelita";
        String contrasena;
        String contrasenaBD="Manuela123";
        Integer nivelVida=70;
        Integer contadorSkills=0;
        Integer contadorDisparos=0;
        Integer precioSkillsVida=100000;
        Integer danoDisparos=-5;
        boolean estaMuerto=false;

        String juego1="Free Fire";
        String juego2="Fifa 24";
        String juegoSeleccionado;

        Scanner lea = new Scanner(System.in);

        //PROCESO
        System.out.println("****Ingresando****");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("***Bienvenido*****");
        System.out.println("____________________");

        System.out.print("Digita tu NickName: ");
        nickname=lea.nextLine();

        System.out.print("Digita tu contraseña: ");
        contrasena=lea.nextLine();

        //RUTINA PARA VERIFICAR EL PERFIL:
        if (nickname.equals(nicknameBD) && contrasena.equals(contrasenaBD)){
            System.out.println("Bienvenido a PSPLUS "+nickname);

            //RUTINA PARA INICIAR EL JUEGO
            System.out.println("Seleccione un juego: ");
            juegoSeleccionado=lea.nextLine();

            if (juegoSeleccionado.equals(juego1)) {
                //ENTRAMOS A FREE FIRE

                do {
                    // RANDOM (DISPARAR O NO)
                    Random random = new Random();
                    int disparo = random.nextInt(2);

                    if (disparo == 1) {
                        //LE DIERON
                        contadorDisparos = contadorDisparos +1;
                        nivelVida = nivelVida -5;
                        System.out.println("Te dispararon, y tu vida quedo en: "+nivelVida);

                        if (contadorDisparos==3){
                            estaMuerto=true;
                            break;
                        }
                        if (nivelVida==0){
                            estaMuerto=true;
                            break;
                        }
                    } else {
                        //NO LE DIERON
                        System.out.println("Esquivo La Bala....");
                        contadorDisparos=0;
                    }

                } while (estaMuerto == false);
                System.out.println("ESTAS MUERTO!!!!");

            }else {
                    System.out.println("Servidores no disponibles....");
                }

        }else {
            System.out.println("Usuario no encontrado...");
        }




    }
}