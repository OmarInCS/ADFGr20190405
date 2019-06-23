package view.backing;

import java.util.Map;

import javax.faces.context.FacesContext;

import model.modules.AppModuleAMImpl;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class Login {
    private RichGridCell gc1;
    private RichGridRow gr1;
    private RichGridCell gc2;
    private RichGridRow gr2;
    private RichPanelGridLayout pgl1;
    private RichForm f1;
    private RichDocument d1;
    private RichInputText it1;
    private RichInputText it2;
    private RichButton b1;
    
    private String username;
    private String password;
    private String msg;
    private RichOutputText ot1;

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setPgl1(RichPanelGridLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGridLayout getPgl1() {
        return pgl1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public String b1_action() {
        // Add event code here...
        ApplicationModule am = Configuration.
            createRootApplicationModule("model.modules.AppModuleAM", "AppModuleAMLocal");
        AppModuleAMImpl my_am = (AppModuleAMImpl) am;
        System.out.println("### " + username + " ### " + password + " ###");
        if(my_am.findUser(username, password) == "true"){
            msg = "Login Success";
            FacesContext ctx = FacesContext.getCurrentInstance();
            Map sm = ctx.getExternalContext().getSessionMap();
            sm.put("user", username);
            return "toWelcome";
        }
        else{
            msg = "Login Failed";
        }
        
        return null;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }
}
