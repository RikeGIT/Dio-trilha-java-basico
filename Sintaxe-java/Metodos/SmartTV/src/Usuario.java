public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV LIGADA?: " + smartTV.ligada);
        System.out.println("Canal Atual?: "+ smartTV.canal);
        System.out.println("Volume: "+ smartTV.volume);

        smartTV.ligar ();

        System.out.println("NOVO STATUS > TV LIGADA?: " + smartTV.ligada);

        smartTV.desligar ();

        System.out.println("NOVO STATUS > TV LIGADA?: " + smartTV.ligada);

        smartTV.aumentarvolume();

        smartTV.diminuirvolume();

        smartTV.selecionarcanal(13);

        smartTV.diminuircanal();

    }
}
