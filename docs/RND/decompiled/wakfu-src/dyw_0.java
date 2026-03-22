/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dyW
 */
public class dyw_0
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
        String string = "lockSpellBorder";
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkh_12);
        }
        fys_02.X(fkh_12);
        fkh_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(4);
        fze2.setPosition(fzw_0.tLk);
        fze2.setRotation(asp_1.daf);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(11);
        fze2.setX(1799);
        fze2.setY(306);
        fkh_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(4);
        fze3.setPosition(fzw_0.tLf);
        fze3.setRotation(asp_1.daf);
        fze3.setTexture(this.okR.uF("themeSimple2"));
        fze3.setWidth(1);
        fze3.setX(1814);
        fze3.setY(306);
        fkh_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setFlipHorizontaly(true);
        fze4.setHeight(4);
        fze4.setPosition(fzw_0.tKY);
        fze4.setRotation(asp_1.daf);
        fze4.setTexture(this.okR.uF("themeSimple2"));
        fze4.setWidth(11);
        fze4.setX(1799);
        fze4.setY(306);
        fkh_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setFlipHorizontaly(true);
        fze5.setHeight(1);
        fze5.setPosition(fzw_0.tLa);
        fze5.setRotation(asp_1.daf);
        fze5.setTexture(this.okR.uF("themeSimple2"));
        fze5.setWidth(11);
        fze5.setX(1799);
        fze5.setY(310);
        fkh_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setFlipHorizontaly(true);
        fze6.setHeight(19);
        fze6.setPosition(fzw_0.tLc);
        fze6.setRotation(asp_1.daf);
        fze6.setTexture(this.okR.uF("themeSimple2"));
        fze6.setWidth(11);
        fze6.setX(1799);
        fze6.setY(311);
        fkh_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(19);
        fze7.setPosition(fzw_0.tLh);
        fze7.setRotation(asp_1.daf);
        fze7.setTexture(this.okR.uF("themeSimple2"));
        fze7.setWidth(1);
        fze7.setX(1814);
        fze7.setY(311);
        fkh_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(19);
        fze8.setPosition(fzw_0.tLo);
        fze8.setRotation(asp_1.daf);
        fze8.setTexture(this.okR.uF("themeSimple2"));
        fze8.setWidth(11);
        fze8.setX(1799);
        fze8.setY(311);
        fkh_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(1);
        fze9.setPosition(fzw_0.tLm);
        fze9.setRotation(asp_1.daf);
        fze9.setTexture(this.okR.uF("themeSimple2"));
        fze9.setWidth(11);
        fze9.setX(1799);
        fze9.setY(310);
        fkh_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkh_12.onChildrenAdded();
        String string2 = "lockSpellBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_12);
        }
        fkd_12.setScaled(true);
        fys_02.X(fkd_12);
        fkd_12.guy();
        String string3 = "ambianceZoneBarCenter";
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze10);
        }
        fze10.setHeight(1);
        fze10.setPosition(fzw_0.tLg);
        fze10.setTexture(this.okR.uF("themeSimple2"));
        fze10.setWidth(1);
        fze10.setX(1814);
        fze10.setY(311);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

