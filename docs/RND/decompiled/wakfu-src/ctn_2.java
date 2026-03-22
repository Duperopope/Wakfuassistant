/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from cTN
 */
public class ctn_2
implements aeh_2 {
    public static final String nKq = "name";
    public static final String nKr = "actorDescriptorLibrary";
    private final ZC nKs;
    private final int nKt;

    public ctn_2(int n, int n2) {
        String string = null;
        try {
            string = String.format(auc_0.cVq().bS("ANMInteractiveElementPath"), n2);
        }
        catch (fu_0 fu_02) {
            ctl_1.nKo.warn((Object)"Probl\u00e8me au chargement de la propri\u00e9t\u00e9 ANMInteractiveElementPath");
        }
        this.nKs = new ZC();
        try {
            this.nKs.k(string, true);
        }
        catch (IOException iOException) {
            ctl_1.nKo.error((Object)("Probl\u00e8me au chargement de " + string));
        }
        this.nKs.dP(String.valueOf(n2));
        this.nKt = n;
    }

    public int aVB() {
        return this.nKt;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(nKq)) {
            return aum_0.cWf().a(99, (long)this.nKt, new Object[0]);
        }
        if (string.equals(nKr)) {
            return this.nKs;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ctn_2)) {
            return false;
        }
        return ((ctn_2)object).nKt == this.nKt;
    }
}

