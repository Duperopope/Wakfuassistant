/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.List;

final class LK
implements PropertyEditor {
    private final List<PropertyChangeListener> aRj = new ArrayList<PropertyChangeListener>();
    private final Class aRk;
    private final String[] aRl;
    private Object aGT;

    LK(Class<?> clazz) {
        ?[] objArray = clazz.getEnumConstants();
        if (objArray == null) {
            throw new IllegalArgumentException("Unsupported " + String.valueOf(clazz));
        }
        this.aRk = clazz;
        this.aRl = new String[objArray.length];
        for (int i = 0; i < objArray.length; ++i) {
            this.aRl[i] = ((Enum)objArray[i]).name();
        }
    }

    @Override
    public Object getValue() {
        return this.aGT;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setValue(Object object) {
        PropertyChangeListener[] propertyChangeListenerArray;
        Object object2;
        if (object != null && !this.aRk.isInstance(object)) {
            throw new IllegalArgumentException("Unsupported m_value: " + String.valueOf(object));
        }
        Object object3 = this.aRj;
        synchronized (object3) {
            object2 = this.aGT;
            this.aGT = object;
            if (object == null ? object2 == null : object.equals(object2)) {
                return;
            }
            int n = this.aRj.size();
            if (n == 0) {
                return;
            }
            propertyChangeListenerArray = this.aRj.toArray(new PropertyChangeListener[n]);
        }
        object3 = new PropertyChangeEvent(this, null, object2, object);
        for (PropertyChangeListener propertyChangeListener : propertyChangeListenerArray) {
            propertyChangeListener.propertyChange((PropertyChangeEvent)object3);
        }
    }

    @Override
    public String getAsText() {
        return this.aGT != null ? ((Enum)this.aGT).name() : "null";
    }

    @Override
    public void setAsText(String string) {
        this.setValue(string != null ? Enum.valueOf(this.aRk, string) : null);
    }

    @Override
    public String[] getTags() {
        return (String[])this.aRl.clone();
    }

    @Override
    public String getJavaInitializationString() {
        return this.aGT != null ? this.aRk.getName() + "." + ((Enum)this.aGT).name() : "null";
    }

    @Override
    public boolean isPaintable() {
        return false;
    }

    @Override
    public void paintValue(Graphics graphics, Rectangle rectangle) {
    }

    @Override
    public boolean supportsCustomEditor() {
        return false;
    }

    @Override
    public Component getCustomEditor() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        List<PropertyChangeListener> list = this.aRj;
        synchronized (list) {
            this.aRj.add(propertyChangeListener);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        List<PropertyChangeListener> list = this.aRj;
        synchronized (list) {
            this.aRj.remove(propertyChangeListener);
        }
    }
}

