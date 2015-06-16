package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/*
 * Validação de dados
 * 		Nesta atividade vamos usar a scene criada no exercicio 8
 * 		para na região central criar text fields a ser preenchidos
 * 		por text, numeros e email e onde a ação de um botão irá
 * 		validadr os dados ai inseridos, atrabes de metodos da classe global utils
 * 
 * 		PAsso 1: copiar a classe main do exercicio anterior 8
 * 		Passo 2: criar os graficos
 * 				-criar um set de layouts que permita dispor as seguitnes labels e textfields
 * 				-Numero fiscal, nome, morada, cidade, cpostal, data de nascimento
 * 		Passo 3:criar 2 botoes: validar e cancelar(Fecha o pprograma)
 * 		Passo 3:O projeto estara disponivel em Share repo
 * 				Formar grupos de 2.
 * 				Todos os erros de validação devem ser comnicados via alertbox da utils.
 * */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//TOP layout
			HBox layoutTop = new HBox(10);			//CRIA O LAYOUT hBOX COM 20 PX ESPACAMENTO ENTRE OBJETOS
			layoutTop.setBackground(null); 
			layoutTop.setPadding(new Insets(15, 12, 15, 12));	//DISTANCIA DETE LAYOUT AO ROOT LAYOUT
			layoutTop.setStyle("-fx-background-color: #336699;");
			
			Button btnTopMenu1 = new Button("File");
			Button btnTopMenu2 = new Button("Edit");
			Button btnTopMenu3 = new Button("View");
			layoutTop.getChildren().addAll(btnTopMenu1, btnTopMenu2, btnTopMenu3);
			
			//leftLayout - Menu
			VBox layoutLeft = new VBox(10);
			layoutLeft.setBackground(null); 
			layoutLeft.setPadding(new Insets(15, 12, 15, 12));	//DISTANCIA DETE LAYOUT AO ROOT LAYOUT
			layoutLeft.setStyle("-fx-background-color: #336633;");
			
			
			Button btnLeftMenu1 = new Button("opção1");
			Button btnLeftMenu2 = new Button("opção2");
			Button btnLeftMenu3 = new Button("opção3");
			layoutLeft.getChildren().addAll(btnLeftMenu1, btnLeftMenu2, btnLeftMenu3);
			
			/* because manias 
			 * 
			 * //centerlayout
			VBox LayoutCenter = new VBox(10);
			LayoutCenter.setBackground(null);
			LayoutCenter.setPadding(new Insets(15, 12, 15, 12));	//DISTANCIA DETE LAYOUT AO ROOT LAYOUT
			LayoutCenter.setStyle("-fx-background-color: #336633;");
			
			Label labelNrFiscal = new Label("Numero Fiscal");
			LayoutCenter.getChildren().addAll(labelNrFiscal);
			*/
			
			BorderPane root = new BorderPane();
			root.setTop(layoutTop);
			root.setLeft(layoutLeft);
			//root.setCenter(LayoutCenter);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}