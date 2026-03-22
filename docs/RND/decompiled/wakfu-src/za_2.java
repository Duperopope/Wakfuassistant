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
 * Renamed from zA
 */
public final class za_2
extends GeneratedMessageV3.Builder<za_2>
implements zb_2 {
    private int an;
    private int aor;
    private int aot;
    private int jq;
    private boolean kO;

    public static final Descriptors.Descriptor azB() {
        return zp_2.anO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anP.ensureFieldAccessorsInitialized(zy_2.class, za_2.class);
    }

    za_2() {
        this.D();
    }

    za_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zy_2.B()) {
            // empty if block
        }
    }

    public za_2 azC() {
        super.clear();
        this.aor = 0;
        this.an &= 0xFFFFFFFE;
        this.aot = 0;
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.an &= 0xFFFFFFFB;
        this.kO = false;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zp_2.anO;
    }

    public zy_2 azA() {
        return zy_2.azz();
    }

    public zy_2 azD() {
        zy_2 zy_22 = this.azE();
        if (!zy_22.isInitialized()) {
            throw za_2.newUninitializedMessageException((Message)zy_22);
        }
        return zy_22;
    }

    public zy_2 azE() {
        zy_2 zy_22 = new zy_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zy_22.aor = this.aor;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            zy_22.aot = this.aot;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            zy_22.jq = this.jq;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            zy_22.kO = this.kO;
            n2 |= 8;
        }
        zy_22.an = n2;
        this.onBuilt();
        return zy_22;
    }

    public za_2 azF() {
        return (za_2)super.clone();
    }

    public za_2 ga(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (za_2)super.setField(fieldDescriptor, object);
    }

    public za_2 cA(Descriptors.FieldDescriptor fieldDescriptor) {
        return (za_2)super.clearField(fieldDescriptor);
    }

    public za_2 cA(Descriptors.OneofDescriptor oneofDescriptor) {
        return (za_2)super.clearOneof(oneofDescriptor);
    }

    public za_2 cA(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (za_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public za_2 gb(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (za_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public za_2 cA(Message message) {
        if (message instanceof zy_2) {
            return this.e((zy_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public za_2 e(zy_2 zy_22) {
        if (zy_22 == zy_2.azz()) {
            return this;
        }
        if (zy_22.azs()) {
            this.kO(zy_22.azt());
        }
        if (zy_22.azu()) {
            this.kP(zy_22.azv());
        }
        if (zy_22.oO()) {
            this.kQ(zy_22.oP());
        }
        if (zy_22.rn()) {
            this.ad(zy_22.getEnabled());
        }
        this.gb(zy_2.d(zy_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.azs()) {
            return false;
        }
        if (!this.azu()) {
            return false;
        }
        if (!this.oO()) {
            return false;
        }
        return this.rn();
    }

    public za_2 jC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zy_2 zy_22 = null;
        try {
            zy_22 = (zy_2)zy_2.aox.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zy_22 = (zy_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zy_22 != null) {
                this.e(zy_22);
            }
        }
        return this;
    }

    @Override
    public boolean azs() {
        return (this.an & 1) != 0;
    }

    @Override
    public int azt() {
        return this.aor;
    }

    public za_2 kO(int n) {
        this.an |= 1;
        this.aor = n;
        this.onChanged();
        return this;
    }

    public za_2 azG() {
        this.an &= 0xFFFFFFFE;
        this.aor = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean azu() {
        return (this.an & 2) != 0;
    }

    @Override
    public int azv() {
        return this.aot;
    }

    public za_2 kP(int n) {
        this.an |= 2;
        this.aot = n;
        this.onChanged();
        return this;
    }

    public za_2 azH() {
        this.an &= 0xFFFFFFFD;
        this.aot = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public za_2 kQ(int n) {
        this.an |= 4;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public za_2 azI() {
        this.an &= 0xFFFFFFFB;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean rn() {
        return (this.an & 8) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    public za_2 ad(boolean bl) {
        this.an |= 8;
        this.kO = bl;
        this.onChanged();
        return this;
    }

    public za_2 azJ() {
        this.an &= 0xFFFFFFF7;
        this.kO = false;
        this.onChanged();
        return this;
    }

    public final za_2 ga(UnknownFieldSet unknownFieldSet) {
        return (za_2)super.setUnknownFields(unknownFieldSet);
    }

    public final za_2 gb(UnknownFieldSet unknownFieldSet) {
        return (za_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gb(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ga(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gb(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cA(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cA(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cA(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ga(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.azC();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.azF();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gb(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cA(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.azC();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cA(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.azF();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gb(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ga(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gb(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cA(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cA(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cA(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ga(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.azF();
    }

    public /* synthetic */ Message buildPartial() {
        return this.azE();
    }

    public /* synthetic */ Message build() {
        return this.azD();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cA(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.azC();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.azF();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.azE();
    }

    public /* synthetic */ MessageLite build() {
        return this.azD();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.azC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jC(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.azF();
    }

    public /* synthetic */ Object clone() {
        return this.azF();
    }
}

