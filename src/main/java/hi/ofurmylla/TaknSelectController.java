package hi.ofurmylla;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;




public class TaknSelectController {

    public static String Player1;
    public static String Player2;

    private int leikamadur = 0;

    @FXML
    private Label Leikmadur1Demacia;

    @FXML
    private Label Leikmadur1Noxus;

    @FXML
    private Label Leikmadur1Shurima;

    @FXML
    private Label Leikmadur2Demacia;

    @FXML
    private Label Leikmadur2Noxus;

    @FXML
    private Label Leikmadur2Shurima;

    //setur Demacia sem takn spilara 1 eða 2
    @FXML
    void VeljaDemacia(MouseEvent event) {
        if (leikamadur == 0) {
            Leikmadur1Demacia.setVisible(true);
            leikamadur++;
            Player1 = "Demacia";
        }
        else  {
            Leikmadur2Demacia.setVisible(true);
            Player2 = "Demacia";
            aframButton.setVisible(true);
            noxusButton.setDisable(true);
            shurimaButton.setDisable(true);
            leikamadur--;
        }
        demaciaButton.setDisable(true);
    }

    //setur noxus sem takn spilara 1 eða 2
    @FXML
    void VeljaNoxus(MouseEvent event) {
        if (leikamadur == 0) {
            Leikmadur1Noxus.setVisible(true);
            Player1 = "Noxus";
            leikamadur++;
        }
        else {
            Leikmadur2Noxus.setVisible(true);
            Player2 = "Noxus";
            aframButton.setVisible(true);
            demaciaButton.setDisable(true);
            shurimaButton.setDisable(true);
            leikamadur--;
        }
        noxusButton.setDisable(true);
    }

    //setur shurima sem takn spilara 1 eða 2
    @FXML
    void VeljaShurima(MouseEvent event) {
        if (leikamadur == 0) {
            Leikmadur1Shurima.setVisible(true);
            Player1 = "Shurima";
            leikamadur++;
        }
        else {
            Leikmadur2Shurima.setVisible(true);
            Player2 = "Shurima";
            aframButton.setVisible(true);
            demaciaButton.setDisable(true);
            noxusButton.setDisable(true);
            leikamadur--;
        }
        shurimaButton.setDisable(true);
    }
    @FXML
    private Button demaciaButton;

    @FXML
    private Button noxusButton;

    @FXML
    private Button shurimaButton;


    @FXML
    void hoverExitDemacia(MouseEvent event) {
        demaciaButton.styleProperty().set("-fx-background-color: #00000000");
    }

    @FXML
    void hoverExitNoxus(MouseEvent event) {
        noxusButton.styleProperty().set("-fx-background-color: #00000000");

    }

    @FXML
    void hoverExitShurima(MouseEvent event) {
        shurimaButton.styleProperty().set("-fx-background-color: #00000000");

    }

    @FXML
    void hoveringDemacia(MouseEvent event) {
        demaciaButton.styleProperty().set("-fx-background-color: #3399FF");

    }

    @FXML
    void hoveringNoxus(MouseEvent event) {
        noxusButton.styleProperty().set("-fx-background-color: #FF3333");
    }

    @FXML
    void hoveringShurima(MouseEvent event) {
        shurimaButton.styleProperty().set("-fx-background-color: #FFFF00");

    }

    @FXML
    private Button aframButton;

    @FXML
    void nextScene(ActionEvent event) {
        ViewSwitcher.switchTo(View.MAIN);
    }



}


