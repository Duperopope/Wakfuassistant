/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;

class bbg {
    private final Constructor hzW;

    bbg(Class clazz) {
        this.hzW = bbg.u(clazz);
    }

    private static Constructor u(Class clazz) {
        for (Constructor<?> constructor : clazz.getConstructors()) {
            if (constructor.getParameterTypes().length != 16) continue;
            return constructor;
        }
        throw new NoSuchMethodException();
    }

    public eSS c(ale_0 ale_02) {
        return (eSS)this.hzW.newInstance(ale_02.d(), bbf.b(ale_02), bbf.y(ale_02.ckh()), bbf.y(ale_02.cki()), ale_02.ckb(), ale_02.cbt(), ale_02.ckc(), ale_02.ckk(), ale_02.ckn(), ale_02.cko(), bbf.lb(ale_02.ckp()), bbf.lb(ale_02.ckq()), ale_02.ckl(), ale_02.bcU(), ale_02.ckf(), ale_02.Fq());
    }
}

