
public class JavaFondo {

    public static void main(String[] args) {
        //length()
        String s = "Hola";
        int tamanio = s.length(); //Regresa el tamaño de la cadena: 4
        //System.out.println("El tamaño de la cadena es: " + tamanio);

        //isEmpty()
        String s1 = "Hola";
        boolean b1 = s1.isEmpty(); //Regresa si la cadena es vacia: false
        //System.out.println("¿La cadena esta vacia? : " + b1);
        String s2 = "";
        boolean b2 = s2.isEmpty(); //Regresa si la cadena esta vacia: true
        //System.out.println("¿La cadena esta vacia? " + b2);

        //charAt()
        String t = "Hola";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);//Regresa los valores del indice 0 hasta el final de la cadena
            //System.out.println(c); //Salida: H o l a
        }

        //equals()
        String x = "Hola";
        String y = "Hola";
        if (x.equals(y)) //Compara los contenidos, regresa true
        {
            System.out.println("SI pasa pasa aqui!");
        }

        // indexOf() y lastIndexOf()
        String s3 = "Hola, como estas?";
        int p1 = s3.indexOf('a');    //Regresa: 3
        //System.out.println(p1);
        int p2 = s3.lastIndexOf('a');//Regresa: 14
        //System.out.println(p2);
        String s4 = "Hola, como estas? Estas como querias?";
        int p3 = s4.indexOf("como");     //Regresa: 6
        int p4 = s4.indexOf("estas");    //Regresa: 11
        int p5 = s4.lastIndexOf("como"); //Regresa: 24
        
        //toUpperCase y toLowerCase
        String s5 = "Hola, como estas";
        String may = s5.toUpperCase(); //Regresa: HOLA, COMO ESTAS?
        String min = s5.toLowerCase(); //Rgeresa: hola, como estas?
        //System.out.println(may);

        //substring()
        String s6 = "Hola, como estas?";
        String s6_1 = s6.substring(0,4);  //Regresa: Hola
        String s6_2 = s6.substring(6,10); //Regresa: como
        String s6_3 = s6.substring(11);          //Regresa: estas?
        //System.out.println(s6_1);
        
        //parseInt() y toString()
        //enteros
        String s7 = "1234";
        int i = Integer.parseInt(s7);  //Regresa 1234
        String t1 = Integer.toString(i); //Regresa "1234"
        //flotantes
        String s8 = "1234.56";
        double d = Double.parseDouble(s8); //Rgeresa 1234.56
        String t2 = Double.toString(d);      //Regresa "1234.56"
    
        //Ejemplo de la clase StringBuiler
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.print(sb); //Salida: Hola, chau
    }
}
