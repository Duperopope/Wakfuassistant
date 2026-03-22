/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from fL
 */
public final class fl_2
extends GeneratedMessageV3.Builder<fl_2>
implements fn_2 {
    private int an;
    private MapField<Integer, ff_2> qv;

    public static final Descriptors.Descriptor BB() {
        return fl_1.pq;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Ar();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.AF();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pr.ensureFieldAccessorsInitialized(fj_2.class, fl_2.class);
    }

    fl_2() {
        this.D();
    }

    fl_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fj_2.BA()) {
            // empty if block
        }
    }

    public fl_2 BC() {
        super.clear();
        this.AF().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.pq;
    }

    public fj_2 Bz() {
        return fj_2.By();
    }

    public fj_2 BD() {
        fj_2 fj_22 = this.BE();
        if (!fj_22.isInitialized()) {
            throw fl_2.newUninitializedMessageException((Message)fj_22);
        }
        return fj_22;
    }

    public fj_2 BE() {
        fj_2 fj_22 = new fj_2(this);
        int n = this.an;
        fj_22.qv = this.Ar();
        fj_22.qv.makeImmutable();
        this.onBuilt();
        return fj_22;
    }

    public fl_2 BF() {
        return (fl_2)super.clone();
    }

    public fl_2 bU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fl_2)super.setField(fieldDescriptor, object);
    }

    public fl_2 ax(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fl_2)super.clearField(fieldDescriptor);
    }

    public fl_2 ax(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fl_2)super.clearOneof(oneofDescriptor);
    }

    public fl_2 ax(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fl_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fl_2 bV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fl_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fl_2 ax(Message message) {
        if (message instanceof fj_2) {
            return this.c((fj_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fl_2 c(fj_2 fj_22) {
        if (fj_22 == fj_2.By()) {
            return this;
        }
        this.AF().mergeFrom(fj_22.Ar());
        this.bV(fj_2.b(fj_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public fl_2 dt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fj_2 fj_22 = null;
        try {
            fj_22 = (fj_2)fj_2.qQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fj_22 = (fj_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fj_22 != null) {
                this.c(fj_22);
            }
        }
        return this;
    }

    private MapField<Integer, ff_2> Ar() {
        if (this.qv == null) {
            return MapField.emptyMapField(fm_2.qR);
        }
        return this.qv;
    }

    private MapField<Integer, ff_2> AF() {
        this.onChanged();
        if (this.qv == null) {
            this.qv = MapField.newMapField(fm_2.qR);
        }
        if (!this.qv.isMutable()) {
            this.qv = this.qv.copy();
        }
        return this.qv;
    }

    @Override
    public int As() {
        return this.Ar().getMap().size();
    }

    @Override
    public boolean cs(int n) {
        return this.Ar().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, ff_2> At() {
        return this.Au();
    }

    @Override
    public Map<Integer, ff_2> Au() {
        return this.Ar().getMap();
    }

    @Override
    public ff_2 a(int n, ff_2 ff_22) {
        Map map = this.Ar().getMap();
        return map.containsKey(n) ? (ff_2)map.get(n) : ff_22;
    }

    @Override
    public ff_2 cA(int n) {
        Map map = this.Ar().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ff_2)map.get(n);
    }

    public fl_2 BG() {
        this.AF().getMutableMap().clear();
        return this;
    }

    public fl_2 cB(int n) {
        this.AF().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, ff_2> AH() {
        return this.AF().getMutableMap();
    }

    public fl_2 b(int n, ff_2 ff_22) {
        if (ff_22 == null) {
            throw new NullPointerException("map value");
        }
        this.AF().getMutableMap().put(n, ff_22);
        return this;
    }

    public fl_2 h(Map<Integer, ff_2> map) {
        this.AF().getMutableMap().putAll(map);
        return this;
    }

    public final fl_2 bU(UnknownFieldSet unknownFieldSet) {
        return (fl_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fl_2 bV(UnknownFieldSet unknownFieldSet) {
        return (fl_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ax(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ax(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ax(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.BC();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.BF();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ax(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.BC();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ax(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.BF();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ax(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ax(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ax(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.BF();
    }

    public /* synthetic */ Message buildPartial() {
        return this.BE();
    }

    public /* synthetic */ Message build() {
        return this.BD();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ax(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.BC();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.BF();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.BE();
    }

    public /* synthetic */ MessageLite build() {
        return this.BD();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.BC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Bz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Bz();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.BF();
    }

    public /* synthetic */ Object clone() {
        return this.BF();
    }
}

