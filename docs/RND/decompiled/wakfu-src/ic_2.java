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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from iC
 */
public final class ic_2
extends GeneratedMessageV3.Builder<ic_2>
implements id_2 {
    private int an;
    private boolean yS;
    private int yU;
    private iw_1 yW;
    private SingleFieldBuilderV3<iw_1, iy_1, iz_1> zc;
    private long yY;
    private boolean xC;

    public static final Descriptors.Descriptor Pv() {
        return ih_2.wz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wA.ensureFieldAccessorsInitialized(ia_2.class, ic_2.class);
    }

    ic_2() {
        this.D();
    }

    ic_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ia_2.bg()) {
            this.PE();
        }
    }

    public ic_2 Pw() {
        super.clear();
        this.yS = false;
        this.an &= 0xFFFFFFFE;
        this.yU = 0;
        this.an &= 0xFFFFFFFD;
        if (this.zc == null) {
            this.yW = null;
        } else {
            this.zc.clear();
        }
        this.an &= 0xFFFFFFFB;
        this.yY = 0L;
        this.an &= 0xFFFFFFF7;
        this.xC = false;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wz;
    }

    public ia_2 Pu() {
        return ia_2.Pt();
    }

    public ia_2 Px() {
        ia_2 ia_22 = this.Py();
        if (!ia_22.isInitialized()) {
            throw ic_2.newUninitializedMessageException((Message)ia_22);
        }
        return ia_22;
    }

    public ia_2 Py() {
        ia_2 ia_22 = new ia_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ia_22.yS = this.yS;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ia_22.yU = this.yU;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ia_22.yW = this.zc == null ? this.yW : (iw_1)this.zc.build();
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            ia_22.yY = this.yY;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            ia_22.xC = this.xC;
            n2 |= 0x10;
        }
        ia_22.an = n2;
        this.onBuilt();
        return ia_22;
    }

    public ic_2 Pz() {
        return (ic_2)super.clone();
    }

    public ic_2 dc(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ic_2)super.setField(fieldDescriptor, object);
    }

    public ic_2 bb(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ic_2)super.clearField(fieldDescriptor);
    }

    public ic_2 bb(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ic_2)super.clearOneof(oneofDescriptor);
    }

    public ic_2 bb(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ic_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ic_2 dd(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ic_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ic_2 bb(Message message) {
        if (message instanceof ia_2) {
            return this.c((ia_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ic_2 c(ia_2 ia_22) {
        if (ia_22 == ia_2.Pt()) {
            return this;
        }
        if (ia_22.Ph()) {
            this.G(ia_22.Pi());
        }
        if (ia_22.Pj()) {
            this.eB(ia_22.Pk());
        }
        if (ia_22.Pl()) {
            this.e(ia_22.Pm());
        }
        if (ia_22.Po()) {
            this.aj(ia_22.Pp());
        }
        if (ia_22.MA()) {
            this.H(ia_22.MB());
        }
        this.dd(ia_2.b(ia_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Ph()) {
            return false;
        }
        if (!this.Pj()) {
            return false;
        }
        if (!this.Pl()) {
            return false;
        }
        if (!this.Po()) {
            return false;
        }
        if (!this.MA()) {
            return false;
        }
        return this.Pm().isInitialized();
    }

    public ic_2 ff(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ia_2 ia_22 = null;
        try {
            ia_22 = (ia_2)ia_2.zb.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ia_22 = (ia_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ia_22 != null) {
                this.c(ia_22);
            }
        }
        return this;
    }

    @Override
    public boolean Ph() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean Pi() {
        return this.yS;
    }

    public ic_2 G(boolean bl) {
        this.an |= 1;
        this.yS = bl;
        this.onChanged();
        return this;
    }

    public ic_2 PA() {
        this.an &= 0xFFFFFFFE;
        this.yS = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Pj() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Pk() {
        return this.yU;
    }

    public ic_2 eB(int n) {
        this.an |= 2;
        this.yU = n;
        this.onChanged();
        return this;
    }

    public ic_2 PB() {
        this.an &= 0xFFFFFFFD;
        this.yU = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Pl() {
        return (this.an & 4) != 0;
    }

    @Override
    public iw_1 Pm() {
        if (this.zc == null) {
            return this.yW == null ? iw_1.OW() : this.yW;
        }
        return (iw_1)this.zc.getMessage();
    }

    public ic_2 d(iw_1 iw_12) {
        if (this.zc == null) {
            if (iw_12 == null) {
                throw new NullPointerException();
            }
            this.yW = iw_12;
            this.onChanged();
        } else {
            this.zc.setMessage((AbstractMessage)iw_12);
        }
        this.an |= 4;
        return this;
    }

    public ic_2 a(iy_1 iy_12) {
        if (this.zc == null) {
            this.yW = iy_12.Pa();
            this.onChanged();
        } else {
            this.zc.setMessage((AbstractMessage)iy_12.Pa());
        }
        this.an |= 4;
        return this;
    }

    public ic_2 e(iw_1 iw_12) {
        if (this.zc == null) {
            this.yW = (this.an & 4) != 0 && this.yW != null && this.yW != iw_1.OW() ? iw_1.a(this.yW).c(iw_12).Pb() : iw_12;
            this.onChanged();
        } else {
            this.zc.mergeFrom((AbstractMessage)iw_12);
        }
        this.an |= 4;
        return this;
    }

    public ic_2 PC() {
        if (this.zc == null) {
            this.yW = null;
            this.onChanged();
        } else {
            this.zc.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public iy_1 PD() {
        this.an |= 4;
        this.onChanged();
        return (iy_1)this.PE().getBuilder();
    }

    @Override
    public iz_1 Pn() {
        if (this.zc != null) {
            return (iz_1)this.zc.getMessageOrBuilder();
        }
        return this.yW == null ? iw_1.OW() : this.yW;
    }

    private SingleFieldBuilderV3<iw_1, iy_1, iz_1> PE() {
        if (this.zc == null) {
            this.zc = new SingleFieldBuilderV3((AbstractMessage)this.Pm(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.yW = null;
        }
        return this.zc;
    }

    @Override
    public boolean Po() {
        return (this.an & 8) != 0;
    }

    @Override
    public long Pp() {
        return this.yY;
    }

    public ic_2 aj(long l) {
        this.an |= 8;
        this.yY = l;
        this.onChanged();
        return this;
    }

    public ic_2 PF() {
        this.an &= 0xFFFFFFF7;
        this.yY = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MA() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean MB() {
        return this.xC;
    }

    public ic_2 H(boolean bl) {
        this.an |= 0x10;
        this.xC = bl;
        this.onChanged();
        return this;
    }

    public ic_2 PG() {
        this.an &= 0xFFFFFFEF;
        this.xC = false;
        this.onChanged();
        return this;
    }

    public final ic_2 dc(UnknownFieldSet unknownFieldSet) {
        return (ic_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ic_2 dd(UnknownFieldSet unknownFieldSet) {
        return (ic_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dd(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dc(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dd(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bb(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bb(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bb(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dc(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Pw();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Pz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dd(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ff(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bb(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Pw();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bb(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Pz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dd(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dc(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dd(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bb(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bb(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bb(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dc(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ff(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Pz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Py();
    }

    public /* synthetic */ Message build() {
        return this.Px();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bb(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Pw();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ff(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Pz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Py();
    }

    public /* synthetic */ MessageLite build() {
        return this.Px();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Pw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Pu();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Pu();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ff(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Pz();
    }

    public /* synthetic */ Object clone() {
        return this.Pz();
    }
}

