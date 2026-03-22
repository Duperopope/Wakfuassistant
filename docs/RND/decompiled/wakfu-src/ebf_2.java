/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebF
 */
public class ebf_2
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
        fze2.setHeight(8);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("txProgrestBarTears"));
        fze2.setWidth(30);
        fze2.setX(0);
        fze2.setY(0);
        fzg2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(1);
        fze3.setPosition(fzw_0.tLf);
        fze3.setTexture(this.okR.uF("txProgrestBarTears"));
        fze3.setWidth(30);
        fze3.setX(0);
        fze3.setY(9);
        fzg2.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(1);
        fze4.setPosition(fzw_0.tLk);
        fze4.setTexture(this.okR.uF("txProgrestBarTears"));
        fze4.setWidth(30);
        fze4.setX(0);
        fze4.setY(13);
        fzg2.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(0);
        fze5.setPosition(fzw_0.tLa);
        fze5.setTexture(this.okR.uF("txProgrestBarTears"));
        fze5.setWidth(0);
        fze5.setX(0);
        fze5.setY(0);
        fzg2.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(0);
        fze6.setPosition(fzw_0.tLc);
        fze6.setTexture(this.okR.uF("txProgrestBarTears"));
        fze6.setWidth(0);
        fze6.setX(0);
        fze6.setY(0);
        fzg2.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(0);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txProgrestBarTears"));
        fze7.setWidth(0);
        fze7.setX(0);
        fze7.setY(0);
        fzg2.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(0);
        fze8.setPosition(fzw_0.tLm);
        fze8.setTexture(this.okR.uF("txProgrestBarTears"));
        fze8.setWidth(0);
        fze8.setX(0);
        fze8.setY(0);
        fzg2.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(0);
        fze9.setPosition(fzw_0.tLh);
        fze9.setTexture(this.okR.uF("txProgrestBarTears"));
        fze9.setWidth(0);
        fze9.setX(0);
        fze9.setY(0);
        fzg2.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(0);
        fze10.setPosition(fzw_0.tLo);
        fze10.setTexture(this.okR.uF("txProgrestBarTears"));
        fze10.setWidth(0);
        fze10.setX(0);
        fze10.setY(0);
        fzg2.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fzg2.onChildrenAdded();
    }
}

