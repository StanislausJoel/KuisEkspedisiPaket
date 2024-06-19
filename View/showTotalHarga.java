package View;

import Controller.PaketController;
import Main.Main;

public class showTotalHarga {

    public showTotalHarga() {

        showTotal();

    }

    public void showTotal() {

        System.out.println("Grand total : " + PaketController.getTotal(Main.listPaket)); 

    }

}
