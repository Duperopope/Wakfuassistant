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

public final class hW
extends GeneratedMessageV3.Builder<hW>
implements hY {
    private int an;
    private MapField<Integer, hZ> mv;
    private long wf;

    public static final Descriptors.Descriptor La() {
        return hL.vK;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.ut();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.uH();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vL.ensureFieldAccessorsInitialized(hU.class, hW.class);
    }

    hW() {
        this.D();
    }

    hW(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hU.pT()) {
            // empty if block
        }
    }

    public hW Lb() {
        super.clear();
        this.uH().clear();
        this.wf = 0L;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hL.vK;
    }

    public hU KZ() {
        return hU.KY();
    }

    public hU Lc() {
        hU hU2 = this.Ld();
        if (!hU2.isInitialized()) {
            throw hW.newUninitializedMessageException((Message)hU2);
        }
        return hU2;
    }

    public hU Ld() {
        hU hU2 = new hU(this);
        int n = this.an;
        int n2 = 0;
        hU2.mv = this.ut();
        hU2.mv.makeImmutable();
        if ((n & 2) != 0) {
            hU2.wf = this.wf;
            n2 |= 1;
        }
        hU2.an = n2;
        this.onBuilt();
        return hU2;
    }

    public hW Le() {
        return (hW)super.clone();
    }

    public hW cO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hW)super.setField(fieldDescriptor, object);
    }

    public hW aU(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hW)super.clearField(fieldDescriptor);
    }

    public hW aU(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hW)super.clearOneof(oneofDescriptor);
    }

    public hW aU(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hW)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hW cP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hW)super.addRepeatedField(fieldDescriptor, object);
    }

    public hW aU(Message message) {
        if (message instanceof hU) {
            return this.d((hU)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hW d(hU hU2) {
        if (hU2 == hU.KY()) {
            return this;
        }
        this.uH().mergeFrom(hU2.ut());
        if (hU2.KT()) {
            this.ac(hU2.KU());
        }
        this.cP(hU.c(hU2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (hZ hZ2 : this.uw().values()) {
            if (hZ2.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hW eK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hU hU2 = null;
        try {
            hU2 = (hU)hU.wh.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hU2 = (hU)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hU2 != null) {
                this.d(hU2);
            }
        }
        return this;
    }

    private MapField<Integer, hZ> ut() {
        if (this.mv == null) {
            return MapField.emptyMapField(hX.wi);
        }
        return this.mv;
    }

    private MapField<Integer, hZ> uH() {
        this.onChanged();
        if (this.mv == null) {
            this.mv = MapField.newMapField(hX.wi);
        }
        if (!this.mv.isMutable()) {
            this.mv = this.mv.copy();
        }
        return this.mv;
    }

    @Override
    public int uu() {
        return this.ut().getMap().size();
    }

    @Override
    public boolean bn(int n) {
        return this.ut().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, hZ> uv() {
        return this.uw();
    }

    @Override
    public Map<Integer, hZ> uw() {
        return this.ut().getMap();
    }

    @Override
    public hZ a(int n, hZ hZ2) {
        Map map = this.ut().getMap();
        return map.containsKey(n) ? (hZ)map.get(n) : hZ2;
    }

    @Override
    public hZ eb(int n) {
        Map map = this.ut().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hZ)map.get(n);
    }

    public hW Lf() {
        this.uH().getMutableMap().clear();
        return this;
    }

    public hW ec(int n) {
        this.uH().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, hZ> uJ() {
        return this.uH().getMutableMap();
    }

    public hW b(int n, hZ hZ2) {
        if (hZ2 == null) {
            throw new NullPointerException("map value");
        }
        this.uH().getMutableMap().put(n, hZ2);
        return this;
    }

    public hW n(Map<Integer, hZ> map) {
        this.uH().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean KT() {
        return (this.an & 2) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public hW ac(long l) {
        this.an |= 2;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public hW Lg() {
        this.an &= 0xFFFFFFFD;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    public final hW cO(UnknownFieldSet unknownFieldSet) {
        return (hW)super.setUnknownFields(unknownFieldSet);
    }

    public final hW cP(UnknownFieldSet unknownFieldSet) {
        return (hW)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aU(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aU(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aU(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Lb();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Le();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aU(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Lb();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aU(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Le();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aU(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aU(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aU(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Le();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Ld();
    }

    public /* synthetic */ Message build() {
        return this.Lc();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aU(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Lb();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Le();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Ld();
    }

    public /* synthetic */ MessageLite build() {
        return this.Lc();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Lb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.KZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.KZ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Le();
    }

    public /* synthetic */ Object clone() {
        return this.Le();
    }
}

