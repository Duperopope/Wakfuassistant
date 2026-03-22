/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from bdZ
 */
public class bdz_1
extends beh_2 {
    public static final String[] hMK = new String[0];
    private final String hML;
    private final String[] hMM;
    final int hMN;
    private Anm hMO;

    public bdz_1(enk_0 enk_02, String string, int n, String[] stringArray) {
        super(enk_02);
        this.hML = string;
        this.hMN = n;
        this.hMM = this.j(stringArray);
    }

    private String[] j(String[] stringArray) {
        if (stringArray == null) {
            return hMK;
        }
        int n = stringArray.length;
        ArrayList<String> arrayList = new ArrayList<String>(n);
        for (int i = 0; i < n; ++i) {
            for (String string : ary_2.fT(stringArray[i])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private bdz_1(bdz_1 bdz_12) {
        super(bdz_12.hMZ);
        this.hML = bdz_12.hML;
        this.hMN = bdz_12.hMN;
        this.hMM = bdz_12.hMM;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.a(bdj_22, true);
    }

    public void a(ZH zH, boolean bl) {
        try {
            int n = this.hML.indexOf(47);
            String string = n == -1 ? null : this.hML.substring(0, n);
            String string2 = n == -1 ? this.hML : this.hML.substring(n + 1);
            String string3 = bdf_1.r(string, Integer.parseInt(string2));
            if (string3 == null) {
                bdx_1.hMI.error((Object)("dossier inconnu ( +" + string + ") pour le chargement de l'anm " + string2 + " [valeurs autoris\u00e9es: equipment/, npc/, player/]"));
                return;
            }
            this.hMO = ZC.dR(string3);
            if (bl) {
                if (zH instanceof bdj_2) {
                    ((bdj_2)zH).dcP().dkr();
                }
            } else {
                zH.a(this.hMO, this.hMM, null);
            }
        }
        catch (fu_0 fu_02) {
            bdx_1.hMI.error((Object)"", (Throwable)fu_02);
        }
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
        bdz_1 bdz_12 = (bdz_1)object;
        if (this.hML != null ? !this.hML.equals(bdz_12.hML) : bdz_12.hML != null) {
            return false;
        }
        return Arrays.equals(this.hMM, bdz_12.hMM);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.hML != null ? this.hML.hashCode() : 0);
        n = 31 * n + (this.hMM != null ? Arrays.hashCode(this.hMM) : 0);
        return n;
    }

    public bdz_1 dei() {
        return new bdz_1(this);
    }

    public /* synthetic */ beh_2 deb() {
        return this.dei();
    }
}

