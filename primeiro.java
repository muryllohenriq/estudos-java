// nome da classe
class MeuPrimeiroProgramaJava
{
    //módulo principal com a entrada pela linha de comando
    public static void main (String entrada[])
    {
        // quando a gente declara um tipo primitivo, estamos reservando um espaço na memória pra colocar aquele valor
        //declaração de variáveis

        String frase = "Muryllo Henrique";
        String curso = "Ciência da Computação";
        // inteiro
        int inteiro = 20;
        // caractere
        char caracter = 'M';
        // real
        double peso = 57.5;
        double real = 1.84;
        boolean VF = true;
        // byte: 8 bits (-128 - 127)
        byte variavelByte = 127;

        if (VF == true)
        {
            System.out.println("Eu sou o " + frase + ", curso " + curso + ", tenho " + inteiro + " anos, sou do gênero " + caracter + ", peso " + peso + "kg e tenho " + real + "m de altura");
        }

        System.out.println(variavelByte);

        System.exit(0);
    }
}