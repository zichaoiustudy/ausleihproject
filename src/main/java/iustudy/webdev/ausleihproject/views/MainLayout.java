package iustudy.webdev.ausleihproject.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/styles.css")
public class MainLayout extends AppLayout {
    SearchView searchView;

    public MainLayout(SearchView searchView) {
        createHeader();
        this.searchView = searchView;
    }

    private void createHeader() {
        H3 logo = new H3("IU Webprogrammierung | GeräteAusleih");
        logo.addClassName("clickable");
        logo.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("/");
            searchView.refreshSearchResult();
        });

        Button userSwitch = new Button("Admin", e -> switchToAdmin());

        var header = new HorizontalLayout(logo, userSwitch);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidthFull();
        addToNavbar(header);
    }

    private void switchToAdmin() {

    }
}