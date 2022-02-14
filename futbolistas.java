/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio;
/*Jerson Enrique Martinez Vargas
    */
/**
 *
 * @author Jerson Martinez
 */
public class futbolistas {
    private String jugador;
    private int energia;
    private int potencia;
    private int prAC;
    /*Caracteristicas que tendran los jugador
    */
    
    public void setJugador (String _jugador)
    {
        this.jugador = _jugador;
    }
    
    public String getJugador(){
     return this.jugador;
    }
    
    public void setEnergia(int _energia){
       this.energia = _energia;
    }
    
    public int getEnergia(){
        return this.energia;
    }
    
    public void setPotencia(int _potencia){
        this.potencia =_potencia;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
     public void setPrAC(int _prAC){
       this.prAC = _prAC;
    }
    
    public int getPrAC(){
        return this.prAC;
    }
    
    public boolean Desgaste()
    {
        boolean flag = true;
        if(this.getEnergia()<=0) flag = false;
        System.out.println("El jugador número:" + this.getJugador()+ "se ha quedado sin energia");
        return flag;
        /* La clase comprueba si el jugador tiene energia y la energia de la carta es mayor que 0, la carta continua con vida y puede volver a usarse
        pero si la energia es igual o menor que "0" significa que la carta ha se ha quedado sin energia y ya no se usara y mostrara
        un mensaje que especifique que la carta se ha quedado sin energia.
        */
        }
    /*Joel Mauricio Diaz Ortiz
    */
    public void acTiro(int _potencia)
    {
        int energiaRest = this.getEnergia();
        int tiro =_potencia;
        if(tiro>0)
        {
          energiaRest-= tiro;
         System.out.println("El jugador :"+this.getJugador() + "ha hecho un tiro con: " + tiro + " puntos. (le disminuye la energia a su contricante)");
         
        } else {
            System.out.println("Para la proxima sera...");
        }
        this.setEnergia(energiaRest);
        System.out.println("El jugador :" +this.getJugador() +" le quedan"+ energiaRest +" puntos de energia.");
        /*
         Si el jugador usado ha hecho un tiro con "x" puntos se restara la cantidad de puntos
         infrinjido a la energia que posee el otro jugador.
         Se muestra un mensaje donde especifica el número del jugador y los puntos de tiro que se ha recibido.
         Al final se mostrara la cantidad de energia que le queda tras realizar un tiro.
         */
    }
}
