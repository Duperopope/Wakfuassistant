/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bwp
extends bwq {
    public static final String jxK = "spellInventory";
    public static final String jxL = "currentSpellDeck";
    public static final String jxM = "activeSpellsLabel";
    public static final String jxN = "passiveLabel";
    public static final String jxO = "naturalStateLabel";
    private static final String[] jxP = (String[])ArrayUtils.addAll((Object[])bwq.jxX, (Object[])new String[]{"spellInventory", "currentSpellDeck"});
    private static final String jxQ = "spellsInventory";
    @Nullable
    private final bmw_0 jxR;
    @NotNull
    private bMT jxS;

    public bwp(@NotNull bMT bMT2) {
        this(null, bMT2);
    }

    public bwp(@Nullable bgt_0 bgt_02, @NotNull bMT bMT2) {
        this.jxR = bgt_02 == null ? null : bgt_02.dpH();
        this.jxS = bMT2;
        this.jxS.efe();
    }

    @Override
    protected int deP() {
        return 1;
    }

    @Override
    protected String dbi() {
        return jxQ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "spellInventory": {
                return this.jxR;
            }
            case "currentSpellDeck": {
                return this.jxS;
            }
            case "activeSpellsLabel": {
                return aum_0.cWf().c("actives", new Object[0]).toUpperCase();
            }
            case "passiveLabel": {
                return aum_0.cWf().c("passiveSpells", new Object[0]).toUpperCase();
            }
            case "naturalStateLabel": {
                return aum_0.cWf().c("build.breed.natural.state", new Object[0]).toUpperCase();
            }
        }
        return super.eu(string);
    }

    public void a(bMW bMW2) {
        this.jxS = bMW2;
        this.jxS.efe();
        if (this.jxR != null) {
            this.jxR.eeK();
        }
    }

    @Override
    public String[] bxk() {
        return jxP;
    }
}

