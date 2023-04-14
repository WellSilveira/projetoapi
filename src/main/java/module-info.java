module com.example.projeto_api_dio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projeto_api_dio to javafx.fxml;
    exports com.example.projeto_api_dio;
}