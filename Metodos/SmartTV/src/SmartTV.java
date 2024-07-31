public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void ligar(){
        ligada= true;
    }
    public void desligar(){
        ligada= false;
    }

    public void aumentarcanal(){
        canal ++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuircanal(){
        canal --;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void selecionarcanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal selecionado foi: " + canal);
    }

    public void aumentarvolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirvolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

}
