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
 * Renamed from iX
 */
public final class ix_2
extends GeneratedMessageV3.Builder<ix_2>
implements iy_2 {
    private int an;
    private int qB;
    private int jq;
    private boolean AA;
    private boolean AC;

    public static final Descriptors.Descriptor Sd() {
        return iu_2.Ao;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ap.ensureFieldAccessorsInitialized(iv_2.class, ix_2.class);
    }

    ix_2() {
        this.D();
    }

    ix_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (iv_2.jh()) {
            // empty if block
        }
    }

    public ix_2 Se() {
        super.clear();
        this.qB = 0;
        this.an &= 0xFFFFFFFE;
        this.jq = 0;
        this.an &= 0xFFFFFFFD;
        this.AA = false;
        this.an &= 0xFFFFFFFB;
        this.AC = false;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Ao;
    }

    public iv_2 Sc() {
        return iv_2.Sb();
    }

    public iv_2 Sf() {
        iv_2 iv_22 = this.Sg();
        if (!iv_22.isInitialized()) {
            throw ix_2.newUninitializedMessageException((Message)iv_22);
        }
        return iv_22;
    }

    public iv_2 Sg() {
        iv_2 iv_22 = new iv_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            iv_22.qB = this.qB;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            iv_22.jq = this.jq;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            iv_22.AA = this.AA;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            iv_22.AC = this.AC;
            n2 |= 8;
        }
        iv_22.an = n2;
        this.onBuilt();
        return iv_22;
    }

    public ix_2 Sh() {
        return (ix_2)super.clone();
    }

    public ix_2 dm(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ix_2)super.setField(fieldDescriptor, object);
    }

    public ix_2 bg(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ix_2)super.clearField(fieldDescriptor);
    }

    public ix_2 bg(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ix_2)super.clearOneof(oneofDescriptor);
    }

    public ix_2 bg(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ix_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ix_2 dn(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ix_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ix_2 bg(Message message) {
        if (message instanceof iv_2) {
            return this.c((iv_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ix_2 c(iv_2 iv_22) {
        if (iv_22 == iv_2.Sb()) {
            return this;
        }
        if (iv_22.AJ()) {
            this.eQ(iv_22.AK());
        }
        if (iv_22.oO()) {
            this.eR(iv_22.oP());
        }
        if (iv_22.RU()) {
            this.I(iv_22.RV());
        }
        if (iv_22.RW()) {
            this.J(iv_22.RX());
        }
        this.dn(iv_2.b(iv_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.AJ()) {
            return false;
        }
        return this.oO();
    }

    public ix_2 fu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iv_2 iv_22 = null;
        try {
            iv_22 = (iv_2)iv_2.AE.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iv_22 = (iv_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iv_22 != null) {
                this.c(iv_22);
            }
        }
        return this;
    }

    @Override
    public boolean AJ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    public ix_2 eQ(int n) {
        this.an |= 1;
        this.qB = n;
        this.onChanged();
        return this;
    }

    public ix_2 Si() {
        this.an &= 0xFFFFFFFE;
        this.qB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 2) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public ix_2 eR(int n) {
        this.an |= 2;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public ix_2 Sj() {
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean RU() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean RV() {
        return this.AA;
    }

    public ix_2 I(boolean bl) {
        this.an |= 4;
        this.AA = bl;
        this.onChanged();
        return this;
    }

    public ix_2 Sk() {
        this.an &= 0xFFFFFFFB;
        this.AA = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean RW() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean RX() {
        return this.AC;
    }

    public ix_2 J(boolean bl) {
        this.an |= 8;
        this.AC = bl;
        this.onChanged();
        return this;
    }

    public ix_2 Sl() {
        this.an &= 0xFFFFFFF7;
        this.AC = false;
        this.onChanged();
        return this;
    }

    public final ix_2 dm(UnknownFieldSet unknownFieldSet) {
        return (ix_2)super.setUnknownFields(unknownFieldSet);
    }

    public final ix_2 dn(UnknownFieldSet unknownFieldSet) {
        return (ix_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dn(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dm(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dn(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bg(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bg(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bg(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dm(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Se();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Sh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dn(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bg(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Se();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bg(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Sh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dn(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dm(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dn(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bg(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bg(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bg(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dm(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Sh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Sg();
    }

    public /* synthetic */ Message build() {
        return this.Sf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bg(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Se();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Sh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Sg();
    }

    public /* synthetic */ MessageLite build() {
        return this.Sf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Se();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Sc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Sc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fu(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Sh();
    }

    public /* synthetic */ Object clone() {
        return this.Sh();
    }
}

