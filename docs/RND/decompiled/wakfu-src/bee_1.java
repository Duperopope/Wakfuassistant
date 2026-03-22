/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bee
 */
public class bee_1
extends beh_2 {
    private static final Logger hMS = Logger.getLogger(bee_1.class);
    private final ArrayList<Pw> hMT;
    private final int hMU;
    private final int hMV;

    public bee_1(enk_0 enk_02, ArrayList<Pw> arrayList, int n, int n2) {
        super(enk_02);
        this.hMT = arrayList;
        this.hMV = n;
        this.hMU = n2;
    }

    bee_1(bee_1 bee_12) {
        super(bee_12.hMZ);
        this.hMT = bee_12.hMT;
        this.hMU = bee_12.hMU;
        this.hMV = bee_12.hMV;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.a((ZH)bdj_22, true);
    }

    public void a(ZH zH, boolean bl) {
        try {
            if (bl) {
                if (zH instanceof bdj_2) {
                    ((bdj_2)zH).dcP().dkr();
                }
            } else {
                for (Pw pw : this.hMT) {
                    this.a(zH, pw);
                }
            }
        }
        catch (fu_0 fu_02) {
            hMS.error((Object)"", (Throwable)fu_02);
        }
    }

    private void a(ZH zH, Pw pw) {
        String string;
        String string2 = pw.aXP();
        int n = string2.indexOf(47);
        String string3 = n == -1 ? null : string2.substring(0, n);
        String string4 = bdf_1.r(string3, Integer.parseInt(string = n == -1 ? string2 : string2.substring(n + 1)));
        if (string4 == null) {
            hMS.error((Object)("dossier inconnu ( +" + string3 + ") pour le chargement de l'anm " + string + " [valeurs autoris\u00e9es: equipment/, npc/, player/]"));
            return;
        }
        Anm anm = ZC.dR(string4);
        if (!(zH instanceof bdj_2) || ((bdj_2)zH).dcP().doJ()) {
            zH.a(anm, pw.aXX(), null);
            return;
        }
        zH.a(anm, pw.aXX(), bo_0.avK);
    }

    public int aXY() {
        return this.hMV;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bee_1 bee_12 = (bee_1)object;
        if (this.hMU != bee_12.hMU) {
            return false;
        }
        if (this.hMV != bee_12.hMV) {
            return false;
        }
        return this.hMT.equals(bee_12.hMT);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.hMT.hashCode();
        n = 31 * n + this.hMU;
        n = 31 * n + this.hMV;
        return n;
    }

    public bee_1 del() {
        return new bee_1(this);
    }

    public /* synthetic */ beh_2 deb() {
        return this.del();
    }
}

