/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqH
 */
public class bqh_1
implements Sp,
aeh_2 {
    public static final String jaU = "animName";
    public static final String jaV = "actorDescriptorLibrary";
    public static final String jaW = "equipedItem";
    private final bzz jaX;

    public bqh_1(bzz bzz2) {
        this.jaX = bzz2;
        this.jaX.c(this);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jaU)) {
            return this.jaX.getAnimName();
        }
        if (string.equals(jaV)) {
            return this.jaX.dON();
        }
        if (string.equals(jaW)) {
            return this.jaX.getItem();
        }
        return null;
    }

    public bzz dEx() {
        return this.jaX;
    }

    @Override
    public void b(Sl sl) {
        fse_1.gFu().a((aef_2)this, jaV, jaU, jaW);
    }
}

