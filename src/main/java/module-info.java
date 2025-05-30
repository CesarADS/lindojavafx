module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.example.demofx to javafx.fxml;
    opens com.example.demofx.model to org.hibernate.orm.core;

    exports com.example.demofx;
}