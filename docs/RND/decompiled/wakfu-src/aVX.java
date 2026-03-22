/*
 * Decompiled with CFR 0.152.
 */
public class aVX
extends agb_1
implements ayz_2 {
    private long htO;
    private byte[] htP;
    private static final ayv_2 htQ = new ayv_2(new aVY());

    public static aVX a(int n, int n2, int n3, long l, byte[] byArray) {
        try {
            aVX aVX2 = (aVX)htQ.borrowObject();
            aVX2.xO(n);
            aVX2.xP(n2);
            aVX2.xQ(n3);
            aVX2.htP = byArray;
            aVX2.htO = l;
            return aVX2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un InteractiveElementUpdateAction : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            htQ.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.htO = 0L;
        this.htP = null;
    }

    aVX() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        if (this.htP != null) {
            bCA bCA2 = (bCA)bzj_2.eqi().my(this.htO);
            if (bCA2 != null) {
                bCA2.as(this.htP);
                bCA2.aVQ();
            } else {
                dJP.error((Object)"L'\u00e9l\u00e9ment interactif \u00e0 mettre \u00e0 jour n'est pas/plus dans les partitions g\u00e9r\u00e9es par le client.");
            }
        } else {
            dJP.warn((Object)"Message de mise \u00e0 jour d'\u00e9l\u00e9ment interactif re\u00e7u sans aucune donn\u00e9e \u00e0 mettre \u00e0 jour.");
        }
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

