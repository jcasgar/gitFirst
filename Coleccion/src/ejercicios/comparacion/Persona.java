package ejercicios.comparacion;

public class Persona implements Comparable<Persona>{
    public String nombre;
    public int edad, altura;

    //Constructor
    public Persona( String nom,int al, int ed){
        this.nombre=nom;
        this.altura = al;
        this.edad = ed;
    }

    //Metodos set
    public String getNombre(){ return nombre;}

    public int getAltura(){ return altura;}

    public int getEdad(){ return edad;}
    //Metodos get
    public void setNombre(){ this.nombre=nombre;}

    public void  setAltura(){ this.altura=altura;}

    public void  setEdad(){ this.edad=edad ;}

    public String toString(){
        String msg="";
        msg="Nombre:\t"+nombre+"\tAltura:\t "+altura+"\tedad:  "+edad;
        return msg;
    }
    
    
    @Override
    public int compareTo (Persona o)
    {
    	return 0;
    }
    
    /**
     * 
     * @param o
     * @param cadena, contiene el tipo de ordenacion a realizar
     * @return
     */
    public int compareToPersona (Persona o, String cadena)
    {
    	int resultado = 0;
    	if(cadena.equals("Edad")){
    		if (this.edad<o.getEdad()) {
    			resultado = -1;
    		}
    		else if (this.edad >o.getEdad())
    			resultado= 1;
    			else
    				resultado = 0;
    	}
    	
    	if(cadena.equals("Altura")) {
    		if (this.altura<o.getAltura())
    			resultado = -1;
    		else if (this.altura>o.getAltura())
    			resultado = 1;
    		else
    			resultado = 0;	
    	}
    		   	
    	return resultado;
    }
    
}
