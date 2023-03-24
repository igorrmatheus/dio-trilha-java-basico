public class TiposVariaveis {

/*tipos primivitos: int, byte, short, long(precisa ser encerrado com um L), boolean, char, float(precisa terminar com um F) e double;
 */

    public static void main(String[] args) throws Exception {
        
        String meuNome = "Igor Matheus";
        
        double salarioMinimo = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero =5;
        numero = 10;
        System.out.println(numero);

        /*Não pode mais modificar seu valor*/
        final double VALOR_DE_PI = 3.14;
    }
}
