/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.chat.console.command.EmoteCommand;
import java.util.Date;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bbF
 */
public class bbf_0
extends bbi_0 {
    private static final int hAR = 1000;
    private long hAS;
    private final boolean hAT;
    private final ang_2 hAU;
    private final boolean hAV;
    private final boolean hAW;
    private final String[] hAX;

    bbf_0(int n, boolean bl, boolean bl2, boolean bl3, String string, String[] stringArray, ang_2 ang_22) {
        super(n, string);
        this.hAT = bl;
        this.hAU = ang_22;
        this.hAV = bl && bl2;
        this.hAW = bl3;
        this.hAX = stringArray;
        this.hBe = true;
    }

    public void dag() {
        aUd aUd2 = aPh.czg().czh().cBG();
        if (aUd2.cUm().contains(this.hBg)) {
            return;
        }
        aUc aUc2 = new aUc(this.hBg, "", new EmoteCommand(this.hBf), false);
        aUc2.setName(this.hBg);
        aUd2.cUl().b(aUc2);
    }

    public boolean cnd() {
        return this.hAT;
    }

    public boolean cne() {
        return this.hAV;
    }

    @Override
    @Nullable
    public String getName() {
        if (aum_0.cWf().e(80, this.hBf)) {
            return aum_0.cWf().a(80, (long)this.hBf, new Object[0]);
        }
        return null;
    }

    @Override
    @Nullable
    public String dah() {
        if (aum_0.cWf().e(80, this.hBf)) {
            return aum_0.cWf().b(80, (long)this.hBf, new Object[0]);
        }
        return null;
    }

    @Override
    public String byf() {
        return auc_0.cVq().zL(this.hBf);
    }

    @Override
    protected boolean isUsable() {
        if (this.hAU == null) {
            return true;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return this.hAU.b(bgt_02, bgt_02.aZw(), this, bgt_02.bdV());
    }

    public boolean cnf() {
        return this.hAW;
    }

    public ang_2 bdo() {
        return this.hAU;
    }

    public void dai() {
        long l = new Date().getTime();
        if (this.hAS != 0L && l - this.hAS < 1000L) {
            return;
        }
        this.hAS = l;
        daw daw2 = new daw();
        daw2.co(this.hBg);
        aaw_1.bUq().h(daw2);
    }
}

