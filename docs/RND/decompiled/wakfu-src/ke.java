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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ke
extends GeneratedMessageV3.Builder<ke>
implements kf_0 {
    private int an;
    private int dL;
    private boolean kO;
    private List<kJ> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<kJ, kL, kM> jm;
    private long EK;

    public static final Descriptors.Descriptor ZI() {
        return kb.Ex;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.Ey.ensureFieldAccessorsInitialized(kc.class, ke.class);
    }

    ke() {
        this.D();
    }

    ke(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kc.oV()) {
            this.oL();
        }
    }

    public ke ZJ() {
        super.clear();
        this.dL = 0;
        this.an &= 0xFFFFFFFE;
        this.kO = false;
        this.an &= 0xFFFFFFFD;
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.jm.clear();
        }
        this.EK = 0L;
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kb.Ex;
    }

    public kc ZH() {
        return kc.ZG();
    }

    public kc ZK() {
        kc kc2 = this.ZL();
        if (!kc2.isInitialized()) {
            throw ke.newUninitializedMessageException((Message)kc2);
        }
        return kc2;
    }

    public kc ZL() {
        kc kc2 = new kc(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kc2.dL = this.dL;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kc2.kO = this.kO;
            n2 |= 2;
        }
        if (this.jm == null) {
            if ((this.an & 4) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFB;
            }
            kc2.jj = this.jj;
        } else {
            kc2.jj = this.jm.build();
        }
        if ((n & 8) != 0) {
            kc2.EK = this.EK;
            n2 |= 4;
        }
        kc2.an = n2;
        this.onBuilt();
        return kc2;
    }

    public ke ZM() {
        return (ke)super.clone();
    }

    public ke dO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ke)super.setField(fieldDescriptor, object);
    }

    public ke bu(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ke)super.clearField(fieldDescriptor);
    }

    public ke bu(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ke)super.clearOneof(oneofDescriptor);
    }

    public ke bu(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ke)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ke dP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ke)super.addRepeatedField(fieldDescriptor, object);
    }

    public ke bu(Message message) {
        if (message instanceof kc) {
            return this.c((kc)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ke c(kc kc2) {
        if (kc2 == kc.ZG()) {
            return this;
        }
        if (kc2.oN()) {
            this.gm(kc2.d());
        }
        if (kc2.rn()) {
            this.P(kc2.getEnabled());
        }
        if (this.jm == null) {
            if (!kc2.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = kc2.jj;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.oH();
                    this.jj.addAll(kc2.jj);
                }
                this.onChanged();
            }
        } else if (!kc2.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = kc2.jj;
                this.an &= 0xFFFFFFFB;
                this.jm = kc.bg() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(kc2.jj);
            }
        }
        if (kc2.ZB()) {
            this.aO(kc2.ZC());
        }
        this.dP(kc.b(kc2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.oN()) {
            return false;
        }
        if (!this.rn()) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.gk(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ke gk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kc kc2 = null;
        try {
            kc2 = (kc)kc.EM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kc2 = (kc)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kc2 != null) {
                this.c(kc2);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public ke gm(int n) {
        this.an |= 1;
        this.dL = n;
        this.onChanged();
        return this;
    }

    public ke ZN() {
        this.an &= 0xFFFFFFFE;
        this.dL = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean rn() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean getEnabled() {
        return this.kO;
    }

    public ke P(boolean bl) {
        this.an |= 2;
        this.kO = bl;
        this.onChanged();
        return this;
    }

    public ke ZO() {
        this.an &= 0xFFFFFFFD;
        this.kO = false;
        this.onChanged();
        return this;
    }

    private void oH() {
        if ((this.an & 4) == 0) {
            this.jj = new ArrayList<kJ>(this.jj);
            this.an |= 4;
        }
    }

    @Override
    public List<kJ> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public kJ gk(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kJ)this.jm.getMessage(n);
    }

    public ke a(int n, kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, kJ2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kJ2);
        }
        return this;
    }

    public ke a(int n, kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, kL2.adc());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kL2.adc());
        }
        return this;
    }

    public ke a(kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(kJ2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kJ2);
        }
        return this;
    }

    public ke b(int n, kJ kJ2) {
        if (this.jm == null) {
            if (kJ2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, kJ2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kJ2);
        }
        return this;
    }

    public ke a(kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(kL2.adc());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kL2.adc());
        }
        return this;
    }

    public ke b(int n, kL kL2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, kL2.adc());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kL2.adc());
        }
        return this;
    }

    public ke Q(Iterable<? extends kJ> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public ke ZP() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public ke gn(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public kL go(int n) {
        return (kL)this.oL().getBuilder(n);
    }

    @Override
    public kM gl(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kM)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kM> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public kL ZQ() {
        return (kL)this.oL().addBuilder((AbstractMessage)kJ.acY());
    }

    public kL gp(int n) {
        return (kL)this.oL().addBuilder(n, (AbstractMessage)kJ.acY());
    }

    public List<kL> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kJ, kL, kM> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    @Override
    public boolean ZB() {
        return (this.an & 8) != 0;
    }

    @Override
    public long ZC() {
        return this.EK;
    }

    public ke aO(long l) {
        this.an |= 8;
        this.EK = l;
        this.onChanged();
        return this;
    }

    public ke ZR() {
        this.an &= 0xFFFFFFF7;
        this.EK = 0L;
        this.onChanged();
        return this;
    }

    public final ke dO(UnknownFieldSet unknownFieldSet) {
        return (ke)super.setUnknownFields(unknownFieldSet);
    }

    public final ke dP(UnknownFieldSet unknownFieldSet) {
        return (ke)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bu(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bu(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bu(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ZJ();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ZM();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bu(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ZJ();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bu(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ZM();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bu(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bu(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bu(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ZM();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ZL();
    }

    public /* synthetic */ Message build() {
        return this.ZK();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bu(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ZJ();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ZM();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ZL();
    }

    public /* synthetic */ MessageLite build() {
        return this.ZK();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ZJ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ZH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ZH();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gk(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ZM();
    }

    public /* synthetic */ Object clone() {
        return this.ZM();
    }
}

