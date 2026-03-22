/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRw
 */
public class arw_0
extends aRY {
    public static final int eJW = 0;
    public static final int eJX = 1;
    public static final int eJY = 2;
    public static final int eJZ = 3;
    private final int eKa;
    private final String[] eKb;

    public arw_0(int n, String ... stringArray) {
        this.eKa = n;
        this.eKb = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eKa) {
            case 0: 
            case 3: {
                return this.eKb.length == 0;
            }
            case 1: 
            case 2: {
                return this.eKb.length == 1;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You have to be connected to access these commands");
            return;
        }
        try {
            switch (this.eKa) {
                case 0: {
                    this.cBS();
                    break;
                }
                case 1: {
                    this.cCK();
                    break;
                }
                case 2: {
                    this.cCJ();
                    break;
                }
                case 3: {
                    this.reset();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("An issue occurred during a command " + String.valueOf(exception));
        }
    }

    private void reset() {
        adq_0.bS(1.0f);
        ZK.bS(1.0f);
        arw_0.jF("Speed reset.");
    }

    private void cCJ() {
        float f2 = Float.parseFloat(this.eKb[0]);
        ZK.bS(f2);
        arw_0.jF("Animation Speed modified.");
    }

    private void cCK() {
        float f2 = Float.parseFloat(this.eKb[0]);
        adq_0.bS(f2);
        arw_0.jF("Movement Speed modified.");
    }

    private void cBS() {
        arw_0.jF("globalSpeed (help | h) : displays commands descriptions");
        arw_0.jF("globalSpeed (setMove | m) speedRatio : set global movement speed ratio (1 = unchanged)  ");
        arw_0.jF("globalSpeed (setAnim | a ) speedRatio : set global animation speed ratio (1 = unchanged) ");
        arw_0.jF("globalSpeed (resetAll | ra) : reset global movement and animation speed ratio");
    }
}

