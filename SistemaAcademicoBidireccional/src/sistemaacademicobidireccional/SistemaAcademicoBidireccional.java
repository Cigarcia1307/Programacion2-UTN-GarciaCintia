
package sistemaacademicobidireccional;

   
public class SistemaAcademicoBidireccional {
    
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Gómez", "Historia");
        Profesor p3 = new Profesor("P003", "María López", "Programación");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Historia Antigua");
        Curso c3 = new Curso("C103", "Java Básico");
        Curso c4 = new Curso("C104", "Estadística");
        Curso c5 = new Curso("C105", "Historia Moderna");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P002");

        System.out.println("Cursos con su profesor:");
        uni.listarCursos();

        System.out.println(" Profesores con sus cursos:");
        uni.listarProfesores();

        System.out.println(" Cambio de profesor en C104:");
        uni.asignarProfesorACurso("C104", "P003");

        System.out.println(" Eliminando curso C102:");
        uni.eliminarCurso("C102");

        System.out.println(" Eliminando profesor P001:");
        uni.eliminarProfesor("P001");

        System.out.println(" Reporte final:");
        uni.reporteCantidadCursosPorProfesor();
    }
}


    

