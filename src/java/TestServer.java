public class TestServer {
    public static void main(String[] args) {
        Servidor servidor = new Servidor(9001);
        String msj = servidor.mensajeEntrante();
        ReadFile readFile = new ReadFile();
        if(msj.compareTo("readFile")==0){
            readFile.readFile();
        }else {
            System.out.println(msj);
        }
    }
}
