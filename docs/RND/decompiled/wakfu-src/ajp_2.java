/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajP
 */
public final class ajp_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBG = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("worldX", null, aff_2.dJy, false), new afe_1("worldY", null, aff_2.dJy, false), new afe_1("isHeightDirections", "True for 8 directions, else 4", aff_2.dJA, true)};
    private static final afe_1[] cBH = new afe_1[]{new afe_1("newDirectionIndex", null, aff_2.dJy, false)};

    public ajp_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileLookAt";
    }

    @Override
    public String getDescription() {
        return "Set the direction of the mobile to look towards the specified coordinates";
    }

    @Override
    public afe_1[] bBg() {
        return cBG;
    }

    @Override
    public afe_1[] bBh() {
        return cBH;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ZG)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection", false);
            this.cah();
            return;
        }
        ZG zG = (ZG)zC;
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        boolean bl = n >= 4 ? this.xx(3) : this.a(zG);
        int n4 = n2 - zG.bcC();
        int n5 = n3 - zG.bcD();
        abi_1 abi_12 = zG.bcB();
        if (bl && (n4 != 0 || n5 != 0)) {
            abi_12 = acq_1.bo(n4, n5);
        } else if (!bl) {
            abi_12 = new acq_1(n4, n5, 0).bXb();
        }
        if (abi_12 != abi_1.dzt) {
            zG.a(abi_12);
        }
        this.xC(abi_12.dzy);
    }
}

