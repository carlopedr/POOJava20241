package crudfiles;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GestorArchivoPersona implements IGestorDeArchivos<Persona>, Serializable {

    private final String nombreDelArchivo;

    public GestorArchivoPersona(String nombreDelArchivo) {
        this.nombreDelArchivo = nombreDelArchivo;
    }

    @Override
    public void guardarObjeto(Persona objeto) throws IOException {
        List<Persona> p = obtenerTodosLosObjetos();
        p.add(objeto);
        guardarTodosLosObjetos(p);
    }

    @Override
    public List<Persona> obtenerTodosLosObjetos() {
        File file = new File(nombreDelArchivo);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        List<Persona> objetos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreDelArchivo))) {
            while (true) {
                Persona objeto = (Persona) ois.readObject();
                objetos.add(objeto);
            }
        } catch (EOFException e) {
            // Fin del archivo
            //e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objetos;
    }

    @Override
    public Optional<Persona> obtenerObjeto(Predicate<Persona> criterio) {
        List<Persona> objetos = obtenerTodosLosObjetos();
        return objetos.stream().filter(criterio).findFirst();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarObjeto(Persona objetoAntiguo, Persona objetoNuevo) {
        List<Persona> objetos = obtenerTodosLosObjetos();
        objetos.removeIf(objeto -> objeto.equals(objetoAntiguo));
        objetos.add(objetoNuevo);
        guardarTodosLosObjetos(objetos);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarObjeto(Persona objeto) {
        List<Persona> objetos = obtenerTodosLosObjetos();
        objetos.removeIf(objetoActual -> objetoActual.equals(objeto));
        guardarTodosLosObjetos(objetos);
    }

    private void guardarTodosLosObjetos(List<Persona> objetos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreDelArchivo))) {
            for (var objeto : objetos) {
                oos.writeObject(objeto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
