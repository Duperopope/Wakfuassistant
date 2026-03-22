/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class djo
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fym_0 fym_02 = (fym_0)fes_23.getAppearance();
        fym_02.setElementMap(fhs_23);
        fym_02.setAlignment(faa_2.tLO);
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(30);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txDirArrowSE"));
        fze2.setWidth(30);
        fze2.setX(0);
        fze2.setY(0);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setAlignment(faa_2.tLO);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(30);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txDirArrowSE"));
        fze3.setWidth(30);
        fze3.setX(0);
        fze3.setY(32);
        fkd_13.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setAlignment(faa_2.tLO);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(30);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txDirArrowSE"));
        fze4.setWidth(30);
        fze4.setX(0);
        fze4.setY(64);
        fkd_14.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setAlignment(faa_2.tLO);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(30);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txDirArrowSE"));
        fze5.setWidth(30);
        fze5.setX(0);
        fze5.setY(96);
        fkd_15.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}

