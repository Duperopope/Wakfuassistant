/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebq
 */
public class ebq_2
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
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        fys_02.X(fkh_12);
        fkh_12.guy();
        String string = "progressBarBackgroundNorthWest";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(13);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(13);
        fze2.setX(779);
        fze2.setY(29);
        fkh_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        String string2 = "progressBarBackgroundNorth";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(13);
        fze3.setPosition(fzw_0.tLa);
        fze3.setTexture(this.okR.uF("themeSimple"));
        fze3.setWidth(1);
        fze3.setX(799);
        fze3.setY(29);
        fkh_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        String string3 = "progressBarBackgroundNorthEast";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setFlipHorizontaly(true);
        fze4.setHeight(13);
        fze4.setPosition(fzw_0.tLc);
        fze4.setTexture(this.okR.uF("themeSimple"));
        fze4.setWidth(13);
        fze4.setX(779);
        fze4.setY(29);
        fkh_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        String string4 = "progressBarBackgroundWest";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(1);
        fze5.setPosition(fzw_0.tLf);
        fze5.setTexture(this.okR.uF("themeSimple"));
        fze5.setWidth(13);
        fze5.setX(779);
        fze5.setY(50);
        fkh_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        String string5 = "progressBarBackgroundEast";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setFlipHorizontaly(true);
        fze6.setHeight(1);
        fze6.setPosition(fzw_0.tLh);
        fze6.setTexture(this.okR.uF("themeSimple"));
        fze6.setWidth(13);
        fze6.setX(779);
        fze6.setY(50);
        fkh_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        String string6 = "progressBarBackgroundSouthWest";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setFlipVerticaly(true);
        fze7.setHeight(13);
        fze7.setPosition(fzw_0.tLk);
        fze7.setTexture(this.okR.uF("themeSimple"));
        fze7.setWidth(13);
        fze7.setX(779);
        fze7.setY(29);
        fkh_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        String string7 = "progressBarBackgroundSouth";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setFlipVerticaly(true);
        fze8.setHeight(13);
        fze8.setPosition(fzw_0.tLm);
        fze8.setTexture(this.okR.uF("themeSimple"));
        fze8.setWidth(1);
        fze8.setX(799);
        fze8.setY(29);
        fkh_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        String string8 = "progressBarBackgroundSouthEast";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze9);
        }
        fze9.setFlipHorizontaly(true);
        fze9.setFlipVerticaly(true);
        fze9.setHeight(13);
        fze9.setPosition(fzw_0.tLo);
        fze9.setTexture(this.okR.uF("themeSimple"));
        fze9.setWidth(13);
        fze9.setX(779);
        fze9.setY(29);
        fkh_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkh_12.onChildrenAdded();
        String string9 = "pmbWindowBackGroundSecondary";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string9 != null) {
            fhs_23.a(string9, fkd_12);
        }
        fkd_12.setScaled(true);
        fys_02.X(fkd_12);
        fkd_12.guy();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(32);
        fze10.setPosition(fzw_0.tKY);
        fze10.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze10.setWidth(32);
        fze10.setX(0);
        fze10.setY(0);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fze fze11 = fze.checkOut();
        fze11.setElementMap(fhs_23);
        fze11.setHeight(32);
        fze11.setPosition(fzw_0.tLa);
        fze11.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze11.setWidth(1);
        fze11.setX(32);
        fze11.setY(0);
        fkd_12.X(fze11);
        fze11.guy();
        fze11.onChildrenAdded();
        fze fze12 = fze.checkOut();
        fze12.setElementMap(fhs_23);
        fze12.setHeight(32);
        fze12.setPosition(fzw_0.tLc);
        fze12.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze12.setWidth(32);
        fze12.setX(32);
        fze12.setY(0);
        fkd_12.X(fze12);
        fze12.guy();
        fze12.onChildrenAdded();
        fze fze13 = fze.checkOut();
        fze13.setElementMap(fhs_23);
        fze13.setHeight(1);
        fze13.setPosition(fzw_0.tLf);
        fze13.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze13.setWidth(32);
        fze13.setX(0);
        fze13.setY(32);
        fkd_12.X(fze13);
        fze13.guy();
        fze13.onChildrenAdded();
        fze fze14 = fze.checkOut();
        fze14.setElementMap(fhs_23);
        fze14.setHeight(1);
        fze14.setPosition(fzw_0.tLg);
        fze14.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze14.setWidth(1);
        fze14.setX(32);
        fze14.setY(32);
        fkd_12.X(fze14);
        fze14.guy();
        fze14.onChildrenAdded();
        fze fze15 = fze.checkOut();
        fze15.setElementMap(fhs_23);
        fze15.setHeight(1);
        fze15.setPosition(fzw_0.tLh);
        fze15.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze15.setWidth(32);
        fze15.setX(32);
        fze15.setY(32);
        fkd_12.X(fze15);
        fze15.guy();
        fze15.onChildrenAdded();
        fze fze16 = fze.checkOut();
        fze16.setElementMap(fhs_23);
        fze16.setHeight(32);
        fze16.setPosition(fzw_0.tLk);
        fze16.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze16.setWidth(32);
        fze16.setX(0);
        fze16.setY(32);
        fkd_12.X(fze16);
        fze16.guy();
        fze16.onChildrenAdded();
        fze fze17 = fze.checkOut();
        fze17.setElementMap(fhs_23);
        fze17.setHeight(32);
        fze17.setPosition(fzw_0.tLm);
        fze17.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze17.setWidth(1);
        fze17.setX(32);
        fze17.setY(32);
        fkd_12.X(fze17);
        fze17.guy();
        fze17.onChildrenAdded();
        fze fze18 = fze.checkOut();
        fze18.setElementMap(fhs_23);
        fze18.setHeight(32);
        fze18.setPosition(fzw_0.tLo);
        fze18.setTexture(this.okR.uF("txWindowBackgroundSecondary"));
        fze18.setWidth(32);
        fze18.setX(32);
        fze18.setY(32);
        fkd_12.X(fze18);
        fze18.guy();
        fze18.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}

