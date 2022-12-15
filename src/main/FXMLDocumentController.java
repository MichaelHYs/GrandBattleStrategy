/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JComboBox;

/**
 *
 * @author LENOVO
 */
public class FXMLDocumentController implements Initializable {

    public static dbAdvisorModel dtAm = new dbAdvisorModel();
    public static dbMarshalModel dtMa = new dbMarshalModel();
    public static dbStaffModel dtSt = new dbStaffModel();

    @FXML
    private Label turn;
    @FXML
    private Label date;
    @FXML
    private Button civ;
    @FXML
    private Button mil;
    @FXML
    private Label news;
    @FXML
    private Button supply;
    @FXML
    private Button worker;
    @FXML
    private Label div_fra;
    @FXML
    private Label div_ger;
    @FXML
    private Label div_gbr;
    @FXML
    private Label div_bel;
    @FXML
    private Label div_lux;
    @FXML
    private Label div_ita;
    @FXML
    private Label div_swi;
    @FXML
    private Label total_stb;
    @FXML
    private Label total_supply;
    @FXML
    private Label total_civ;
    @FXML
    private Label total_mil;
    @FXML
    private Label count_civ;
    @FXML
    private Label count_mil;
    @FXML
    private Label count_supply;
    @FXML
    private Label count_stb;
    @FXML
    private Button next_turn;
    @FXML
    private Button state_fra;
    @FXML
    private Button state_ger;
    @FXML
    private Button state_gbr;
    @FXML
    private Button state_pol;
    @FXML
    private Button state_bel;
    @FXML
    private Button state_lux;
    @FXML
    private Button state_ita;
    @FXML
    private Button state_swi;
    @FXML
    private Button state_dutch;
    @FXML
    private Label div_dutch;
    LocalDate d = LocalDate.parse("1936-01-01");
    LocalDate gDate = d;
    LocalDate nd = LocalDate.parse("1936-01-01");
    LocalDate nnDate = nd;
    int y = 0;
    int k = 0;
    int s = 0;
    int t = 0;
    int m = 0;

    int a = 0;
    int b = 0;
    int c = 0;
    int e = 0;
    @FXML
    private ComboBox<String> cmbCA;
    @FXML
    private ComboBox<String> cmbFM;
    @FXML
    private ComboBox<String> cmbMS;
    @FXML
    private Label nDate;
    dbAdvisorModel dt = new dbAdvisorModel();
    @FXML
    private Label efCCiv;
    @FXML
    private Label efCMil;
    @FXML
    private Label efCSup;
    @FXML
    private Label efCStb;
    int xefCCiv = 0;
    int xefCMil = 0;
    int xefCSup = 0;
    int xefCStb = 0;

    int yefCCiv = 0;
    int yefCMil = 0;
    int yefCSup = 0;
    int yefCStb = 0;

    int zefCCiv = 0;
    int zefCMil = 0;
    int zefCSup = 0;
    int zefCStb = 0;
    @FXML
    private Button state_chec;
    @FXML
    private Button state_hun;
    @FXML
    private Button state_aus;
    @FXML
    private Button state_ussr;
    @FXML
    private Button state_est;
    @FXML
    private Button state_lat;
    @FXML
    private Button state_lit;
    @FXML
    private Button state_swe;
    @FXML
    private Button state_den;
    @FXML
    private Button state_nor;
    @FXML
    private Button state_ire;
    @FXML
    private Label div_ussr;
    @FXML
    private Button state_yug;
    @FXML
    private Button state_bul;
    @FXML
    private Button state_yun;
    @FXML
    private Button state_alb;
    @FXML
    private Label div_yug;
    @FXML
    private Label div_alb;
    @FXML
    private Label div_yun;
    @FXML
    private Label div_bul;
    @FXML
    private Label div_rom;
    @FXML
    private Button state_rom;
    @FXML
    private Button state_tur;
    @FXML
    private Label div_swe;
    @FXML
    private Label div_nor;
    @FXML
    private Label div_tur;
    @FXML
    private Button state_fin;
    @FXML
    private Label div_fin;
    @FXML
    private Button state_spa;
    @FXML
    private Button state_por;
    @FXML
    private Label div_spa;
    @FXML
    private Label div_por;
    @FXML
    private Label div_den;
    @FXML
    private Label div_pol;
    @FXML
    private Label div_chec;
    @FXML
    private Label div_hun;
    @FXML
    private Label div_aus;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String s = String.valueOf(gDate);
        String ns = String.valueOf(nnDate);
        date.setText(s);
        nDate.setText(ns);
//        loadCmbAd();
//        loadCmbFm();
//        loadCmbMs();
        countEffect();
        cmbCA.setOnAction(this::cntAd);
        cmbMS.setOnAction(this::cntMs);
        cmbFM.setOnAction(this::cntFm);
        efCCiv.setText(String.valueOf(xefCCiv));
        efCMil.setText(String.valueOf(xefCMil));
        efCSup.setText(String.valueOf(xefCSup));
        efCStb.setText(String.valueOf(xefCStb));

        efCCiv.setText(String.valueOf(yefCCiv));
        efCMil.setText(String.valueOf(yefCMil));
        efCSup.setText(String.valueOf(yefCSup));
        efCStb.setText(String.valueOf(yefCStb));

        efCCiv.setText(String.valueOf(zefCCiv));
        efCMil.setText(String.valueOf(zefCMil));
        efCSup.setText(String.valueOf(zefCSup));
        efCStb.setText(String.valueOf(zefCStb));

        countAllEffect();
        //publivc void prhitungan
    }

    public void countEffect() {
//        advisor
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from advisor");
            while (rs.next()) {
                dbAdvisorModel aM = new dbAdvisorModel();
                aM.setName(rs.getString("name"));
                aM.setEffectCiv(rs.getInt("effectCiv"));
                aM.setEffectMil(rs.getInt("effectMil"));
                aM.setEffectSup(rs.getInt("effectSup"));
                aM.setEffectStb(rs.getInt("effectStb"));
                cmbCA.getItems().addAll(aM.getName());
//                xefCCiv = xefCCiv+aM.getEffectCiv();
//                xefCMil = xefCMil+aM.getEffectMil();
//                xefCSup = xefCSup+aM.getEffectSup();
//                xefCStb = xefCStb+aM.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        loadMarshal
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from marshal");
            while (rs.next()) {
                dbMarshalModel Fm = new dbMarshalModel();
                Fm.setName(rs.getString("name"));
                Fm.setEffectCiv(rs.getInt("effectCiv"));
                Fm.setEffectMil(rs.getInt("effectMil"));
                Fm.setEffectSup(rs.getInt("effectSup"));
                Fm.setEffectStb(rs.getInt("effectStb"));
                cmbFM.getItems().addAll(Fm.getName());

//                xefCCiv = xefCCiv+Fm.getEffectCiv();
//                xefCMil = xefCMil+Fm.getEffectMil();
//                xefCSup = xefCSup+Fm.getEffectSup();
//                xefCStb = xefCStb+Fm.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        staff
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from staff");
            while (rs.next()) {
                dbStaffModel Ms = new dbStaffModel();
                Ms.setName(rs.getString("name"));
                Ms.setEffectCiv(rs.getInt("effectCiv"));
                Ms.setEffectMil(rs.getInt("effectMil"));
                Ms.setEffectSup(rs.getInt("effectSup"));
                Ms.setEffectStb(rs.getInt("effectStb"));
                cmbMS.getItems().addAll(Ms.getName());

//                xefCCiv = xefCCiv+Ms.getEffectCiv();
//                xefCMil = xefCMil+Ms.getEffectMil();
//                xefCSup = xefCSup+Ms.getEffectSup();
//                xefCStb = xefCStb+Ms.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void endTurn() {
//        game date
        gDate = gDate.plusMonths(1);
        String s = String.valueOf(gDate);
        date.setText(s);
//        news date
        nnDate = nnDate.plusMonths(1);
        String ns = String.valueOf(nnDate);
        nDate.setText(ns);

        System.out.println(date);
        y++;
        String t = String.valueOf(y);
        turn.setText(t);
        System.out.println(turn);
    }

    public void mekanikNation() {

    }

    @FXML
    private void act_civ(ActionEvent event) {
        endTurn();
        countAllEffect();
        String bcc = total_civ.getText();
        int cc = Integer.parseInt(bcc);
        k++;
        String pCiv = String.valueOf(k);
        total_civ.setText(pCiv);
        String nbcc = total_civ.getText();
        int ncc = Integer.parseInt(nbcc);
//        System.out.println(nbcc);
        int nncc = ncc + a;
        System.out.println(nncc);
        String npCiv = String.valueOf(ncc);
        total_civ.setText(npCiv);
        int pcCiv = Integer.parseInt(pCiv);
        int fcCiv = pcCiv - cc;
        String scCiv = String.valueOf(fcCiv);
        count_civ.setText(scCiv);
    }

    @FXML
    private void act_mil(ActionEvent event) {
        endTurn();
        String bcm = total_mil.getText();
        int cm = Integer.parseInt(bcm);
        m++;
        String pMil = String.valueOf(m);
        total_mil.setText(pMil);
        int pcMil = Integer.parseInt(pMil);
        int fcMil = pcMil - cm;
        String scMil = String.valueOf(fcMil);
        count_mil.setText(scMil);
    }

    @FXML
    private void act_supply(ActionEvent event) {
        endTurn();
        String bcp = total_supply.getText();
        int cp = Integer.parseInt(bcp);
        t++;
        String pSup = String.valueOf(t);
        total_supply.setText(pSup);
        int pcSup = Integer.parseInt(pSup);
        int fcSup = pcSup - cp;
        String scSup = String.valueOf(fcSup);
        count_supply.setText(scSup);
    }

    @FXML
    private void act_worker(ActionEvent event) {
        endTurn();
        countAllEffect();
        String bcs = total_stb.getText();
        int cs = Integer.parseInt(bcs);
        s++;
        String pWor = String.valueOf(s);
        total_stb.setText(pWor);
        int pcStb = Integer.parseInt(pWor);
        int fcStb = pcStb - cs;
        String scStb = String.valueOf(fcStb);
        count_stb.setText(scStb);
    }

    @FXML
    private void next_turn(ActionEvent event) {
        endTurn();
    }

    @FXML
    private void cntAd(ActionEvent event) {
        String getAd = cmbCA.getValue();
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from advisor where name = '" + getAd + "'");

            while (rs.next()) {
                dbAdvisorModel aM = new dbAdvisorModel();
                aM.setName(rs.getString("name"));
                aM.setEffectCiv(rs.getInt("effectCiv"));
                aM.setEffectMil(rs.getInt("effectMil"));
                aM.setEffectSup(rs.getInt("effectSup"));
                aM.setEffectStb(rs.getInt("effectStb"));
//                cmbCA.getItems().addAll(aM.getName());
                xefCCiv = aM.getEffectCiv();
                xefCMil = aM.getEffectMil();
                xefCSup = aM.getEffectSup();
                xefCStb = aM.getEffectStb();
//                xefCCiv = xefCCiv+aM.getEffectCiv();
//                xefCMil = xefCMil+aM.getEffectMil();
//                xefCSup = xefCSup+aM.getEffectSup();
//                xefCStb = xefCStb+aM.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
                countAllEffect();
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void cntFm(ActionEvent event) {
        String getAd = cmbFM.getValue();
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from marshal where name = '" + getAd + "'");

            while (rs.next()) {
                dbMarshalModel Fm = new dbMarshalModel();
                Fm.setName(rs.getString("name"));
                Fm.setEffectCiv(rs.getInt("effectCiv"));
                Fm.setEffectMil(rs.getInt("effectMil"));
                Fm.setEffectSup(rs.getInt("effectSup"));
                Fm.setEffectStb(rs.getInt("effectStb"));
//                cmbFM.getItems().addAll(aM.getName());
                xefCCiv = Fm.getEffectCiv();
                xefCMil = Fm.getEffectMil();
                xefCSup = Fm.getEffectSup();
                xefCStb = Fm.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
                countAllEffect();
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void cntMs(ActionEvent event) {
        String getAd = cmbMS.getValue();
        try {
            koneksi con = new koneksi();
            con.bukakoneksi();
            con.statement = con.dbkoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery(
                    "Select * from staff where name = '" + getAd + "'");

            while (rs.next()) {
                dbStaffModel Ms = new dbStaffModel();
                Ms.setName(rs.getString("name"));
                Ms.setEffectCiv(rs.getInt("effectCiv"));
                Ms.setEffectMil(rs.getInt("effectMil"));
                Ms.setEffectSup(rs.getInt("effectSup"));
                Ms.setEffectStb(rs.getInt("effectStb"));
//                cmbMS.getItems().addAll(aM.getName());
                xefCCiv = Ms.getEffectCiv();
                xefCMil = Ms.getEffectMil();
                xefCSup = Ms.getEffectSup();
                xefCStb = Ms.getEffectStb();
//                efCCiv.setText(String.valueOf(xefCCiv));
//                efCMil.setText(String.valueOf(xefCMil));
//                efCSup.setText(String.valueOf(xefCSup));
//                efCStb.setText(String.valueOf(xefCStb));
                countAllEffect();
            }

            con.tutupkoneksi();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void countAllEffect() {
        a = xefCCiv + yefCCiv + zefCCiv;
        b = xefCMil + yefCMil + zefCMil;
        c = xefCSup + yefCSup + zefCSup;
        e = xefCStb + yefCStb + zefCStb;
        efCCiv.setText(String.valueOf(a));
        efCMil.setText(String.valueOf(b));
        efCSup.setText(String.valueOf(c));
        efCStb.setText(String.valueOf(e));
    }

    public void arrayTetanggaNegara() {
        String wnGer[][] = {
            {"state_ger", "state_swi", "state_ita", "state_lux", "state_dutch", "state_fra", "state_bel"}
        };
        String wnPol[][] = {
            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
        };
        String wnFra[][] = {
            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
        };
        String wnSwi[][] = {
            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
//        String wnPol[][] = {
//            {"state_lit", "state_ussr", "state_chec", "state_rom", "state_ger"}
//        };
    }

    public void gameOver() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_gameOver.fxml"));
            Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            Stage stg = new Stage();
            stg.initModality(Modality.APPLICATION_MODAL);
            stg.setResizable(false);
            stg.setIconified(false);
            stg.setScene(scene);
            stg.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeBtn() {

    }

    @FXML
    private void atk_fra(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_fra":
                String fra = div_ger.getText();
                String frb = div_fra.getText();
                int nfra = Integer.parseInt(fra);
                int nfrb = Integer.parseInt(frb);
                int akfra = nfra - nfrb;
                int akfrb = nfrb - nfra;
                String sfra = String.valueOf(akfra);
                String sfrb = String.valueOf(akfrb);
                div_ger.setText(sfra);
                div_fra.setText(sfrb);

                if (akfra <= 0) {
                    gameOver();
                } else if (akfrb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_gbr(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_gbr":
                String a = div_ger.getText();
                String b = div_gbr.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_gbr.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_pol(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_pol.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_pol.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_bel(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_bel.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_bel.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_dutch(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_dutch.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_dutch.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_lux(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_lux.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_lux.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_ita(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_ita.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_ita.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_chec(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_chec.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_chec.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_hun(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_hun.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_hun.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_aus(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        switch (id) {
            case "state_pol":
                String a = div_ger.getText();
                String b = div_aus.getText();
                int na = Integer.parseInt(a);
                int nb = Integer.parseInt(b);
                int aka = na - nb;
                int akb = nb - na;
                String sa = String.valueOf(aka);
                String sb = String.valueOf(akb);
                div_ger.setText(sa);
                div_aus.setText(sb);

                if (aka <= 0) {
                    gameOver();
                } else if (akb <= 0) {
                    btn.setVisible(false);
                }
                break;
        }
    }

    @FXML
    private void atk_ussr(ActionEvent event) {
    }

    @FXML
    private void atk_est(ActionEvent event) {
    }

    @FXML
    private void atk_lat(ActionEvent event) {
    }

    @FXML
    private void atk_lit(ActionEvent event) {
    }

    @FXML
    private void atk_yug(ActionEvent event) {
    }

    @FXML
    private void atk_bul(ActionEvent event) {
    }

    @FXML
    private void atk_yun(ActionEvent event) {
    }

    @FXML
    private void atk_alb(ActionEvent event) {
    }

    @FXML
    private void atk_rom(ActionEvent event) {
    }

    @FXML
    private void atk_swe(ActionEvent event) {
    }

    @FXML
    private void atk_nor(ActionEvent event) {
    }

    @FXML
    private void atk_tur(ActionEvent event) {
    }

    @FXML
    private void atk_fin(ActionEvent event) {
    }

    @FXML
    private void atk_swi(ActionEvent event) {
    }

    @FXML
    private void atk_den(ActionEvent event) {
    }

    @FXML
    private void atk_spa(ActionEvent event) {
    }

    @FXML
    private void atk_ire(ActionEvent event) {
    }

    @FXML
    private void atk_por(ActionEvent event) {
    }
}
