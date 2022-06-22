public class HarryPotter {

    public static void main(String[] args) {

        //private framework that allows us to display information, images in a window
        Screen screen = new Screen();

        //I instantiate my models to show them
        Dumbledore dumbledore = new Dumbledore(
                01,
                "Albus Percival Wulfric Brian Dumbledore",
                "Humano",
                "Masculino",
                "Azul",
                "Blanca",
                "Fénix",
                "Gryffindor"
        );

        SiriusBlack siriusBlack = new SiriusBlack(02,"","","","","","","");
        //data entry via set
        siriusBlack.setName("Sirius Black");
        siriusBlack.setSpecies("N/A");
        siriusBlack.setGender("Masculino");
        siriusBlack.setEyeColor("Grises");
        siriusBlack.setSkinColor("Blanca");
        siriusBlack.setPatrons("Perro(posiblemente)");
        siriusBlack.setHouse("Gryffindor");


        screen.setVisible(true);

        //the first character is shown
        screen.out(dumbledore.showMessage(), "Helvetica", 28, Colors.BLACK);
        screen.out(siriusBlack.showMessage(), "Helvetica", 28, Colors.BLACK);
    }
}
