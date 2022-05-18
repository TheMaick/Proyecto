package Controller;
import Model.Model;
import View.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Controller implements ActionListener{

    private Producto view;
    private Model model;
    
    DefaultTableModel model1;

    //Controlador
    public Controller(Producto view, Model model) {
        this.view = view;
        this.model = model;
        this.view.btnReg.addActionListener(this);
    }
    
    //Es para darle un titulo a la ventana y centrarla
    public void iniciar(){
        view.setTitle("ALTA DE PRODUCTOS");
        view.setLocationRelativeTo(null);
    }
    
    //metodo del boton de registrar para agregarlo a la tabla
    public void ActionPerformed(ActionEvent w){
        String info[] = new String[4];
        info[0] = model.setName(view.txtName.getName());
        info[1] = model.setEleccion((String) view.btneleccion.getSelectedItem());
        //info[2] = model.setAlmacen(view.txtAlmacen.get);
        //info[3] =model.setPrecio(view.TxtPrecio.g);
        

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
