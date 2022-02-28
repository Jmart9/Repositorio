package portafolio;

import java.util.Random;



public class principal{
    
    public static void main (String[] arg){
        
        int salud = 0;
        int aleatorio; 
        boolean jugador = true, sith = true;
        
        Personajes messi = new Personajes();
        Personajes Ronaldo = new Personajes();
        Personajes Fernandez = new Personajes();
        Personajes Bruyne = new Personajes();
        
        Random rand = new Random(System.nanoTime());
        
        messi.setJugador("Leo Messi");
        messi.setEnergia(200);
        messi.setPotencia(40);
        messi.setPrAC(0.85);
        
        Ronaldo.setJugador("Cristiano Ronaldo");
        Ronaldo.setEnergia(250);
        Ronaldo.setPotencia(75);
        Ronaldo.setPrAC(0.60);
        
        Fernandez.setJugador("Bruno Fernandez");
        Fernandez.setEnergia(300);
        Fernandez.setPotencia(50);
        Fernandez.setPrAC(0.75);
        
        Bruyne.setJugador("Kevin de Bruyne");
        Bruyne.setEnergia(275);
        Bruyne.setPotencia(60);
        Bruyne.setPrAC(0.65);
        
        System.out.println(messi.getJugador()+" Tiene una energia de: " + messi.getEnergia());
        System.out.println(Ronaldo.getJugador()+" Tiene una energia de: " + Ronaldo.getEnergia());
        System.out.println(Fernandez.getJugador()+" Tiene una energia de: " + Fernandez.getEnergia());
        System.out.println(Bruyne.getJugador()+" Tiene una energia de: " + Bruyne.getEnergia());
        
        do{
            aleatorio = rand.nextInt(1);
            if(aleatorio == 0){
                salud = messi.fallo_tiro();
            }
            else{
                salud = messi.ataque_tiro();
            }
           System.out.println(messi.getJugador()+ "Messi ha soltado un zurdaso con un daño de: "+salud);
           Ronaldo.daño(salud);
           
           
            aleatorio = rand.nextInt(1);
            if(aleatorio == 0){
                salud = Fernandez.fallo_tiro();
            }
            else{
                salud = Fernandez.ataque_tiro();
            }
           System.out.println(Fernandez.getJugador()+ "Bruno Fernandez a soltado un cañonaso con un daño de: "+salud);
           Ronaldo.daño(salud);
           
            aleatorio = rand.nextInt(1);
            if(aleatorio == 0){
                salud = Bruyne.fallo_tiro();
            }
            else{
                salud = Bruyne.ataque_tiro();
            }
           System.out.println(Bruyne.getJugador()+ "Kevin De Bruyne soltó un trayaso con un daño de: "+salud);
           Ronaldo.daño(salud);

           if(Ronaldo.getEnergia()>0){
               
                aleatorio = rand.nextInt(1);
            if(aleatorio == 0){
                salud = Ronaldo.fallo_tiro();
            }
            else{
                salud = Ronaldo.ataque_tiro();
            }
           System.out.println(messi.getJugador()+ "Cristiano Ronaldo dejo ir un balonazo sideral con daño de: "+salud);
            aleatorio = rand.nextInt(1);
            if(aleatorio == 0){
                messi.daño(salud);
                Fernandez.daño(salud);
            }
            else{
                Bruyne.daño(salud);
           }
           }
           
           System.out.println(messi.getJugador()+" Tiene una energia de: " + messi.getEnergia());
           System.out.println(Ronaldo.getJugador()+" Tiene una energia de: " + Ronaldo.getEnergia());
           System.out.println(Fernandez.getJugador()+" Tiene una energia de: " + Fernandez.getEnergia());
           System.out.println(Bruyne.getJugador()+" Tiene una energia de: " + Bruyne.getEnergia());
           
           try{
               System.in.read();
           }catch(Exception e){}
               
           
                      
        }while(jugador && sith); 
        
    }
}