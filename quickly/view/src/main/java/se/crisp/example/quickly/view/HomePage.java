package se.crisp.example.quickly.view;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends BasePage<Object> {
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        add(new Link("nextPage") {
            @Override
            public void onClick() {
                setResponsePage(new MyNewPage("home"));
            }
        });
    }
}
