/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from gl
 */
public final class gl_1
extends GeneratedMessageV3.Builder<gl_1>
implements gn_1 {
    private int an;
    private MapField<Integer, gf_2> kC;
    private dn_2 kG;
    private SingleFieldBuilderV3<dn_2, dp_1, ds_2> kK;

    public static final Descriptors.Descriptor DF() {
        return ge_2.rK;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.qJ();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.rd();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ge_2.rL.ensureFieldAccessorsInitialized(gj_1.class, gl_1.class);
    }

    gl_1() {
        this.D();
    }

    gl_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gj_1.aJ()) {
            this.rl();
        }
    }

    public gl_1 DG() {
        super.clear();
        this.rd().clear();
        if (this.kK == null) {
            this.kG = null;
        } else {
            this.kK.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ge_2.rK;
    }

    public gj_1 DE() {
        return gj_1.DD();
    }

    public gj_1 DH() {
        gj_1 gj_12 = this.DI();
        if (!gj_12.isInitialized()) {
            throw gl_1.newUninitializedMessageException((Message)gj_12);
        }
        return gj_12;
    }

    public gj_1 DI() {
        gj_1 gj_12 = new gj_1(this);
        int n = this.an;
        int n2 = 0;
        gj_12.kC = this.qJ();
        gj_12.kC.makeImmutable();
        if ((n & 2) != 0) {
            gj_12.kG = this.kK == null ? this.kG : (dn_2)this.kK.build();
            n2 |= 1;
        }
        gj_12.an = n2;
        this.onBuilt();
        return gj_12;
    }

    public gl_1 DJ() {
        return (gl_1)super.clone();
    }

    public gl_1 ce(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gl_1)super.setField(fieldDescriptor, object);
    }

    public gl_1 aC(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gl_1)super.clearField(fieldDescriptor);
    }

    public gl_1 aC(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gl_1)super.clearOneof(oneofDescriptor);
    }

    public gl_1 aC(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gl_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gl_1 cf(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gl_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gl_1 aC(Message message) {
        if (message instanceof gj_1) {
            return this.e((gj_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gl_1 e(gj_1 gj_12) {
        if (gj_12 == gj_1.DD()) {
            return this;
        }
        this.rd().mergeFrom(gj_12.qJ());
        if (gj_12.qQ()) {
            this.g(gj_12.qR());
        }
        this.cf(gj_1.d(gj_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (gf_2 gf_22 : this.qM().values()) {
            if (gf_22.isInitialized()) continue;
            return false;
        }
        return !this.qQ() || this.qR().isInitialized();
    }

    public gl_1 dI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gj_1 gj_12 = null;
        try {
            gj_12 = (gj_1)gj_1.rZ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gj_12 = (gj_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gj_12 != null) {
                this.e(gj_12);
            }
        }
        return this;
    }

    private MapField<Integer, gf_2> qJ() {
        if (this.kC == null) {
            return MapField.emptyMapField(gm_1.sa);
        }
        return this.kC;
    }

    private MapField<Integer, gf_2> rd() {
        this.onChanged();
        if (this.kC == null) {
            this.kC = MapField.newMapField(gm_1.sa);
        }
        if (!this.kC.isMutable()) {
            this.kC = this.kC.copy();
        }
        return this.kC;
    }

    @Override
    public int qK() {
        return this.qJ().getMap().size();
    }

    @Override
    public boolean aF(int n) {
        return this.qJ().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, gf_2> qL() {
        return this.qM();
    }

    @Override
    public Map<Integer, gf_2> qM() {
        return this.qJ().getMap();
    }

    @Override
    public gf_2 a(int n, gf_2 gf_22) {
        Map map = this.qJ().getMap();
        return map.containsKey(n) ? (gf_2)map.get(n) : gf_22;
    }

    @Override
    public gf_2 cO(int n) {
        Map map = this.qJ().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (gf_2)map.get(n);
    }

    public gl_1 DK() {
        this.rd().getMutableMap().clear();
        return this;
    }

    public gl_1 cP(int n) {
        this.rd().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, gf_2> rf() {
        return this.rd().getMutableMap();
    }

    public gl_1 b(int n, gf_2 gf_22) {
        if (gf_22 == null) {
            throw new NullPointerException("map value");
        }
        this.rd().getMutableMap().put(n, gf_22);
        return this;
    }

    public gl_1 k(Map<Integer, gf_2> map) {
        this.rd().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean qQ() {
        return (this.an & 2) != 0;
    }

    @Override
    public dn_2 qR() {
        if (this.kK == null) {
            return this.kG == null ? dn_2.qt() : this.kG;
        }
        return (dn_2)this.kK.getMessage();
    }

    public gl_1 f(dn_2 dn_22) {
        if (this.kK == null) {
            if (dn_22 == null) {
                throw new NullPointerException();
            }
            this.kG = dn_22;
            this.onChanged();
        } else {
            this.kK.setMessage((AbstractMessage)dn_22);
        }
        this.an |= 2;
        return this;
    }

    public gl_1 b(dp_1 dp_12) {
        if (this.kK == null) {
            this.kG = dp_12.qx();
            this.onChanged();
        } else {
            this.kK.setMessage((AbstractMessage)dp_12.qx());
        }
        this.an |= 2;
        return this;
    }

    public gl_1 g(dn_2 dn_22) {
        if (this.kK == null) {
            this.kG = (this.an & 2) != 0 && this.kG != null && this.kG != dn_2.qt() ? dn_2.a(this.kG).c(dn_22).qy() : dn_22;
            this.onChanged();
        } else {
            this.kK.mergeFrom((AbstractMessage)dn_22);
        }
        this.an |= 2;
        return this;
    }

    public gl_1 DL() {
        if (this.kK == null) {
            this.kG = null;
            this.onChanged();
        } else {
            this.kK.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public dp_1 rk() {
        this.an |= 2;
        this.onChanged();
        return (dp_1)this.rl().getBuilder();
    }

    @Override
    public ds_2 qS() {
        if (this.kK != null) {
            return (ds_2)this.kK.getMessageOrBuilder();
        }
        return this.kG == null ? dn_2.qt() : this.kG;
    }

    private SingleFieldBuilderV3<dn_2, dp_1, ds_2> rl() {
        if (this.kK == null) {
            this.kK = new SingleFieldBuilderV3((AbstractMessage)this.qR(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.kG = null;
        }
        return this.kK;
    }

    public final gl_1 ce(UnknownFieldSet unknownFieldSet) {
        return (gl_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gl_1 cf(UnknownFieldSet unknownFieldSet) {
        return (gl_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cf(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ce(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cf(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aC(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aC(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aC(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ce(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.DG();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.DJ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cf(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aC(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.DG();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aC(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.DJ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cf(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ce(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cf(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aC(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aC(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aC(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ce(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.DJ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.DI();
    }

    public /* synthetic */ Message build() {
        return this.DH();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aC(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.DG();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.DJ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.DI();
    }

    public /* synthetic */ MessageLite build() {
        return this.DH();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.DG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.DE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.DE();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.DJ();
    }

    public /* synthetic */ Object clone() {
        return this.DJ();
    }
}

