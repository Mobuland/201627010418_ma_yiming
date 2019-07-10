package cn.edu.scau.cmi.mayiming.Comprehensive_experiment;

import cn.edu.scau.cmi.mayiming.singleton.Index;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class controller {

    @FXML
    private Button single;

    @FXML
    private Button Factory_method;

    @FXML
    private Button Abstract_factory;

    @FXML
    private Button Simple_factory;

    @FXML
    private Button Class_adapter;

    @FXML
    private Button Object_adapter;

    @FXML
    private Button one;

    @FXML
    private Button Safe;

    @FXML
    void single(ActionEvent event) throws Exception {
        Index index = new Index();
        index.start(new Stage());
    }

    @FXML
    void Simple_factory(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.FactoryMode.simpleFactoryMethod.Index index= new cn.edu.scau.cmi.mayiming.FactoryMode.simpleFactoryMethod.Index();
        index.start(new Stage());
    }


    @FXML
    void Factory_method(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.FactoryMode.factoryMethod.Index index = new cn.edu.scau.cmi.mayiming.FactoryMode.factoryMethod.Index();
        index.start(new Stage());
    }

    @FXML
    void Abstract_factory(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.Index  index = new cn.edu.scau.cmi.mayiming.FactoryMode.abstractFactory.Index();
        index.start(new Stage());
    }

    @FXML
    void Class_adapter(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.Adapter.classAdapter.Index index = new cn.edu.scau.cmi.mayiming.Adapter.classAdapter.Index();
        index.start(new Stage());
    }

    @FXML
    void Object_adapter(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.Adapter.objectAdapter.Index index = new cn.edu.scau.cmi.mayiming.Adapter.objectAdapter.Index();
        index.start(new Stage());
    }

    @FXML
    void Safe(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.composite.safeComposite.Index index = new cn.edu.scau.cmi.mayiming.composite.safeComposite.Index();
        index.start(new Stage());
    }

    @FXML
    void one(ActionEvent event) throws Exception {
        cn.edu.scau.cmi.mayiming.composite.transparentComposite.Index index = new cn.edu.scau.cmi.mayiming.composite.transparentComposite.Index();
        index.start(new Stage());
    }

}

