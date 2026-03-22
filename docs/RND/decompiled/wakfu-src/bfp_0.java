/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bFp
 */
public class bfp_0
extends bfc_1
implements bfv_1 {
    private static final Logger jTm = Logger.getLogger(bfp_0.class);
    private int epc;
    private short bol;
    private boolean jTn;

    public bfp_0(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTm.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void v(String[] stringArray) {
        this.epc = Integer.parseInt(stringArray[0]);
        this.bol = Short.parseShort(stringArray[1]);
        this.jTn = stringArray.length >= 3 && Boolean.parseBoolean(stringArray[2]);
    }

    @Override
    public void clear() {
    }

    @Override
    public @Unmodifiable Collection<Integer> dTn() {
        return List.of(Integer.valueOf(this.epc));
    }

    @Override
    public fgM dTl() {
        return fgM.skK;
    }
}

