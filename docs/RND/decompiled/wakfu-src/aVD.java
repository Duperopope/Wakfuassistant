/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class aVD
extends agb_1
implements ayz_2 {
    private List<bgy> htl;
    private String bKc;
    private long bUm;
    private static final ayv_2 htm = new ayv_2(new ave_0());

    public static aVD a(int n, int n2, int n3, List<bgy> list, String string, int n4) {
        try {
            aVD aVD2 = (aVD)htm.borrowObject();
            aVD2.xO(n);
            aVD2.xP(n2);
            aVD2.xQ(n3);
            aVD2.htl = list;
            aVD2.bKc = string;
            aVD2.bUm = n4;
            return aVD2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    aVD() {
        super(0, 0, 0);
    }

    @Override
    public void aZp() {
        try {
            htm.returnObject(this);
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
        this.htl = null;
        this.bKc = null;
        this.bUm = 0L;
    }

    @Override
    protected long cbk() {
        if (this.htl == null || this.htl.isEmpty()) {
            return 0L;
        }
        for (int i = 0; i < this.htl.size(); ++i) {
            bgy bgy2 = this.htl.get(i);
            bgy2.ddI().dT(this.bKc);
        }
        return this.bUm;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public void M(bgy bgy2) {
        if (this.htl == null) {
            this.htl = new ArrayList<bgy>();
        }
        this.htl.add(bgy2);
    }
}

