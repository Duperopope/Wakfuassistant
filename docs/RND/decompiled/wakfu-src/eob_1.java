/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eob
 */
public class eob_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzq fzq2 = (fzq)fes_23.getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlignment(faa_2.tLO);
        fes_22.X(fzq2);
        fzq2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault10Bold"));
        fyW2.setElementMap(fhs_23);
        fzq2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("redColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        String string = "labelMoneyBorder";
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkh_12);
        }
        fzq2.X(fkh_12);
        fkh_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(6);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(26);
        fze2.setX(201);
        fze2.setY(426);
        fkh_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(6);
        fze3.setPosition(fzw_0.tLa);
        fze3.setTexture(this.okR.uF("themeSimple"));
        fze3.setWidth(1);
        fze3.setX(231);
        fze3.setY(426);
        fkh_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(6);
        fze4.setPosition(fzw_0.tLc);
        fze4.setTexture(this.okR.uF("themeSimple"));
        fze4.setWidth(26);
        fze4.setX(236);
        fze4.setY(426);
        fkh_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(11);
        fze5.setPosition(fzw_0.tLh);
        fze5.setTexture(this.okR.uF("themeSimple"));
        fze5.setWidth(26);
        fze5.setX(236);
        fze5.setY(432);
        fkh_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(6);
        fze6.setPosition(fzw_0.tLo);
        fze6.setTexture(this.okR.uF("themeSimple"));
        fze6.setWidth(26);
        fze6.setX(236);
        fze6.setY(443);
        fkh_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(6);
        fze7.setPosition(fzw_0.tLm);
        fze7.setTexture(this.okR.uF("themeSimple"));
        fze7.setWidth(1);
        fze7.setX(231);
        fze7.setY(443);
        fkh_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(6);
        fze8.setPosition(fzw_0.tLk);
        fze8.setTexture(this.okR.uF("themeSimple"));
        fze8.setWidth(26);
        fze8.setX(201);
        fze8.setY(443);
        fkh_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(11);
        fze9.setPosition(fzw_0.tLf);
        fze9.setTexture(this.okR.uF("themeSimple"));
        fze9.setWidth(26);
        fze9.setX(201);
        fze9.setY(432);
        fkh_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkh_12.onChildrenAdded();
        String string2 = "labelMoneyBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_12);
        }
        fkd_12.setScaled(true);
        fzq2.X(fkd_12);
        fkd_12.guy();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(11);
        fze10.setPosition(fzw_0.tLg);
        fze10.setTexture(this.okR.uF("themeSimple"));
        fze10.setWidth(1);
        fze10.setX(231);
        fze10.setY(432);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fzq2.onChildrenAdded();
    }
}

