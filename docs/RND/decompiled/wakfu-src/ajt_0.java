/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aJT
 */
public class ajt_0
implements TObjectProcedure<fam_0> {
    final /* synthetic */ float ecz;
    final /* synthetic */ DisplayedScreenMultiElement ecA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public ajt_0(DisplayedScreenMultiElement displayedScreenMultiElement, float f2) {
        this.ecA = displayedScreenMultiElement;
        this.ecz = f2;
    }

    public boolean a(fam_0 fam_02) {
        this.b(fam_02);
        return true;
    }

    private void b(fam_0 fam_02) {
        aci_1 aci_12 = fam_02.fRe();
        int n = fsu.aae(aci_12.cuR);
        if (n < this.ecA.bpd || n >= this.ecA.bpd + this.ecA.brs) {
            return;
        }
        int n2 = fsu.aaf(aci_12.cuT);
        if (n2 < this.ecA.bpe || n2 >= this.ecA.bpe + this.ecA.brt) {
            return;
        }
        int n3 = fam_02.conn();
        aJU.b(this.ecA.bVe, n3, fam_02.fRc() - this.ecA.bpd * 9, fam_02.fRd() - this.ecA.bpe * 9, this.ecz, this.ecA.ecy.Kb(n3));
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

