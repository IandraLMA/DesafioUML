import model.Iphone;
import model.Samsumg;
import contract.SmartPhone;

public class Main {
    public static void main(String[] args) {
        Iphone i = new Iphone();
        Samsumg u = new Samsumg();
        acessandoLoja(i);
        acessandoLoja(u);
    }
    public static void acessandoLoja(SmartPhone i){
        if(i instanceof Iphone){
            Iphone iphone = (Iphone) i;
            iphone.acessarLoja();
        }else{
            System.out.println("Loja Smansung não foi criada");
        }
    }

}