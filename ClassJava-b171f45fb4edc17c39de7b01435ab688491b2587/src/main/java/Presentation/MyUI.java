package Presentation;

import Metier.Vehicule;
import Metier.Visiteur;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.client.widget.grid.selection.SelectionEvent;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.SelectionEvent.SelectionListener;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;

/**
 *
 */

public class MyUI extends UI {

    private final Grid contactList = new Grid();
    private final Table contactTable = new Table();

    @Override
    protected void init(VaadinRequest vaadinrequest) {
        configureComponents();  // configuration des composants
        buildLayout();          //  construction de la vue
    }

    private void configureComponents() {


        // Chargement des données.
        Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);

        contactList.setContainerDataSource(Vehicule.getVehicules());
        
        //contactList.setContainerDataSource(Visiteur.getVisiteur());

        //contactTable.setContainerDataSource(new BeanItemContainer<>( Vehicule.class));
        contactList.setColumnOrder("marque", "modele", "prix");  // choisir l'ordre des colonnes
        contactList.removeColumn("id");  // masquer la colonne
        //  contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        contactList.setSizeFull();
        
        Visiteur Visiteur1 = new Visiteur(1, "Arejdal", "Abdel","saint-Etienne", 42000);
        Visiteur Visiteur2 = new Visiteur(2, "Gallet", "Emile","Saint-Etienne", 42100);
        Visiteur Visiteur3 = new Visiteur(3, "Chiter", "Adem", "Saint-Etienne", 42000);
        contactList.setContainerDataSource(Visiteur.getVisiteur());

        //contactTable.setContainerDataSource(new BeanItemContainer<>( Vehicule.class));
        contactList.setColumnOrder("nom", "prenom", "adresse", "codePostal");  // choisir l'ordre des colonnes
        contactList.removeColumn("id");  // masquer la colonne
        //  contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        contactList.setSizeFull();
        

    }

    private void buildLayout() {

        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        // ajouts de composants
        layout.addComponent(new Label(" Parc de véhicule"));
        layout.addComponent(contactList);
        //layout.addComponent(contactTable);
        setContent(layout);  // affectation de la vue
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
