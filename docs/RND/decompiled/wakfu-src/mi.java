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

public final class mi
extends GeneratedMessageV3.Builder<mi>
implements mj_0 {
    private int an;
    private mk Kp;
    private SingleFieldBuilderV3<mk, mm_0, mn> Kv;
    private List<mc> Ce = Collections.emptyList();
    private RepeatedFieldBuilderV3<mc, me_0, mf_0> Ch;
    private long Ks;

    public static final Descriptors.Descriptor akN() {
        return mb_0.JN;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JO.ensureFieldAccessorsInitialized(mg.class, mi.class);
    }

    mi() {
        this.D();
    }

    mi(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mg.aJ()) {
            this.akU();
            this.Vv();
        }
    }

    public mi akO() {
        super.clear();
        if (this.Kv == null) {
            this.Kp = null;
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.Ch.clear();
        }
        this.Ks = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mb_0.JN;
    }

    public mg akM() {
        return mg.akL();
    }

    public mg akP() {
        mg mg2 = this.akQ();
        if (!mg2.isInitialized()) {
            throw mi.newUninitializedMessageException((Message)mg2);
        }
        return mg2;
    }

    public mg akQ() {
        mg mg2 = new mg(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mg2.Kp = this.Kv == null ? this.Kp : (mk)this.Kv.build();
            n2 |= 1;
        }
        if (this.Ch == null) {
            if ((this.an & 2) != 0) {
                this.Ce = Collections.unmodifiableList(this.Ce);
                this.an &= 0xFFFFFFFD;
            }
            mg2.Ce = this.Ce;
        } else {
            mg2.Ce = this.Ch.build();
        }
        if ((n & 4) != 0) {
            mg2.Ks = this.Ks;
            n2 |= 2;
        }
        mg2.an = n2;
        this.onBuilt();
        return mg2;
    }

    public mi akR() {
        return (mi)super.clone();
    }

    public mi eO(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mi)super.setField(fieldDescriptor, object);
    }

    public mi bU(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mi)super.clearField(fieldDescriptor);
    }

    public mi bU(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mi)super.clearOneof(oneofDescriptor);
    }

    public mi bU(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mi)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mi eP(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mi)super.addRepeatedField(fieldDescriptor, object);
    }

    public mi bU(Message message) {
        if (message instanceof mg) {
            return this.c((mg)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mi c(mg mg2) {
        if (mg2 == mg.akL()) {
            return this;
        }
        if (mg2.akD()) {
            this.b(mg2.akE());
        }
        if (this.Ch == null) {
            if (!mg2.Ce.isEmpty()) {
                if (this.Ce.isEmpty()) {
                    this.Ce = mg2.Ce;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.Vr();
                    this.Ce.addAll(mg2.Ce);
                }
                this.onChanged();
            }
        } else if (!mg2.Ce.isEmpty()) {
            if (this.Ch.isEmpty()) {
                this.Ch.dispose();
                this.Ch = null;
                this.Ce = mg2.Ce;
                this.an &= 0xFFFFFFFD;
                this.Ch = mg.oB() ? this.Vv() : null;
            } else {
                this.Ch.addAllMessages(mg2.Ce);
            }
        }
        if (mg2.akG()) {
            this.bg(mg2.akH());
        }
        this.eP(mg.b(mg2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.akD()) {
            return false;
        }
        if (!this.akG()) {
            return false;
        }
        if (!this.akE().isInitialized()) {
            return false;
        }
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.hW(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public mi hK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mg mg2 = null;
        try {
            mg2 = (mg)mg.Ku.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mg2 = (mg)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mg2 != null) {
                this.c(mg2);
            }
        }
        return this;
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        if (this.Kv == null) {
            return this.Kp == null ? mk.ale() : this.Kp;
        }
        return (mk)this.Kv.getMessage();
    }

    public mi a(mk mk2) {
        if (this.Kv == null) {
            if (mk2 == null) {
                throw new NullPointerException();
            }
            this.Kp = mk2;
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mi a(mm_0 mm_02) {
        if (this.Kv == null) {
            this.Kp = mm_02.ali();
            this.onChanged();
        } else {
            this.Kv.setMessage((AbstractMessage)mm_02.ali());
        }
        this.an |= 1;
        return this;
    }

    public mi b(mk mk2) {
        if (this.Kv == null) {
            this.Kp = (this.an & 1) != 0 && this.Kp != null && this.Kp != mk.ale() ? mk.c(this.Kp).e(mk2).alj() : mk2;
            this.onChanged();
        } else {
            this.Kv.mergeFrom((AbstractMessage)mk2);
        }
        this.an |= 1;
        return this;
    }

    public mi akS() {
        if (this.Kv == null) {
            this.Kp = null;
            this.onChanged();
        } else {
            this.Kv.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public mm_0 akT() {
        this.an |= 1;
        this.onChanged();
        return (mm_0)this.akU().getBuilder();
    }

    @Override
    public mn akF() {
        if (this.Kv != null) {
            return (mn)this.Kv.getMessageOrBuilder();
        }
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    private SingleFieldBuilderV3<mk, mm_0, mn> akU() {
        if (this.Kv == null) {
            this.Kv = new SingleFieldBuilderV3((AbstractMessage)this.akE(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Kp = null;
        }
        return this.Kv;
    }

    private void Vr() {
        if ((this.an & 2) == 0) {
            this.Ce = new ArrayList<mc>(this.Ce);
            this.an |= 2;
        }
    }

    @Override
    public List<mc> Ve() {
        if (this.Ch == null) {
            return Collections.unmodifiableList(this.Ce);
        }
        return this.Ch.getMessageList();
    }

    @Override
    public int Vg() {
        if (this.Ch == null) {
            return this.Ce.size();
        }
        return this.Ch.getCount();
    }

    @Override
    public mc hW(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (mc)this.Ch.getMessage(n);
    }

    public mi a(int n, mc mc2) {
        if (this.Ch == null) {
            if (mc2 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.set(n, mc2);
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)mc2);
        }
        return this;
    }

    public mi a(int n, me_0 me_02) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.set(n, me_02.akp());
            this.onChanged();
        } else {
            this.Ch.setMessage(n, (AbstractMessage)me_02.akp());
        }
        return this;
    }

    public mi d(mc mc2) {
        if (this.Ch == null) {
            if (mc2 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(mc2);
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)mc2);
        }
        return this;
    }

    public mi b(int n, mc mc2) {
        if (this.Ch == null) {
            if (mc2 == null) {
                throw new NullPointerException();
            }
            this.Vr();
            this.Ce.add(n, mc2);
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)mc2);
        }
        return this;
    }

    public mi a(me_0 me_02) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(me_02.akp());
            this.onChanged();
        } else {
            this.Ch.addMessage((AbstractMessage)me_02.akp());
        }
        return this;
    }

    public mi b(int n, me_0 me_02) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.add(n, me_02.akp());
            this.onChanged();
        } else {
            this.Ch.addMessage(n, (AbstractMessage)me_02.akp());
        }
        return this;
    }

    public mi ae(Iterable<? extends mc> iterable) {
        if (this.Ch == null) {
            this.Vr();
            AbstractMessageLite.Builder.addAll(iterable, this.Ce);
            this.onChanged();
        } else {
            this.Ch.addAllMessages(iterable);
        }
        return this;
    }

    public mi akV() {
        if (this.Ch == null) {
            this.Ce = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.Ch.clear();
        }
        return this;
    }

    public mi hY(int n) {
        if (this.Ch == null) {
            this.Vr();
            this.Ce.remove(n);
            this.onChanged();
        } else {
            this.Ch.remove(n);
        }
        return this;
    }

    public me_0 hZ(int n) {
        return (me_0)this.Vv().getBuilder(n);
    }

    @Override
    public mf_0 hX(int n) {
        if (this.Ch == null) {
            return this.Ce.get(n);
        }
        return (mf_0)this.Ch.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mf_0> Vf() {
        if (this.Ch != null) {
            return this.Ch.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ce);
    }

    public me_0 akW() {
        return (me_0)this.Vv().addBuilder((AbstractMessage)mc.akl());
    }

    public me_0 ia(int n) {
        return (me_0)this.Vv().addBuilder(n, (AbstractMessage)mc.akl());
    }

    public List<me_0> Vu() {
        return this.Vv().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mc, me_0, mf_0> Vv() {
        if (this.Ch == null) {
            this.Ch = new RepeatedFieldBuilderV3(this.Ce, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ce = null;
        }
        return this.Ch;
    }

    @Override
    public boolean akG() {
        return (this.an & 4) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public mi bg(long l) {
        this.an |= 4;
        this.Ks = l;
        this.onChanged();
        return this;
    }

    public mi akX() {
        this.an &= 0xFFFFFFFB;
        this.Ks = 0L;
        this.onChanged();
        return this;
    }

    public final mi eO(UnknownFieldSet unknownFieldSet) {
        return (mi)super.setUnknownFields(unknownFieldSet);
    }

    public final mi eP(UnknownFieldSet unknownFieldSet) {
        return (mi)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eP(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eO(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eP(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bU(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bU(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bU(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eO(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.akO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.akR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eP(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bU(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.akO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bU(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.akR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eP(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eO(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eP(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bU(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bU(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bU(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eO(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.akR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.akQ();
    }

    public /* synthetic */ Message build() {
        return this.akP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bU(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.akO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.akR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.akQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.akP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.akO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.akM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.akM();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hK(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.akR();
    }

    public /* synthetic */ Object clone() {
        return this.akR();
    }
}

