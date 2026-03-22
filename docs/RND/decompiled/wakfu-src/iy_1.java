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
 * Renamed from iy
 */
public final class iy_1
extends GeneratedMessageV3.Builder<iy_1>
implements iz_1 {
    private int an;
    private long yJ;
    private int yL;
    private boolean yN;

    public static final Descriptors.Descriptor OY() {
        return ih_2.wB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wC.ensureFieldAccessorsInitialized(iw_1.class, iy_1.class);
    }

    iy_1() {
        this.D();
    }

    iy_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (iw_1.el()) {
            // empty if block
        }
    }

    public iy_1 OZ() {
        super.clear();
        this.yJ = 0L;
        this.an &= 0xFFFFFFFE;
        this.yL = 0;
        this.an &= 0xFFFFFFFD;
        this.yN = false;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wB;
    }

    public iw_1 OX() {
        return iw_1.OW();
    }

    public iw_1 Pa() {
        iw_1 iw_12 = this.Pb();
        if (!iw_12.isInitialized()) {
            throw iy_1.newUninitializedMessageException((Message)iw_12);
        }
        return iw_12;
    }

    public iw_1 Pb() {
        iw_1 iw_12 = new iw_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            iw_12.yJ = this.yJ;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            iw_12.yL = this.yL;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            iw_12.yN = this.yN;
            n2 |= 4;
        }
        iw_12.an = n2;
        this.onBuilt();
        return iw_12;
    }

    public iy_1 Pc() {
        return (iy_1)super.clone();
    }

    public iy_1 da(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iy_1)super.setField(fieldDescriptor, object);
    }

    public iy_1 ba(Descriptors.FieldDescriptor fieldDescriptor) {
        return (iy_1)super.clearField(fieldDescriptor);
    }

    public iy_1 ba(Descriptors.OneofDescriptor oneofDescriptor) {
        return (iy_1)super.clearOneof(oneofDescriptor);
    }

    public iy_1 ba(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (iy_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public iy_1 db(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (iy_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public iy_1 ba(Message message) {
        if (message instanceof iw_1) {
            return this.c((iw_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public iy_1 c(iw_1 iw_12) {
        if (iw_12 == iw_1.OW()) {
            return this;
        }
        if (iw_12.ON()) {
            this.ai(iw_12.OO());
        }
        if (iw_12.OP()) {
            this.eA(iw_12.OQ());
        }
        if (iw_12.OR()) {
            this.F(iw_12.OS());
        }
        this.db(iw_1.b(iw_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.ON()) {
            return false;
        }
        if (!this.OP()) {
            return false;
        }
        return this.OR();
    }

    public iy_1 fc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iw_1 iw_12 = null;
        try {
            iw_12 = (iw_1)iw_1.yP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iw_12 = (iw_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iw_12 != null) {
                this.c(iw_12);
            }
        }
        return this;
    }

    @Override
    public boolean ON() {
        return (this.an & 1) != 0;
    }

    @Override
    public long OO() {
        return this.yJ;
    }

    public iy_1 ai(long l) {
        this.an |= 1;
        this.yJ = l;
        this.onChanged();
        return this;
    }

    public iy_1 Pd() {
        this.an &= 0xFFFFFFFE;
        this.yJ = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean OP() {
        return (this.an & 2) != 0;
    }

    @Override
    public int OQ() {
        return this.yL;
    }

    public iy_1 eA(int n) {
        this.an |= 2;
        this.yL = n;
        this.onChanged();
        return this;
    }

    public iy_1 Pe() {
        this.an &= 0xFFFFFFFD;
        this.yL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean OR() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean OS() {
        return this.yN;
    }

    public iy_1 F(boolean bl) {
        this.an |= 4;
        this.yN = bl;
        this.onChanged();
        return this;
    }

    public iy_1 Pf() {
        this.an &= 0xFFFFFFFB;
        this.yN = false;
        this.onChanged();
        return this;
    }

    public final iy_1 da(UnknownFieldSet unknownFieldSet) {
        return (iy_1)super.setUnknownFields(unknownFieldSet);
    }

    public final iy_1 db(UnknownFieldSet unknownFieldSet) {
        return (iy_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.db(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.da(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.db(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ba(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ba(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ba(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.da(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.OZ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Pc();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.db(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ba(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.OZ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ba(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Pc();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.db(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.da(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.db(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ba(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ba(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ba(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.da(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Pc();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Pb();
    }

    public /* synthetic */ Message build() {
        return this.Pa();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ba(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.OZ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Pc();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Pb();
    }

    public /* synthetic */ MessageLite build() {
        return this.Pa();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.OZ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.OX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.OX();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fc(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Pc();
    }

    public /* synthetic */ Object clone() {
        return this.Pc();
    }
}

