/*
 * Decompiled with CFR 0.152.
 */
public class agi {
    private agi() {
    }

    public static acb_1 a(afV afV2, anz_1 anz_12) {
        return agi.a(afV2, anz_12.getWorldX(), anz_12.getWorldY(), anz_12.getAltitude());
    }

    public static acb_1 a(afV afV2, float f2, float f3, float f4) {
        float f5 = afV2.aM(f2, f3);
        float f6 = afV2.j(f2, f3, f4);
        return new acb_1(f5, f6);
    }

    public static acb_1 b(afV afV2, anz_1 anz_12) {
        return agi.b(afV2, anz_12.getWorldX(), anz_12.getWorldY(), anz_12.getAltitude());
    }

    public static acb_1 b(afV afV2, float f2, float f3, float f4) {
        agf agf2 = afV2.brf();
        float f5 = agf2.byB() / afV2.getScale();
        float f6 = afV2.aM(f2, f3) - agf2.bsh();
        float f7 = afV2.j(f2, f3, f4) - agf2.bsi();
        return new acb_1(f6 *= f5, f7 *= f5);
    }

    public static acb_1 c(afV afV2, anz_1 anz_12) {
        return agi.c(afV2, anz_12.getWorldX(), anz_12.getWorldY(), anz_12.getAltitude());
    }

    public static acb_1 c(afV afV2, float f2, float f3, float f4) {
        acb_1 acb_12 = agi.b(afV2, f2, f3, f4);
        acb_12.aPY += afV2.bRq() * 0.5f;
        acb_12.aPZ += afV2.bRr() * 0.5f;
        return acb_12;
    }

    public static int a(afV afV2, short s) {
        return (int)((float)s * afV2.byt() * afV2.brf().byB());
    }
}

