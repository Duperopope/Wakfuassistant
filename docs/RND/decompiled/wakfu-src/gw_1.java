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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from gw
 */
public final class gw_1
extends GeneratedMessageV3.Builder<gw_1>
implements gx_1 {
    private int an;
    private int sj;
    private int lh;
    private int lj;

    public static final Descriptors.Descriptor DW() {
        return gt_1.sf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.sg.ensureFieldAccessorsInitialized(gu_1.class, gw_1.class);
    }

    gw_1() {
        this.D();
    }

    gw_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gu_1.oV()) {
            // empty if block
        }
    }

    public gw_1 DX() {
        super.clear();
        this.sj = 0;
        this.an &= 0xFFFFFFFE;
        this.lh = 0;
        this.an &= 0xFFFFFFFD;
        this.lj = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gt_1.sf;
    }

    public gu_1 DV() {
        return gu_1.DU();
    }

    public gu_1 DY() {
        gu_1 gu_12 = this.DZ();
        if (!gu_12.isInitialized()) {
            throw gw_1.newUninitializedMessageException((Message)gu_12);
        }
        return gu_12;
    }

    public gu_1 DZ() {
        gu_1 gu_12 = new gu_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            gu_12.sj = this.sj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            gu_12.lh = this.lh;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            gu_12.lj = this.lj;
            n2 |= 4;
        }
        gu_12.an = n2;
        this.onBuilt();
        return gu_12;
    }

    public gw_1 Ea() {
        return (gw_1)super.clone();
    }

    public gw_1 cg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gw_1)super.setField(fieldDescriptor, object);
    }

    public gw_1 aD(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gw_1)super.clearField(fieldDescriptor);
    }

    public gw_1 aD(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gw_1)super.clearOneof(oneofDescriptor);
    }

    public gw_1 aD(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gw_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gw_1 ch(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gw_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gw_1 aD(Message message) {
        if (message instanceof gu_1) {
            return this.c((gu_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gw_1 c(gu_1 gu_12) {
        if (gu_12 == gu_1.DU()) {
            return this;
        }
        if (gu_12.DP()) {
            this.cQ(gu_12.DQ());
        }
        if (gu_12.sk()) {
            this.cR(gu_12.sl());
        }
        if (gu_12.sm()) {
            this.cS(gu_12.sn());
        }
        this.ch(gu_1.b(gu_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.DP()) {
            return false;
        }
        if (!this.sk()) {
            return false;
        }
        return this.sm();
    }

    public gw_1 dL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gu_1 gu_12 = null;
        try {
            gu_12 = (gu_1)gu_1.sn.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gu_12 = (gu_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gu_12 != null) {
                this.c(gu_12);
            }
        }
        return this;
    }

    @Override
    public boolean DP() {
        return (this.an & 1) != 0;
    }

    @Override
    public int DQ() {
        return this.sj;
    }

    public gw_1 cQ(int n) {
        this.an |= 1;
        this.sj = n;
        this.onChanged();
        return this;
    }

    public gw_1 Eb() {
        this.an &= 0xFFFFFFFE;
        this.sj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sk() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sl() {
        return this.lh;
    }

    public gw_1 cR(int n) {
        this.an |= 2;
        this.lh = n;
        this.onChanged();
        return this;
    }

    public gw_1 Ec() {
        this.an &= 0xFFFFFFFD;
        this.lh = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean sm() {
        return (this.an & 4) != 0;
    }

    @Override
    public int sn() {
        return this.lj;
    }

    public gw_1 cS(int n) {
        this.an |= 4;
        this.lj = n;
        this.onChanged();
        return this;
    }

    public gw_1 Ed() {
        this.an &= 0xFFFFFFFB;
        this.lj = 0;
        this.onChanged();
        return this;
    }

    public final gw_1 cg(UnknownFieldSet unknownFieldSet) {
        return (gw_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gw_1 ch(UnknownFieldSet unknownFieldSet) {
        return (gw_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ch(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ch(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aD(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aD(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aD(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.DX();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Ea();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ch(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aD(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.DX();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aD(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Ea();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ch(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ch(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aD(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aD(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aD(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Ea();
    }

    public /* synthetic */ Message buildPartial() {
        return this.DZ();
    }

    public /* synthetic */ Message build() {
        return this.DY();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aD(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.DX();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Ea();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.DZ();
    }

    public /* synthetic */ MessageLite build() {
        return this.DY();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.DX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.DV();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.DV();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Ea();
    }

    public /* synthetic */ Object clone() {
        return this.Ea();
    }
}

