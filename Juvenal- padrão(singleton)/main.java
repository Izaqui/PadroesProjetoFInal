public class main {
    public static void main(String[] args) {

      Singleton singleton01 = Singleton.getInstnce();
      Singleton singleton02 = Singleton.getInstnce();
        //Objetivo do padrão singelnto é emppedir que exista multiplicas instancias da mesma classe
        System.out.println(singleton01==singleton02);
    }
}