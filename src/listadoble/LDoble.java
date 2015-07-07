package listadoble;

public class LDoble {

    private Nodo cab, cola;
    private int cont = 1;

   
    public void insertarAlFinal(int dato) {
        Nodo p = new Nodo();
        p.info = dato;
        p.sig = null;

        if (cab == null && cola == null) {
            // insertar primer nodo de la lista
            cab = p;
            cola = p;
            p.ant = null;
            cola = p;
        } else {
            // la  lista tiene almenos un nodo
            p.ant = cola;
            cola.sig = p;
            cola = p;
        }
    }

    public void imprimirDeIzqAder() {
        for (Nodo t = cab; t != null; t = t.sig) {
            System.out.println(t.info);
        }
    }

   
    public void borrar() {
        Nodo t = cab;

        while (t != null) {
            if ((cont % 2 == 0) && (t == cola)) {
              //borrar ultimo nodo
                cola=cola.ant;
                cola.sig=null;
                t=cola.sig;
                
                
            } else if (cont % 2 == 0) {

                //borrar nodo intermedio
                (t.ant).sig = t.sig;
                (t.sig).ant = t.ant;
                t = t.sig;
                cont++;

            } else {
                t = t.sig;
                cont++;
            }

        }
    }

}
