module healthprojectdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens healthprojectdemo to javafx.fxml;
    exports healthprojectdemo;
    exports healthprojectdemo.controllers;
    exports healthprojectdemo.util;
    opens healthprojectdemo.controllers to javafx.fxml;
}