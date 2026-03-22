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
 * Renamed from hv
 */
public final class hv_1
extends GeneratedMessageV3.Builder<hv_1>
implements hx_1 {
    private int an;
    private int uI;
    private int uK;
    private int uM;
    private MapField<Integer, hy_1> uO;

    public static final Descriptors.Descriptor IB() {
        return hh_1.ua;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 4: {
                return this.Is();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 4: {
                return this.IJ();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.ub.ensureFieldAccessorsInitialized(ht_1.class, hv_1.class);
    }

    hv_1() {
        this.D();
    }

    hv_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ht_1.el()) {
            // empty if block
        }
    }

    public hv_1 IC() {
        super.clear();
        this.uI = 0;
        this.an &= 0xFFFFFFFE;
        this.uK = 0;
        this.an &= 0xFFFFFFFD;
        this.uM = 0;
        this.an &= 0xFFFFFFFB;
        this.IJ().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hh_1.ua;
    }

    public ht_1 IA() {
        return ht_1.Iz();
    }

    public ht_1 ID() {
        ht_1 ht_12 = this.IE();
        if (!ht_12.isInitialized()) {
            throw hv_1.newUninitializedMessageException((Message)ht_12);
        }
        return ht_12;
    }

    public ht_1 IE() {
        ht_1 ht_12 = new ht_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ht_12.uI = this.uI;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ht_12.uK = this.uK;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ht_12.uM = this.uM;
            n2 |= 4;
        }
        ht_12.uO = this.Is();
        ht_12.uO.makeImmutable();
        ht_12.an = n2;
        this.onBuilt();
        return ht_12;
    }

    public hv_1 IF() {
        return (hv_1)super.clone();
    }

    public hv_1 cC(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hv_1)super.setField(fieldDescriptor, object);
    }

    public hv_1 aO(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hv_1)super.clearField(fieldDescriptor);
    }

    public hv_1 aO(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hv_1)super.clearOneof(oneofDescriptor);
    }

    public hv_1 aO(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hv_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hv_1 cD(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hv_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public hv_1 aO(Message message) {
        if (message instanceof ht_1) {
            return this.c((ht_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hv_1 c(ht_1 ht_12) {
        if (ht_12 == ht_1.Iz()) {
            return this;
        }
        if (ht_12.Im()) {
            this.dB(ht_12.In());
        }
        if (ht_12.Io()) {
            this.dC(ht_12.Ip());
        }
        if (ht_12.Iq()) {
            this.dD(ht_12.Ir());
        }
        this.IJ().mergeFrom(ht_12.Is());
        this.cD(ht_1.b(ht_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Im()) {
            return false;
        }
        if (!this.Io()) {
            return false;
        }
        for (hy_1 hy_12 : this.Iv().values()) {
            if (hy_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hv_1 es(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ht_1 ht_12 = null;
        try {
            ht_12 = (ht_1)ht_1.uQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ht_12 = (ht_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ht_12 != null) {
                this.c(ht_12);
            }
        }
        return this;
    }

    @Override
    public boolean Im() {
        return (this.an & 1) != 0;
    }

    @Override
    public int In() {
        return this.uI;
    }

    public hv_1 dB(int n) {
        this.an |= 1;
        this.uI = n;
        this.onChanged();
        return this;
    }

    public hv_1 IG() {
        this.an &= 0xFFFFFFFE;
        this.uI = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Io() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Ip() {
        return this.uK;
    }

    public hv_1 dC(int n) {
        this.an |= 2;
        this.uK = n;
        this.onChanged();
        return this;
    }

    public hv_1 IH() {
        this.an &= 0xFFFFFFFD;
        this.uK = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Iq() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Ir() {
        return this.uM;
    }

    public hv_1 dD(int n) {
        this.an |= 4;
        this.uM = n;
        this.onChanged();
        return this;
    }

    public hv_1 II() {
        this.an &= 0xFFFFFFFB;
        this.uM = 0;
        this.onChanged();
        return this;
    }

    private MapField<Integer, hy_1> Is() {
        if (this.uO == null) {
            return MapField.emptyMapField(hw_1.uR);
        }
        return this.uO;
    }

    private MapField<Integer, hy_1> IJ() {
        this.onChanged();
        if (this.uO == null) {
            this.uO = MapField.newMapField(hw_1.uR);
        }
        if (!this.uO.isMutable()) {
            this.uO = this.uO.copy();
        }
        return this.uO;
    }

    @Override
    public int It() {
        return this.Is().getMap().size();
    }

    @Override
    public boolean dz(int n) {
        return this.Is().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, hy_1> Iu() {
        return this.Iv();
    }

    @Override
    public Map<Integer, hy_1> Iv() {
        return this.Is().getMap();
    }

    @Override
    public hy_1 a(int n, hy_1 hy_12) {
        Map map = this.Is().getMap();
        return map.containsKey(n) ? (hy_1)map.get(n) : hy_12;
    }

    @Override
    public hy_1 dA(int n) {
        Map map = this.Is().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hy_1)map.get(n);
    }

    public hv_1 IK() {
        this.IJ().getMutableMap().clear();
        return this;
    }

    public hv_1 dE(int n) {
        this.IJ().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, hy_1> IL() {
        return this.IJ().getMutableMap();
    }

    public hv_1 b(int n, hy_1 hy_12) {
        if (hy_12 == null) {
            throw new NullPointerException("map value");
        }
        this.IJ().getMutableMap().put(n, hy_12);
        return this;
    }

    public hv_1 m(Map<Integer, hy_1> map) {
        this.IJ().getMutableMap().putAll(map);
        return this;
    }

    public final hv_1 cC(UnknownFieldSet unknownFieldSet) {
        return (hv_1)super.setUnknownFields(unknownFieldSet);
    }

    public final hv_1 cD(UnknownFieldSet unknownFieldSet) {
        return (hv_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cD(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cC(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cD(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aO(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aO(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aO(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cC(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.IC();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.IF();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cD(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.es(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aO(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.IC();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aO(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.IF();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cD(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cC(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cD(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aO(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aO(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aO(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cC(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.es(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.IF();
    }

    public /* synthetic */ Message buildPartial() {
        return this.IE();
    }

    public /* synthetic */ Message build() {
        return this.ID();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aO(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.IC();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.es(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.IF();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.IE();
    }

    public /* synthetic */ MessageLite build() {
        return this.ID();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.IC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.IA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.IA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.es(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.IF();
    }

    public /* synthetic */ Object clone() {
        return this.IF();
    }
}

