/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dBd
 */
public class dbd_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fys_0 fys_02 = fes_23.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(3, 3, 3, 3));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        String string = "titleBarBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setScaled(true);
        fys_02.X(fkd_12);
        fkd_12.guy();
        String string2 = "titleBarNorthWest";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze2);
        }
        fze2.setHeight(10);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(7);
        fze2.setX(126);
        fze2.setY(250);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        String string3 = "titleBarNorth";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze3);
        }
        fze3.setHeight(10);
        fze3.setPosition(fzw_0.tLa);
        fze3.setTexture(this.okR.uF("themeSimple2"));
        fze3.setWidth(1);
        fze3.setX(137);
        fze3.setY(250);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        String string4 = "titleBarNorthEast";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze4);
        }
        fze4.setFlipHorizontaly(true);
        fze4.setHeight(10);
        fze4.setPosition(fzw_0.tLc);
        fze4.setTexture(this.okR.uF("themeSimple2"));
        fze4.setWidth(7);
        fze4.setX(126);
        fze4.setY(250);
        fkd_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        String string5 = "titleBarWest";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze5);
        }
        fze5.setHeight(1);
        fze5.setPosition(fzw_0.tLf);
        fze5.setTexture(this.okR.uF("themeSimple2"));
        fze5.setWidth(7);
        fze5.setX(126);
        fze5.setY(261);
        fkd_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        String string6 = "titleBarCenter";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze6);
        }
        fze6.setHeight(1);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("themeSimple2"));
        fze6.setWidth(1);
        fze6.setX(137);
        fze6.setY(261);
        fkd_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        String string7 = "titleBarEast";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze7);
        }
        fze7.setFlipHorizontaly(true);
        fze7.setHeight(1);
        fze7.setPosition(fzw_0.tLh);
        fze7.setTexture(this.okR.uF("themeSimple2"));
        fze7.setWidth(7);
        fze7.setX(126);
        fze7.setY(261);
        fkd_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        String string8 = "titleBarSouthWest";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze8);
        }
        fze8.setHeight(12);
        fze8.setPosition(fzw_0.tLk);
        fze8.setTexture(this.okR.uF("themeSimple2"));
        fze8.setWidth(7);
        fze8.setX(126);
        fze8.setY(262);
        fkd_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        String string9 = "titleBarSouth";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string9 != null) {
            fhs_23.a(string9, fze9);
        }
        fze9.setHeight(12);
        fze9.setPosition(fzw_0.tLm);
        fze9.setTexture(this.okR.uF("themeSimple2"));
        fze9.setWidth(1);
        fze9.setX(137);
        fze9.setY(262);
        fkd_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        String string10 = "titleBarSouthEast";
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        if (fhs_23 != null && string10 != null) {
            fhs_23.a(string10, fze10);
        }
        fze10.setFlipHorizontaly(true);
        fze10.setHeight(12);
        fze10.setPosition(fzw_0.tLo);
        fze10.setTexture(this.okR.uF("themeSimple2"));
        fze10.setWidth(7);
        fze10.setX(126);
        fze10.setY(262);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

