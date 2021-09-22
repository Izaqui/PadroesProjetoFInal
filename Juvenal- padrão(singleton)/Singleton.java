public class Singleton {
    //Criação de um atributo static, então teremos apenas um singleton da classe
    private static Singleton singleton;
    //Criação de um construtor privado que é utlizado par que não haja instanciação direta
    private Singleton(){

    }
    //Método statico que vai retorna a propria instacia da classe singleton
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();

        }
        return singleton;

    }
}