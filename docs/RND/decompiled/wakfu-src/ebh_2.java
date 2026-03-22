/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebH
 */
public class ebh_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzg fzg2 = (fzg)fes_23.getAppearance();
        fzg2.setElementMap(fhs_23);
        fes_22.X(fzg2);
        fzg2.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(9);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("txXpBar"));
        fze2.setWidth(2);
        fze2.setX(18);
        fze2.setY(44);
        fzg2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(2);
        fze3.setPosition(fzw_0.tLf);
        fze3.setTexture(this.okR.uF("txXpBar"));
        fze3.setWidth(2);
        fze3.setX(18);
        fze3.setY(53);
        fzg2.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(9);
        fze4.setPosition(fzw_0.tLk);
        fze4.setTexture(this.okR.uF("txXpBar"));
        fze4.setWidth(2);
        fze4.setX(18);
        fze4.setY(55);
        fzg2.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(9);
        fze5.setPosition(fzw_0.tLa);
        fze5.setTexture(this.okR.uF("txXpBar"));
        fze5.setWidth(1);
        fze5.setX(10);
        fze5.setY(44);
        fzg2.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(2);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txXpBar"));
        fze6.setWidth(1);
        fze6.setX(10);
        fze6.setY(53);
        fzg2.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(9);
        fze7.setPosition(fzw_0.tLm);
        fze7.setTexture(this.okR.uF("txXpBar"));
        fze7.setWidth(1);
        fze7.setX(10);
        fze7.setY(55);
        fzg2.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(9);
        fze8.setPosition(fzw_0.tLc);
        fze8.setTexture(this.okR.uF("txXpBar"));
        fze8.setWidth(1);
        fze8.setX(0);
        fze8.setY(44);
        fzg2.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(2);
        fze9.setPosition(fzw_0.tLh);
        fze9.setTexture(this.okR.uF("txXpBar"));
        fze9.setWidth(1);
        fze9.setX(0);
        fze9.setY(53);
        fzg2.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(9);
        fze10.setPosition(fzw_0.tLo);
        fze10.setTexture(this.okR.uF("txXpBar"));
        fze10.setWidth(1);
        fze10.setX(0);
        fze10.setY(55);
        fzg2.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fzg2.onChildrenAdded();
    }
}

