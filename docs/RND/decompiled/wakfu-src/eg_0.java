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
 * Renamed from eg
 */
public final class eg_0
extends GeneratedMessageV3.Builder<eg_0>
implements ei_0 {
    private int an;
    private MapField<Integer, ea> mv;

    public static final Descriptors.Descriptor uC() {
        return dV.lX;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.ut();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.uH();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.lY.ensureFieldAccessorsInitialized(ee_0.class, eg_0.class);
    }

    eg_0() {
        this.D();
    }

    eg_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ee_0.aJ()) {
            // empty if block
        }
    }

    public eg_0 uD() {
        super.clear();
        this.uH().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dV.lX;
    }

    public ee_0 uB() {
        return ee_0.uA();
    }

    public ee_0 uE() {
        ee_0 ee_02 = this.uF();
        if (!ee_02.isInitialized()) {
            throw eg_0.newUninitializedMessageException((Message)ee_02);
        }
        return ee_02;
    }

    public ee_0 uF() {
        ee_0 ee_02 = new ee_0(this);
        int n = this.an;
        ee_02.mv = this.ut();
        ee_02.mv.makeImmutable();
        this.onBuilt();
        return ee_02;
    }

    public eg_0 uG() {
        return (eg_0)super.clone();
    }

    public eg_0 bm(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eg_0)super.setField(fieldDescriptor, object);
    }

    public eg_0 ag(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eg_0)super.clearField(fieldDescriptor);
    }

    public eg_0 ag(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eg_0)super.clearOneof(oneofDescriptor);
    }

    public eg_0 ag(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eg_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eg_0 bn(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eg_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public eg_0 ag(Message message) {
        if (message instanceof ee_0) {
            return this.c((ee_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eg_0 c(ee_0 ee_02) {
        if (ee_02 == ee_0.uA()) {
            return this;
        }
        this.uH().mergeFrom(ee_02.ut());
        this.bn(ee_0.b(ee_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (ea ea2 : this.uw().values()) {
            if (ea2.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public eg_0 cu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ee_0 ee_02 = null;
        try {
            ee_02 = (ee_0)ee_0.mx.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ee_02 = (ee_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ee_02 != null) {
                this.c(ee_02);
            }
        }
        return this;
    }

    private MapField<Integer, ea> ut() {
        if (this.mv == null) {
            return MapField.emptyMapField(eh_0.my);
        }
        return this.mv;
    }

    private MapField<Integer, ea> uH() {
        this.onChanged();
        if (this.mv == null) {
            this.mv = MapField.newMapField(eh_0.my);
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
    public Map<Integer, ea> uv() {
        return this.uw();
    }

    @Override
    public Map<Integer, ea> uw() {
        return this.ut().getMap();
    }

    @Override
    public ea a(int n, ea ea2) {
        Map map = this.ut().getMap();
        return map.containsKey(n) ? (ea)map.get(n) : ea2;
    }

    @Override
    public ea bo(int n) {
        Map map = this.ut().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ea)map.get(n);
    }

    public eg_0 uI() {
        this.uH().getMutableMap().clear();
        return this;
    }

    public eg_0 bp(int n) {
        this.uH().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, ea> uJ() {
        return this.uH().getMutableMap();
    }

    public eg_0 b(int n, ea ea2) {
        if (ea2 == null) {
            throw new NullPointerException("map value");
        }
        this.uH().getMutableMap().put(n, ea2);
        return this;
    }

    public eg_0 f(Map<Integer, ea> map) {
        this.uH().getMutableMap().putAll(map);
        return this;
    }

    public final eg_0 bm(UnknownFieldSet unknownFieldSet) {
        return (eg_0)super.setUnknownFields(unknownFieldSet);
    }

    public final eg_0 bn(UnknownFieldSet unknownFieldSet) {
        return (eg_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bn(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bm(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bn(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ag(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ag(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ag(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bm(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.uD();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.uG();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bn(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ag(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.uD();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ag(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.uG();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bn(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bm(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bn(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ag(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ag(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ag(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bm(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.uG();
    }

    public /* synthetic */ Message buildPartial() {
        return this.uF();
    }

    public /* synthetic */ Message build() {
        return this.uE();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ag(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.uD();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.uG();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.uF();
    }

    public /* synthetic */ MessageLite build() {
        return this.uE();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.uD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.uB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.uB();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.uG();
    }

    public /* synthetic */ Object clone() {
        return this.uG();
    }
}

