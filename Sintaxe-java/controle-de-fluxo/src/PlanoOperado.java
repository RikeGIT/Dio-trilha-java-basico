public class PlanoOperado {
    public static void main(String[] args) {
        String plano = "B";
        System.out.println("O seu plano tem direito há:");
        
        switch (plano) {
            case "T":
                System.out.println("5GB de youtube");
            case "M":
                System.out.println("Whatsapp e instagram ilimitado");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
