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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ku
 */
public final class ku_0
extends GeneratedMessageV3.Builder<ku_0>
implements kv_0 {
    private int an;
    private List<kc> Fr = Collections.emptyList();
    private RepeatedFieldBuilderV3<kc, ke, kf_0> Fw;
    private kg_0 Ft;
    private SingleFieldBuilderV3<kg_0, ki_0, kr_0> Fx;

    public static final Descriptors.Descriptor abw() {
        return kb.Ev;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.Ew.ensureFieldAccessorsInitialized(ks_0.class, ku_0.class);
    }

    ku_0() {
        this.D();
    }

    ku_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ks_0.aJ()) {
            this.abF();
            this.abI();
        }
    }

    public ku_0 abx() {
        super.clear();
        if (this.Fw == null) {
            this.Fr = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.Fw.clear();
        }
        if (this.Fx == null) {
            this.Ft = null;
        } else {
            this.Fx.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kb.Ev;
    }

    public ks_0 abv() {
        return ks_0.abu();
    }

    public ks_0 aby() {
        ks_0 ks_02 = this.abz();
        if (!ks_02.isInitialized()) {
            throw ku_0.newUninitializedMessageException((Message)ks_02);
        }
        return ks_02;
    }

    public ks_0 abz() {
        ks_0 ks_02 = new ks_0(this);
        int n = this.an;
        int n2 = 0;
        if (this.Fw == null) {
            if ((this.an & 1) != 0) {
                this.Fr = Collections.unmodifiableList(this.Fr);
                this.an &= 0xFFFFFFFE;
            }
            ks_02.Fr = this.Fr;
        } else {
            ks_02.Fr = this.Fw.build();
        }
        if ((n & 2) != 0) {
            ks_02.Ft = this.Fx == null ? this.Ft : (kg_0)this.Fx.build();
            n2 |= 1;
        }
        ks_02.an = n2;
        this.onBuilt();
        return ks_02;
    }

    public ku_0 abA() {
        return (ku_0)super.clone();
    }

    public ku_0 dW(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ku_0)super.setField(fieldDescriptor, object);
    }

    public ku_0 by(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ku_0)super.clearField(fieldDescriptor);
    }

    public ku_0 by(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ku_0)super.clearOneof(oneofDescriptor);
    }

    public ku_0 by(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ku_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ku_0 dX(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ku_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ku_0 by(Message message) {
        if (message instanceof ks_0) {
            return this.c((ks_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ku_0 c(ks_0 ks_02) {
        if (ks_02 == ks_0.abu()) {
            return this;
        }
        if (this.Fw == null) {
            if (!ks_02.Fr.isEmpty()) {
                if (this.Fr.isEmpty()) {
                    this.Fr = ks_02.Fr;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.abB();
                    this.Fr.addAll(ks_02.Fr);
                }
                this.onChanged();
            }
        } else if (!ks_02.Fr.isEmpty()) {
            if (this.Fw.isEmpty()) {
                this.Fw.dispose();
                this.Fw = null;
                this.Fr = ks_02.Fr;
                this.an &= 0xFFFFFFFE;
                this.Fw = ks_0.oB() ? this.abF() : null;
            } else {
                this.Fw.addAllMessages(ks_02.Fr);
            }
        }
        if (ks_02.abo()) {
            this.e(ks_02.abp());
        }
        this.dX(ks_0.b(ks_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.abo()) {
            return false;
        }
        for (int i = 0; i < this.abn(); ++i) {
            if (this.gB(i).isInitialized()) continue;
            return false;
        }
        return this.abp().isInitialized();
    }

    public ku_0 gw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ks_0 ks_02 = null;
        try {
            ks_02 = (ks_0)ks_0.Fv.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ks_02 = (ks_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ks_02 != null) {
                this.c(ks_02);
            }
        }
        return this;
    }

    private void abB() {
        if ((this.an & 1) == 0) {
            this.Fr = new ArrayList<kc>(this.Fr);
            this.an |= 1;
        }
    }

    @Override
    public List<kc> abl() {
        if (this.Fw == null) {
            return Collections.unmodifiableList(this.Fr);
        }
        return this.Fw.getMessageList();
    }

    @Override
    public int abn() {
        if (this.Fw == null) {
            return this.Fr.size();
        }
        return this.Fw.getCount();
    }

    @Override
    public kc gB(int n) {
        if (this.Fw == null) {
            return this.Fr.get(n);
        }
        return (kc)this.Fw.getMessage(n);
    }

    public ku_0 a(int n, kc kc2) {
        if (this.Fw == null) {
            if (kc2 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.set(n, kc2);
            this.onChanged();
        } else {
            this.Fw.setMessage(n, (AbstractMessage)kc2);
        }
        return this;
    }

    public ku_0 a(int n, ke ke2) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.set(n, ke2.ZK());
            this.onChanged();
        } else {
            this.Fw.setMessage(n, (AbstractMessage)ke2.ZK());
        }
        return this;
    }

    public ku_0 d(kc kc2) {
        if (this.Fw == null) {
            if (kc2 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.add(kc2);
            this.onChanged();
        } else {
            this.Fw.addMessage((AbstractMessage)kc2);
        }
        return this;
    }

    public ku_0 b(int n, kc kc2) {
        if (this.Fw == null) {
            if (kc2 == null) {
                throw new NullPointerException();
            }
            this.abB();
            this.Fr.add(n, kc2);
            this.onChanged();
        } else {
            this.Fw.addMessage(n, (AbstractMessage)kc2);
        }
        return this;
    }

    public ku_0 a(ke ke2) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.add(ke2.ZK());
            this.onChanged();
        } else {
            this.Fw.addMessage((AbstractMessage)ke2.ZK());
        }
        return this;
    }

    public ku_0 b(int n, ke ke2) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.add(n, ke2.ZK());
            this.onChanged();
        } else {
            this.Fw.addMessage(n, (AbstractMessage)ke2.ZK());
        }
        return this;
    }

    public ku_0 T(Iterable<? extends kc> iterable) {
        if (this.Fw == null) {
            this.abB();
            AbstractMessageLite.Builder.addAll(iterable, this.Fr);
            this.onChanged();
        } else {
            this.Fw.addAllMessages(iterable);
        }
        return this;
    }

    public ku_0 abC() {
        if (this.Fw == null) {
            this.Fr = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.Fw.clear();
        }
        return this;
    }

    public ku_0 gD(int n) {
        if (this.Fw == null) {
            this.abB();
            this.Fr.remove(n);
            this.onChanged();
        } else {
            this.Fw.remove(n);
        }
        return this;
    }

    public ke gE(int n) {
        return (ke)this.abF().getBuilder(n);
    }

    @Override
    public kf_0 gC(int n) {
        if (this.Fw == null) {
            return this.Fr.get(n);
        }
        return (kf_0)this.Fw.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kf_0> abm() {
        if (this.Fw != null) {
            return this.Fw.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Fr);
    }

    public ke abD() {
        return (ke)this.abF().addBuilder((AbstractMessage)kc.ZG());
    }

    public ke gF(int n) {
        return (ke)this.abF().addBuilder(n, (AbstractMessage)kc.ZG());
    }

    public List<ke> abE() {
        return this.abF().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kc, ke, kf_0> abF() {
        if (this.Fw == null) {
            this.Fw = new RepeatedFieldBuilderV3(this.Fr, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fr = null;
        }
        return this.Fw;
    }

    @Override
    public boolean abo() {
        return (this.an & 2) != 0;
    }

    @Override
    public kg_0 abp() {
        if (this.Fx == null) {
            return this.Ft == null ? kg_0.aac() : this.Ft;
        }
        return (kg_0)this.Fx.getMessage();
    }

    public ku_0 d(kg_0 kg_02) {
        if (this.Fx == null) {
            if (kg_02 == null) {
                throw new NullPointerException();
            }
            this.Ft = kg_02;
            this.onChanged();
        } else {
            this.Fx.setMessage((AbstractMessage)kg_02);
        }
        this.an |= 2;
        return this;
    }

    public ku_0 a(ki_0 ki_02) {
        if (this.Fx == null) {
            this.Ft = ki_02.aag();
            this.onChanged();
        } else {
            this.Fx.setMessage((AbstractMessage)ki_02.aag());
        }
        this.an |= 2;
        return this;
    }

    public ku_0 e(kg_0 kg_02) {
        if (this.Fx == null) {
            this.Ft = (this.an & 2) != 0 && this.Ft != null && this.Ft != kg_0.aac() ? kg_0.a(this.Ft).c(kg_02).aah() : kg_02;
            this.onChanged();
        } else {
            this.Fx.mergeFrom((AbstractMessage)kg_02);
        }
        this.an |= 2;
        return this;
    }

    public ku_0 abG() {
        if (this.Fx == null) {
            this.Ft = null;
            this.onChanged();
        } else {
            this.Fx.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public ki_0 abH() {
        this.an |= 2;
        this.onChanged();
        return (ki_0)this.abI().getBuilder();
    }

    @Override
    public kr_0 abq() {
        if (this.Fx != null) {
            return (kr_0)this.Fx.getMessageOrBuilder();
        }
        return this.Ft == null ? kg_0.aac() : this.Ft;
    }

    private SingleFieldBuilderV3<kg_0, ki_0, kr_0> abI() {
        if (this.Fx == null) {
            this.Fx = new SingleFieldBuilderV3((AbstractMessage)this.abp(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ft = null;
        }
        return this.Fx;
    }

    public final ku_0 dW(UnknownFieldSet unknownFieldSet) {
        return (ku_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ku_0 dX(UnknownFieldSet unknownFieldSet) {
        return (ku_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dX(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dW(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dX(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.by(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.by(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.by(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dW(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.abx();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.abA();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dX(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.by(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.abx();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.by(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.abA();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dX(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dW(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dX(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.by(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.by(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.by(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dW(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.abA();
    }

    public /* synthetic */ Message buildPartial() {
        return this.abz();
    }

    public /* synthetic */ Message build() {
        return this.aby();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.by(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.abx();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.abA();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.abz();
    }

    public /* synthetic */ MessageLite build() {
        return this.aby();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.abx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abv();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abv();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.abA();
    }

    public /* synthetic */ Object clone() {
        return this.abA();
    }
}

