package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class OngletController implements Initializable{
	//déclaration des components visuels

    @FXML
    private ComboBox<String> cboVolume1;

    @FXML
    private TextField txtMasse1;

    @FXML
    private TextField txtMasse2;

    @FXML
    private TextField txtVolume2;

    @FXML
    private TextField txtVolume1;

    @FXML
    private Button btnSortie;

    @FXML
    private TextField txtSurface1;

    @FXML
    private ComboBox<String> cboLongeur2;

    @FXML
    private TextField txtSurface2;

    @FXML
    private ComboBox<String> cboLongeur1;

    @FXML
    private ComboBox<String> cboVolume2;

    @FXML
    private Text txtAcceuil;

    @FXML
    private TextField txtLongeur2;

    @FXML
    private TextField txtLongeur1;

    @FXML
    private ComboBox<String> cboSurface1;

    @FXML
    private Text txtBienvenue;

    @FXML
    private ComboBox<String> cboSurface2;

    @FXML
    private ComboBox<String> cboMasse2;

    @FXML
    private ComboBox<String> cboMasse1;
    //ONGLET VOLUME
    //formation de la liste ComboBox 
    @FXML
    private ObservableList<String> liste1=(ObservableList<String>) FXCollections.observableArrayList("mm cubes","cm cubes","pouces cubes","m cubes","pieds cubes");

    //les proportions entre unités
    double[]volume= {100000000, 100000000, 61023.7,1.0, 35.3147};
   
    @Override
    public void initialize(URL location, ResourceBundle resources)
{
	cboVolume1.setItems(liste1);
	cboVolume2.setItems(liste1);
	cboVolume1.getSelectionModel().selectFirst();
	cboVolume2.getSelectionModel().selectFirst();
}
  //calculs
@FXML 
void calculer()
{
	convertir1(txtVolume1,txtVolume2,cboVolume1,cboVolume2);
} 

@FXML 
void calculer1()
{
	convertir1(txtVolume2,txtVolume1,cboVolume2,cboVolume1);
}

public void convertir1(TextField txtVolume1,TextField txtVolume2, ComboBox<String> cboVolume1, ComboBox<String> cboVolume2)
{
	int item1=cboVolume1.getSelectionModel().getSelectedIndex();
	int item2=cboVolume2.getSelectionModel().getSelectedIndex();
	double taux=volume[item2]/volume[item1];
	double res=taux*(Double.parseDouble(txtVolume1.getText()));
	txtVolume2.setText(String.format("%.2f", res));
}

//ONGLET LONGEUR
//formation de la liste ComboBox 
@FXML
private ObservableList<String> liste2=(ObservableList<String>) FXCollections.observableArrayList("mm","cm","pouces","m","pieds");

//proportions entre unités
double[]longeur= {1000, 100, 39.3701, 1, 3.28084};

{
cboLongeur1.setItems(liste2);
cboLongeur2.setItems(liste2);
cboLongeur1.getSelectionModel().selectFirst();
cboLongeur2.getSelectionModel().selectFirst();
}
//calculs
@FXML 
void calculer3()
{
	convertir3(txtLongeur1,txtLongeur2,cboLongeur1,cboLongeur2);
} 

@FXML 
void calculer4()
{
	convertir3(txtLongeur2,txtLongeur1,cboLongeur2,cboLongeur1);
} 

public void convertir3(TextField txtLongeur1,TextField txtLongeur2, ComboBox<String> cboLongeur1, ComboBox<String> cboLongeur2)
{
	int item1=cboLongeur1.getSelectionModel().getSelectedIndex();
	int item2=cboLongeur2.getSelectionModel().getSelectedIndex();
	double taux=longeur[item2]/longeur[item1];
	double res=taux*(Double.parseDouble(txtLongeur1.getText()));
	txtLongeur2.setText(String.format("%.2f", res));
}

//ONGLET SURFACE
//formation de la liste ComboBox 

private ObservableList<String> liste3=(ObservableList<String>) FXCollections.observableArrayList("mm carrées","cm carrées","pouces carrées","m carrés","pieds carrées");

//proportions entre unités
double[]surface= {1000, 100, 39.3701, 1, 3.28084};

{
cboSurface1.setItems(liste3);
cboSurface2.setItems(liste3);
cboSurface1.getSelectionModel().selectFirst();
cboSurface2.getSelectionModel().selectFirst();
}
//calculs
@FXML 
void calculer5()
{
	convertir2(txtSurface1,txtSurface2,cboSurface1,cboSurface2);
} 

@FXML 
void calculer6()
{
	convertir2(txtSurface2,txtSurface1,cboSurface2,cboSurface1);
} 

public void convertir2(TextField txtSurface1,TextField txtSurface2, ComboBox<String> cboSurface1, ComboBox<String> cboSurface2)
{
	int item1=cboSurface1.getSelectionModel().getSelectedIndex();
	int item2=cboSurface2.getSelectionModel().getSelectedIndex();
	double taux=surface[item2]/surface[item1];
	double res=taux*(Double.parseDouble(txtSurface1.getText()));
	txtSurface2.setText(String.format("%.2f", res));
}}












