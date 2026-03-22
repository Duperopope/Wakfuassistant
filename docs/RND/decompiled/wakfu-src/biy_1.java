/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Random;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIY
 */
public class biy_1
implements aeh_2 {
    private static final Random kjB = new Random();
    private static final Logger kjC = Logger.getLogger(biy_1.class);
    public static final String kjD = "messageBody";
    public static final String kjE = "button1Text";
    public static final String kjF = "button2Text";
    public static final String kjG = "buttonContainer";
    public static final String kjH = "id";
    public static final String kjI = "icon";
    private static final String[] kjJ = new String[]{"messageBody", "button1Text", "button2Text", "buttonContainer", "icon"};
    private final String kjK;
    private final int kjL;
    private final int kjM;
    private final int kjN;
    private final String kjO;
    private final String kjP;
    private final String kjQ;
    private final Runnable kjR;
    private final Runnable kjS;
    private final Runnable kjT;
    private Runnable kjU;
    private final long kjV = kjB.nextLong();

    public biy_1(biw_1 biw_12) {
        this.kjK = biw_12.dZA();
        String string = biw_12.dZH();
        this.kjP = string == null ? null : aum_0.cWf().c(string, new Object[0]);
        String string2 = biw_12.dZI();
        this.kjQ = string2 == null ? null : aum_0.cWf().c(string2, new Object[0]);
        this.kjL = biw_12.dZB();
        this.kjM = biw_12.dZC();
        this.kjN = biw_12.dZD();
        this.kjO = cda_2.LS(biw_12.dZE());
        this.kjR = biw_12.dZF();
        this.kjS = biw_12.dZG();
        this.kjT = biw_12.dZJ();
    }

    @Override
    public String[] bxk() {
        return kjJ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "messageBody": {
                return this.kjK;
            }
            case "button1Text": {
                return this.kjP;
            }
            case "button2Text": {
                return this.kjQ;
            }
            case "buttonContainer": {
                return null;
            }
            case "id": {
                return String.valueOf(this.kjV);
            }
            case "icon": {
                return this.kjO;
            }
        }
        return null;
    }

    public void dZQ() {
        if (this.kjR == null) {
            return;
        }
        this.kjR.run();
    }

    public void dZR() {
        if (this.kjS == null) {
            return;
        }
        this.kjS.run();
    }

    public void dZS() {
        if (this.kjT == null) {
            return;
        }
        this.kjT.run();
    }

    public void u(Runnable runnable) {
        this.kjU = runnable;
    }

    public void dZT() {
        if (this.kjU == null) {
            return;
        }
        this.kjU.run();
    }

    public String getId() {
        return String.valueOf(this.kjV);
    }

    public int dZB() {
        return this.kjL;
    }

    public int dZC() {
        return this.kjM;
    }

    public int dZD() {
        return this.kjN;
    }
}

