/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from djQ
 */
public class djq_1
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
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        String string = "pmbDefaultButtonExpandHudMenu";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(22);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txExpandHudButton"));
        fze2.setWidth(15);
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
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        String string2 = "pmbHoverButtonExpandHudMenu";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_13);
        }
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(22);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txExpandHudButton"));
        fze3.setWidth(15);
        fze3.setX(0);
        fze3.setY(24);
        fkd_13.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        String string3 = "pmbPressedButtonExpandHudMenu";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fkd_14);
        }
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(22);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txExpandHudButton"));
        fze4.setWidth(15);
        fze4.setX(0);
        fze4.setY(48);
        fkd_14.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string4 = "pmbDisabledButtonExpandHudMenu";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fkd_15);
        }
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(22);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txExpandHudButton"));
        fze5.setWidth(15);
        fze5.setX(0);
        fze5.setY(0);
        fkd_15.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}

