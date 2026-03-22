/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dvw
 */
public class dvw_2
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
        String string = "blueWindowTextFrame";
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
        fze2.setHeight(38);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("themeSimple3"));
        fze2.setWidth(38);
        fze2.setX(429);
        fze2.setY(104);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(38);
        fze3.setPosition(fzw_0.tLa);
        fze3.setTexture(this.okR.uF("themeSimple3"));
        fze3.setWidth(1);
        fze3.setX(466);
        fze3.setY(104);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setFlipHorizontaly(true);
        fze4.setHeight(38);
        fze4.setPosition(fzw_0.tLc);
        fze4.setTexture(this.okR.uF("themeSimple3"));
        fze4.setWidth(38);
        fze4.setX(429);
        fze4.setY(104);
        fkd_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(1);
        fze5.setPosition(fzw_0.tLf);
        fze5.setTexture(this.okR.uF("themeSimple3"));
        fze5.setWidth(38);
        fze5.setX(429);
        fze5.setY(141);
        fkd_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(1);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("themeSimple3"));
        fze6.setWidth(1);
        fze6.setX(466);
        fze6.setY(141);
        fkd_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setFlipHorizontaly(true);
        fze7.setHeight(1);
        fze7.setPosition(fzw_0.tLh);
        fze7.setTexture(this.okR.uF("themeSimple3"));
        fze7.setWidth(38);
        fze7.setX(429);
        fze7.setY(141);
        fkd_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setFlipVerticaly(true);
        fze8.setHeight(38);
        fze8.setPosition(fzw_0.tLk);
        fze8.setTexture(this.okR.uF("themeSimple3"));
        fze8.setWidth(38);
        fze8.setX(429);
        fze8.setY(104);
        fkd_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setFlipVerticaly(true);
        fze9.setHeight(38);
        fze9.setPosition(fzw_0.tLm);
        fze9.setTexture(this.okR.uF("themeSimple3"));
        fze9.setWidth(1);
        fze9.setX(466);
        fze9.setY(104);
        fkd_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setFlipHorizontaly(true);
        fze10.setFlipVerticaly(true);
        fze10.setHeight(38);
        fze10.setPosition(fzw_0.tLo);
        fze10.setTexture(this.okR.uF("themeSimple3"));
        fze10.setWidth(38);
        fze10.setX(429);
        fze10.setY(104);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

