/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dzU
 */
public class dzu_0
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
        String string = "skillProgressBarBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setScaled(true);
        fys_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(2);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(2);
        fze2.setX(822);
        fze2.setY(424);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        String string2 = "skillProgressBarBorder";
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkh_12);
        }
        fys_02.X(fkh_12);
        fkh_12.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(20);
        fze3.setPosition(fzw_0.tKY);
        fze3.setTexture(this.okR.uF("themeSimple2"));
        fze3.setWidth(32);
        fze3.setX(790);
        fze3.setY(404);
        fkh_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(20);
        fze4.setPosition(fzw_0.tLa);
        fze4.setTexture(this.okR.uF("themeSimple2"));
        fze4.setWidth(4);
        fze4.setX(822);
        fze4.setY(404);
        fkh_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(20);
        fze5.setPosition(fzw_0.tLc);
        fze5.setTexture(this.okR.uF("themeSimple2"));
        fze5.setWidth(28);
        fze5.setX(826);
        fze5.setY(404);
        fkh_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(2);
        fze6.setPosition(fzw_0.tLh);
        fze6.setTexture(this.okR.uF("themeSimple2"));
        fze6.setWidth(28);
        fze6.setX(826);
        fze6.setY(424);
        fkh_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(20);
        fze7.setPosition(fzw_0.tLo);
        fze7.setTexture(this.okR.uF("themeSimple2"));
        fze7.setWidth(28);
        fze7.setX(826);
        fze7.setY(426);
        fkh_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(20);
        fze8.setPosition(fzw_0.tLm);
        fze8.setTexture(this.okR.uF("themeSimple2"));
        fze8.setWidth(4);
        fze8.setX(822);
        fze8.setY(426);
        fkh_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(20);
        fze9.setPosition(fzw_0.tLk);
        fze9.setTexture(this.okR.uF("themeSimple2"));
        fze9.setWidth(32);
        fze9.setX(790);
        fze9.setY(426);
        fkh_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(2);
        fze10.setPosition(fzw_0.tLf);
        fze10.setTexture(this.okR.uF("themeSimple2"));
        fze10.setWidth(32);
        fze10.setX(790);
        fze10.setY(424);
        fkh_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkh_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

