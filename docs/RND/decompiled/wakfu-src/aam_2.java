/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.Logger;

/*
 * Renamed from aAM
 */
public abstract class aam_2 {
    protected static final Logger dwV = Logger.getLogger(aam_2.class);
    private long dwW;
    private long dwX;
    private final AtomicReference<aao_2> dwY = new AtomicReference();

    public aao_2 bUg() {
        return this.dwY.get();
    }

    public void a(aao_2 aao_22) {
        this.dwY.set(aao_22);
    }

    public void bGy() {
        aao_2 aao_22 = this.dwY.get();
        if (aao_22 == null) {
            dwV.warn((Object)("Le message de type " + this.getClass().getSimpleName() + " n'a pas de destinataire."));
            return;
        }
        aao_22.b(this);
    }

    public abstract int d();

    public void lK(int n) {
    }

    public boolean h(int n, int n2, boolean bl) {
        if (bl) {
            if (n != n2) {
                dwV.error((Object)("****************************** Message de longueur incorrecte : re\u00e7u=" + n + " octet(s), attendu=" + n2 + " octet(s), type : " + this.getClass().getName()), (Throwable)new Exception("TRACE"));
                return false;
            }
        } else if (n < n2) {
            dwV.error((Object)("****************************** Message de longueur incorrecte : re\u00e7u=" + n + " octet(s), attendu >= " + n2 + " octet(s), type : " + this.getClass().getName()), (Throwable)new Exception("TRACE"));
            return false;
        }
        return true;
    }

    void hg(long l) {
        this.dwW = l;
    }

    public long bUh() {
        return this.dwW;
    }

    public long bUi() {
        return this.dwX;
    }

    public void hh(long l) {
        this.dwX = l;
    }

    public String toString() {
        return this.s(aam_2.class);
    }

    protected String s(Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getSimpleName()).append('@').append(Integer.toHexString(this.hashCode())).append('{');
        try {
            Class<?> clazz2 = this.getClass();
            do {
                Field[] fieldArray;
                for (Field field : fieldArray = clazz2.getDeclaredFields()) {
                    if (Modifier.isStatic(field.getModifiers())) continue;
                    stringBuilder.append(field.getName()).append('=');
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        if (field.getType().isArray()) {
                            Object object = field.get(this);
                            if (object == null) {
                                stringBuilder.append("null");
                            } else {
                                int n = Array.getLength(object);
                                stringBuilder.append('[');
                                for (int i = 0; i < n; ++i) {
                                    stringBuilder.append(Array.get(object, i));
                                    if (i >= n - 1) continue;
                                    stringBuilder.append(", ");
                                }
                                stringBuilder.append(']');
                            }
                        } else {
                            stringBuilder.append(field.get(this));
                        }
                    }
                    catch (IllegalAccessException | SecurityException | InaccessibleObjectException exception) {
                        stringBuilder.append('?');
                    }
                    stringBuilder.append(", ");
                }
            } while ((clazz2 = clazz2.getSuperclass()) != null && clazz2 != clazz);
        }
        catch (Exception exception) {
            dwV.error((Object)("Error while doing toString on message " + this.getClass().getSimpleName()), (Throwable)exception);
            stringBuilder.append("ERROR");
        }
        stringBuilder.append("handler=").append(this.bUg()).append('}');
        return stringBuilder.toString();
    }
}

