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
 * Renamed from jz
 */
public final class jz_1
extends GeneratedMessageV3.Builder<jz_1>
implements ja_1 {
    private int an;
    private long Cp;
    private long Cr;
    private boolean Ct;
    private int Cv;
    private int Cx;
    private int Cz;
    private long CB;

    public static final Descriptors.Descriptor Wd() {
        return iu_2.Aq;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ar.ensureFieldAccessorsInitialized(jx_1.class, jz_1.class);
    }

    jz_1() {
        this.D();
    }

    jz_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jx_1.gb()) {
            // empty if block
        }
    }

    public jz_1 We() {
        super.clear();
        this.Cp = 0L;
        this.an &= 0xFFFFFFFE;
        this.Cr = 0L;
        this.an &= 0xFFFFFFFD;
        this.Ct = false;
        this.an &= 0xFFFFFFFB;
        this.Cv = 0;
        this.an &= 0xFFFFFFF7;
        this.Cx = 0;
        this.an &= 0xFFFFFFEF;
        this.Cz = 0;
        this.an &= 0xFFFFFFDF;
        this.CB = 0L;
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Aq;
    }

    public jx_1 Wc() {
        return jx_1.Wb();
    }

    public jx_1 Wf() {
        jx_1 jx_12 = this.Wg();
        if (!jx_12.isInitialized()) {
            throw jz_1.newUninitializedMessageException((Message)jx_12);
        }
        return jx_12;
    }

    public jx_1 Wg() {
        jx_1 jx_12 = new jx_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jx_12.Cp = this.Cp;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jx_12.Cr = this.Cr;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            jx_12.Ct = this.Ct;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            jx_12.Cv = this.Cv;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            jx_12.Cx = this.Cx;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            jx_12.Cz = this.Cz;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            jx_12.CB = this.CB;
            n2 |= 0x40;
        }
        jx_12.an = n2;
        this.onBuilt();
        return jx_12;
    }

    public jz_1 Wh() {
        return (jz_1)super.clone();
    }

    public jz_1 dA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jz_1)super.setField(fieldDescriptor, object);
    }

    public jz_1 bn(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jz_1)super.clearField(fieldDescriptor);
    }

    public jz_1 bn(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jz_1)super.clearOneof(oneofDescriptor);
    }

    public jz_1 bn(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jz_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jz_1 dB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jz_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jz_1 bn(Message message) {
        if (message instanceof jx_1) {
            return this.g((jx_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jz_1 g(jx_1 jx_12) {
        if (jx_12 == jx_1.Wb()) {
            return this;
        }
        if (jx_12.VK()) {
            this.aA(jx_12.VL());
        }
        if (jx_12.VM()) {
            this.aB(jx_12.VN());
        }
        if (jx_12.VO()) {
            this.N(jx_12.VP());
        }
        if (jx_12.VQ()) {
            this.fB(jx_12.VR());
        }
        if (jx_12.VS()) {
            this.fC(jx_12.VT());
        }
        if (jx_12.VU()) {
            this.fD(jx_12.VV());
        }
        if (jx_12.VW()) {
            this.aC(jx_12.VX());
        }
        this.dB(jx_1.f(jx_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public jz_1 fP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jx_1 jx_12 = null;
        try {
            jx_12 = (jx_1)jx_1.CD.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jx_12 = (jx_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jx_12 != null) {
                this.g(jx_12);
            }
        }
        return this;
    }

    @Override
    public boolean VK() {
        return (this.an & 1) != 0;
    }

    @Override
    public long VL() {
        return this.Cp;
    }

    public jz_1 aA(long l) {
        this.an |= 1;
        this.Cp = l;
        this.onChanged();
        return this;
    }

    public jz_1 Wi() {
        this.an &= 0xFFFFFFFE;
        this.Cp = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VM() {
        return (this.an & 2) != 0;
    }

    @Override
    public long VN() {
        return this.Cr;
    }

    public jz_1 aB(long l) {
        this.an |= 2;
        this.Cr = l;
        this.onChanged();
        return this;
    }

    public jz_1 Wj() {
        this.an &= 0xFFFFFFFD;
        this.Cr = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VO() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean VP() {
        return this.Ct;
    }

    public jz_1 N(boolean bl) {
        this.an |= 4;
        this.Ct = bl;
        this.onChanged();
        return this;
    }

    public jz_1 Wk() {
        this.an &= 0xFFFFFFFB;
        this.Ct = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VQ() {
        return (this.an & 8) != 0;
    }

    @Override
    public int VR() {
        return this.Cv;
    }

    public jz_1 fB(int n) {
        this.an |= 8;
        this.Cv = n;
        this.onChanged();
        return this;
    }

    public jz_1 Wl() {
        this.an &= 0xFFFFFFF7;
        this.Cv = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VS() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int VT() {
        return this.Cx;
    }

    public jz_1 fC(int n) {
        this.an |= 0x10;
        this.Cx = n;
        this.onChanged();
        return this;
    }

    public jz_1 Wm() {
        this.an &= 0xFFFFFFEF;
        this.Cx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VU() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int VV() {
        return this.Cz;
    }

    public jz_1 fD(int n) {
        this.an |= 0x20;
        this.Cz = n;
        this.onChanged();
        return this;
    }

    public jz_1 Wn() {
        this.an &= 0xFFFFFFDF;
        this.Cz = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean VW() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long VX() {
        return this.CB;
    }

    public jz_1 aC(long l) {
        this.an |= 0x40;
        this.CB = l;
        this.onChanged();
        return this;
    }

    public jz_1 Wo() {
        this.an &= 0xFFFFFFBF;
        this.CB = 0L;
        this.onChanged();
        return this;
    }

    public final jz_1 dA(UnknownFieldSet unknownFieldSet) {
        return (jz_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jz_1 dB(UnknownFieldSet unknownFieldSet) {
        return (jz_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bn(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bn(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bn(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.We();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Wh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bn(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.We();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bn(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Wh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bn(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bn(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bn(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Wh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Wg();
    }

    public /* synthetic */ Message build() {
        return this.Wf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bn(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.We();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Wh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Wg();
    }

    public /* synthetic */ MessageLite build() {
        return this.Wf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.We();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Wc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Wc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Wh();
    }

    public /* synthetic */ Object clone() {
        return this.Wh();
    }
}

