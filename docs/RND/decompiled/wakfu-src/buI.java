/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class buI
implements Comparator<axb_2> {
    private static buI jqz = new buI();

    private buI() {
    }

    public int b(axb_2 axb_22, axb_2 axb_23) {
        int n;
        int n2;
        int n3;
        int n4;
        if (axb_22.aIU() >= axb_22.aIW() && axb_22.aIU() >= axb_22.aIV()) {
            n4 = 0;
            n3 = axb_22.bPX() - axb_22.bPY();
        } else if (axb_22.aIV() >= axb_22.aIW()) {
            n4 = 1;
            n3 = axb_22.bPY() - axb_22.bPW();
        } else {
            n4 = 2;
            n3 = axb_22.bPW() - axb_22.bPY();
        }
        if (axb_23.aIU() >= axb_23.aIW() && axb_23.aIU() >= axb_23.aIV()) {
            n2 = 0;
            n = axb_23.bPX() - axb_23.bPY();
        } else if (axb_23.aIV() >= axb_23.aIW()) {
            n2 = 1;
            n = axb_23.bPY() - axb_23.bPW();
        } else {
            n2 = 2;
            n = axb_23.bPW() - axb_23.bPY();
        }
        if (n4 != n2) {
            return n4 - n2;
        }
        return n3 - n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((axb_2)object, (axb_2)object2);
    }
}

