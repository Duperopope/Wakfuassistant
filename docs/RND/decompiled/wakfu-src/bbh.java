/*
 * Decompiled with CFR 0.152.
 */
public class bbh
extends QR {
    public bbh(QT qT, qm_0 qm_02) {
        this.a(qT);
        this.a(qm_02);
    }

    @Override
    public void a(int n, int n2, short s, int n3, int n4, short s2, qu_0 qu_02) {
    }

    @Override
    public QQ dr(long l) {
        eSS eSS2 = eTo.fIZ().iY(l);
        if (eSS2 == null) {
            biG.error((Object)("pas de modele de zone d'effet d'id " + l));
            return null;
        }
        return eSS2.a(null);
    }
}

