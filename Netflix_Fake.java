import java.util.ArrayList;
import java.util.Scanner;

public class Netflix_Fake{
    public static int dato;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int Salir;
        int Contador = 0;

        //Datos Cliente
        ArrayList Nombre = new ArrayList();
        ArrayList Edad = new ArrayList();
        ArrayList Dirección = new ArrayList();

        //Datos Pelicula
        ArrayList MovieName = new ArrayList();
        ArrayList MovieTipo = new ArrayList();
        ArrayList MovieGenero = new ArrayList();
        ArrayList MovieSinopsis = new ArrayList();


        //Listas
        Cliente[] Clientes_List = new Cliente[10];
        Pelicula[] Movie_List = new Pelicula[10];


        //Inicio de bienvenida

        //Ojo con sout mas TAB para no escribir toda la linea de tecxto
        do{
            System.out.println("");
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║             Bienvenido a NECFLIS©             ║");
            System.out.println("╠═══════════════════════════════════════════════╣");
            System.out.println("║                                               ║");
            System.out.println("║  Disfruta de Necflis, películas y series en   ║");
            System.out.println("║  streaming en tu smart TV, consola, PC, Mac,  ║");
            System.out.println("║  móvil, tableta y más dispositivos.           ║");
            System.out.println("║                                               ║");
            System.out.println("╠═══════════════════════════════════════════════╣");
            System.out.println("║ Elija una de las opciones :)                  ║");
            System.out.println("║                                               ║");
            System.out.println("║ 1.Clientes                                    ║");
            System.out.println("║ 2.Películas/Series                            ║");
            System.out.println("║ 3.Salir                                       ║");
            System.out.println("║                                               ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.println("");
            int Opcion1 = sc.nextInt();  //LEER OPCION

            switch (Opcion1)
            {
                case 1: //El de clientes

                    System.out.println("");
                    System.out.println("╔═══════════════════════════════════════════════╗");
                    System.out.println("║                 Menu Clientes                 ║");
                    System.out.println("╠═══════════════════════════════════════════════╣");
                    System.out.println("║ Elija una de las opciones :)                  ║");
                    System.out.println("║                                               ║");
                    System.out.println("║ 1.Ver listado de Clientes                     ║");
                    System.out.println("║ 2.Crear un nuevo Cliente                      ║");
                    System.out.println("║ 3.Seleccionar un Cliente                      ║");
                    System.out.println("║ 4.Regresar al menu principal / Salir          ║");
                    System.out.println("║                                               ║");
                    System.out.println("╚═══════════════════════════════════════════════╝");
                    System.out.println("");
                    int Subopcion1 = sc.nextInt();

                    switch (Subopcion1)
                    {
                        case 1:
                            if (Contador == 0){
                                System.out.println("");
                                System.out.println("╔════════════════════════════════════════════════╗");
                                System.out.println("║              No existen clientes  :(           ║");
                                System.out.println("╠════════════════════════════════════════════════╣");
                                System.out.println("║ Crea un cliente para poderlo ver en esta lista.║");
                                System.out.println("╚════════════════════════════════════════════════╝");
                                System.out.println("");
                            } else {
                                System.out.println("╔════════════════════════════════════════════════╗");
                                System.out.println("║              Listado de Clientes               ║");
                                System.out.println("╚════════════════════════════════════════════════╝");

                                for (int j = 0; j < Nombre.size(); j++) {
                                    String nombre1 = (String) Nombre.get(j);
                                    String direccion1 = (String) Dirección.get(j);
                                    int edad1 = (int) Edad.get(j);
                                    System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ Posición: " + j +  " ║ Nombre:  " + nombre1 + " ║  Dirección: " + direccion1 + " ║ Edad " + edad1 + "║");
                                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                }
                            }
                            break;

                        case 2:
                            Contador++;
                            sc.nextLine();
                            System.out.println("╔════════════════════════════════════════════════╗");
                            System.out.println("║              Creador de clientes               ║");
                            System.out.println("╚════════════════════════════════════════════════╝");

                            System.out.println("╔════════════════╗");
                            System.out.println("║ Ingrese Nombre ║");
                            System.out.println("╚════════════════╝");
                            String nombre = sc.nextLine();

                            System.out.println("");
                            System.out.println("╔═══════════════════╗");
                            System.out.println("║ Ingrese Direccion ║");
                            System.out.println("╚═══════════════════╝");
                            String direccion = sc.nextLine();

                            System.out.println("");
                            System.out.println("╔══════════════╗");
                            System.out.println("║ Ingrese Edad ║");
                            System.out.println("╚══════════════╝");
                            int edad = Integer.parseInt(sc.nextLine());

                            Cliente cliente = new Cliente(nombre, direccion, edad);
                            Clientes_List[Contador] = cliente;

                            for(int i = 0; i < 1; i++){
                                Nombre.add(cliente.nombre);
                                String nombre1 = (String) Nombre.get(i);

                                Dirección.add(cliente.direccion);
                                String direccion1 = (String) Dirección.get(i);

                                Edad.add(cliente.edad);
                                int edad1 = (int) Edad.get(i);
                            }
                            for (int j = 0; j < Nombre.size(); j++) {
                                String nombre1 = (String) Nombre.get(j);
                                String direccion1 = (String) Dirección.get(j);
                                int edad1 = (int) Edad.get(j);
                                int j1 = j+1;
                                System.out.println("");
                                System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ La lista actual es:                                                                                  ║");
                                System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println("║ Posición: " + j1 +  " ║ Nombre:  " + nombre1 + " ║  Dirección: " + direccion1 + " ║ Edad " + edad1 + "║");
                                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                System.out.println("");
                            }
                            break;

                        case 3:
                            System.out.println("╔════════════════════════════════════════════════╗");
                            System.out.println("║              Creador de clientes               ║");
                            System.out.println("╚════════════════════════════════════════════════╝");
                            System.out.println("");
                            System.out.println("╔════════════════════════════════════════════════╗");
                            System.out.println("║              Listado de Clientes               ║");
                            System.out.println("╚════════════════════════════════════════════════╝");
                            System.out.println("");

                            if (Contador == 0) {
                                System.out.println("");
                                System.out.println("╔════════════════════════════════════════════════╗");
                                System.out.println("║              No existen clientes  :(           ║");
                                System.out.println("╠════════════════════════════════════════════════╣");
                                System.out.println("║ Crea un cliente para poderlo ver en esta lista.║");
                                System.out.println("╚════════════════════════════════════════════════╝");
                                System.out.println("");
                            } else {
                                for (int j = 0; j < Nombre.size(); j++) {
                                    String nombre1 = (String) Nombre.get(j);
                                    String direccion1 = (String) Dirección.get(j);
                                    int edad1 = (int) Edad.get(j);
                                    System.out.println("");
                                    int j1 = j + 1;
                                    System.out.println("");
                                    System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ La lista actual es:                                                                                  ║");
                                    System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
                                    System.out.println("║ Posición: " + j1 +  " ║ Nombre:  " + nombre1 + " ║  Dirección: " + direccion1 + " ║ Edad " + edad1 + "║");
                                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                    System.out.println("");
                                }
                            }

                            System.out.println("╔════════════════════════════════════════════════╗");
                            System.out.println("║              Elije un Cliente                  ║");
                            System.out.println("╚════════════════════════════════════════════════╝");
                            int cl = sc.nextInt();
                            int cl1 = cl - 1;

                            if(cl == 0){
                                System.out.println("╔═══════╗");
                                System.out.println("║ Atras ║");
                                System.out.println("╚═══════╝");
                            } else {
                                System.out.println("");
                                System.out.println("╔════════════════════════════════════════════════╗");
                                System.out.println("║              Elijio el Cliente:                ║");
                                System.out.println("╚════════════════════════════════════════════════╝");
                                System.out.println("");
                                System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ Posición: " + cl +  " ║ Nombre:  " + Nombre.get(cl1) + " ║  Dirección: " + Dirección.get(cl1) + " ║ Edad " + Edad.get(cl1) +"        ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                System.out.println("");
                                System.out.println("╔═══════════════════════════════════════════════╗");
                                System.out.println("║        Elije una de las opciones :)           ║");
                                System.out.println("║                                               ║");
                                System.out.println("║ 1.PlayList                                    ║");
                                System.out.println("║ 2.Agregar película                            ║");
                                System.out.println("║ 3.Atras                                       ║");
                                System.out.println("╚═══════════════════════════════════════════════╝");
                                System.out.println("");

                            }
                            int Sunopcion4 = sc.nextInt();

                            switch (Sunopcion4)
                            {
                                case 1:
                                    System.out.println("");
                                    System.out.println("╔════════════════════════════════════╗");
                                    System.out.println("║              PLAYLIST              ║");
                                    System.out.println("╚════════════════════════════════════╝");
                                    System.out.println("");
                                    int cls = cl - 1;
                                    System.out.println("");
                                    System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ Posición: " + cl +  " ║ Nombre:  " + Nombre.get(cls) + " ║  Dirección: " + Dirección.get(cls) + " ║ Edad " + Edad.get(cls) +"       ║");
                                    System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                    System.out.println("");
                                    System.out.println("");
                                    int dato1 = dato + 1;
                                    System.out.println("");
                                    System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ Posición: " + dato1 + " ║ Nombre: " + MovieName.get(dato) + " ║ Tipo: " + MovieTipo.get(dato) + " ║ Genero: " + MovieGenero.get(dato) + " ║ Sinopsis: "  + MovieSinopsis.get(dato) );
                                    System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                    System.out.println("");
                                    break;

                                case 2:
                                    if(Contador == 0){
                                        System.out.println("");
                                        System.out.println("╔════════════════════════════════════════════════════════╗");
                                        System.out.println("║           No existen Peliculas ni Series  :(           ║");
                                        System.out.println("╠════════════════════════════════════════════════════════╣");
                                        System.out.println("║ Crea una pelicula/Serie para poderla ver en esta lista.║");
                                        System.out.println("╚════════════════════════════════════════════════════════╝");
                                        System.out.println("");
                                    } else {
                                        System.out.println("╔════════════════════════════════════════════════╗");
                                        System.out.println("║           Ver   Listado de Peliculas/Series    ║");
                                        System.out.println("╚════════════════════════════════════════════════╝");

                                        for (int j = 0; j < MovieName.size(); j++) {
                                            String nombrep = (String) MovieName.get(j);
                                            String generop = (String) MovieGenero.get(j);
                                            String tipo = (String) MovieTipo.get(j);
                                            String sinopsis = (String) MovieSinopsis.get(j);
                                            System.out.println("");
                                            int j1 = j + 1;
                                            System.out.println("");
                                            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║ Posición: " + j1 + " ║ Nombre: " + nombrep + " ║ Tipo: " + tipo + " ║ Genero: " + generop + " ║ Sinopsis: "  + sinopsis );
                                            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                            System.out.println("");
                                        }
                                    }

                                    System.out.println("╔════════════════════════════════════════════════╗");
                                    System.out.println("║              Elija una Pelicula/Serie          ║");
                                    System.out.println("╚════════════════════════════════════════════════╝");
                                    int DataMovie = sc.nextInt();
                                    int DataMovie2 = DataMovie - 1;
                                    if(DataMovie2 == 0){
                                        System.out.println("╔════════════════╗");
                                        System.out.println("║  Procesado...  ║");
                                        System.out.println("╚════════════════╝");
                                    } else {
                                        System.out.println("");
                                        System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                        System.out.println("║ Posición: " + DataMovie + " ║ Nombre: " + MovieName.get(DataMovie2) + " ║ Tipo: " + MovieTipo.get(DataMovie2) + " ║ Genero: " + MovieGenero.get(DataMovie2) + " ║ Sinopsis: "  + MovieSinopsis.get(DataMovie2) );
                                        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        System.out.println("");
                                        System.out.println("");
                                        dato = DataMovie2;
                                    }
                                    break;

                                case 3:
                                    System.out.println("╔═════════╗");
                                    System.out.println("║  Atras  ║");
                                    System.out.println("╚═════════╝");
                                    break;

                                default:
                                    System.out.println("--");
                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("╔═══════╗");
                            System.out.println("║ Salir ║");
                            System.out.println("╚═══════╝");
                            break;

                        default:
                            System.out.println("Default case");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("╔═══════════════════════════════════════════════╗");
                    System.out.println("║             Menu Peliculas/Series             ║");
                    System.out.println("╠═══════════════════════════════════════════════╣");
                    System.out.println("║ Elija una de las opciones :)                  ║");
                    System.out.println("║                                               ║");
                    System.out.println("║ 1.Ver listado de Peliculas/Series             ║");
                    System.out.println("║ 2.Crear Una Pelicula/Serie                    ║");
                    System.out.println("║ 3.Regresar al menu principal / Salir          ║");
                    System.out.println("║                                               ║");
                    System.out.println("╚═══════════════════════════════════════════════╝");
                    System.out.println("");
                    int Subopcion2 = sc.nextInt();

                    switch (Subopcion2)
                    {
                        case 1:
                            if(Contador == 0){
                                System.out.println("");
                                System.out.println("╔════════════════════════════════════════════════════════╗");
                                System.out.println("║           No existen Peliculas ni Series  :(           ║");
                                System.out.println("╠════════════════════════════════════════════════════════╣");
                                System.out.println("║ Crea una pelicula/Serie para poderla ver en esta lista.║");
                                System.out.println("╚════════════════════════════════════════════════════════╝");
                                System.out.println("");
                            } else {
                                System.out.println("╔════════════════════════════════════════════════╗");
                                System.out.println("║              Listado de Peliculas/Series       ║");
                                System.out.println("╚════════════════════════════════════════════════╝");
                                for (int j = 0; j < MovieName.size(); j++) {
                                    String Namem = (String) MovieName.get(j);
                                    String Generom = (String) MovieGenero.get(j);
                                    String Tipom = (String) MovieTipo.get(j);
                                    String Sinopsism = (String) MovieSinopsis.get(j);
                                    int j1 = j+1;
                                    System.out.println("");
                                    System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ Posición: " + j1 + " ║ Nombre: " + Namem + " ║ Tipo: " + Tipom + " ║ Genero: " + Generom + " ║ Sinopsis: "  + Sinopsism );
                                    System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                    System.out.println("");
                                }
                            }
                            break;

                        case 2:
                            Contador++;
                            sc.nextLine();
                            System.out.println("╔════════════════════════════════════════════════╗");
                            System.out.println("║              Creador de Peliculas              ║");
                            System.out.println("╚════════════════════════════════════════════════╝");

                            System.out.println("");
                            System.out.println("╔═════════════════════════════════════╗");
                            System.out.println("║ Ingrese Nombre de la Pelicula/Serie ║");
                            System.out.println("╚═════════════════════════════════════╝");
                            String Movie2Name = sc.nextLine();


                            System.out.println("");
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║ " + Movie2Name + " Es serie o Pelicula?");
                            System.out.println("╚══════════════════════════════════════════════════╝");
                            String Movietipo = sc.nextLine();

                            System.out.println("");
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║ la " + Movietipo + " " + Movie2Name + " Es de genero (drama, comedia, terror, suspenso)");
                            System.out.println("╚══════════════════════════════════════════════════╝");
                            String genero = sc.nextLine();

                            System.out.println("");
                            System.out.println("╔══════════════════════════════════════════════════╗");
                            System.out.println("║ Ingrese sinopsis de la " + Movietipo + "");
                            System.out.println("╚══════════════════════════════════════════════════╝");
                            String sinopsis = sc.nextLine();

                            Pelicula pelicula = new Pelicula(Movie2Name, Movietipo, genero, sinopsis);
                            Movie_List[Contador] = pelicula;

                            for(int i = 0; i < 1; i++){
                                MovieName.add(pelicula.nombre_pelicula);
                                String nombrep = (String) MovieName.get(i);

                                MovieGenero.add(pelicula.genero);
                                String generop = (String) MovieGenero.get(i);

                                MovieTipo.add(pelicula.tipo);
                                String tipo1 = (String) MovieTipo.get(i);

                                MovieSinopsis.add(pelicula.sinopsis);
                                String sinopsis1 = (String) MovieSinopsis.get(i);
                            }
                            for (int j = 0; j < MovieName.size(); j++) {
                                String Moviena = (String) MovieName.get(j);
                                String generop = (String) MovieGenero.get(j);
                                String tipo1 = (String) MovieTipo.get(j);
                                String sinopsis1 = (String) MovieSinopsis.get(j);
                                int j1 = j+1;
                                System.out.println("");
                                System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ La lista actual es:                                                                                                         ║");
                                System.out.println("╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
                                System.out.println("║ Posición: " + j1 + " ║ Nombre: " + Moviena + " ║ Tipo: " + Movietipo + " ║ Genero: " + generop + " ║ Sinopsis: "  + sinopsis );
                                System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                System.out.println("");
                            }
                            break;

                        case 3:
                            System.out.println("Atrás");
                            break;

                        default:
                            System.out.println("Default case");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("╔═══════════════════════════════════════════════╗");
                    System.out.println("║                                               ║");
                    System.out.println("║        Necflis, películas y series en         ║");
                    System.out.println("║  streaming en tu smart TV, consola, PC, Mac,  ║");
                    System.out.println("║     móvil, tableta y más dispositivos.        ║");
                    System.out.println("║                                               ║");
                    System.out.println("╚═══════════════════════════════════════════════╝");
                    System.out.println("");
                    break;

                default:
                    System.out.println("...");
                    break;
            }

            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║        Elije una de las opciones :)           ║");
            System.out.println("║                                               ║");
            System.out.println("║ 1.Salir de programa                           ║");
            System.out.println("║ 2.Regresar al Menu Principal                  ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            Salir = sc.nextInt();
        }while(Salir != 1);
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║ Gracias, pase feliz Navidad ║");
        System.out.println("╚═════════════════════════════╝");
    }
}