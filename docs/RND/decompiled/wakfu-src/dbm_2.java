/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dBm
 */
public class dbm_2
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
        String string = "pmbVerticalXpBarContainer";
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
        fze2.setHeight(9);
        fze2.setPosition(fzw_0.tLk);
        fze2.setRotation(asp_1.daf);
        fze2.setTexture(this.okR.uF("txXpBar"));
        fze2.setWidth(9);
        fze2.setX(0);
        fze2.setY(0);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(1);
        fze3.setPosition(fzw_0.tLm);
        fze3.setRotation(asp_1.daf);
        fze3.setTexture(this.okR.uF("txXpBar"));
        fze3.setWidth(9);
        fze3.setX(0);
        fze3.setY(10);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(9);
        fze4.setPosition(fzw_0.tLo);
        fze4.setRotation(asp_1.daf);
        fze4.setTexture(this.okR.uF("txXpBar"));
        fze4.setWidth(9);
        fze4.setX(0);
        fze4.setY(11);
        fkd_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(9);
        fze5.setPosition(fzw_0.tLf);
        fze5.setRotation(asp_1.daf);
        fze5.setTexture(this.okR.uF("txXpBar"));
        fze5.setWidth(1);
        fze5.setX(10);
        fze5.setY(0);
        fkd_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(1);
        fze6.setPosition(fzw_0.tLg);
        fze6.setRotation(asp_1.daf);
        fze6.setTexture(this.okR.uF("txXpBar"));
        fze6.setWidth(1);
        fze6.setX(10);
        fze6.setY(10);
        fkd_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(9);
        fze7.setPosition(fzw_0.tLh);
        fze7.setRotation(asp_1.daf);
        fze7.setTexture(this.okR.uF("txXpBar"));
        fze7.setWidth(1);
        fze7.setX(10);
        fze7.setY(11);
        fkd_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(9);
        fze8.setPosition(fzw_0.tKY);
        fze8.setRotation(asp_1.daf);
        fze8.setTexture(this.okR.uF("txXpBar"));
        fze8.setWidth(9);
        fze8.setX(11);
        fze8.setY(0);
        fkd_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(1);
        fze9.setPosition(fzw_0.tLa);
        fze9.setRotation(asp_1.daf);
        fze9.setTexture(this.okR.uF("txXpBar"));
        fze9.setWidth(9);
        fze9.setX(11);
        fze9.setY(10);
        fkd_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(9);
        fze10.setPosition(fzw_0.tLc);
        fze10.setRotation(asp_1.daf);
        fze10.setTexture(this.okR.uF("txXpBar"));
        fze10.setWidth(9);
        fze10.setX(11);
        fze10.setY(11);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

