/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dAS
 */
public class das_2
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
        fks_1 fks_12 = fks_1.checkOut();
        fks_12.setElementMap(fhs_23);
        fks_12.setHorizontal(false);
        fys_02.X(fks_12);
        fks_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(73);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(403);
        fze2.setX(1065);
        fze2.setY(1558);
        fks_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fks_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

