package view.backing;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.context.AdfFacesContext;

public class DynamicForm {
    private RichGridCell gc1;
    private RichGridRow gr1;
    private RichGridCell gc2;
    private RichGridRow gr2;
    private RichPanelGridLayout pgl1;
    private RichForm f1;
    private RichDocument d1;
//    private RichPanelFormLayout pfl1;
    
    private boolean isReadOnly;

    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public boolean isIsReadOnly() {
        return isReadOnly;
    }

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
    
    public void enableForm(ActionEvent e){
        setIsReadOnly(false);
        AdfFacesContext.getCurrentInstance().addPartialTarget(f1);
    }
    
    public void disableForm(ActionEvent e){
        setIsReadOnly(true);
        AdfFacesContext.getCurrentInstance().addPartialTarget(f1);
    }
}
