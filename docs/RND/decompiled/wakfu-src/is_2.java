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
 * Renamed from iS
 */
public final class is_2
extends GeneratedMessageV3.Builder<is_2>
implements it_2 {
    private int an;
    private long zW;
    private int zY;
    private int Aa;
    private long Ac;
    private int oq;

    public static final Descriptors.Descriptor RJ() {
        return ih_2.wD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wE.ensureFieldAccessorsInitialized(iq_1.class, is_2.class);
    }

    is_2() {
        this.D();
    }

    is_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (iq_1.ju()) {
            // empty if block
        }
    }

    public is_2 RK() {
        super.clear();
        this.zW = 0L;
        this.an &= 0xFFFFFFFE;
        this.zY = 0;
        this.an &= 0xFFFFFFFD;
        this.Aa = 0;
        this.an &= 0xFFFFFFFB;
        this.Ac = 0L;
        this.an &= 0xFFFFFFF7;
        this.oq = 0;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wD;
    }

    public iq_1 RI() {
        return iq_1.RH();
    }

    public iq_1 RL() {
        iq_1 iq_12 = this.RM();
        if (!iq_12.isInitialized()) {
            throw is_2.newUninitializedMessageException((Message)iq_12);
        }
        return iq_12;
    }

    public iq_1 RM() {
        iq_1 iq_12 = new iq_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            iq_12.zW = this.zW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            iq_12.zY = this.zY;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            iq_12.Aa = this.Aa;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            iq_12.Ac = this.Ac;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            iq_12.oq = this.oq;
            n2 |= 0x10;
        }
        iq_12.an = n2;
        this.onBuilt();
        return iq_12;
    }

    public is_2 RN() {
        return (is_2)super.clone();
    }

    public is_2 dk(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is_2)super.setField(fieldDescriptor, object);
    }

    public is_2 bf(Descriptors.FieldDescriptor fieldDescriptor) {
        return (is_2)super.clearField(fieldDescriptor);
    }

    public is_2 bf(Descriptors.OneofDescriptor oneofDescriptor) {
        return (is_2)super.clearOneof(oneofDescriptor);
    }

    public is_2 bf(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (is_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public is_2 dl(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public is_2 bf(Message message) {
        if (message instanceof iq_1) {
            return this.e((iq_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public is_2 e(iq_1 iq_12) {
        if (iq_12 == iq_1.RH()) {
            return this;
        }
        if (iq_12.Rw()) {
            this.ap(iq_12.Rx());
        }
        if (iq_12.Ry()) {
            this.eN(iq_12.Rz());
        }
        if (iq_12.RA()) {
            this.eO(iq_12.RB());
        }
        if (iq_12.RC()) {
            this.aq(iq_12.RD());
        }
        if (iq_12.xS()) {
            this.eP(iq_12.xT());
        }
        this.dl(iq_1.d(iq_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public is_2 fr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iq_1 iq_12 = null;
        try {
            iq_12 = (iq_1)iq_1.Af.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iq_12 = (iq_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iq_12 != null) {
                this.e(iq_12);
            }
        }
        return this;
    }

    @Override
    public boolean Rw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Rx() {
        return this.zW;
    }

    public is_2 ap(long l) {
        this.an |= 1;
        this.zW = l;
        this.onChanged();
        return this;
    }

    public is_2 RO() {
        this.an &= 0xFFFFFFFE;
        this.zW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ry() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Rz() {
        return this.zY;
    }

    public is_2 eN(int n) {
        this.an |= 2;
        this.zY = n;
        this.onChanged();
        return this;
    }

    public is_2 RP() {
        this.an &= 0xFFFFFFFD;
        this.zY = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean RA() {
        return (this.an & 4) != 0;
    }

    @Override
    public int RB() {
        return this.Aa;
    }

    public is_2 eO(int n) {
        this.an |= 4;
        this.Aa = n;
        this.onChanged();
        return this;
    }

    public is_2 RQ() {
        this.an &= 0xFFFFFFFB;
        this.Aa = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean RC() {
        return (this.an & 8) != 0;
    }

    @Override
    public long RD() {
        return this.Ac;
    }

    public is_2 aq(long l) {
        this.an |= 8;
        this.Ac = l;
        this.onChanged();
        return this;
    }

    public is_2 RR() {
        this.an &= 0xFFFFFFF7;
        this.Ac = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    public is_2 eP(int n) {
        this.an |= 0x10;
        this.oq = n;
        this.onChanged();
        return this;
    }

    public is_2 RS() {
        this.an &= 0xFFFFFFEF;
        this.oq = 0;
        this.onChanged();
        return this;
    }

    public final is_2 dk(UnknownFieldSet unknownFieldSet) {
        return (is_2)super.setUnknownFields(unknownFieldSet);
    }

    public final is_2 dl(UnknownFieldSet unknownFieldSet) {
        return (is_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dl(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dk(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dl(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bf(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bf(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bf(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dk(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.RK();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.RN();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dl(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bf(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.RK();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bf(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.RN();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dl(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dk(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dl(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bf(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bf(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bf(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dk(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.RN();
    }

    public /* synthetic */ Message buildPartial() {
        return this.RM();
    }

    public /* synthetic */ Message build() {
        return this.RL();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bf(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.RK();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.RN();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.RM();
    }

    public /* synthetic */ MessageLite build() {
        return this.RL();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.RK();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.RI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.RI();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.RN();
    }

    public /* synthetic */ Object clone() {
        return this.RN();
    }
}

