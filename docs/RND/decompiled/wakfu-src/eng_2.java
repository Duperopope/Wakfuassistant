/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from eng
 */
public class eng_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(0, 5, 0, 0));
        fes_22.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fes_2 fes_23 = fes_22;
        fzq fzq2 = (fzq)fes_23.getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlignment(faa_2.tLO);
        fzq2.setState("default");
        fes_22.X(fzq2);
        fzq2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontTitle12"));
        fyW2.setElementMap(fhs_23);
        fzq2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("defaultDarkColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        String string = "characterBookLabelBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setScaled(true);
        fzq2.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(15);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(208);
        fze2.setX(1718);
        fze2.setY(23);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        String string2 = "characterBookLabelBorder";
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkh_12);
        }
        fzq2.X(fkh_12);
        fkh_12.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(4);
        fze3.setPosition(fzw_0.tKY);
        fze3.setTexture(this.okR.uF("themeSimple2"));
        fze3.setWidth(4);
        fze3.setX(1714);
        fze3.setY(19);
        fkh_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(4);
        fze4.setPosition(fzw_0.tLa);
        fze4.setTexture(this.okR.uF("themeSimple2"));
        fze4.setWidth(208);
        fze4.setX(1718);
        fze4.setY(19);
        fkh_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(4);
        fze5.setPosition(fzw_0.tLc);
        fze5.setTexture(this.okR.uF("themeSimple2"));
        fze5.setWidth(4);
        fze5.setX(1926);
        fze5.setY(19);
        fkh_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(15);
        fze6.setPosition(fzw_0.tLh);
        fze6.setTexture(this.okR.uF("themeSimple2"));
        fze6.setWidth(4);
        fze6.setX(1926);
        fze6.setY(23);
        fkh_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(4);
        fze7.setPosition(fzw_0.tLo);
        fze7.setTexture(this.okR.uF("themeSimple2"));
        fze7.setWidth(4);
        fze7.setX(1926);
        fze7.setY(38);
        fkh_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(4);
        fze8.setPosition(fzw_0.tLm);
        fze8.setTexture(this.okR.uF("themeSimple2"));
        fze8.setWidth(204);
        fze8.setX(1718);
        fze8.setY(38);
        fkh_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(4);
        fze9.setPosition(fzw_0.tLk);
        fze9.setTexture(this.okR.uF("themeSimple2"));
        fze9.setWidth(4);
        fze9.setX(1714);
        fze9.setY(38);
        fkh_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(15);
        fze10.setPosition(fzw_0.tLf);
        fze10.setTexture(this.okR.uF("themeSimple2"));
        fze10.setWidth(4);
        fze10.setX(1714);
        fze10.setY(23);
        fkh_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkh_12.onChildrenAdded();
        fzq2.onChildrenAdded();
    }
}

