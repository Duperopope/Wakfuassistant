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
 * Renamed from hk
 */
public final class hk_1
extends GeneratedMessageV3.Builder<hk_1>
implements hq_1 {
    private int an;
    private MapField<Long, hm_1> ug;

    public static final Descriptors.Descriptor HD() {
        return hh_1.tU;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Hu();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.HI();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tV.ensureFieldAccessorsInitialized(hi_1.class, hk_1.class);
    }

    hk_1() {
        this.D();
    }

    hk_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hi_1.fa()) {
            // empty if block
        }
    }

    public hk_1 HE() {
        super.clear();
        this.HI().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hh_1.tU;
    }

    public hi_1 HC() {
        return hi_1.HB();
    }

    public hi_1 HF() {
        hi_1 hi_12 = this.HG();
        if (!hi_12.isInitialized()) {
            throw hk_1.newUninitializedMessageException((Message)hi_12);
        }
        return hi_12;
    }

    public hi_1 HG() {
        hi_1 hi_12 = new hi_1(this);
        int n = this.an;
        hi_12.ug = this.Hu();
        hi_12.ug.makeImmutable();
        this.onBuilt();
        return hi_12;
    }

    public hk_1 HH() {
        return (hk_1)super.clone();
    }

    public hk_1 cy(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hk_1)super.setField(fieldDescriptor, object);
    }

    public hk_1 aM(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hk_1)super.clearField(fieldDescriptor);
    }

    public hk_1 aM(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hk_1)super.clearOneof(oneofDescriptor);
    }

    public hk_1 aM(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hk_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hk_1 cz(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hk_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public hk_1 aM(Message message) {
        if (message instanceof hi_1) {
            return this.c((hi_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hk_1 c(hi_1 hi_12) {
        if (hi_12 == hi_1.HB()) {
            return this;
        }
        this.HI().mergeFrom(hi_12.Hu());
        this.cz(hi_1.b(hi_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (hm_1 hm_12 : this.Hx().values()) {
            if (hm_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hk_1 em(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hi_1 hi_12 = null;
        try {
            hi_12 = (hi_1)hi_1.ui.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hi_12 = (hi_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hi_12 != null) {
                this.c(hi_12);
            }
        }
        return this;
    }

    private MapField<Long, hm_1> Hu() {
        if (this.ug == null) {
            return MapField.emptyMapField(hl_1.uj);
        }
        return this.ug;
    }

    private MapField<Long, hm_1> HI() {
        this.onChanged();
        if (this.ug == null) {
            this.ug = MapField.newMapField(hl_1.uj);
        }
        if (!this.ug.isMutable()) {
            this.ug = this.ug.copy();
        }
        return this.ug;
    }

    @Override
    public int Hv() {
        return this.Hu().getMap().size();
    }

    @Override
    public boolean V(long l) {
        return this.Hu().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, hm_1> Hw() {
        return this.Hx();
    }

    @Override
    public Map<Long, hm_1> Hx() {
        return this.Hu().getMap();
    }

    @Override
    public hm_1 a(long l, hm_1 hm_12) {
        Map map = this.Hu().getMap();
        return map.containsKey(l) ? (hm_1)map.get(l) : hm_12;
    }

    @Override
    public hm_1 W(long l) {
        Map map = this.Hu().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (hm_1)map.get(l);
    }

    public hk_1 HJ() {
        this.HI().getMutableMap().clear();
        return this;
    }

    public hk_1 X(long l) {
        this.HI().getMutableMap().remove(l);
        return this;
    }

    @Deprecated
    public Map<Long, hm_1> HK() {
        return this.HI().getMutableMap();
    }

    public hk_1 b(long l, hm_1 hm_12) {
        if (hm_12 == null) {
            throw new NullPointerException("map value");
        }
        this.HI().getMutableMap().put(l, hm_12);
        return this;
    }

    public hk_1 l(Map<Long, hm_1> map) {
        this.HI().getMutableMap().putAll(map);
        return this;
    }

    public final hk_1 cy(UnknownFieldSet unknownFieldSet) {
        return (hk_1)super.setUnknownFields(unknownFieldSet);
    }

    public final hk_1 cz(UnknownFieldSet unknownFieldSet) {
        return (hk_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cz(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cy(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cz(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aM(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aM(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aM(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cy(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.HE();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.HH();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cz(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.em(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aM(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.HE();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aM(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.HH();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cz(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cy(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cz(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aM(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aM(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aM(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cy(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.em(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.HH();
    }

    public /* synthetic */ Message buildPartial() {
        return this.HG();
    }

    public /* synthetic */ Message build() {
        return this.HF();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aM(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.HE();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.em(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.HH();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.HG();
    }

    public /* synthetic */ MessageLite build() {
        return this.HF();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.HE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.HC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.HC();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.em(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.HH();
    }

    public /* synthetic */ Object clone() {
        return this.HH();
    }
}

